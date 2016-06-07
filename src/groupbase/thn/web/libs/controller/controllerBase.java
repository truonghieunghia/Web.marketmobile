package groupbase.thn.web.libs.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.view.View;

public abstract class controllerBase extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest mRequest;
	private HttpServletResponse mResponse;
	private PrintWriter mPrintWriter;
	private String mPathView = "/";
	protected String mContentType = "text/plain; charset=utf-8";
	private ServletContext mContext;

	protected abstract View doGet();

	protected abstract View doPost();

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		mRequest = arg0;
		mResponse = arg1;
		mResponse.setContentType(getContentType());
		mPrintWriter = mResponse.getWriter();
		mContext = getServletContext();
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		showView(doGet());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		showView(doPost());
	}

	protected String getContentType() {
		return mContentType;
	}
	private void showView(View view) {
		RequestDispatcher mDispatcher = mContext.getRequestDispatcher(getPath() + view.getViewName() + ".jsp");
		HashMap<String, Object> data = view.getData();
		if (data != null) {
			Iterator<Entry<String, Object>> iterator = data.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, Object> entry = (Map.Entry<String, Object>) iterator.next();
				if (entry.getKey() != null) {
					pushData(entry.getKey(), entry.getValue());
				}
			}
		}

		switch (view.getViewAction()) {
		case FORWARD:
			try {
				mDispatcher.forward(mRequest, mResponse);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case REDIRECT:
			try {
				this.mResponse.sendRedirect(view.getViewName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case OUTTEXT:
			if (view.isFile()) {
				outString(outTextFromFile(view.getViewName()));
			} else {
				outString(view.getViewName());
			}

			break;
		default:

			try {
				mDispatcher.forward(mRequest, mResponse);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

	}

	private String getPath() {
		if (mContext.getInitParameter("View") == null) {
			return mPathView;
		}
		if (mPathView.length() == 1) {
			return mContext.getInitParameter("View");
		} else {
			return mPathView;
		}
	}

	private String getPathRoot() {
		return mContext.getRealPath("");
	}

	protected String outTextFromFile(String pathFile) {
		try {
			FileInputStream fis = new FileInputStream(getPathRoot() + pathFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(isr);
			String line = null;
			String result = "";
			while ((line = reader.readLine()) != null) {
				result = result + line;
			}
			reader.close();
			fis.close();
			isr.close();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}

	private void outString(String text) {
		mPrintWriter.println(text);
	}

	protected void pushData(String key, Object data) {
		mRequest.setAttribute(key, data);
	}

	private <T> T paserStringToType(String str, Class<T> clazz) {
		Object value = null;
		if (clazz.equals(String.class)) {
			value = str;
		}
		if (clazz.equals(Integer.class)) {
			value = Integer.parseInt(str);
		}
		if (clazz.equals(Float.class)) {
			value = Float.parseFloat(str);
		}
		return clazz.cast(value);
	}

	protected <T> T getDataPost(Class<T> formData) {
		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(formData.getDeclaredFields()));
			Object result = formData.newInstance();

			for (Field field : fields) {
				field.setAccessible(true);
				ColumnNameAnnotation formAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (formAnnotation != null) {
					String[] value = mRequest.getParameterValues(formAnnotation.ColumnName());

					if (value != null) {
						if (value.length == 1) {
							if (value[0].trim().length() == 0) {
								field.set(result, null);
							} else {
								field.set(result, paserStringToType(value[0], formAnnotation.FieldType()));
							}
						} else {
							field.set(result, value);
						}
					}
				}
			}
			return formData.cast(result);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	protected String getFileName(final Part part) {

		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}

	protected void upload(String pathFolder, String partName, String fileName) {
		try {
			final String path = getPathRoot() + pathFolder.trim();
			final Part filePart = mRequest.getPart(partName);
			final String tempfile = getFileName(filePart);
			if (fileName == null | fileName.trim().length() == 0) {
				fileName = tempfile;
			} else {

				fileName = fileName + tempfile.substring(tempfile.lastIndexOf("."), tempfile.length());
			}
			OutputStream out = null;
			InputStream filecontent = null;
			out = new FileOutputStream(new File(path + File.separator + fileName));
			filecontent = filePart.getInputStream();

			int read = 0;
			final byte[] bytes = new byte[1024];

			while ((read = filecontent.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			if (out != null) {
				out.close();
			}
			if (filecontent != null) {
				filecontent.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void upload(String pathFolder, Part part, String fileName) {
		try {
			final String path = getPathRoot() + pathFolder.trim();
			final Part filePart = part;
			final String tempfile = getFileName(filePart);
			if (fileName == null | fileName.trim().length() == 0) {
				fileName = tempfile;
			} else {

				fileName = fileName + tempfile.substring(tempfile.lastIndexOf("."), tempfile.length());
			}
			OutputStream out = null;
			InputStream filecontent = null;
			out = new FileOutputStream(new File(path + File.separator + fileName));
			filecontent = filePart.getInputStream();

			int read = 0;
			final byte[] bytes = new byte[1024];

			while ((read = filecontent.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			if (out != null) {
				out.close();
			}
			if (filecontent != null) {
				filecontent.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected ArrayList<Part> getPart(String partName) {
		try {
			return new ArrayList<Part>(mRequest.getParts());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}

package groupbase.thn.web.libs.view;

import java.util.HashMap;

public class View {

	private String mViewName;
	private ViewAction mViewAction;
	private boolean mIsFile = false;
	private HashMap<String, Object> mData = null;

	public View(String viewName, ViewAction viewAction) {
		mViewName = viewName;
		mViewAction = viewAction;
		mData = null;
	}

	public View(String viewName, ViewAction viewAction, String key, Object data) {
		mViewName = viewName;
		mViewAction = viewAction;
		if (key != null) {
			mData = new HashMap<>();
			mData.put(key, data);
		}
	}

	public View(String viewName, ViewAction viewAction, HashMap<String, Object> listdata) {
		mViewName = viewName;
		mViewAction = viewAction;
		if (listdata != null) {
			mData = new HashMap<>();
			mData = listdata;
		}
	}

	public HashMap<String, Object> getData() {
		return mData;
	}

	public View(String viewName) {
		mViewName = viewName;
		mViewAction = ViewAction.FORWARD;
	}

	public String getViewName() {
		return mViewName;
	}

	public View setIsFile(boolean isfile) {
		mIsFile = isfile;
		return this;
	}

	public boolean isFile() {
		return mIsFile;
	}

	public ViewAction getViewAction() {
		return mViewAction;
	}
}

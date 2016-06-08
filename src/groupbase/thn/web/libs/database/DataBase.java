package groupbase.thn.web.libs.database;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tomcat.jdbc.pool.DataSource;

public class DataBase {
	private Connection mConnection = null;
	private Statement mStatement = null;
	private ResultSet mResultSet = null;
	private ResultData mResultData = null;
	private PreparedStatement mPreparedStatement = null;
	private CallableStatement mCallableStatement = null;

	public <T> T getEntry(Class<T> entry) {
		try {
			return entry.cast(entry.newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("static-access")
	private void open() {
		try {
			InitialContext ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/marketmobile");
			Future<Connection> future = dataSource.getConnectionAsync();
			while (!future.isDone()) {
				System.out.println("Connection is not yet available. Do some background work");
				try {
					Thread.sleep(100); // simulate work
				} catch (InterruptedException x) {
					Thread.currentThread().interrupted();
				}
			}
			mConnection = future.get();
		} catch (NamingException e) {
			mConnection = null;
			System.out.println(e.toString());
		} catch (SQLException e) {
			System.out.println(e.toString());
			mConnection = null;
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			mConnection = null;
		} catch (ExecutionException e) {
			System.out.println(e.toString());
			mConnection = null;
		}
	}

	private void close() {
		try {
			if (this.mConnection != null)
				this.mConnection.close();
			if (this.mResultSet != null)
				this.mResultSet.close();
			if (this.mStatement != null)
				this.mStatement.close();
			if (this.mPreparedStatement != null)
				this.mPreparedStatement.close();
			if (mCallableStatement != null)
				mCallableStatement.close();
		} catch (SQLException e) {
			this.mConnection = null;
			this.mResultSet = null;
			this.mStatement = null;
			this.mCallableStatement = null;
		}
	}

	public void executeQuery(String sql) {
		try {
			if (mConnection == null) {
				open();
			}
			mStatement = mConnection.createStatement();
			mResultSet = mStatement.executeQuery(sql);
			mResultData = new ResultData(mResultSet);
			close();
		} catch (SQLException e) {
			close();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void executeQuery(String sql, ArrayList<ParameterSql> parameters) {
		try {
			if (mConnection == null) {
				open();
			}
			mPreparedStatement = mConnection.prepareStatement(sql);
			for (int i = 0; i < parameters.size(); i++) {
				ParameterSql parameterSql = parameters.get(i);
				mPreparedStatement.setObject(i + 1, parameterSql.getClassType().cast(parameterSql.getValue()));
			}
			mResultSet = mPreparedStatement.executeQuery();
			mResultData = new ResultData(mResultSet);
			close();
		} catch (SQLException e) {
			close();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insert(Class<?> entry, Object valueEntry) {
		String sqlInsert = "";
		String fieldlist = "";
		String valueslist = "";
		String tableName;
		int result = -1;
		EntryAnnotation entryAnnotation = entry.getAnnotation(EntryAnnotation.class);
		tableName = entryAnnotation.TableName();

		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(entry.getDeclaredFields()));
			for (Field field : fields) {
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					if (!columnNameAnnotation.isAuto_increment()) {
						fieldlist = fieldlist + columnNameAnnotation.ColumnName() + ",";
						valueslist = valueslist + "?,";
					}
				}
			}
			fieldlist = fieldlist.substring(0, fieldlist.trim().length() - 1);
			valueslist = valueslist.substring(0, valueslist.trim().length() - 1);
			sqlInsert = "INSERT INTO " + tableName + " (" + fieldlist + ") VALUES (" + valueslist + ");";
			if (mConnection == null) {
				open();
			}
			mPreparedStatement = mConnection.prepareStatement(sqlInsert);
			int index = 1;
			for (int i = 0; i < fields.size(); i++) {

				Field field = fields.get(i);
				field.setAccessible(true);
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					if (!columnNameAnnotation.isAuto_increment()) {
						mPreparedStatement.setObject(index,
								columnNameAnnotation.FieldType().cast(field.get(valueEntry)));
						index = index + 1;
					}
				}

			}
			result = mPreparedStatement.executeUpdate();

		} catch (Exception e) {
			close();
			e.printStackTrace();
		}
		close();
		return result;
	}

	public int update(Class<?> entry, Object valueEntry) {
		String sqlupdate = "";
		String fieldlist = "";
		String where = "";
		String tableName;
		int result = -1;
		EntryAnnotation entryAnnotation = entry.getAnnotation(EntryAnnotation.class);
		tableName = entryAnnotation.TableName();

		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(entry.getDeclaredFields()));
			for (Field field : fields) {
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					if (!columnNameAnnotation.isPrimary()) {
						fieldlist = fieldlist + columnNameAnnotation.ColumnName() + " = ?,";
					} else {
						where = where + columnNameAnnotation.ColumnName() + "= ? and";
					}
				}
			}
			fieldlist = fieldlist.substring(0, fieldlist.trim().length() - 1);
			where = where.substring(0, where.trim().length() - 3);
			sqlupdate = "update " + tableName + " set " + fieldlist + " where " + where + ";";
			if (mConnection == null) {
				open();
			}
			mPreparedStatement = mConnection.prepareStatement(sqlupdate);
			int index = 1;
			for (int i = 0; i < fields.size(); i++) {

				Field field = fields.get(i);
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					if (!columnNameAnnotation.isPrimary()) {
						mPreparedStatement.setObject(index,
								columnNameAnnotation.FieldType().cast(field.get(valueEntry)));
						index = index + 1;
					}

				}

			}
			for (int i = 0; i < fields.size(); i++) {

				Field field = fields.get(i);
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					if (columnNameAnnotation.isPrimary()) {
						mPreparedStatement.setObject(index,
								columnNameAnnotation.FieldType().cast(field.get(valueEntry)));
						index = index + 1;
					}

				}

			}

			result = mPreparedStatement.executeUpdate();
			close();

		} catch (Exception e) {
			close();
			e.printStackTrace();
		}
		return result;
	}

	public int delete(Class<?> entry, String where, ArrayList<ParameterSql> parameters) {
		String tableName;
		EntryAnnotation entryAnnotation = entry.getAnnotation(EntryAnnotation.class);
		tableName = entryAnnotation.TableName();
		String sqldelete = "DELETE FROM " + tableName + " where " + where;
		int result = -1;
		try {
			if (mConnection == null) {
				open();
			}
			mPreparedStatement = mConnection.prepareStatement(sqldelete);
			for (int i = 0; i < parameters.size(); i++) {
				ParameterSql parameterSql = parameters.get(i);
				mPreparedStatement.setObject(i + 1, parameterSql.getClassType().cast(parameterSql.getValue()));
			}
			result = mPreparedStatement.executeUpdate();
			close();
		} catch (SQLException e) {
			close();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public <T> ArrayList<T> executeQueryEntry(Class<T> entry, String where) {
		String tableName;
		EntryAnnotation entryAnnotation = entry.getAnnotation(EntryAnnotation.class);
		tableName = entryAnnotation.TableName();

		String sql;
		String select = "";
		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(entry.getDeclaredFields()));
			for (Field field : fields) {
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					select = select + columnNameAnnotation.ColumnName() + ",";
				}
			}
			select = select.trim();
		} catch (Exception e) {
			select = "*";
		}
		if (!select.equals("*")) {
			select = select.substring(0, select.trim().length() - 1);
		}
		if (where != null && where.trim().length() > 0) {
			sql = "select " + select + " from " + tableName + "where " + where;
		} else {
			sql = "select " + select + " from " + tableName;
		}
		executeQuery(sql);
		ResultData resultData = getResultData();
		return resultData.getAllDataRow(entry);
	}

	public <T> ArrayList<T> executeQueryEntry(Class<T> entry, String where, ArrayList<ParameterSql> parameters) {
		String tableName;
		EntryAnnotation entryAnnotation = entry.getAnnotation(EntryAnnotation.class);
		tableName = entryAnnotation.TableName();

		String sql;
		String select = "";
		try {
			List<Field> fields = new ArrayList<Field>();
			fields.addAll(Arrays.asList(entry.getDeclaredFields()));
			for (Field field : fields) {
				ColumnNameAnnotation columnNameAnnotation = field.getAnnotation(ColumnNameAnnotation.class);
				if (columnNameAnnotation != null) {
					select = select + columnNameAnnotation.ColumnName() + ",";
				}
			}
			select = select.trim();
		} catch (Exception e) {
			select = "*";
		}
		if (select.equals("*")) {
			select = select.substring(0, select.trim().length() - 1);
		}
		if (where != null && where.trim().length() > 0) {
			sql = "select " + select + " from " + tableName + "where " + where;
		} else {
			sql = "select " + select + " from " + tableName;
		}
		executeQuery(sql, parameters);
		ResultData resultData = getResultData();
		return resultData.getAllDataRow(entry);
	}

	public void callProc(String procName, ArrayList<ParameterSql> parametersIn, ArrayList<ParameterSql> parametersOut) {
		int index = 0;
		try {
			if (mConnection == null) {
				open();
			}
			mCallableStatement = mConnection.prepareCall("{call " + procName + "}");
			if (parametersIn != null) {
				for (int i = 0; i < parametersIn.size(); i++) {
					ParameterSql parameterSql = parametersIn.get(i);
					index = i + 1;
					mCallableStatement.setObject(index, parameterSql.getClassType().cast(parameterSql.getValue()));
				}
			}
			if (parametersOut != null) {
				for (int i = 0; i < parametersOut.size(); i++) {
					ParameterSql parameterSql = parametersOut.get(i);
					index = i + 1;
					mCallableStatement.registerOutParameter(index, parameterSql.convertToSqlType());
				}
			}
			mResultSet = mCallableStatement.executeQuery();
			mResultData = new ResultData(mResultSet);
		} catch (SQLException e) {
			close();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultData getResultData() {
		return mResultData;
	}
}

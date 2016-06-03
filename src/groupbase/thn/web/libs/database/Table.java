package groupbase.thn.web.libs.database;

import java.util.ArrayList;

public class Table {
	DataBase connect;

	public Table() {
		connect = new DataBase();
	}

	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectAll() {
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), null);
	}

	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectWhere(String where) {
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), where);
	}

	public int add(Object valueEntry) {
		return connect.insert(this.getClass(), valueEntry);
	}

	public int update(Object valueEntry) {
		return connect.update(this.getClass(), valueEntry);
	}

	public int delete(String where, ArrayList<ParameterSql> parameters) {
		return connect.delete(this.getClass(), where, parameters);
	}
}

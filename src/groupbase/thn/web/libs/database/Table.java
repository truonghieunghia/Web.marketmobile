package groupbase.thn.web.libs.database;

import java.util.ArrayList;

public class Table {
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectAll() {
		DataBase connect = new DataBase();
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), null);
	}

	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectWhere(String where) {
		DataBase connect = new DataBase();
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), where);
	}

	public int add(Object valueEntry) {
		DataBase connect = new DataBase();
		return connect.insert(this.getClass(), valueEntry);
	}

	public int update(Object valueEntry) {
		DataBase connect = new DataBase();
		return connect.update(this.getClass(), valueEntry);
	}

	public int delete(String where, ArrayList<ParameterSql> parameters) {
		DataBase connect = new DataBase();
		return connect.delete(this.getClass(), where, parameters);
	}
}

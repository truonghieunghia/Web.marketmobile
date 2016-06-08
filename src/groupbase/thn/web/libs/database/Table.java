package groupbase.thn.web.libs.database;

import java.util.ArrayList;

public class Table {
	/**
	 * select all item
	 * 
	 * @return arrayList
	 */
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectAll() {
		DataBase connect = new DataBase();
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), null);
	}

	/**
	 * select all item with where
	 * 
	 * @param where
	 * @return arrayList
	 */
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectWhere(String where) {
		DataBase connect = new DataBase();
		return (ArrayList<T>) connect.executeQueryEntry(this.getClass(), where);
	}

	/**
	 * add item
	 * 
	 * @param valueEntry
	 * @return
	 */
	public int add(Object valueEntry) {
		DataBase connect = new DataBase();
		return connect.insert(this.getClass(), valueEntry);
	}

	/**
	 * update item
	 * 
	 * @param valueEntry
	 * @return
	 */
	public int update(Object valueEntry) {
		DataBase connect = new DataBase();
		return connect.update(this.getClass(), valueEntry);
	}

	/**
	 * delete item
	 * @param where
	 * @param parameters
	 * @return
	 */
	public int delete(String where, ArrayList<ParameterSql> parameters) {
		DataBase connect = new DataBase();
		return connect.delete(this.getClass(), where, parameters);
	}
}

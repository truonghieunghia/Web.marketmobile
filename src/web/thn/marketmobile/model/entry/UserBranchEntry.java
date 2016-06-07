package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "user_branch")
public class UserBranchEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String user_id_Col = "user_id";
	public static String userName_Col = "userName";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int id = 0;

	@ColumnNameAnnotation(ColumnName = "user_id", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int user_id = 0;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName = "";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

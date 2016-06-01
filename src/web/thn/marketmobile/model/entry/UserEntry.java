package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "user")
public class UserEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Field = "userID";
	public static String userName_Field = "userName";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName;

	public int getuserID() {
		return userID;
	}

	public void setuserID(int userid) {
		userID = userid;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String username) {
		userName = username;
	}

}

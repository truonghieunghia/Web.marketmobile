package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "user_branch")
public class UserBranchEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String branchID_Col = "branchID";
	public static String userID_Col = "userID";

	@ColumnNameAnnotation(ColumnName = "branchID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int branchID;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, MaxLength = 11)
	private int userID;

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}

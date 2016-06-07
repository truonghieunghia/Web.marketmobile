package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_import")
public class ProductImportEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String importDate_Col = "importDate";
	public static String totalMoney_Col = "totalMoney";
	public static String comment_Col = "comment";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "importDate", FieldType = String.class, MaxLength = 8)
	private String importDate;

	@ColumnNameAnnotation(ColumnName = "totalMoney", FieldType = String.class, MaxLength = 45)
	private String totalMoney;

	@ColumnNameAnnotation(ColumnName = "comment", FieldType = String.class)
	private String comment;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getImportDate() {
		return importDate;
	}

	public void setImportDate(String importDate) {
		this.importDate = importDate;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}

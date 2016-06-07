package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_export")
public class ProductExportEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String exportDate_Col = "exportDate";
	public static String totalMoney_Col = "totalMoney";
	public static String comment_Col = "comment";
	public static String userOrderName_Col = "userOrderName";
	public static String userOrderAddress_Col = "userOrderAddress";
	public static String userOrderID_Col = "userOrderID";
	public static String userOrderPhone_Col = "userOrderPhone";
	public static String userOrderEmail_Col = "userOrderEmail";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no = 0;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String userID = "";

	@ColumnNameAnnotation(ColumnName = "exportDate", FieldType = String.class, MaxLength = 8)
	private String exportDate = "";

	@ColumnNameAnnotation(ColumnName = "totalMoney", FieldType = Double.class)
	private double totalMoney = 0;

	@ColumnNameAnnotation(ColumnName = "comment", FieldType = String.class, MaxLength = 45)
	private String comment = "";

	@ColumnNameAnnotation(ColumnName = "userOrderName", FieldType = String.class, MaxLength = 45)
	private String userOrderName = "";

	@ColumnNameAnnotation(ColumnName = "userOrderAddress", FieldType = String.class, MaxLength = 45)
	private String userOrderAddress = "";

	@ColumnNameAnnotation(ColumnName = "userOrderID", FieldType = Integer.class, MaxLength = 11)
	private int userOrderID = 0;

	@ColumnNameAnnotation(ColumnName = "userOrderPhone", FieldType = String.class, MaxLength = 45)
	private String userOrderPhone = "";

	@ColumnNameAnnotation(ColumnName = "userOrderEmail", FieldType = String.class, MaxLength = 45)
	private String userOrderEmail = "";

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getExportDate() {
		return exportDate;
	}

	public void setExportDate(String exportDate) {
		this.exportDate = exportDate;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserOrderName() {
		return userOrderName;
	}

	public void setUserOrderName(String userOrderName) {
		this.userOrderName = userOrderName;
	}

	public String getUserOrderAddress() {
		return userOrderAddress;
	}

	public void setUserOrderAddress(String userOrderAddress) {
		this.userOrderAddress = userOrderAddress;
	}

	public int getUserOrderID() {
		return userOrderID;
	}

	public void setUserOrderID(int userOrderID) {
		this.userOrderID = userOrderID;
	}

	public String getUserOrderPhone() {
		return userOrderPhone;
	}

	public void setUserOrderPhone(String userOrderPhone) {
		this.userOrderPhone = userOrderPhone;
	}

	public String getUserOrderEmail() {
		return userOrderEmail;
	}

	public void setUserOrderEmail(String userOrderEmail) {
		this.userOrderEmail = userOrderEmail;
	}

}

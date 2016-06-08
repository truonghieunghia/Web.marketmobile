package web.groupbase.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_order")
public class ProductOrderEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String orderDate_Col = "orderDate";
	public static String totalMoney_Col = "totalMoney";
	public static String comment_Col = "comment";
	public static String product_ordercol_Col = "product_ordercol";
	public static String userOrderName_Col = "userOrderName";
	public static String userOrderAddress_Col = "userOrderAddress";
	public static String userOrderID_Col = "userOrderID";
	public static String userOrderPhone_Col = "userOrderPhone";
	public static String userOrderEmail_Col = "userOrderEmail";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no = 0;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID = 0;

	@ColumnNameAnnotation(ColumnName = "orderDate", FieldType = String.class, MaxLength = 8)
	private String orderDate = "";

	@ColumnNameAnnotation(ColumnName = "totalMoney", FieldType = Double.class)
	private double totalMoney = 0;

	@ColumnNameAnnotation(ColumnName = "comment", FieldType = String.class)
	private String comment = "";

	@ColumnNameAnnotation(ColumnName = "product_ordercol", FieldType = String.class, MaxLength = 45)
	private String product_ordercol = "";

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

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
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

	public String getProduct_ordercol() {
		return product_ordercol;
	}

	public void setProduct_ordercol(String product_ordercol) {
		this.product_ordercol = product_ordercol;
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

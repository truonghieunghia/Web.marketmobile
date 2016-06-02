package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "product_order")
public class Product_orderEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_orderNO_Field = "product_orderNO";
	public static String userID_Field = "userID";
	public static String product_TotalPrice_Field = "product_TotalPrice";
	public static String product_totalNumber_Field = "product_totalNumber";
	public static String product_orderDate_Field = "product_orderDate";

	@ColumnNameAnnotation(ColumnName = "product_orderNO", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int product_orderNO;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "product_TotalPrice", FieldType = Integer.class, MaxLength = 11)
	private int product_TotalPrice;

	@ColumnNameAnnotation(ColumnName = "product_totalNumber", FieldType = Integer.class, MaxLength = 11)
	private int product_totalNumber;

	@ColumnNameAnnotation(ColumnName = "product_orderDate", FieldType = String.class, MaxLength = 8)
	private String product_orderDate;

	public int getProduct_orderNO() {
		return product_orderNO;
	}

	public void setProduct_orderNO(int product_orderNO) {
		this.product_orderNO = product_orderNO;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getProduct_TotalPrice() {
		return product_TotalPrice;
	}

	public void setProduct_TotalPrice(int product_TotalPrice) {
		this.product_TotalPrice = product_TotalPrice;
	}

	public int getProduct_totalNumber() {
		return product_totalNumber;
	}

	public void setProduct_totalNumber(int product_totalNumber) {
		this.product_totalNumber = product_totalNumber;
	}

	public String getProduct_orderDate() {
		return product_orderDate;
	}

	public void setProduct_orderDate(String product_orderDate) {
		this.product_orderDate = product_orderDate;
	}

}

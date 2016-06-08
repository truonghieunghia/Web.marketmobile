package thn.groupbase.web.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_price")
public class ProductPriceEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Col = "userID";
	public static String userName_Col = "userName";
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String price_Col = "price";
	public static String priceVAT_Col = "priceVAT";
	public static String priceDate_Col = "priceDate";
	public static String discount_Col = "discount";
	public static String datediscountstart_Col = "datediscountstart";
	public static String datediscountend_Col = "datediscountend";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID = 0;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName = "";

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID = "";

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName = "";

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Integer.class, MaxLength = 11)
	private int price = 0;

	@ColumnNameAnnotation(ColumnName = "priceVAT", FieldType = Integer.class, MaxLength = 11)
	private int priceVAT = 0;

	@ColumnNameAnnotation(ColumnName = "priceDate", FieldType = String.class, MaxLength = 8)
	private String priceDate = "";

	@ColumnNameAnnotation(ColumnName = "discount", FieldType = Integer.class, MaxLength = 11)
	private int discount = 0;

	@ColumnNameAnnotation(ColumnName = "datediscountstart", FieldType = String.class, MaxLength = 8)
	private String datediscountstart = "";

	@ColumnNameAnnotation(ColumnName = "datediscountend", FieldType = String.class, MaxLength = 8)
	private String datediscountend = "";

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPriceVAT() {
		return priceVAT;
	}

	public void setPriceVAT(int priceVAT) {
		this.priceVAT = priceVAT;
	}

	public String getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(String priceDate) {
		this.priceDate = priceDate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDatediscountstart() {
		return datediscountstart;
	}

	public void setDatediscountstart(String datediscountstart) {
		this.datediscountstart = datediscountstart;
	}

	public String getDatediscountend() {
		return datediscountend;
	}

	public void setDatediscountend(String datediscountend) {
		this.datediscountend = datediscountend;
	}

}

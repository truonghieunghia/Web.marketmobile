package thn.groupbase.web.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_order_detail")
public class ProductOrderDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String stt_Col = "stt";
	public static String price_Col = "price";
	public static String number_Col = "number";
	public static String priceVAT_Col = "priceVAT";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no = 0;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID = 0;

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID = "";

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName = "";

	@ColumnNameAnnotation(ColumnName = "stt", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int stt = 0;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Double.class)
	private double price = 0;

	@ColumnNameAnnotation(ColumnName = "number", FieldType = Double.class)
	private double number = 0;

	@ColumnNameAnnotation(ColumnName = "priceVAT", FieldType = Double.class)
	private double priceVAT = 0;

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

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public double getPriceVAT() {
		return priceVAT;
	}

	public void setPriceVAT(double priceVAT) {
		this.priceVAT = priceVAT;
	}

}

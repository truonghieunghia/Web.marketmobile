package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_export_detail")
public class ProductExportDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String productID_Col = "productID";
	public static String ProductName_Col = "ProductName";
	public static String number_Col = "number";
	public static String stt_Col = "stt";
	public static String price_Col = "price";
	public static String priceVAT_Col = "priceVAT";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no = 0;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String userID = "";

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID = "";

	@ColumnNameAnnotation(ColumnName = "ProductName", FieldType = String.class, MaxLength = 45)
	private String ProductName = "";

	@ColumnNameAnnotation(ColumnName = "number", FieldType = String.class, MaxLength = 45)
	private String number = "0";

	@ColumnNameAnnotation(ColumnName = "stt", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int stt = 0;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Double.class)
	private double price = 0;

	@ColumnNameAnnotation(ColumnName = "priceVAT", FieldType = Double.class)
	private double priceVAT = 0;

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

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		this.ProductName = productName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public double getPriceVAT() {
		return priceVAT;
	}

	public void setPriceVAT(double priceVAT) {
		this.priceVAT = priceVAT;
	}

}

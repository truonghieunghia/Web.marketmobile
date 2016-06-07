package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_import_detail")
public class ProductImportDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String no_Col = "no";
	public static String userID_Col = "userID";
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String stt_Col = "stt";
	public static String number_Col = "number";
	public static String price_Col = "price";
	public static String priceVAT_Col = "priceVAT";

	@ColumnNameAnnotation(ColumnName = "no", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int no;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID;

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName;

	@ColumnNameAnnotation(ColumnName = "stt", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int stt;

	@ColumnNameAnnotation(ColumnName = "number", FieldType = Float.class)
	private float number;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Integer.class, MaxLength = 11)
	private int price;

	@ColumnNameAnnotation(ColumnName = "priceVAT", FieldType = Integer.class, MaxLength = 11)
	private int priceVAT;

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

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
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

}

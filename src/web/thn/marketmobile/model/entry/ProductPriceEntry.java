package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_price")
public class ProductPriceEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_shopUserID_Col = "product_shopUserID";
	public static String product_shopID_Col = "product_shopID";
	public static String product_shopName_Col = "product_shopName";
	public static String price_Col = "price";
	public static String priceDate_Col = "priceDate";

	@ColumnNameAnnotation(ColumnName = "product_shopUserID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String product_shopUserID;

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Long.class, MaxLength = 10)
	private long price;

	@ColumnNameAnnotation(ColumnName = "priceDate", FieldType = String.class, MaxLength = 8)
	private String priceDate;

	public String getProduct_shopUserID() {
		return product_shopUserID;
	}

	public void setProduct_shopUserID(String product_shopUserID) {
		this.product_shopUserID = product_shopUserID;
	}

	public int getProduct_shopID() {
		return product_shopID;
	}

	public void setProduct_shopID(int product_shopID) {
		this.product_shopID = product_shopID;
	}

	public String getProduct_shopName() {
		return product_shopName;
	}

	public void setProduct_shopName(String product_shopName) {
		this.product_shopName = product_shopName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(String priceDate) {
		this.priceDate = priceDate;
	}

}

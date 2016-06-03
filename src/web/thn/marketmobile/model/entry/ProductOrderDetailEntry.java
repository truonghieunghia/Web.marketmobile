package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_order_detail")
public class ProductOrderDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_orderNO_Col = "product_orderNO";
	public static String STT_Col = "STT";
	public static String product_shopID_Col = "product_shopID";
	public static String product_shopName_Col = "product_shopName";
	public static String number_Col = "number";
	public static String price_Col = "price";

	@ColumnNameAnnotation(ColumnName = "product_orderNO", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int product_orderNO;

	@ColumnNameAnnotation(ColumnName = "STT", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String STT;

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "number", FieldType = Integer.class, MaxLength = 11)
	private int number;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Integer.class, MaxLength = 11)
	private int price;

	public int getProduct_orderNO() {
		return product_orderNO;
	}

	public void setProduct_orderNO(int product_orderNO) {
		this.product_orderNO = product_orderNO;
	}

	public String getSTT() {
		return STT;
	}

	public void setSTT(String sTT) {
		this.STT = sTT;
	}

	public String getProduct_shopID() {
		return product_shopID;
	}

	public void setProduct_shopID(String product_shopID) {
		this.product_shopID = product_shopID;
	}

	public String getProduct_shopName() {
		return product_shopName;
	}

	public void setProduct_shopName(String product_shopName) {
		this.product_shopName = product_shopName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "import_product_detail")
public class ImportProductDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String import_productID_Col = "import_productID";
	public static String product_shopID_Col = "product_shopID";
	public static String product_shopName_Col = "product_shopName";
	public static String STT_Col = "STT";
	public static String number_Col = "number";
	public static String price_Col = "price";

	@ColumnNameAnnotation(ColumnName = "import_productID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int import_productID;

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "STT", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int STT;

	@ColumnNameAnnotation(ColumnName = "number", FieldType = String.class, MaxLength = 45)
	private String number;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Long.class, MaxLength = 15)
	private long price;

	public int getImport_productID() {
		return import_productID;
	}

	public void setImport_productID(int import_productID) {
		this.import_productID = import_productID;
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

	public int getSTT() {
		return STT;
	}

	public void setSTT(int sTT) {
		this.STT = sTT;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}

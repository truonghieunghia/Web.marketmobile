package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_export_detail")
public class ProductExportDetailEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String exportNo_Col = "exportNo";
	public static String STT_Col = "STT";
	public static String product_shopID_Col = "product_shopID";
	public static String product_shopName_Col = "product_shopName";
	public static String price_Col = "price";
	public static String number_Col = "number";

	@ColumnNameAnnotation(ColumnName = "exportNo", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int exportNo;

	@ColumnNameAnnotation(ColumnName = "STT", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String STT;

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "price", FieldType = Integer.class, MaxLength = 11)
	private int price;

	@ColumnNameAnnotation(ColumnName = "number", FieldType = Integer.class, MaxLength = 11)
	private int number;

	public int getExportNo() {
		return exportNo;
	}

	public void setExportNo(int exportNo) {
		this.exportNo = exportNo;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

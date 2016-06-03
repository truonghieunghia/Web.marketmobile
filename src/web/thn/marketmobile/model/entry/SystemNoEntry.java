package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "systemNo")
public class SystemNoEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String shopID_Col = "shopID";
	public static String importNo_Col = "importNo";
	public static String orderNo_Col = "orderNo";
	public static String exportNo_Col = "exportNo";
	public static String shopName_Col = "shopName";

	@ColumnNameAnnotation(ColumnName = "shopID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int shopID;

	@ColumnNameAnnotation(ColumnName = "importNo", FieldType = Integer.class, MaxLength = 11)
	private int importNo;

	@ColumnNameAnnotation(ColumnName = "orderNo", FieldType = Integer.class, MaxLength = 11)
	private int orderNo;

	@ColumnNameAnnotation(ColumnName = "exportNo", FieldType = Integer.class, MaxLength = 11)
	private int exportNo;

	@ColumnNameAnnotation(ColumnName = "shopName", FieldType = String.class, MaxLength = 45)
	private String shopName;

	public int getShopID() {
		return shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}

	public int getImportNo() {
		return importNo;
	}

	public void setImportNo(int importNo) {
		this.importNo = importNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getExportNo() {
		return exportNo;
	}

	public void setExportNo(int exportNo) {
		this.exportNo = exportNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}

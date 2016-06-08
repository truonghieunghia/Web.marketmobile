package thn.groupbase.web.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_inventory")
public class ProductInventoryEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Col = "userID";
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String totalImport_Col = "totalImport";
	public static String totalExport_Col = "totalExport";
	public static String totalExisting_Col = "totalExisting";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID = 0;

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID = "";

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName = "";

	@ColumnNameAnnotation(ColumnName = "totalImport", FieldType = Integer.class, MaxLength = 11)
	private int totalImport = 0;

	@ColumnNameAnnotation(ColumnName = "totalExport", FieldType = Integer.class, MaxLength = 11)
	private int totalExport = 0;

	@ColumnNameAnnotation(ColumnName = "totalExisting", FieldType = Integer.class, MaxLength = 11)
	private int totalExisting = 0;

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

	public int getTotalImport() {
		return totalImport;
	}

	public void setTotalImport(int totalImport) {
		this.totalImport = totalImport;
	}

	public int getTotalExport() {
		return totalExport;
	}

	public void setTotalExport(int totalExport) {
		this.totalExport = totalExport;
	}

	public int getTotalExisting() {
		return totalExisting;
	}

	public void setTotalExisting(int totalExisting) {
		this.totalExisting = totalExisting;
	}

}

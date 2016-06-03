package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_inventory")
public class ProductInventoryEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_shopID_Col = "product_shopID";
	public static String product_shopName_Col = "product_shopName";
	public static String numberInport_Col = "numberInport";
	public static String numberExport_Col = "numberExport";
	public static String shopID_Col = "shopID";
	public static String numberExisting_Col = "numberExisting";

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "numberInport", FieldType = Integer.class, MaxLength = 11)
	private int numberInport;

	@ColumnNameAnnotation(ColumnName = "numberExport", FieldType = String.class, MaxLength = 45)
	private String numberExport;

	@ColumnNameAnnotation(ColumnName = "shopID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int shopID;

	@ColumnNameAnnotation(ColumnName = "numberExisting", FieldType = Integer.class, MaxLength = 11)
	private int numberExisting;

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

	public int getNumberInport() {
		return numberInport;
	}

	public void setNumberInport(int numberInport) {
		this.numberInport = numberInport;
	}

	public String getNumberExport() {
		return numberExport;
	}

	public void setNumberExport(String numberExport) {
		this.numberExport = numberExport;
	}

	public int getShopID() {
		return shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}

	public int getNumberExisting() {
		return numberExisting;
	}

	public void setNumberExisting(int numberExisting) {
		this.numberExisting = numberExisting;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "product_storage")
public class Product_storageEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_storageID_Field = "product_storageID";
	public static String product_storageName_Field = "product_storageName";

	@ColumnNameAnnotation(ColumnName = "product_storageID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int product_storageID;

	@ColumnNameAnnotation(ColumnName = "product_storageName", FieldType = String.class, MaxLength = 45)
	private String product_storageName;

	public int getProduct_storageID() {
		return product_storageID;
	}

	public void setProduct_storageID(int product_storageID) {
		this.product_storageID = product_storageID;
	}

	public String getProduct_storageName() {
		return product_storageName;
	}

	public void setProduct_storageName(String product_storageName) {
		this.product_storageName = product_storageName;
	}

}

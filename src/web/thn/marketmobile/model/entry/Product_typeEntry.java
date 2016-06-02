package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "product_type")
public class Product_typeEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_typeID_Field = "product_typeID";
	public static String product_typeName_Field = "product_typeName";

	@ColumnNameAnnotation(ColumnName = "product_typeID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int product_typeID;

	@ColumnNameAnnotation(ColumnName = "product_typeName", FieldType = String.class, MaxLength = 45)
	private String product_typeName;

	public int getProduct_typeID() {
		return product_typeID;
	}

	public void setProduct_typeID(int product_typeID) {
		this.product_typeID = product_typeID;
	}

	public String getProduct_typeName() {
		return product_typeName;
	}

	public void setProduct_typeName(String product_typeName) {
		this.product_typeName = product_typeName;
	}

}

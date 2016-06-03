package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_color")
public class ProductColorEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_colorID_Col = "product_colorID";
	public static String product_colorName_Col = "product_colorName";

	@ColumnNameAnnotation(ColumnName = "product_colorID", FieldType = String.class, isPrimary = true, MaxLength = 10)
	private String product_colorID;

	@ColumnNameAnnotation(ColumnName = "product_colorName", FieldType = String.class, MaxLength = 45)
	private String product_colorName;

	public String getProduct_colorID() {
		return product_colorID;
	}

	public void setProduct_colorID(String product_colorID) {
		this.product_colorID = product_colorID;
	}

	public String getProduct_colorName() {
		return product_colorName;
	}

	public void setProduct_colorName(String product_colorName) {
		this.product_colorName = product_colorName;
	}

}

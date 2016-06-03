package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "brand")
public class BrandEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String brandID_Col = "brandID";
	public static String brandName_Col = "brandName";

	@ColumnNameAnnotation(ColumnName = "brandID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int brandID;

	@ColumnNameAnnotation(ColumnName = "brandName", FieldType = String.class, MaxLength = 45)
	private String brandName;

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "category")
public class CategoryEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String categoryID_Col = "categoryID";
	public static String categoryName_Col = "categoryName";

	@ColumnNameAnnotation(ColumnName = "categoryID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int categoryID;

	@ColumnNameAnnotation(ColumnName = "categoryName", FieldType = String.class, MaxLength = 45)
	private String categoryName;

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}

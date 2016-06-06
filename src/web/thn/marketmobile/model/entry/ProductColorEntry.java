package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_color")
public class ProductColorEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String name_Col = "name";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = String.class, isPrimary = true, MaxLength = 10)
	private String id;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

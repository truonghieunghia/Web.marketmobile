package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "brand")
public class BrandEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String name_Col = "name";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int id;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

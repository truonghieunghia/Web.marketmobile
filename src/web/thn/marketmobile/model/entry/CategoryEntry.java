package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "category")
public class CategoryEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String name_Col = "name";
	public static String pathID_Col = "pathID";
	public static String pathName_Col = "pathName";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String id;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	@ColumnNameAnnotation(ColumnName = "pathID", FieldType = String.class, MaxLength = 45)
	private String pathID;

	@ColumnNameAnnotation(ColumnName = "pathName", FieldType = String.class)
	private String pathName;

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

	public String getPathID() {
		return pathID;
	}

	public void setPathID(String pathID) {
		this.pathID = pathID;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

}

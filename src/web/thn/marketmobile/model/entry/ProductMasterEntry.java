package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_master")
public class ProductMasterEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String name_Col = "name";
	public static String imageList_Col = "imageList";
	public static String detail_Col = "detail";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String id;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	@ColumnNameAnnotation(ColumnName = "imageList", FieldType = String.class, MaxLength = 45)
	private String imageList;

	@ColumnNameAnnotation(ColumnName = "detail", FieldType = String.class, MaxLength = 45)
	private String detail;

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

	public String getImageList() {
		return imageList;
	}

	public void setImageList(String imageList) {
		this.imageList = imageList;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}

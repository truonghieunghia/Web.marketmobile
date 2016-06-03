package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_info")
public class ProductInfoEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String tempID_Col = "tempID";
	public static String htmlData_Col = "htmlData";

	@ColumnNameAnnotation(ColumnName = "tempID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int tempID;

	@ColumnNameAnnotation(ColumnName = "htmlData", FieldType = String.class, MaxLength = 45)
	private String htmlData;

	public int getTempID() {
		return tempID;
	}

	public void setTempID(int tempID) {
		this.tempID = tempID;
	}

	public String getHtmlData() {
		return htmlData;
	}

	public void setHtmlData(String htmlData) {
		this.htmlData = htmlData;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_info_shop")
public class ProductInfoShopEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String tempID_Col = "tempID";
	public static String htmlData_Col = "htmlData";
	public static String shopID_Col = "shopID";

	@ColumnNameAnnotation(ColumnName = "tempID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int tempID;

	@ColumnNameAnnotation(ColumnName = "htmlData", FieldType = String.class, MaxLength = 200)
	private String htmlData;

	@ColumnNameAnnotation(ColumnName = "shopID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String shopID;

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

	public String getShopID() {
		return shopID;
	}

	public void setShopID(String shopID) {
		this.shopID = shopID;
	}

}

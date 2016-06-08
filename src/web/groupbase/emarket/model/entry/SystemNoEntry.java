package web.groupbase.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "system_no")
public class SystemNoEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Col = "userID";
	public static String importNo_Col = "importNo";
	public static String exportNo_Col = "exportNo";
	public static String orderNo_Col = "orderNo";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID = 0;

	@ColumnNameAnnotation(ColumnName = "importNo", FieldType = Integer.class, MaxLength = 11)
	private int importNo = 0;

	@ColumnNameAnnotation(ColumnName = "exportNo", FieldType = Integer.class, MaxLength = 11)
	private int exportNo = 0;

	@ColumnNameAnnotation(ColumnName = "orderNo", FieldType = Integer.class, MaxLength = 11)
	private int orderNo = 0;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getImportNo() {
		return importNo;
	}

	public void setImportNo(int importNo) {
		this.importNo = importNo;
	}

	public int getExportNo() {
		return exportNo;
	}

	public void setExportNo(int exportNo) {
		this.exportNo = exportNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_export")
public class ProductExportEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String exportNO_Col = "exportNO";
	public static String orderNO_Col = "orderNO";
	public static String userID_Col = "userID";
	public static String userName_Col = "userName";
	public static String totalPrice_Col = "totalPrice";
	public static String totalNumber_Col = "totalNumber";

	@ColumnNameAnnotation(ColumnName = "exportNO", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int exportNO;

	@ColumnNameAnnotation(ColumnName = "orderNO", FieldType = Integer.class, MaxLength = 11)
	private int orderNO;

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName;

	@ColumnNameAnnotation(ColumnName = "totalPrice", FieldType = Integer.class, MaxLength = 11)
	private int totalPrice;

	@ColumnNameAnnotation(ColumnName = "totalNumber", FieldType = String.class, MaxLength = 45)
	private String totalNumber;

	public int getExportNO() {
		return exportNO;
	}

	public void setExportNO(int exportNO) {
		this.exportNO = exportNO;
	}

	public int getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(int orderNO) {
		this.orderNO = orderNO;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}

}

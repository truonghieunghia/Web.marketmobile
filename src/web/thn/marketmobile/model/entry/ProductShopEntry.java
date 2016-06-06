package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_shop")
public class ProductShopEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Col = "userID";
	public static String id_Col = "id";
	public static String name_Col = "name";
	public static String imageList_Col = "imageList";
	public static String detail_Col = "detail";
	public static String userBranchID_Col = "userBranchID";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "id", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String id;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	@ColumnNameAnnotation(ColumnName = "imageList", FieldType = String.class, MaxLength = 45)
	private String imageList;

	@ColumnNameAnnotation(ColumnName = "detail", FieldType = String.class, MaxLength = 45)
	private String detail;

	@ColumnNameAnnotation(ColumnName = "userBranchID", FieldType = Integer.class, MaxLength = 11)
	private int userBranchID;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

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

	public int getUserBranchID() {
		return userBranchID;
	}

	public void setUserBranchID(int userBranchID) {
		this.userBranchID = userBranchID;
	}

}

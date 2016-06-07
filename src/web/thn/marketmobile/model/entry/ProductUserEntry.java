package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_user")
public class ProductUserEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Col = "userID";
	public static String userBranchID_Col = "userBranchID";
	public static String userName_Col = "userName";
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String originID_Col = "originID";
	public static String originName_Col = "originName";
	public static String brandID_Col = "brandID";
	public static String brandName_Col = "brandName";
	public static String categoryID_Col = "categoryID";
	public static String categoryName_Col = "categoryName";
	public static String detail_Col = "detail";
	public static String extID_Col = "extID";
	public static String stateID_Col = "stateID";
	public static String stateName_Col = "stateName";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "userBranchID", FieldType = Integer.class, MaxLength = 11)
	private int userBranchID;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName;

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID;

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName;

	@ColumnNameAnnotation(ColumnName = "originID", FieldType = Integer.class, MaxLength = 11)
	private int originID;

	@ColumnNameAnnotation(ColumnName = "originName", FieldType = String.class, MaxLength = 45)
	private String originName;

	@ColumnNameAnnotation(ColumnName = "brandID", FieldType = Integer.class, MaxLength = 11)
	private int brandID;

	@ColumnNameAnnotation(ColumnName = "brandName", FieldType = String.class, MaxLength = 45)
	private String brandName;

	@ColumnNameAnnotation(ColumnName = "categoryID", FieldType = String.class, MaxLength = 45)
	private String categoryID;

	@ColumnNameAnnotation(ColumnName = "categoryName", FieldType = String.class, MaxLength = 45)
	private String categoryName;

	@ColumnNameAnnotation(ColumnName = "detail", FieldType = String.class)
	private String detail;

	@ColumnNameAnnotation(ColumnName = "extID", FieldType = Integer.class, MaxLength = 11)
	private int extID;

	@ColumnNameAnnotation(ColumnName = "stateID", FieldType = Integer.class, MaxLength = 11)
	private int stateID;

	@ColumnNameAnnotation(ColumnName = "stateName", FieldType = String.class, MaxLength = 45)
	private String stateName;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getUserBranchID() {
		return userBranchID;
	}

	public void setUserBranchID(int userBranchID) {
		this.userBranchID = userBranchID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getOriginID() {
		return originID;
	}

	public void setOriginID(int originID) {
		this.originID = originID;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getExtID() {
		return extID;
	}

	public void setExtID(int extID) {
		this.extID = extID;
	}

	public int getStateID() {
		return stateID;
	}

	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}

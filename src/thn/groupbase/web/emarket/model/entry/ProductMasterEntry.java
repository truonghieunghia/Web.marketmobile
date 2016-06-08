package thn.groupbase.web.emarket.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product_master")
public class ProductMasterEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
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

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID = "";

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName = "";

	@ColumnNameAnnotation(ColumnName = "originID", FieldType = Integer.class, MaxLength = 11)
	private int originID = 0;

	@ColumnNameAnnotation(ColumnName = "originName", FieldType = String.class, MaxLength = 45)
	private String originName = "";

	@ColumnNameAnnotation(ColumnName = "brandID", FieldType = Integer.class, MaxLength = 11)
	private int brandID = 0;

	@ColumnNameAnnotation(ColumnName = "brandName", FieldType = String.class, MaxLength = 45)
	private String brandName = "";

	@ColumnNameAnnotation(ColumnName = "categoryID", FieldType = String.class, MaxLength = 45)
	private String categoryID = "0";

	@ColumnNameAnnotation(ColumnName = "categoryName", FieldType = String.class, MaxLength = 45)
	private String categoryName = "";

	@ColumnNameAnnotation(ColumnName = "detail", FieldType = String.class)
	private String detail = "";

	@ColumnNameAnnotation(ColumnName = "extID", FieldType = Integer.class, MaxLength = 11)
	private int extID = 0;

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

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "product")
public class ProductEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String productID_Col = "productID";
	public static String productName_Col = "productName";
	public static String productColor_Col = "productColor";
	public static String productColorName_Col = "productColorName";
	public static String productTypeID_Col = "productTypeID";
	public static String productTypeName_Col = "productTypeName";
	public static String productStateID_Col = "productStateID";
	public static String productStateName_Col = "productStateName";
	public static String productImage_Col = "productImage";
	public static String productBrandID_Col = "productBrandID";
	public static String productBrandName_Col = "productBrandName";
	public static String productStorageID_Col = "productStorageID";
	public static String productStorageName_Col = "productStorageName";
	public static String productInfoID_Col = "productInfoID";

	@ColumnNameAnnotation(ColumnName = "productID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String productID;

	@ColumnNameAnnotation(ColumnName = "productName", FieldType = String.class, MaxLength = 45)
	private String productName;

	@ColumnNameAnnotation(ColumnName = "productColor", FieldType = String.class, MaxLength = 45)
	private String productColor;

	@ColumnNameAnnotation(ColumnName = "productColorName", FieldType = String.class, MaxLength = 45)
	private String productColorName;

	@ColumnNameAnnotation(ColumnName = "productTypeID", FieldType = String.class, MaxLength = 45)
	private String productTypeID;

	@ColumnNameAnnotation(ColumnName = "productTypeName", FieldType = String.class, MaxLength = 45)
	private String productTypeName;

	@ColumnNameAnnotation(ColumnName = "productStateID", FieldType = String.class, MaxLength = 45)
	private String productStateID;

	@ColumnNameAnnotation(ColumnName = "productStateName", FieldType = String.class, MaxLength = 45)
	private String productStateName;

	@ColumnNameAnnotation(ColumnName = "productImage", FieldType = String.class, MaxLength = 45)
	private String productImage;

	@ColumnNameAnnotation(ColumnName = "productBrandID", FieldType = String.class, MaxLength = 45)
	private String productBrandID;

	@ColumnNameAnnotation(ColumnName = "productBrandName", FieldType = String.class, MaxLength = 45)
	private String productBrandName;

	@ColumnNameAnnotation(ColumnName = "productStorageID", FieldType = String.class, MaxLength = 45)
	private String productStorageID;

	@ColumnNameAnnotation(ColumnName = "productStorageName", FieldType = String.class, MaxLength = 45)
	private String productStorageName;

	@ColumnNameAnnotation(ColumnName = "productInfoID", FieldType = String.class, MaxLength = 45)
	private String productInfoID;

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

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductColorName() {
		return productColorName;
	}

	public void setProductColorName(String productColorName) {
		this.productColorName = productColorName;
	}

	public String getProductTypeID() {
		return productTypeID;
	}

	public void setProductTypeID(String productTypeID) {
		this.productTypeID = productTypeID;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getProductStateID() {
		return productStateID;
	}

	public void setProductStateID(String productStateID) {
		this.productStateID = productStateID;
	}

	public String getProductStateName() {
		return productStateName;
	}

	public void setProductStateName(String productStateName) {
		this.productStateName = productStateName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductBrandID() {
		return productBrandID;
	}

	public void setProductBrandID(String productBrandID) {
		this.productBrandID = productBrandID;
	}

	public String getProductBrandName() {
		return productBrandName;
	}

	public void setProductBrandName(String productBrandName) {
		this.productBrandName = productBrandName;
	}

	public String getProductStorageID() {
		return productStorageID;
	}

	public void setProductStorageID(String productStorageID) {
		this.productStorageID = productStorageID;
	}

	public String getProductStorageName() {
		return productStorageName;
	}

	public void setProductStorageName(String productStorageName) {
		this.productStorageName = productStorageName;
	}

	public String getProductInfoID() {
		return productInfoID;
	}

	public void setProductInfoID(String productInfoID) {
		this.productInfoID = productInfoID;
	}

}

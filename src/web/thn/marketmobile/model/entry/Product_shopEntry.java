package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "product_shop")
public class Product_shopEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_shopUserID_Field = "product_shopUserID";
	public static String product_shopID_Field = "product_shopID";
	public static String product_shopName_Field = "product_shopName";
	public static String product_shopColor_Field = "product_shopColor";
	public static String product_shopColorName_Field = "product_shopColorName";
	public static String product_shopTypeID_Field = "product_shopTypeID";
	public static String product_shopTypeName_Field = "product_shopTypeName";
	public static String product_shopStateID_Field = "product_shopStateID";
	public static String product_shopStateName_Field = "product_shopStateName";
	public static String product_shopImage_Field = "product_shopImage";
	public static String product_shopBrandID_Field = "product_shopBrandID";
	public static String product_shopBrandName_Field = "product_shopBrandName";
	public static String product_shopStorageID_Field = "product_shopStorageID";
	public static String product_shopStorageName_Field = "product_shopStorageName";
	public static String product_shopInfoID_Field = "product_shopInfoID";

	@ColumnNameAnnotation(ColumnName = "product_shopUserID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int product_shopUserID;

	@ColumnNameAnnotation(ColumnName = "product_shopID", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String product_shopID;

	@ColumnNameAnnotation(ColumnName = "product_shopName", FieldType = String.class, MaxLength = 45)
	private String product_shopName;

	@ColumnNameAnnotation(ColumnName = "product_shopColor", FieldType = String.class, MaxLength = 45)
	private String product_shopColor;

	@ColumnNameAnnotation(ColumnName = "product_shopColorName", FieldType = String.class, MaxLength = 45)
	private String product_shopColorName;

	@ColumnNameAnnotation(ColumnName = "product_shopTypeID", FieldType = String.class, MaxLength = 45)
	private String product_shopTypeID;

	@ColumnNameAnnotation(ColumnName = "product_shopTypeName", FieldType = String.class, MaxLength = 45)
	private String product_shopTypeName;

	@ColumnNameAnnotation(ColumnName = "product_shopStateID", FieldType = String.class, MaxLength = 45)
	private String product_shopStateID;

	@ColumnNameAnnotation(ColumnName = "product_shopStateName", FieldType = String.class, MaxLength = 45)
	private String product_shopStateName;

	@ColumnNameAnnotation(ColumnName = "product_shopImage", FieldType = String.class, MaxLength = 45)
	private String product_shopImage;

	@ColumnNameAnnotation(ColumnName = "product_shopBrandID", FieldType = String.class, MaxLength = 45)
	private String product_shopBrandID;

	@ColumnNameAnnotation(ColumnName = "product_shopBrandName", FieldType = String.class, MaxLength = 45)
	private String product_shopBrandName;

	@ColumnNameAnnotation(ColumnName = "product_shopStorageID", FieldType = String.class, MaxLength = 45)
	private String product_shopStorageID;

	@ColumnNameAnnotation(ColumnName = "product_shopStorageName", FieldType = String.class, MaxLength = 45)
	private String product_shopStorageName;

	@ColumnNameAnnotation(ColumnName = "product_shopInfoID", FieldType = String.class, MaxLength = 45)
	private String product_shopInfoID;

	public int getProduct_shopUserID() {
		return product_shopUserID;
	}

	public void setProduct_shopUserID(int product_shopUserID) {
		this.product_shopUserID = product_shopUserID;
	}

	public String getProduct_shopID() {
		return product_shopID;
	}

	public void setProduct_shopID(String product_shopID) {
		this.product_shopID = product_shopID;
	}

	public String getProduct_shopName() {
		return product_shopName;
	}

	public void setProduct_shopName(String product_shopName) {
		this.product_shopName = product_shopName;
	}

	public String getProduct_shopColor() {
		return product_shopColor;
	}

	public void setProduct_shopColor(String product_shopColor) {
		this.product_shopColor = product_shopColor;
	}

	public String getProduct_shopColorName() {
		return product_shopColorName;
	}

	public void setProduct_shopColorName(String product_shopColorName) {
		this.product_shopColorName = product_shopColorName;
	}

	public String getProduct_shopTypeID() {
		return product_shopTypeID;
	}

	public void setProduct_shopTypeID(String product_shopTypeID) {
		this.product_shopTypeID = product_shopTypeID;
	}

	public String getProduct_shopTypeName() {
		return product_shopTypeName;
	}

	public void setProduct_shopTypeName(String product_shopTypeName) {
		this.product_shopTypeName = product_shopTypeName;
	}

	public String getProduct_shopStateID() {
		return product_shopStateID;
	}

	public void setProduct_shopStateID(String product_shopStateID) {
		this.product_shopStateID = product_shopStateID;
	}

	public String getProduct_shopStateName() {
		return product_shopStateName;
	}

	public void setProduct_shopStateName(String product_shopStateName) {
		this.product_shopStateName = product_shopStateName;
	}

	public String getProduct_shopImage() {
		return product_shopImage;
	}

	public void setProduct_shopImage(String product_shopImage) {
		this.product_shopImage = product_shopImage;
	}

	public String getProduct_shopBrandID() {
		return product_shopBrandID;
	}

	public void setProduct_shopBrandID(String product_shopBrandID) {
		this.product_shopBrandID = product_shopBrandID;
	}

	public String getProduct_shopBrandName() {
		return product_shopBrandName;
	}

	public void setProduct_shopBrandName(String product_shopBrandName) {
		this.product_shopBrandName = product_shopBrandName;
	}

	public String getProduct_shopStorageID() {
		return product_shopStorageID;
	}

	public void setProduct_shopStorageID(String product_shopStorageID) {
		this.product_shopStorageID = product_shopStorageID;
	}

	public String getProduct_shopStorageName() {
		return product_shopStorageName;
	}

	public void setProduct_shopStorageName(String product_shopStorageName) {
		this.product_shopStorageName = product_shopStorageName;
	}

	public String getProduct_shopInfoID() {
		return product_shopInfoID;
	}

	public void setProduct_shopInfoID(String product_shopInfoID) {
		this.product_shopInfoID = product_shopInfoID;
	}

}

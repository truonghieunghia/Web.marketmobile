package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "import_product")
public class Import_productEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String import_productID_Field = "import_productID";
	public static String import_productDate_Field = "import_productDate";
	public static String import_productTotalMoney_Field = "import_productTotalMoney";
	public static String import_productTotalNumber_Field = "import_productTotalNumber";
	public static String product_shopUserID_Field = "product_shopUserID";
	public static String comment_Field = "comment";

	@ColumnNameAnnotation(ColumnName = "import_productID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int import_productID;

	@ColumnNameAnnotation(ColumnName = "import_productDate", FieldType = String.class, MaxLength = 8)
	private String import_productDate;

	@ColumnNameAnnotation(ColumnName = "import_productTotalMoney", FieldType = Long.class, MaxLength = 15)
	private long import_productTotalMoney;

	@ColumnNameAnnotation(ColumnName = "import_productTotalNumber", FieldType = Integer.class, MaxLength = 11)
	private int import_productTotalNumber;

	@ColumnNameAnnotation(ColumnName = "product_shopUserID", FieldType = Integer.class, isPrimary = true, MaxLength = 11)
	private int product_shopUserID;

	@ColumnNameAnnotation(ColumnName = "comment", FieldType = String.class, MaxLength = 200)
	private String comment;

	public int getImport_productID() {
		return import_productID;
	}

	public void setImport_productID(int import_productID) {
		this.import_productID = import_productID;
	}

	public String getImport_productDate() {
		return import_productDate;
	}

	public void setImport_productDate(String import_productDate) {
		this.import_productDate = import_productDate;
	}

	public long getImport_productTotalMoney() {
		return import_productTotalMoney;
	}

	public void setImport_productTotalMoney(long import_productTotalMoney) {
		this.import_productTotalMoney = import_productTotalMoney;
	}

	public int getImport_productTotalNumber() {
		return import_productTotalNumber;
	}

	public void setImport_productTotalNumber(int import_productTotalNumber) {
		this.import_productTotalNumber = import_productTotalNumber;
	}

	public int getProduct_shopUserID() {
		return product_shopUserID;
	}

	public void setProduct_shopUserID(int product_shopUserID) {
		this.product_shopUserID = product_shopUserID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}

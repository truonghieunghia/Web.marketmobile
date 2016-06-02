package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "product_state")
public class Product_stateEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String product_stateID_Field = "product_stateID";
	public static String product_stateName_Field = "product_stateName";

	@ColumnNameAnnotation(ColumnName = "product_stateID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int product_stateID;

	@ColumnNameAnnotation(ColumnName = "product_stateName", FieldType = String.class, MaxLength = 45)
	private String product_stateName;

	public int getProduct_stateID() {
		return product_stateID;
	}

	public void setProduct_stateID(int product_stateID) {
		this.product_stateID = product_stateID;
	}

	public String getProduct_stateName() {
		return product_stateName;
	}

	public void setProduct_stateName(String product_stateName) {
		this.product_stateName = product_stateName;
	}

}

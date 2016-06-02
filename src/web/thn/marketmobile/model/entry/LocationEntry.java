package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "location")
public class LocationEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String locationID_Field = "locationID";
	public static String locationName_Field = "locationName";

	@ColumnNameAnnotation(ColumnName = "locationID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int locationID;

	@ColumnNameAnnotation(ColumnName = "locationName", FieldType = String.class, MaxLength = 45)
	private String locationName;

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}

package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "user")
public class UserEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String id_Col = "id";
	public static String email_Col = "email";
	public static String name_Col = "name";
	public static String phoneNumber_Col = "phoneNumber";
	public static String address_Col = "address";
	public static String latitude_Col = "latitude";
	public static String longitude_Col = "longitude";
	public static String passWord_Col = "passWord";
	public static String deviceID_Col = "deviceID";
	public static String locationID_Col = "locationID";
	public static String locationName_Col = "locationName";
	public static String roleID_Col = "roleID";
	public static String roleName_Col = "roleName";
	public static String state_Col = "state";
	public static String branchID_Col = "branchID";
	public static String sex_Col = "sex";
	public static String sexName_Col = "sexName";
	public static String logo_Col = "logo";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int id;

	@ColumnNameAnnotation(ColumnName = "email", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String email;

	@ColumnNameAnnotation(ColumnName = "name", FieldType = String.class, MaxLength = 45)
	private String name;

	@ColumnNameAnnotation(ColumnName = "phoneNumber", FieldType = String.class, MaxLength = 20)
	private String phoneNumber;

	@ColumnNameAnnotation(ColumnName = "address", FieldType = String.class, MaxLength = 200)
	private String address;

	@ColumnNameAnnotation(ColumnName = "latitude", FieldType = String.class, MaxLength = 15)
	private String latitude;

	@ColumnNameAnnotation(ColumnName = "longitude", FieldType = String.class, MaxLength = 15)
	private String longitude;

	@ColumnNameAnnotation(ColumnName = "passWord", FieldType = String.class, MaxLength = 45)
	private String passWord;

	@ColumnNameAnnotation(ColumnName = "deviceID", FieldType = String.class, MaxLength = 200)
	private String deviceID;

	@ColumnNameAnnotation(ColumnName = "locationID", FieldType = String.class, MaxLength = 3)
	private String locationID;

	@ColumnNameAnnotation(ColumnName = "locationName", FieldType = String.class, MaxLength = 45)
	private String locationName;

	@ColumnNameAnnotation(ColumnName = "roleID", FieldType = String.class, MaxLength = 3)
	private String roleID;

	@ColumnNameAnnotation(ColumnName = "roleName", FieldType = String.class, MaxLength = 45)
	private String roleName;

	@ColumnNameAnnotation(ColumnName = "state", FieldType = Integer.class, MaxLength = 11)
	private int state;

	@ColumnNameAnnotation(ColumnName = "branchID", FieldType = Integer.class, MaxLength = 11)
	private int branchID;

	@ColumnNameAnnotation(ColumnName = "sex", FieldType = Integer.class, MaxLength = 11)
	private int sex;

	@ColumnNameAnnotation(ColumnName = "sexName", FieldType = String.class, MaxLength = 45)
	private String sexName;

	@ColumnNameAnnotation(ColumnName = "logo", FieldType = String.class, MaxLength = 45)
	private String logo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}

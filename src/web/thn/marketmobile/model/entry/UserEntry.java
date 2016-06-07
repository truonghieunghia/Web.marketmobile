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
	public static String userName_Col = "userName";
	public static String fullName_Col = "fullName";
	public static String birthDate_Col = "birthDate";
	public static String sex_Col = "sex";
	public static String sexName_Col = "sexName";
	public static String passWord_Col = "passWord";
	public static String address_Col = "address";
	public static String deviceID_Col = "deviceID";
	public static String locationID_Col = "locationID";
	public static String locationName_Col = "locationName";
	public static String roleID_Col = "roleID";
	public static String roleName_Col = "roleName";
	public static String stateID_Col = "stateID";
	public static String stateName_Col = "stateName";
	public static String branchID_Col = "branchID";
	public static String latitude_Col = "latitude";
	public static String longitude_Col = "longitude";
	public static String logo_Col = "logo";
	public static String type_Col = "type";

	@ColumnNameAnnotation(ColumnName = "id", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int id;

	@ColumnNameAnnotation(ColumnName = "email", FieldType = String.class, MaxLength = 45)
	private String email = "";

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName = "";

	@ColumnNameAnnotation(ColumnName = "fullName", FieldType = String.class, MaxLength = 45)
	private String fullName = "";

	@ColumnNameAnnotation(ColumnName = "birthDate", FieldType = String.class, MaxLength = 8)
	private String birthDate = "";

	@ColumnNameAnnotation(ColumnName = "sex", FieldType = Integer.class, MaxLength = 11)
	private int sex = 0;

	@ColumnNameAnnotation(ColumnName = "sexName", FieldType = String.class, MaxLength = 45)
	private String sexName = "";

	@ColumnNameAnnotation(ColumnName = "passWord", FieldType = String.class, MaxLength = 45)
	private String passWord = "";

	@ColumnNameAnnotation(ColumnName = "address", FieldType = String.class, MaxLength = 45)
	private String address = "";

	@ColumnNameAnnotation(ColumnName = "deviceID", FieldType = String.class, MaxLength = 45)
	private String deviceID = "";

	@ColumnNameAnnotation(ColumnName = "locationID", FieldType = Integer.class, MaxLength = 11)
	private int locationID = 0;

	@ColumnNameAnnotation(ColumnName = "locationName", FieldType = String.class, MaxLength = 45)
	private String locationName = "";

	@ColumnNameAnnotation(ColumnName = "roleID", FieldType = Integer.class, MaxLength = 11)
	private int roleID = 0;

	@ColumnNameAnnotation(ColumnName = "roleName", FieldType = String.class, MaxLength = 45)
	private String roleName = "";

	@ColumnNameAnnotation(ColumnName = "stateID", FieldType = Integer.class, MaxLength = 11)
	private int stateID = 0;

	@ColumnNameAnnotation(ColumnName = "stateName", FieldType = String.class, MaxLength = 45)
	private String stateName = "";

	@ColumnNameAnnotation(ColumnName = "branchID", FieldType = Integer.class, MaxLength = 11)
	private int branchID = 0;

	@ColumnNameAnnotation(ColumnName = "latitude", FieldType = String.class, MaxLength = 45)
	private String latitude = "";

	@ColumnNameAnnotation(ColumnName = "longitude", FieldType = String.class, MaxLength = 45)
	private String longitude = "";

	@ColumnNameAnnotation(ColumnName = "logo", FieldType = String.class)
	private String logo = "";

	@ColumnNameAnnotation(ColumnName = "type", FieldType = Integer.class, MaxLength = 11)
	private int type = 1;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

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

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

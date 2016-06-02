package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;

@EntryAnnotation(TableName = "user")
public class UserEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String userID_Field = "userID";
	public static String userEmail_Field = "userEmail";
	public static String userName_Field = "userName";
	public static String userPhoneNumber_Field = "userPhoneNumber";
	public static String userAddress_Field = "userAddress";
	public static String userLatitude_Field = "userLatitude";
	public static String userLongitude_Field = "userLongitude";
	public static String userPassWord_Field = "userPassWord";
	public static String userDeviceID_Field = "userDeviceID";
	public static String userLocationID_Field = "userLocationID";
	public static String userLocationName_Field = "userLocationName";
	public static String userRoleID_Field = "userRoleID";
	public static String userRoleName_Field = "userRoleName";
	public static String userState_Field = "userState";

	@ColumnNameAnnotation(ColumnName = "userID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int userID;

	@ColumnNameAnnotation(ColumnName = "userEmail", FieldType = String.class, isPrimary = true, MaxLength = 45)
	private String userEmail;

	@ColumnNameAnnotation(ColumnName = "userName", FieldType = String.class, MaxLength = 45)
	private String userName;

	@ColumnNameAnnotation(ColumnName = "userPhoneNumber", FieldType = String.class, MaxLength = 20)
	private String userPhoneNumber;

	@ColumnNameAnnotation(ColumnName = "userAddress", FieldType = String.class, MaxLength = 200)
	private String userAddress;

	@ColumnNameAnnotation(ColumnName = "userLatitude", FieldType = String.class, MaxLength = 15)
	private String userLatitude;

	@ColumnNameAnnotation(ColumnName = "userLongitude", FieldType = String.class, MaxLength = 15)
	private String userLongitude;

	@ColumnNameAnnotation(ColumnName = "userPassWord", FieldType = String.class, MaxLength = 45)
	private String userPassWord;

	@ColumnNameAnnotation(ColumnName = "userDeviceID", FieldType = String.class, MaxLength = 200)
	private String userDeviceID;

	@ColumnNameAnnotation(ColumnName = "userLocationID", FieldType = String.class, MaxLength = 3)
	private String userLocationID;

	@ColumnNameAnnotation(ColumnName = "userLocationName", FieldType = String.class, MaxLength = 45)
	private String userLocationName;

	@ColumnNameAnnotation(ColumnName = "userRoleID", FieldType = String.class, MaxLength = 3)
	private String userRoleID;

	@ColumnNameAnnotation(ColumnName = "userRoleName", FieldType = String.class, MaxLength = 45)
	private String userRoleName;

	@ColumnNameAnnotation(ColumnName = "userState", FieldType = Integer.class, MaxLength = 11)
	private int userState;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserLatitude() {
		return userLatitude;
	}

	public void setUserLatitude(String userLatitude) {
		this.userLatitude = userLatitude;
	}

	public String getUserLongitude() {
		return userLongitude;
	}

	public void setUserLongitude(String userLongitude) {
		this.userLongitude = userLongitude;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getUserDeviceID() {
		return userDeviceID;
	}

	public void setUserDeviceID(String userDeviceID) {
		this.userDeviceID = userDeviceID;
	}

	public String getUserLocationID() {
		return userLocationID;
	}

	public void setUserLocationID(String userLocationID) {
		this.userLocationID = userLocationID;
	}

	public String getUserLocationName() {
		return userLocationName;
	}

	public void setUserLocationName(String userLocationName) {
		this.userLocationName = userLocationName;
	}

	public String getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(String userRoleID) {
		this.userRoleID = userRoleID;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public int getUserState() {
		return userState;
	}

	public void setUserState(int userState) {
		this.userState = userState;
	}

}

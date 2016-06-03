package web.thn.marketmobile.model.entry;

import java.io.Serializable;

import groupbase.thn.web.libs.database.ColumnNameAnnotation;
import groupbase.thn.web.libs.database.EntryAnnotation;
import groupbase.thn.web.libs.database.Table;

@EntryAnnotation(TableName = "role")
public class RoleEntry extends Table implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String roleID_Col = "roleID";
	public static String roleName_Col = "roleName";

	@ColumnNameAnnotation(ColumnName = "roleID", FieldType = Integer.class, isPrimary = true, isAuto_increment = true, MaxLength = 11)
	private int roleID;

	@ColumnNameAnnotation(ColumnName = "roleName", FieldType = String.class, MaxLength = 45)
	private String roleName;

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

}

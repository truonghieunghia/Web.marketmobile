import java.util.HashMap;

import groupbase.thn.web.libs.database.Table;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneralEntry {

	public static void main(String[] args) throws Exception {
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String dbName = "market";
		ArrayList<String> listTable = new ArrayList<String>();
		HashMap<String, Object> tabledetail = new HashMap<String, Object>();
		String showtable = "show tables from "+dbName;
		String showcolumn = "SHOW COLUMNS FROM ";
		// TODO Auto-generated method stub
		String Path = System.getProperty("user.dir") + "/src/web/thn/marketmobile/model/entry/";
		String Pathjson = System.getProperty("user.dir") + "/src/groupbase/thn/web/marketmobile/api/result/json/";
		String packageEntry ="web.thn.marketmobile.model.entry;";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?" + "user=root&password=");
			statement = connect.createStatement();
			resultSet = statement.executeQuery(showtable);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("Tables_in_"+dbName));
				listTable.add(resultSet.getString("Tables_in_"+dbName));
			}
			for (String table : listTable) {
				resultSet = statement.executeQuery(showcolumn + table);
				ArrayList<Object> listcolumn = new ArrayList<Object>();
				while (resultSet.next()) {
					HashMap<String, String> obj = new HashMap<String, String>();
					obj.put("Field", resultSet.getString("Field"));
					obj.put("Type", resultSet.getString("Type"));
					obj.put("Null", resultSet.getString("Null"));
					obj.put("Key", resultSet.getString("Key"));
					obj.put("Default", resultSet.getString("Default"));
					obj.put("Extra", resultSet.getString("Extra"));
					listcolumn.add(obj);
				}
				tabledetail.put(table, listcolumn);
			}
			resultSet.close();
			statement.close();
			connect.close();
			//
//			for (String table : listTable) {
//				PrintWriter writer = new PrintWriter(Pathjson + table + "EntryJson.java");
//				writer.println("package groupbase.thn.web.buyandsell.api.result.json;");
//				writer.println();
//				writer.println("import java.util.ArrayList;");
//				writer.println();
//				writer.println("import groupbase.thn.web.buyandsell.entry." + table + "Entry;");
//				writer.println();
//				writer.println("public class " + table + "EntryJson {");
//				writer.println("\tpublic ArrayList<" + table + "Entry> " + table.toLowerCase() + "_list;");
//				writer.println("}");
//				writer.close();
//			}
			for (String table : listTable) {
				String clazzname="";
				String[] lstclazzname = table.split("_");
				if(lstclazzname.length>1){
					for(int i=0;i<lstclazzname.length;i++){
						clazzname +=lstclazzname[i].substring(0,1).toUpperCase()+lstclazzname[i].substring(1);
					}
				} else{
					clazzname=table.substring(0,1).toUpperCase()+table.substring(1);
				}
				PrintWriter writer = new PrintWriter(Path + clazzname + "Entry.java");
				writer.println("package "+packageEntry);
				writer.println();

				writer.println("import java.io.Serializable;");
				writer.println();
				writer.println("import groupbase.thn.web.libs.database.ColumnNameAnnotation;");
				writer.println("import groupbase.thn.web.libs.database.EntryAnnotation;");
				writer.println("import groupbase.thn.web.libs.database.Table;");
				writer.println();
				writer.println("@EntryAnnotation(TableName = \"" + table + "\")");
				writer.println("public class " + clazzname + "Entry extends Table implements Serializable {");
				writer.println();
				writer.println("\tprivate static final long serialVersionUID = 1L;");

				@SuppressWarnings("unchecked")
				ArrayList<Object> listcolumn = (ArrayList<Object>) tabledetail.get(table);
				for (Object obj : listcolumn) {
					@SuppressWarnings("unchecked")
					HashMap<String, Object> columnDetail = (HashMap<String, Object>) obj;
					String Field = columnDetail.get("Field").toString();
					writer.println("\tpublic static String " + Field + "_Col = \"" + Field + "\";");

				}
				writer.println();
				for (Object obj : listcolumn) {
					@SuppressWarnings("unchecked")
					HashMap<String, Object> columnDetail = (HashMap<String, Object>) obj;
					String Field = columnDetail.get("Field").toString();
					String Type = columnDetail.get("Type").toString();
					String Key = columnDetail.get("Key").toString();
					String Extra = columnDetail.get("Extra").toString();
					String defaultValue = columnDetail.get("Default")==null?"\"\"":columnDetail.get("Default").toString();
					int start = Type.indexOf('(');
					int end = Type.indexOf(')');
					String length;
					if (start != -1) {
						length = Type.substring(start + 1, end);
					} else {
						length = "0";
					}
					String type = "String";
					String isPrimary;
					String isAuto_increment;
					if (Type.contains("int")) {
						if (Type.contains("bigint")) {
							Type = "Long.class";
							type = "long";
						} else {
							Type = "Integer.class";
							type = "int";
						}
						if (columnDetail.get("Default")==null){
							defaultValue = "0";
						}
					}

					if (Type.contains("varchar") | Type.contains("tinytext") | Type.contains("text")
							| Type.contains("char")) {
						Type = "String.class";
						type = "String";
						if (columnDetail.get("Default")!=null){
							defaultValue = "\""+defaultValue+"\"";
						}
					}
					if (Type.contains("double")) {
						Type = "Double.class";
						type = "double";
						if (columnDetail.get("Default")==null){
							defaultValue = "0";
						}
					}
					if (Type.contains("float")) {
						Type = "Float.class";
						type = "float";
						if (columnDetail.get("Default")==null){
							defaultValue = "0";
						}
					}
					isPrimary = Key.length() > 0 ? "true" : "false";
					isAuto_increment = Extra.length() > 0 ? "true" : "false";

					String data = "\t@ColumnNameAnnotation(ColumnName = \"" + Field + "\", FieldType = " + Type;
					if (isPrimary.equals("true")) {
						data = data + ", isPrimary = " + isPrimary;
					}
					if (isAuto_increment.equals("true")) {
						data = data + ", isAuto_increment = " + isAuto_increment;
					}
					if (!length.equals("0")) {
						data = data + ", MaxLength = " + length;
					}
					data = data + ")";
					writer.println(data);
					if (Boolean.parseBoolean(isAuto_increment)){
						writer.println("\tprivate " + type + " " + Field + ";");	
					}else{
						writer.println("\tprivate " + type + " " + Field + " = "+defaultValue+";");
					}				
					writer.println();

				}

				for (Object obj : listcolumn) {
					@SuppressWarnings("unchecked")
					HashMap<String, Object> columnDetail = (HashMap<String, Object>) obj;
					String Field = columnDetail.get("Field").toString();
					String Type = columnDetail.get("Type").toString();
					String type = "String";
					String setField = Field.substring(1);
					String temp = Field.substring(0, 1).toLowerCase();

					setField = temp + setField;
					if (Type.contains("int")) {
						if (Type.contains("bigint")) {
							Type = "Long.class";
							type = "long";
						} else {
							Type = "Integer.class";
							type = "int";
						}
					}

					if (Type.contains("varchar") | Type.contains("tinytext") | Type.contains("text")
							| Type.contains("char")) {
						Type = "String.class";
						type = "String";
					}
					if (Type.contains("double")) {
						Type = "Double.class";
						type = "double";
					}
					if (Type.contains("float")) {
						Type = "Float.class";
						type = "float";
					}
					writer.println("\tpublic " + type + " get" + Field.substring(0,1).toUpperCase()+Field.substring(1) + "() {");
					writer.println("\t\treturn " + Field + ";");
					writer.println("\t}");
					writer.println();
					writer.println("\tpublic void set" + Field.substring(0,1).toUpperCase()+Field.substring(1) + "(" + type + " " + setField + ") {");
					writer.println("\t\tthis." + Field + " = " + setField + ";");
					writer.println("\t}");
					writer.println();
				}
				writer.println("}");
				writer.close();
			}

			//
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}

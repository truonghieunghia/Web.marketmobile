package groupbase.thn.web.libs.database;

public class ParameterSql {
	private Class<?> mClassType;
	private Object mValue;

	public ParameterSql(Class<?> classType, Object value) {
		setClassType(classType);
		setValue(value);
	}

	public Class<?> getClassType() {
		return mClassType;
	}

	public void setClassType(Class<?> classType) {
		this.mClassType = classType;
	}

	public Object getValue() {
		return mValue;
	}

	public void setValue(Object value) {
		this.mValue = value;
	}
	public int convertToSqlType(){
		if (mClassType == String.class){
			return java.sql.Types.VARCHAR;
		}
		if (mClassType == Integer.class){
			return java.sql.Types.INTEGER;
		}
		if (mClassType == Float.class){
			return java.sql.Types.FLOAT;
		}
		if (mClassType == Double.class){
			return java.sql.Types.DOUBLE;
		}
		return 0;
	}
}

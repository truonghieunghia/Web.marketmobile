package thn.groupbase.web.emarket.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.libs.controller.controllerBase;
import groupbase.thn.web.libs.database.DataBase;
import groupbase.thn.web.libs.database.DataRow;
import groupbase.thn.web.libs.database.ParameterSql;
import groupbase.thn.web.libs.database.ResultData;
import groupbase.thn.web.libs.view.View;
import groupbase.thn.web.libs.view.ViewAction;

@WebServlet(urlPatterns = { "/test.html" })
public class TestController extends controllerBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5618303348106850170L;

	@Override
	protected View doGet() {
		// TODO Auto-generated method stub
//		connect.executeQueryEntry(UserEntry.class, null);
//		ResultData result = connect.getResultData();
		DataBase baseFactory = new DataBase();
		String test = "";
//		ArrayList<UserEntry> lstdata = baseFactory.getEntry(UserEntry.class).selectAll() ;
//		for (UserEntry obj : lstdata){
//			test += obj.getFullName();
//		}		
		ArrayList<ParameterSql> parametersIn = new ArrayList<>();
		ArrayList<ParameterSql> parametersOut = new ArrayList<>();
		parametersIn.add(new ParameterSql(String.class, "truonghieunghia84@gmail.com"));
		parametersIn.add(new ParameterSql(String.class, "acnovn"));
		parametersOut.add(new ParameterSql(Boolean.class, "is_ok"));
		HashMap<String,Object>outValue =  baseFactory.callProc("user_insert_procedure(?,?,?)", parametersIn, parametersOut);
		if (outValue!=null ){
			test = outValue.get("is_ok").toString();
		}
//		ResultData data  = baseFactory.getResultData();
//		for(DataRow dataRow :data.getListData() ){
//			for(int i =0 ;i<data.getColumnCount();i++){
//				test+=dataRow.getDataColumn(i).getValue().toString();
//			}
//			
//		}
//		test = baseFactory.getResultData().getDataRow(0).getDataColumn(1).getValue().toString();
//		return new View("/testview/index",ViewAction.FORWARD);
		return new View(test, ViewAction.OUTTEXT);
	}

	@Override
	protected View doPost() {
		// TODO Auto-generated method stub
		return null;
	}

}

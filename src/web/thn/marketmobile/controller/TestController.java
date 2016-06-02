package web.thn.marketmobile.controller;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.libs.controller.controllerBase;
import groupbase.thn.web.libs.database.MysqlConnect;
import groupbase.thn.web.libs.view.View;
import groupbase.thn.web.libs.view.ViewAction;
import web.thn.marketmobile.model.entry.UserEntry;

@WebServlet(urlPatterns = { "/test.html" })
public class TestController extends controllerBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5618303348106850170L;

	@Override
	protected View doGet() {
		// TODO Auto-generated method stub
		MysqlConnect connect = new MysqlConnect(); 		
//		connect.executeQueryEntry(UserEntry.class, null);
//		ResultData result = connect.getResultData();
		String test = "";
		ArrayList<UserEntry> lst = connect.executeQueryEntry(UserEntry.class, null);
		for (UserEntry obj : lst){
			test += obj.getUserName();
		}		
//		return new View("/testview/index",ViewAction.FORWARD);
		return new View(test, ViewAction.OUTTEXT);
	}

	@Override
	protected View doPost() {
		// TODO Auto-generated method stub
		return null;
	}

}

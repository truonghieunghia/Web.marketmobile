package web.groupbase.emarket.controller;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.libs.controller.controllerBase;
import groupbase.thn.web.libs.database.DataBase;
import groupbase.thn.web.libs.view.View;
import groupbase.thn.web.libs.view.ViewAction;
import web.groupbase.emarket.model.entry.UserEntry;

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
		ArrayList<UserEntry> lstdata = baseFactory.getEntry(UserEntry.class).selectAll() ;
		for (UserEntry obj : lstdata){
			test += obj.getFullName();
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

package web.groupbase.emarket.controller.api;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.libs.view.View;
import groupbase.thn.web.libs.view.ViewAction;
import web.groupbase.emarket.model.UserModel;
import web.groupbase.emarket.model.entry.UserEntry;
@WebServlet(urlPatterns = { "/api/user" })
public class UserController extends ApiControllerBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected View doGet() {
		UserModel userModel = new UserModel();
		ArrayList<UserEntry>lst = userModel.getAll();		
		return new View(toJson("list_user", lst), ViewAction.OUTTEXT);
	}

	@Override
	protected View doPost() {	
		UserModel userModel = new UserModel();
		userModel.add(getDataPost(UserEntry.class));
		return new View("hello insert new user", ViewAction.OUTTEXT);
	}

}

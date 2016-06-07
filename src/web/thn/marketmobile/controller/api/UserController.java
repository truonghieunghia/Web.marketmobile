package web.thn.marketmobile.controller.api;

import javax.servlet.annotation.WebServlet;

import groupbase.thn.web.libs.view.View;
import groupbase.thn.web.libs.view.ViewAction;
import web.thn.marketmobile.model.UserModel;
import web.thn.marketmobile.model.entry.UserEntry;
@WebServlet(urlPatterns = { "/api/user" })
public class UserController extends ApiControllerBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected View doGet() {
		// TODO Auto-generated method stub
		return new View("hello register new user", ViewAction.OUTTEXT);
	}

	@Override
	protected View doPost() {	
		UserModel userModel = new UserModel();
		userModel.add(getDataPost(UserEntry.class));
		return new View("hello insert new user", ViewAction.OUTTEXT);
	}

}

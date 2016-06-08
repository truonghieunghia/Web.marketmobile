package web.groupbase.emarket.controller.api;

import com.google.gson.Gson;

import groupbase.thn.web.libs.controller.controllerBase;

public abstract class ApiControllerBase extends controllerBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String getContentType() {
		// TODO Auto-generated method stub
		return "application/json; charset=utf-8";
	}
	protected String toJson(String nameResult,Object object){
		return "{\""+nameResult+"\":"+ new Gson().toJson(object)+"}";
	}
}

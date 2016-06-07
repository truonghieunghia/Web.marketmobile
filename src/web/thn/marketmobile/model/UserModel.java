package web.thn.marketmobile.model;

import java.util.ArrayList;

import groupbase.thn.web.libs.database.DataBase;
import web.thn.marketmobile.model.entry.UserEntry;

public class UserModel {

	private DataBase mDB ;
	public UserModel (){
		mDB = new DataBase();
	}
	public int add(UserEntry userEntry){
		return mDB.getEntry(UserEntry.class).add(userEntry);
	}
	public ArrayList<UserEntry> getAll() {
		return mDB.getEntry(UserEntry.class).selectAll();
	}
}

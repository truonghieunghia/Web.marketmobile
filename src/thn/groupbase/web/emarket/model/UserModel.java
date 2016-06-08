package thn.groupbase.web.emarket.model;

import java.util.ArrayList;

import groupbase.thn.web.libs.database.DataBase;
import thn.groupbase.web.emarket.model.entry.UserEntry;

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

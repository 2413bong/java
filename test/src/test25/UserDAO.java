package test25;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {

	public ArrayList<HashMap<String,String>> selectUserList();
	public int deleteUserInfo(HashMap<String,String> userInfo);
	public int insertUserInfo(HashMap<String,String> userInfo);
	public ArrayList<HashMap<String,String>> selectUser(HashMap<String,String> userInfo);
	
	
	
}

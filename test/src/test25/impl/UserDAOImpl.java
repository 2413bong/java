package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;

	@Override
	public ArrayList<HashMap<String, String>> selectUserList() {
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();
		String sql = "select uiNum,uiName,uiAge from user_info";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return userList;
	}

	public int deleteUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		int result = 0;
		String sql = "delete from user_info ";
		if (userInfo != null) {
			if (userInfo.get("uiName") != null) {
				sql += " where uiName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (userInfo != null) {
				if (userInfo.get("uiName") != null) {
					ps.setString(1, userInfo.get("uiName"));
				}
			}

			result= ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {
			DBCon.close();
		}
		return result;

	}
}

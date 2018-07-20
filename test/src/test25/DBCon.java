package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static Connection con;
	private static final String url = "jdbc:mariadb://localhost:3306/oreo";
	private static final String userName = "root";
	private static final String passWord = "12345678";

	private static void openCon() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			DBCon.con = DriverManager.getConnection(url, userName, passWord);
			con.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getCon() {
		if (DBCon.con == null) {
			openCon();

		}
		return DBCon.con;
	}

	public static void closeCon() {
		if (DBCon.con != null) {
			try {
				DBCon.con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}

}
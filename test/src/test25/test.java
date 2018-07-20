package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		Connection con=null;
		String url = "jdbc:mariadb://localhost:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from user_info where uNum = 2";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String str = rs.getInt("uNum") + rs.getString("uName");
				str += rs.getInt("uAge") + rs.getString("uAddress");
				str += rs.getString("uEtc");
				System.out.println(str);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


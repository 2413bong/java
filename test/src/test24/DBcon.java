package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBcon {
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://localhost:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		
		
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				con = DriverManager.getConnection(url, id, pwd);
				Statement stmt = con.createStatement();
//				String sql = " create table user_info(\r\n" + 
//						"uNum int AUTO_INCREMENT PRIMARY key,\r\n" + 
//						"uName varchar(200) not null,\r\n" + 
//						"uAge tinyint not null,\r\n" + 
//						"uAddress varchar(200) not null,\r\n" + 
//						"uEtc varchar(2000)\r\n" + 
//						"); ";
//				int cnt = stmt.executeUpdate(sql);
//				String sql = "delete from user_info ";
//				int cnt = stmt.executeUpdate(sql);
//				if(cnt==8) {
//					System.out.println("1번이 삭제");
//				}else {
//					System.out.println("삭제안됨 1번 못찾음");
//				}
//				
				String sql= "insert into user_info(uName, uAge, uAddress, uEtc)";
				sql += "values('황길동',33,'서울','기타')";
				
				int cnt = stmt.executeUpdate(sql);
//				if(cnt==1) {
//					System.out.println("등록완료");
//				}else {
//					System.out.println("등록안됨");
//				}
//				
//				sql = "update user_info set uEtc='테스트' where uNum=4";
//				cnt = stmt.executeUpdate(sql);
//				if(cnt==1) {
//					System.out.println("수정완료");
//				}else {
//					System.out.println("수정안됨");
//				}
				
				sql ="select *from user_info";
				ResultSet rs = stmt.executeQuery(sql);
//				ResultSetMetaData rsmd = rs.getMetaData();
//				int colSize = rsmd.getColumnCount();
//				List<String> colList = new ArrayList<String>();
//				for(int i = 1;i<=colSize;i++) {
//					colList.add(rsmd.getColumnLabel(i));
//				}

				while(rs.next()) {
//					for(String col:colList) {
//						System.out.println(rs.getString(col));
//					}
//					System.out.println();
					String str =rs.getInt("uNum")+rs.getString("uName");
					str +=rs.getInt("uAge")+rs.getString("uAddress");
					str +=rs.getString("uEtc");
					System.out.println(str);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}



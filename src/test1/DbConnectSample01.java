package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectSample01 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root","password");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from country limit 50");
			while(rs.next()){
				System.out.println(rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e){
					e.printStackTrace();
				}
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con != null){
				try{
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


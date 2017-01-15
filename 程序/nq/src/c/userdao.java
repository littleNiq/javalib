package c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import a.DBManager;

public class userdao {
	public static boolean find(String name,String psw){
		String sql="select * from user where username=? and userpwd=?";
	    PreparedStatement stmt=null;
		ResultSet rs=null;
		Connection conn=DBManager.getConnection();
		try{
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2,psw);
			rs=stmt.executeQuery();
			if(rs.next())
				return true;
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
}

package c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import b.test;



import a.DBManager;

public class testDao {
   //添加信息
	public static boolean  add(test bean) {
		Connection conn = null;// 数据库的连接 
	      PreparedStatement stm = null;// SQL 语句的装载器  
	      String sql = "insert into student(sno,sname,ssex,sphone,saddress,semail,sphonepath)"
	      + " values(?,?,?,?,?,?,?)";  
	 try {  
	       // （1）获取数据库连接  
		 conn = DBManager.getConnection();  
	       // （2）将 SQL 语句放到装载器中
		 stm = conn.prepareStatement(sql);    
	       // （3）设置参数的值  
		    stm.setString(1, bean.getNo()); 
	        stm.setString(2, bean.getName());
	        stm.setString(3, bean.getSex());
	        stm.setString(4, bean.getPhone());
	        stm.setString(5, bean.getAddress());
	        stm.setString(6, bean.getEmail());
	        stm.setString(7, bean.getPhotopath());
	       
	     // （4）执行 SQL 语句    
	        stm.execute();
	        return true;
	   } 
	 catch (SQLException e) {
	    e.printStackTrace(); 
	     return false; 
	  }
	 finally {// （5）关闭 
	   try {    
	         stm.close();  
	         conn.close(); 
	       } 
	        catch (SQLException e) {   
	             e.printStackTrace();    }  
	 }
	  } 
	//删除信息
	public static boolean deletetxl(String no) {  
        Connection conn = null;// 数据库的连接
        PreparedStatement stm = null;// SQL 语句的装载器
        String sql = "delete from student where sno=?";   
        try { 
             // （1）获取数据库连接  
        	conn = DBManager.getConnection(); 
            // （2）将 SQL 语句放到装载器中   
        	stm = conn.prepareStatement(sql); 
            // （3）设置参数的值  
            stm.setString(1, no);
            // （4）执行 SQL 语句  
            stm.execute();
            return true;
            }
       catch (SQLException e) {
            e.printStackTrace();
            return false;
           }
       finally {
         // （5）关闭
         try {
             stm.close();
             conn.close();
             }
         catch (SQLException e) { 
             e.printStackTrace();
            }
          }	
	
	}
	//查询信息通过编号
	public static Vector<test> findByNo(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=find(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet find(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//通过姓名查找
	public static Vector<test> findByName(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findname(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findname(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//通过性别查找 
	public static Vector<test> findBySex(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findsex(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findsex(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//通过地址查找
	public static Vector<test> findByAddress(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findaddress(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findaddress(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//更改信息
	public static boolean updateTxl(test bean,String no) {  
        Connection conn = null;// 数据库的连接
        PreparedStatement stm = null;// SQL 语句的装载器
        String sql = "update student set sno=?,sname=?,ssex=?,sphone=?,saddress=?,semail=?,sphonepath=? where sno=?";
        try {   
             // （1）获取数据库连接    
        	  conn = DBManager.getConnection(); 
             // （2）将 SQL 语句放到装载器中
        	  stm = conn.prepareStatement(sql);
             // （3）设置参数的值 
             stm.setString(1, bean.getNo());
             stm.setString(2, bean.getName());
             stm.setString(3, bean.getSex());
             stm.setString(4, bean.getPhone());
             stm.setString(5, bean.getAddress());
             stm.setString(6, bean.getEmail());
             stm.setString(7, bean.getPhotopath());
             stm.setString(8, no);
            // （4）执行 SQL 语句 
            stm.execute();
            return true;
            }
     catch (SQLException e) {
               e.printStackTrace();
               return false; 
          }
     
	
  }  
   
	//根据编号，更新图片的路径  
	 public static void updatePicturePath(String id, String saveFile) {
		 Connection conn = null;
		 PreparedStatement stm = null;
		 String sql = "update student set sphonepath=? where sno=?";
		 try {
			 conn = DBManager.getConnection();
			 stm = conn.prepareStatement(sql);
			 stm.setString(1, saveFile);
			 stm.setString(2, id);
			 stm.executeUpdate();// 执行更新
			 } 
		 catch (SQLException e) {  
	           e.printStackTrace();   }
		 finally {
			 try {  
				 stm.close(); 
				 conn.close();
				 } 
			 catch (SQLException e) {  
	           e.printStackTrace();    }  
	  }  
	 } 
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.manager;
import java.sql.*;

import javax.swing.JOptionPane;

 /**
 * @author Amalt
 ***/
public class CustomerQuery {
	static Connection con;
        static Customer user;
	static {
        String className="com.mysql.cj.jdbc.Driver";
        try {
			Class.forName(className);
		
        String user="root";
        String pass="Amaltvinod123..";
        String url="jdbc:mysql://localhost:3306/book_manager";
        con=DriverManager.getConnection(url,user,pass); 
        }catch(Exception e) {
        	
        	
        	
        }
        
	}
    public  static boolean verifyAccount(Customer c){
        boolean flag=false;
        try{
        	String Query="select * from customeraccount where cname=? and cpass=?";
        	PreparedStatement ps=con.prepareStatement(Query);
        	ps.setString(1,c.getCname() );
                ps.setString(2,c.getCpass());
                ResultSet rs=ps.executeQuery();
                user=c;
                if(rs.next()) {
                    flag=true;
                }
           
            }catch(Exception e){
            
            }
        return flag;
     
    }
     public static boolean CreateAccount(Customer c){
        boolean flag=false;
       try{
    	   String Query="INSERT INTO customeraccount (cname,cpass) VALUES(?,?)";
       	   PreparedStatement ps=con.prepareStatement(Query);
       	   ps.setString(1,c.getCname());
           ps.setString(2,c.getCpass());
           ps.executeUpdate();
           flag=true;
       }catch(Exception e){
           
       }
       return flag;
    }
     
     public static boolean UpdateReading(String bname){
        boolean flag=false;
       try{
    	   String Query="select bid from books where bname=?";
       	   PreparedStatement ps=con.prepareStatement(Query);
       	   ps.setString(1,bname);
          
           ResultSet rs=ps.executeQuery();
           int bid=0;
           while(rs.next()){
               bid=rs.getInt("bid");
           }
            Query="select id from customeraccount where cname=?";
       	    ps=con.prepareStatement(Query);
       	   ps.setString(1,user.getCname());
           rs=ps.executeQuery();
           int id=0;
           while(rs.next()){
               id=rs.getInt("id");
           }
           Query="insert into readingbooks values(?,?)";
       	   ps=con.prepareStatement(Query);
       	   ps.setInt(1,id);
           ps.setInt(2,bid);
          ps.executeUpdate();
            flag=true;
       }catch(Exception e){
           
       }
       return flag;
    }
     
     
     public static ResultSet ViewReadingBooks(){
        ResultSet rs=null;
       try{
    	   
            String Query="select id from customeraccount where cname=?";
       	    PreparedStatement ps=con.prepareStatement(Query);
       	    ps.setString(1,user.getCname());
             rs=ps.executeQuery();
           int id=0;
           while(rs.next()){
               id=rs.getInt("id");
           }
           Query="Select bname from books natural join readingbooks where readingbooks.id=?";
       	   ps=con.prepareStatement(Query);
       	   ps.setInt(1,id);
           rs=ps.executeQuery();
       }catch(Exception e){
           
       }
       return rs;
    }
     
}

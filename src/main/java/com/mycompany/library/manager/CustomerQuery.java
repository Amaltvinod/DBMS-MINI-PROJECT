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
    	   String Query="insert into customeraccount values(?,?)";
       	   PreparedStatement ps=con.prepareStatement(Query);
       	   ps.setString(1,c.getCname() );
           ps.setString(2,c.getCpass());
           ps.executeUpdate();
           flag=true;
       }catch(Exception e){
           
       }
       return flag;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.manager;
import java.sql.Connection;
import com.mycompany.library.manager.MysqlConnector;
import java.sql.PreparedStatement;
 /**
 * @author Amalt
 ***/
public class CustomerQuery {
    public static boolean verifyAccount(Customer c){
        boolean flag=false;
       try{
           Connection con=MysqlConnector.getConnection();
           String Query="select * from CustomerAccount where cname=? and cpass=?";
           PreparedStatement ps=con.prepareStatement(Query);
           ps.setString(1,c.getcName());
           ps.setString(2,c.getpass());
           flag=true;
       }catch(Exception e){
            System.out.println("unsuccessfull");
           
       }
       return flag;
    }
     public static boolean CreateAccount(Customer c){
        boolean flag=false;
       try{
           Connection con=MysqlConnector.getConnection();
           String Query="insert into CustomerAccount values(?,?)";
           PreparedStatement ps=con.prepareStatement(Query);
           ps.setString(1,c.getcName() );
           ps.setString(2,c.getpass());
           flag=true;
       }catch(Exception e){
           
       }
       return flag;
    }
}

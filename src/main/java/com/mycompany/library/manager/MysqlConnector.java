/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library.manager;

import java.sql.*;

/**
 *
 * @author Amalt
 */
public class MysqlConnector {
    static Connection con;
    public static Connection getConnection(){
        String className="com.mysql.cj.jdbc.Driver";
        try{
        Class.forName(className);
        String user="root";
        String pass="Amaltvinod123..";
        String url="jdbc:mysql://localhost:3306/book_manager";
        con=DriverManager.getConnection(url,user,pass);
        System.out.println("connected Sucessfully");
        }catch(Exception e){
            e.printStackTrace();
             System.out.println("not connected");
                    
        }
        return con;
    }
    
}

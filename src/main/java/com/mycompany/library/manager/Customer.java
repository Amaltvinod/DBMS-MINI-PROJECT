/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.library.manager;
import com.mycompany.library.gui.CustomerLogin;
/**
 *
 * @author Amalt
 */
public class Customer {
    private String cname;
    private String cpass;
    private String bookname;
    public Customer(String cname,String cpass){
        this.cname=cname;
        this.cpass=cpass;
    }
    public void setBookName(String bookname){
        this.bookname=bookname;
        
    }
    
    public String getBookName(){
        return this.bookname;
    }
    public void setcName(String cname){
        this.cname=cname;
        
    }
    
    public String getcName(){
        return this.cname;
    }
    public void setPass(String cpass){
        this.cpass=cpass;
        
    }
    public String getpass(){
        return cpass;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustomerLogin cl=new CustomerLogin();
        cl.setVisible(true);
        
        
       
    }
    
}

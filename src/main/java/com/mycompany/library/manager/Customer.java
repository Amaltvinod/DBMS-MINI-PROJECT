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
       setCname(cname);
       setCpass(cpass);
       
       
    }
   
    public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
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

package com.nucleus.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nucleus.ConnectionSetup;
import com.nucleus.customer.Customer;
import com.nucleus.customer.Login;



public class CustomerDaoimpl implements CustomerDAO {
	ConnectionSetup connectionSetup=new ConnectionSetup();
	Connection con=connectionSetup.getConnection();
	PreparedStatement pstmt=null;
	Customer customer=new Customer();
//-------------------------------------------------------------	
	
	
//---------------------------------------------------------------	
/*public void save(Customer customer)
{
	try {
		pstmt=con.prepareStatement("insert into table89 values(?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1,customer.getCustomer_Code());
		pstmt.setString(2,customer.getCustomer_Name());
		pstmt.setString(3,customer.getCustomer_Address1());
		pstmt.setString(4,customer.getCustomer_Address2());
		pstmt.setLong(5,customer.getCustomer_Pincode());
		pstmt.setString(6,customer.getEmail_address());
		pstmt.setLong(7,customer.getContact_Number());
		pstmt.setString(8,customer.getPrimary_Contact_Person());
		pstmt.setString(9,customer.getRecord_Status());
		pstmt.setString(10,customer.getActive_Inactive_Flag());
		pstmt.executeUpdate();
	
		} catch (SQLException e) 
			{
				e.printStackTrace();
			}
}*/
	
	//-------------------------------------------------------------------------------------------
/*public void update(Customer customer, String Customer_Code)	
{
	try {
		pstmt=con.prepareStatement("UPDATE book_table_007 set Customer_Code=?, Customer_Name=?, Customer_Address1=?, Customer_Address2=?, Customer_Pincode=?, Email_address=?, Contact_Number=?, Primary_Contact_Person=?");
		pstmt.setString(1,customer.getCustomer_Code());
		pstmt.setString(2,customer.getCustomer_Name());
		pstmt.setString(3,customer.getCustomer_Address1());
		pstmt.setString(4,customer.getCustomer_Address2());
		pstmt.setLong(5,customer.getCustomer_Pincode());
		pstmt.setString(6,customer.getEmail_address());
		pstmt.setLong(7,customer.getContact_Number());
		pstmt.setString(8,customer.getPrimary_Contact_Person());
		pstmt.setString(9,customer.getRecord_Status());
		pstmt.setString(10,customer.getActive_Inactive_Flag());
		pstmt.executeUpdate();
		} 
			catch (SQLException e) 
			{
		
				e.printStackTrace();
			}
	
}*/
	//-------------------------------------------------------------------
/*public void delete(Customer customer, String Customer_Code)	
{ System.out.println("hello"+Customer_Code);
	 try {
		pstmt=con.prepareStatement("delete from table89 where Customer_Code=?");
		pstmt.setString(1,Customer_Code);
		pstmt.executeUpdate();  
	 	} catch (SQLException e)
	 	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	 	}  
	 }*/
	//---------------------------------------------------------------
/*public void view(Customer customer,String View)
{
	try {
		pstmt=con.prepareStatement("Select * from table89 where Customer_Code=?");
		pstmt.setString(1,View);
		ResultSet rs=pstmt.executeQuery();  
           if(rs.next()){  
        	   customer.setCustomer_Code(rs.getString(1));  
	             customer.setCustomer_Name(rs.getString(2));  
	             customer.setCustomer_Address1(rs.getString(3));  
	             customer.setCustomer_Address2(rs.getString(4));  
	             customer.setCustomer_Pincode(rs.getLong(5));
	             customer.setEmail_address(rs.getString(6));
	             customer.setContact_Number(rs.getLong(7));
	             customer.setPrimary_Contact_Person(rs.getString(8));  
	             customer.setRecord_Status(rs.getString(9));  
	             customer.setActive_Inactive_Flag(rs.getString(10));  
            }  

		pstmt.executeQuery();
	} catch (SQLException e) 
	{

		e.printStackTrace();
	}
			
}*/
	//---------------------------------------------------------------------------------------------
	public List<Customer> view_all()
{ 	 List<Customer> list=new ArrayList<Customer>(); 
		try {
			pstmt=con.prepareStatement("Select * from table89");
			System.out.println("hiiiiiiiii");
			ResultSet rs=pstmt.executeQuery();  
	           while(rs.next()){  
	             Customer customer=new Customer();
	             customer.setCustomer_Code(rs.getString(1));  
	             customer.setCustomer_Name(rs.getString(2));  
	             customer.setCustomer_Address1(rs.getString(3));  
	             customer.setCustomer_Address2(rs.getString(4));  
	             customer.setCustomer_Pincode(rs.getLong(5));
	             customer.setEmail_address(rs.getString(6));
	             customer.setContact_Number(rs.getLong(7));
	             customer.setPrimary_Contact_Person(rs.getString(8));  
	             customer.setRecord_Status(rs.getString(9));  
	             customer.setActive_Inactive_Flag(rs.getString(10));  
	              list.add( customer);  
	              System.out.print("hellooooo");
	           } 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
}
	 }

	

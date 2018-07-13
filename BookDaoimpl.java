package com.nucleus.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nucleus.DAO.*;
import com.nucleus.connection1.*;
import com.nucleus.book.*;

public class BookDaoimpl implements BookDAO {
	ConnectionSetup connectionSetup=new ConnectionSetup();
	Connection con=connectionSetup.getConnection();
	PreparedStatement pstmt=null;
	Book book=new Book();
//-------------------------------------------------------------	
/*public void save(Book book)
{
	try {
		pstmt=con.prepareStatement("insert into book_table_007 values(?,?,?,?,?,?,?,?)");
		pstmt.setString(1,book.getBook_Id());
		pstmt.setString(2,book.getBook_Name());
		pstmt.setLong(3,book.getISBN_No());
		pstmt.setLong(4,book.getPrice());
		pstmt.setString(5,book.getAuthors_Name());
		pstmt.setString(6,book.getCategory_of_book());
		pstmt.setString(7,book.getPublication_Name());
		pstmt.setString(8,book.getBook_Description());
		pstmt.executeUpdate();
		} catch (SQLException e) 
			{
				e.printStackTrace();
			}
}
	*/
	//-------------------------------------------------------------------------------------------
/*public void update(Book book)	
{
	try {
		pstmt=con.prepareStatement("UPDATE book_table_007 set Book_Id=?, Book_Name=?, ISBN_No=?, Price=?, Authors_Name=?, Category_of_book=?, Publication_Name=?, Book_Description=?");
		pstmt.setString(1,book.getBook_Id());
		pstmt.setString(2,book.getBook_Name());
		pstmt.setLong(3,book.getISBN_No());
		pstmt.setLong(4,book.getPrice());
		pstmt.setString(5,book.getAuthors_Name());
		pstmt.setString(6,book.getCategory_of_book());
		pstmt.setString(7,book.getPublication_Name());
		pstmt.setString(8,book.getBook_Description());
		pstmt.executeUpdate();
		} 
			catch (SQLException e) 
			{
		
				e.printStackTrace();
			}
	
}*/
	//-------------------------------------------------------------------
/*public void delete1(Book book,String Book_Id)
{//System.out.println("hello"+Book_Id);
	 try {
		pstmt=con.prepareStatement("delete from book_table_007 where Book_Id=?");
		pstmt.setString(1,Book_Id);
		pstmt.executeUpdate();  
	 	} catch (SQLException e)
	 	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	 	}  
	 }*/
	//---------------------------------------------------------------
/*public void view(Book book,String View)
{
	try {
		pstmt=con.prepareStatement("Select * from book_table_007 where Book_id=?");
		pstmt.setString(1,View);
		ResultSet rs=pstmt.executeQuery();  
           if(rs.next()){  
              book.setBook_Id(rs.getString(1));  
              book.setBook_Name(rs.getString(2));  
              book.setISBN_No(rs.getLong(3));  
              book.setPrice(rs.getLong(4));  
              book.setAuthors_Name(rs.getString(5));
              book.setCategory_of_book(rs.getString(6));
              book.setPublication_Name(rs.getString(7));
              book.setBook_Description(rs.getString(8));  
            }  

		pstmt.executeQuery();
	} catch (SQLException e) 
	{

		e.printStackTrace();
	}
			
}*/
	//---------------------------------------------------------------------------------------------
	public Static List <book> view_all(Book book)
{ 	 ArrayList <book> list=new ArrayList(); 
		try {
			pstmt=con.prepareStatement("Select * from book_table_007");
			
			ResultSet rs=pstmt.executeQuery();  
	           if(rs.next()){  
	              book.setBook_Id(rs.getString(1));  
	              book.setBook_Name(rs.getString(2));  
	              book.setISBN_No(rs.getLong(3));  
	              book.setPrice(rs.getLong(4));  
	              book.setAuthors_Name(rs.getString(5));
	              book.setCategory_of_book(rs.getString(6));
	              book.setPublication_Name(rs.getString(7));
	              book.setBook_Description(rs.getString(8));  
	              list.add(book);  
	           } 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	 }

package com.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nucleus.DAO.BookDAO;
import com.nucleus.DAO.BookDaoimpl;
import com.nucleus.book.Book;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/C12")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int Book_Id = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 **/
	/* protected void dosave(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
			String BookID=request.getParameter("text1");
			String BookName=request.getParameter("text2");
			Long ISBN_No=Long.parseLong (request.getParameter("text3"));
			Long Price=Long.parseLong(request.getParameter("text4"));
			String Authors_Name=request.getParameter("text5");
			String Category_of_book=request.getParameter("radio1");
			String Publication_Name=request.getParameter("city");
			String Book_Description=request.getParameter("text6");
			out.println("  BookID: " +BookID+"\n");
			out.println("  BookName: "+BookName+"\n");
			out.println("  ISBN_No: " +ISBN_No+"\n");
			out.println("  Price: " +Price+"\n");
			out.println("  Authors_Name: " +Authors_Name+"\n");
			out.println("  Category_of_book: " +Category_of_book+"\n");
			out.println("  Publication_Name: " +Publication_Name+"\n");
			out.println("  Book_Description: " +Book_Description+"\n");
			Book book=new Book();
			book.setBook_Id(BookID);
			book.setBook_Name(BookName);
			book.setISBN_No(ISBN_No);
			book.setPrice(Price);
			book.setAuthors_Name(Authors_Name);
			book.setCategory_of_book(Category_of_book);
			book.setPublication_Name(Publication_Name);
			book.setBook_Description(Book_Description);
			
			
			BookDAO bookDAO=new BookDaoimpl();
			bookDAO.save(book);
			
			out.println("<br><center><h1>!!new entry is done!!!</h1></center><br>");
			out.println("<br><a href=redirect><center><h3>click here to redirect!!!</h3></center></a><br>");
	 }*/
	 
	//-----------------------------------------------------------------------------------------------------------------------------------
	/* protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		 String Book_Id=request.getParameter("saas");  
		 System.out.println("BookID is: "+Book_Id);
		 Book book=new Book();
		 BookDAO bookDAO=new BookDaoimpl();
		 bookDAO.delete1(book,Book_Id);
		 out.println("deleted");
	 }*/
	 //-----------------------------------------------------------------------------------------------------------------------
	/* protected void doview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 }
	 protected void doupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 } */
	
	 
	/* protected void doview_all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 Book book=new Book();
		 BookDAO bookDAO=new BookDaoimpl();
		 bookDAO.view_all(book);
	 }
	 */
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //dosave(request,response);
		 /*if(newvalue.equals("save"))
		 {
			 dosave(request,response);
		 } //String newvalue=request.getParameter("value");
		
	}  */
		
	//------------------------------------------------------------------------------------------	 
		// doDelete(request,response);
		
	 //---------------------------------------------------------------

		 
		 Book book=new Book();
		 BookDAO bookDAO=new BookDaoimpl();
		 bookDAO.view_all(book);
	 }
	 
	//---------------------------------------		
	 
	 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //dosave(request,response);
		//---------------------------------------------------------------------------
		 /*PrintWriter out=response.getWriter();
		 String View=request.getParameter("view1");  
		 System.out.println("view value"+View);
		 out.println(View);
		 System.out.println("byeee");
		 Book book=new Book();
		 BookDAO bookDAO=new BookDaoimpl();
		 bookDAO.view(book,View);
		 
		 out.println("Book ID is:" +book.getBook_Id());
		 out.println("Book Name is:" +book.getBook_Name());
		 out.println("ISBN No. is:" +book.getISBN_No());
		 out.println("Price of Book is:" +book.getPrice());
		 out.println("Author's Name is:" +book.getAuthors_Name());
		 out.println("Category_of_book is:" +book.getCategory_of_book());
		 out.println("Publication's Name is:" +book.getPublication_Name());
		 out.println("Book_Description is:" +book.getBook_Description());*/
		 
	//----------------------------------------------------------------------------------------	 
	}
	

}

package com.nucleus.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.DAO.CustomerDAO;
import com.nucleus.DAO.CustomerDaoimpl;
import com.nucleus.customer.Customer;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	
		
		
	/*	protected void dosave(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
			String Customer_Code=request.getParameter("text2");
			String Customer_Name=request.getParameter("text3");
			String Customer_Address1=request.getParameter("text4");
			String Customer_Address2=request.getParameter("text5");
			Long Customer_Pincode=Long.parseLong(request.getParameter("text6"));
			String Email_address=request.getParameter("text7");
			Long Contact_Number=Long.parseLong(request.getParameter("text8"));
			String Primary_Contact_Person=request.getParameter("text9");
			String Record_Status=request.getParameter("radio1");
			String Active_Inactive_Flag=request.getParameter("radio2");
			
			
			
			out.println("  Customer_Code: " +Customer_Code+"\n");
			out.println("  Customer_Name: "+Customer_Name+"\n");
			out.println("  Customer_Address1: " +Customer_Address1+"\n");
			out.println("  Customer_Address2: " +Customer_Address2+"\n");
			out.println("  Customer_Pincode: " +Customer_Pincode+"\n");
			out.println("  Email_address: " +Email_address+"\n");
			out.println("  Contact_Number: " +Contact_Number+"\n");
			out.println("  Primary_Contact_Person: " +Primary_Contact_Person+"\n");
			out.println("  Record_Status: " +Record_Status+"\n");
			out.println("  Active_Inactive_Flag: " +Active_Inactive_Flag+"\n");
			Customer customer=new Customer();
			customer.setCustomer_Code(Customer_Code);
			customer.setCustomer_Name(Customer_Name);
			customer.setCustomer_Address1(Customer_Address1);
			customer.setCustomer_Address2(Customer_Address2);
			customer.setCustomer_Pincode(Customer_Pincode);
			customer.setEmail_address(Email_address);
			customer.setContact_Number(Contact_Number);
			customer.setPrimary_Contact_Person(Primary_Contact_Person);
			customer.setRecord_Status(Record_Status);
			customer.setActive_Inactive_Flag(Active_Inactive_Flag);
			
			
			CustomerDAO customerDAO=new CustomerDaoimpl();
			customerDAO.save(customer);
			
			out.println("<br><center><h1>!!new entry is done!!!</h1></center><br>");
			//out.println("<br><a href=redirect><center><h3>click here to redirect!!!</h3></center></a><br>");
			}*/

	//-----------------------------------------------------------------------------------------------
	/*protected void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 PrintWriter out=response.getWriter();
	 String View=request.getParameter("view1");  
	 System.out.println("view value"+View);
	 out.println(View);
	 System.out.println("byeee");
	  Customer customer=new Customer();
	 CustomerDAO customerDAO=new CustomerDaoimpl();
	 customerDAO.view(customer,View);
	 
	 out.println("Customer_Code is:" +customer.getCustomer_Code());
	 out.println("\n Customer_Name is:" +customer.getCustomer_Name());
	 out.println("\n Customer_Address1 is:" +customer.getCustomer_Address1());
	 out.println("\n Customer_Address2 is:" +customer.getCustomer_Address2());
	 out.println("\n Customer_Pincode is:" +customer.getCustomer_Pincode());
	 out.println("\n Email_address is:" +customer.getEmail_address());
	 out.println("\n Contact_Number is:" +customer.getContact_Number());
	 out.println("\n Primary_Contact_Person is:" +customer.getPrimary_Contact_Person());
	 out.println("\n Record_Status is:" +customer.getRecord_Status());
	 out.println("\n Active_Inactive_Flag is:" +customer.getActive_Inactive_Flag());
	}*/
	//--------------------------------------------------------------------------------
	/*
	 protected void Delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		 String Customer_Code=request.getParameter("del");  
		 System.out.println("Customer_Code is: "+Customer_Code);
		 Customer customer=new Customer();
		 CustomerDAO customerDAO=new CustomerDaoimpl();
		 customerDAO.delete(customer,Customer_Code);
		 out.println("deleted");
	 }*/
	//-----------------------------------------------------------------------
	 protected void view_all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
	 Customer customer=new Customer();
	 CustomerDAO customerDAO=new CustomerDaoimpl();
	 List<Customer> list=customerDAO.view_all();
	 request.setAttribute("list", list);
	 RequestDispatcher rd=request.getRequestDispatcher("ViewAll1.jsp");
	 rd.forward(request, response);
	
	 }
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//dosave(request,response);	
			//view(request,response);
			//Delete(request,response);
			view_all(request,response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	


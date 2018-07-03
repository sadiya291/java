package com.nucleus.Execution;


import com.nucleus.domain.CustomerMaster;
import com.nucleus.dao.CustomerDAO;
import com.nucleus.dao.CustomerDaoImp;
import java.util.Scanner;
import com.nucleus.domain.ErrorLogFile;

public class ExecutionFile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for record level rejection||enter 2 for file level rejection");
		int a=sc.nextInt();
		CustomerMaster customerMaster=new CustomerMaster();
		CustomerDAO customerDAO=new CustomerDaoImp();
		customerDAO.Reader(customerMaster);
		
		if(a==1)
		{
			System.out.print("you chose record level rejection");
			customerDAO.Reader(customerMaster);
				
		}
		
		if(a==2)
		{
			System.out.print("you chose file level rejection");
		}
		sc.close();

	}

}

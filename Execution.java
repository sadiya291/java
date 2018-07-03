package com.nucleus.execution;

import com.nucleus.dao.CustomerRecordDAO;
import com.nucleus.dao.CustomerRecorddDAOImpl;
import com.nucleus.domain.CustomerRecord;

import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
CustomerRecord customerRecord=new CustomerRecord();


CustomerRecordDAO customerRecordDAO=new CustomerRecorddDAOImpl();
int c=1;
System.out.println("enter the path ");
String path=sc.next();


String fullname=null;

while(c==1)
{
	System.out.println("enter the file name");
	String filename=sc.next();
	
	if(filename.endsWith(".txt"))
    {fullname=path+"\\"+filename;
     c=0;}
else{System.out.println("enter the correct file name");}
}



System.out.println("Type of rejection level");
System.out.println("enter r for record level\nf for file leve.");

String rejection=sc.next();

customerRecordDAO.readFromFile(fullname,rejection);
	}

}

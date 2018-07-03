package com.nucleus.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.connection.ConnectionSetup;
import com.nucleus.domain.CustomerRecord;
import com.nucleus.domain.ErrorLogFile;

public class CustomerRecorddDAOImpl implements CustomerRecordDAO 
{
	
	ConnectionSetup connectionSetup=new ConnectionSetup();
	Connection con=connectionSetup.getConnection();
	CustomerRecordCondition customerRecordCondition =new CustomerRecordCondition();
	ErrorLogFile errorLogFile=new ErrorLogFile();
	PreparedStatement pstmt;
	CustomerRecord customerRecord= new CustomerRecord();	
	
	
	public void writeIntoFile(CustomerRecord customerRecord)
	{
		try {
			pstmt=con.prepareStatement("insert into  table168 values( seq_one.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1,customerRecord.getCustomerCode());
			pstmt.setString(2,customerRecord.getCustomerName());
			pstmt.setString(3,customerRecord.getCustomerAddress1());
			pstmt.setString(4,customerRecord.getCustomerAddress2());
			pstmt.setLong(5,customerRecord.getCustomerPinCode());
			pstmt.setString(6,customerRecord.getEmailaddress());
			pstmt.setLong(7,customerRecord.getContactNumber());
			pstmt.setString(8,customerRecord.getPrimaryContactPerson());
			pstmt.setString(9,customerRecord.getRecordStatus());
			pstmt.setString(10,customerRecord.getActiveInactive());
			pstmt.setString(11,customerRecord.getCreateDate());
			pstmt.setString(12,customerRecord.getCreatedBy());
			pstmt.setString(13,customerRecord.getModifiedDate());
			pstmt.setString(14,customerRecord.getModifiedBy());
			pstmt.setString(15,customerRecord.getAuthorizedDate());
			pstmt.setString(16,customerRecord.getAuthorizedBy());
			pstmt.executeUpdate();
		} catch (SQLException e) {	
			String line1="Primarykey= "+line;
			errorLogFile.saveInErrorLog(line1);
			//e.printStackTrace();
			}
		
	}
	
	 String line=null;
	
	public void readFromFile(String fullfilename, String rejection) {
	
		CustomerRecord customerRecord= new CustomerRecord();	
	    FileReader fileReader=null;
	    BufferedReader bufferedReader=null;
	    PrintWriter printWriter=null;
	    int g=0;
	    String errorname=null;
	   
	
		
			try {
				fileReader = new FileReader(fullfilename);
				bufferedReader=new BufferedReader(fileReader);
				
				line = bufferedReader.readLine();
					//System.out.println(line);
				
		while(line!=null){
				   
					String value[]=line.split("~",-1);  //seperating the values
				
					//System.out.println(value[5]);
				//customer code
			    if(customerRecordCondition.Null(value[0]) && (value[0].length()<=10) /*&& (customerRecordCondition.unique(value[0]))*/)     //for null
				{ customerRecord.setCustomerCode(value[0]);}
				else
				{g++;
				errorname="CustomerCode = ";}
				
				//customer name
				if(customerRecordCondition.CustomerNamecheck(value[1]) && (value[1].length()<=30))
				{customerRecord.setCustomerName(value[1]);	}
				else 
				{g++; errorname="CustomerName = ";}
								
				//address1
				if(customerRecordCondition.Null(value[2]) && (value[2].length()<=100))
				{customerRecord.setCustomerAddress1(value[2]);}
				else{g++;  errorname="CustomerAddress1 = ";}
				
				//address2
				if(value[3].length()<=100)
                {customerRecord.setCustomerAddress2(value[3]);}
				else{g++;   errorname="CustomerAddress2 = ";}
							
				//customerPin 
				if(customerRecordCondition.CustomerPinCodecheck(Long.parseLong(value[4])))
				{  customerRecord.setCustomerPinCode(Long.parseLong(value[4]));	}
				else
				{ g++;  errorname="CustomerPinCode = ";}
               				
				//email
				if(customerRecordCondition.EmailValidcheck(value[5]))
				{ customerRecord.setEmailaddress(value[5]);}
				else 
				{g++;  errorname="Emailaddress = ";}			
			
				//contact number
				if(value[6].length()<=20)
				{customerRecord.setContactNumber(Long.parseLong(value[6]));}
				else
				{g++;}
				
				//contact person
				if(customerRecordCondition.Null(value[7])&& (value[7].length()<=100))
				{  customerRecord.setPrimaryContactPerson(value[7]);	}
				else {g++;   errorname="ContactPerson = ";}

				
				//record staus
				if(customerRecordCondition.RecordStatuscheck(value[8]))
	               { customerRecord.setRecordStatus(value[8]);   }
				else{  g++;  }
			
				//active inactive
				if(customerRecordCondition.ActiveInactiveFlagcheck(value[9]))				
					{ customerRecord.setActiveInactive(value[9]); }
				else
				{ g++;   errorname="Activeinactiveflag = "; }

				//create date
				if(customerRecordCondition.Null(value[10]))
				{customerRecord.setCreateDate(value[10]);  }
				else{  g++; errorname="Createdate = ";}
				
				//creeateby
				if(customerRecordCondition.Null(value[11])&& (value[11].length()<=30))
				{  customerRecord.setCreatedBy(value[11]);	}
			     else{g++;   errorname="Created by = ";}
				
				
				//modified date
				customerRecord.setModifiedDate(value[12]);
				
				
				//modified by
				if(value[13].length()<=30)
				{customerRecord.setModifiedBy(value[13]);}
				else {g++;  errorname="Modifiedby = ";}
				
				//authorized date
				customerRecord.setAuthorizedDate(value[14]);
				
				//authorized by
				if((value[15].length()<=30))
				{customerRecord.setAuthorizedBy(value[15]);}
				else {g++;   errorname="Authorizedby = ";}
				
				if(g==0)
				{
					writeIntoFile(customerRecord);
					line=bufferedReader.readLine();
					
				}
				if(g>0)
				{
				if(rejection.equalsIgnoreCase("r"))
				{
					String line1 = errorname+line;
					errorLogFile.saveInErrorLog(line1);
				   line=bufferedReader.readLine();
				   g=0;
			     }
				else
				{
					FileReader fileReader1 = new FileReader(fullfilename);
					BufferedReader bufferedReader1=new BufferedReader(fileReader1);
					line = bufferedReader1.readLine();
					while(line!=null)
					{
					
					errorLogFile.saveInErrorLog(line);
					
					line = bufferedReader1.readLine();
			    	
					}
					pstmt=con.prepareStatement("truncate table table168");
					pstmt.executeUpdate();
					//System.exit(0);
				}
		
		}
	
		}
		
} //while end
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		
				}
			}
		

				
			
	

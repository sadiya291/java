package com.nucleus.dao;
import com.nucleus.connection1.ConnectionSetup;
import com.nucleus.domain.CustomerMaster;
import com.nucleus.domain.ErrorLogFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.validation.CustomerValidation;


public class CustomerDaoImp  implements CustomerDAO
{
	ConnectionSetup connectionSetup=new ConnectionSetup();
	Connection con=connectionSetup.getConnection();
	PreparedStatement pstmt=null;
	CustomerValidation customerValidation=new CustomerValidation();
	CustomerMaster customerMaster=new CustomerMaster();
	ErrorLogFile errorLogFile=new ErrorLogFile();
	
	
	public void Writer(CustomerMaster customerMaster)
	
	
		{
			try {
		pstmt=con.prepareStatement("insert into SANDY_CUSTOMER_MASTER values(sadiya1.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1,customerMaster.getCustomer_Code());
		pstmt.setString(2,customerMaster.getCustomer_Name());
		pstmt.setString(3,customerMaster.getCustomer_Address1());
		pstmt.setString(4,customerMaster.getCustomer_Address2());
		pstmt.setLong(5,customerMaster.getCustomer_Pincode());
		pstmt.setString(6,customerMaster.getEmail_address());
		pstmt.setLong(7,customerMaster.getContact_Number());
		pstmt.setString(8,customerMaster.getPrimary_Contact_Person());
		pstmt.setString(9,customerMaster.getRecord_Status());
		pstmt.setString(10,customerMaster.getActive_Inactive_Flag());
		pstmt.setString(11,customerMaster.getCreate_Date());
		pstmt.setString(12,customerMaster.getCreated_By());
		pstmt.setString(13,customerMaster.getModified_Date());
		pstmt.setString(14,customerMaster.getModified_By());
		pstmt.setString(15,customerMaster.getAuthorized_Date());
		pstmt.setString(16,customerMaster.getAuthorized_By());
		pstmt.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();}
		}
	
	

	
	public void Reader(CustomerMaster customerMaster)
	
	{	
		FileReader fileReader=null;
		
		

		try { 
			fileReader=new FileReader("C:\\Users\\temp\\Desktop\\Test Cases\\testCase2.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			
			while(line!=null)
			{
				String[] spt=line.split("~",-1);
				

				
				if(customerValidation.ValidateNUL(spt[0])&& spt[0].length()<=10 )
				{	if(customerValidation.isPrimary_Key(spt[0], 10))
				{ customerMaster.setCustomer_Code(spt[0]);
				System.out.println("1"+customerMaster.getCustomer_Code());
				
				}
				else{errorLogFile.SaveLog(line);
				line=bufferedReader.readLine();
					}
				}
				
				
				if(customerValidation.ValidateNUL(spt[1])&& spt[1].length()<=30 )
				{
					if(customerValidation.CustomerNameValid(spt[1]))
					{
						customerMaster.setCustomer_Name(spt[1]);
						System.out.println("2"+customerMaster.getCustomer_Name());
					}
			
				else{
					errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();
				}
				}
				
				if(customerValidation.ValidateNUL(spt[2])&& spt[2].length()<=100 )
				{
				if(customerValidation.isValid_String(spt[2],100))
				{ customerMaster.setCustomer_Address1(spt[2]);
				  System.out.println("3"+customerMaster.getCustomer_Address1());
				}
				else{errorLogFile.SaveLog(line);
				line=bufferedReader.readLine();

				}
				}
				
				if(customerValidation.isValid_String(spt[3],100))
				{ customerMaster.setCustomer_Address2(spt[3]);
				 System.out.println("4"+customerMaster.getCustomer_Address2());
				}
				else{errorLogFile.SaveLog(line);
				line=bufferedReader.readLine();
					//flag++;
				}

				if(customerValidation.ValidateNUL(spt[4])&& spt[4].length()<=6 )
				{
				if(customerValidation.isValidCustomer_Pincode(Long.parseLong(spt[4]), 6))
				{ customerMaster.setCustomer_Pincode(Long.parseLong(spt[4]));
				 System.out.println("5"+customerMaster.getCustomer_Pincode());
				}
						
				else{errorLogFile.SaveLog(line);
				line=bufferedReader.readLine();
					//flag++;
				}
				}
				
				
				if(customerValidation.ValidateNUL(spt[5])&& spt[5].length()<=100 )
				{
				if(customerValidation.isValidEmail_Address(spt[5],100))
						{ customerMaster.setEmail_address(spt[5]);
						System.out.println("6"+customerMaster.getEmail_address());
					
						}else{errorLogFile.SaveLog(line);
						line=bufferedReader.readLine();

						}
				}

				if(customerValidation.isValidContact_Number(Long.parseLong(spt[6]), 20))
						{ customerMaster.setContact_Number(Long.parseLong(spt[6]));
						System.out.println("7"+customerMaster.getContact_Number());
						}else{errorLogFile.SaveLog(line);
						line=bufferedReader.readLine();

						}
				
				
				if(customerValidation.ValidateNUL(spt[7])&& spt[7].length()<=100 )
				{
				if(customerValidation.isValid_String(spt[7],100,true))
					{customerMaster.setPrimary_Contact_Person(spt[7]);
					System.out.println("8"+customerMaster.getPrimary_Contact_Person());
				
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				}
				
				
				
				if(customerValidation.ValidateNUL(spt[8])&& spt[8].length()<=1 )
				{
				if(customerValidation.isValidRecord_Status(spt[8]))
					{customerMaster.setRecord_Status(spt[8]);
					System.out.println("9"+customerMaster.getRecord_Status());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				}
				
				
				if(customerValidation.ValidateNUL(spt[9])&& spt[9].length()<=1 )
				{
				if(customerValidation.isValidActive_Inactive_Flag(spt[9]))
					{customerMaster.setActive_Inactive_Flag(spt[9]);
					System.out.println("10"+customerMaster.getActive_Inactive_Flag());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				}
				
				
				if(customerValidation.isValidDate(spt[10]))
					{customerMaster.setCreate_Date(spt[10]);
					System.out.println("11"+customerMaster.getCreate_Date());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				
				
				
				
				if(customerValidation.isValid_String(spt[11], 30, true))
					{customerMaster.setCreated_By(spt[11]);
					System.out.println("12"+customerMaster.getCreated_By());
				}else{errorLogFile.SaveLog(line);
				line=bufferedReader.readLine();

				}
				
				
				if(customerValidation.isValidDate(spt[12]))
					{customerMaster.setModified_Date(spt[12]);
					System.out.println("13"+customerMaster.getModified_Date());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				if(customerValidation.isValid_String(spt[13], 30))
					{customerMaster.setModified_By(spt[13]);
					System.out.println("14"+customerMaster.getModified_By());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				if(customerValidation.isValidDate(spt[14]))
					{customerMaster.setAuthorized_Date(spt[14]);
					System.out.println("15"+customerMaster.getAuthorized_Date());
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				if(customerValidation.isValid_String(spt[15], 30))
					{customerMaster.setAuthorized_By(spt[15]);
					System.out.println("16"+customerMaster.getAuthorized_By());
				
					}else{errorLogFile.SaveLog(line);
					line=bufferedReader.readLine();

					}
				line=bufferedReader.readLine();
				Writer(customerMaster);

				
					}
					}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	



	
	
}
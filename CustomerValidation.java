package com.nucleus.validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.*;

import com.nucleus.connection1.ConnectionSetup;

public class CustomerValidation {
	public boolean NULL(String str) {
		if(str.equals(""))
		{	System.out.println("=======>false-NULL is there.");
			return false;
		}
		else
		{	System.out.println("=======>true-not NULL");
			return true;
		}	
}
	//-----------------------------------------------------
	
	public boolean Primary_Key(String str,int size)
	{
		if(str!=null)
			{
				if(str.length()<=size)
				{
					ConnectionSetup connectionSetup=new ConnectionSetup();
					Connection con=connectionSetup.getConnection();
					PreparedStatement pstmt;
					try {
						pstmt = con.prepareStatement("select * from SANDY_CUSTOMER_MASTER");
						ResultSet rs=pstmt.executeQuery();
						while(rs.next())
							{
								String input=rs.getString(2);
								if(input.equals(str))
								{		System.out.println("======>false-enter unique key");
										return false;
					
								}
							}
							System.out.println("=====>true-verified primary key");
							return true;
						} catch (SQLException e) 
								{
										e.printStackTrace();
								}		
				}
					System.out.println("=======>size is greater than required size");
			
			}
				System.out.println("=======>false-string is null");
				return false;
	}
	//------------------------------------------------------------------
	public boolean Record_Status(String Status)
	{
		if(Status!=null)
		{
			if(Status.equals("N")||Status.equals("M")||Status.equals("D")||Status.equals("A")||Status.equals("R"))
			{
				System.out.println("=====>true-record status verified");
				return true;
			}
		}	
			System.out.println("======>false-enter valid character");
			return false;
	}
	
//----------------------------------------------------------------------------------------------------------	
	
	public boolean String(String str,int size)
	{
			if(str!=null)
			{
				if(str.length()<=size)
					{ 
						char[] characters=str.toCharArray();
						for(char xyz:characters)
						{
							if((Character.isLetterOrDigit(xyz)))
							{
								String x=Character.toString(xyz);
								System.out.println("======>true-string verified");
								return true;
							}
							System.out.println("======>false-enter valid string");
							return false;
						}
				}
		
			}
				System.out.println("=====>Enter required string");
				return false;
	}
	

	
	//----------------------------------------------------------------------------------------------
	public boolean Contact_Number(long num,int size)
	{
		String number=String.valueOf(num);
		if(number!=null)
		{
			if(number.length()<=size)
				{	char[]characters=number.toCharArray();
					for(char xyz:characters)
					{
						if((Character.isDigit(xyz)))
						{
							String x=Character.toString(xyz);
							System.out.println("======>true-Number verified");
							return true;
						}
						System.out.println("======>false-enter valid number");
						return false;
					}
				}
		}
		System.out.println("======>false-Enter required number");
		return false;
	}	
	//--------------------------------------------------------------------------
public boolean Customer_Pincode(long num,int size)
{
	String PIN=String.valueOf(num);
	if(PIN!=null)
	{
		if(PIN.length()<=size)
			{	char[]characters=PIN.toCharArray();
				for(char xyz:characters)
				{
					if((Character.isDigit(xyz)))
					{
						String x=Character.toString(xyz);
						System.out.println("======>true-pincode verified");
						return true;
					}
					System.out.println("======>false-enter valid string");
					return false;
				}
			}
	}
	System.out.println("=====>false-Please enter a valid pincode");
	return false;
	}	
	//------------------------------------------------------------------------

	public boolean FileFormat(String strg)
	{
		if(strg.contains(".txt"))
			{ 
			System.out.println("=====>true");
			return true;
	
			}
			System.out.println("======>false");
			return false;
		
	}
	
	//-----------------------------------------------------------
	public boolean Date(String date)
	{
		if(date!=null)
		{	System.out.println("======>true-date is verified");
			return true;
		}
		System.out.println("======>false-enter a valid date");
		return false;
		
	}
//----------------------------------------------
	public boolean Email_Address(String email, int size) 
{
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
				+"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
					
					if(email!=null)
					{
						if(email.length()<=size)
						{
						if(String.valueOf(email).matches(emailRegex))
							{	
								System.out.println("======>true-email verified");
								return true;
							} 
						System.out.println("=====>false-please enter a valid email");
						return false;
						}
						
					}
					System.out.println("false-email required");
					return false;
	
		
	
}
	
	//---------------------------------------------------------------
	public boolean Active_Inactive_Flag(String Flag )
	{
		if(Flag!=null)
		{
			if(Flag.equals("A")||Flag.equals("I"))
			{	
				System.out.println("=====>true-active-inactive flag verified");
				return true;
			}
		}
		System.out.println("=====>false-enter a valid flag");
		return false;
	}
	
//--------------------------------------------------------------------------
	
		public boolean CustomerNameValid(String CustomerName)
		{
			char[] xyz=CustomerName.toCharArray();
			int l=xyz.length;
			for(char ch: xyz)
				if(!Character.isLetterOrDigit(ch))
				{	
					return false;
				}
			System.out.println("=====>true nameeeeeeeeee");
			return true;
		}	
//---------------------------------------------------------
		public boolean String(String str,int size, boolean notnull)
		{
			if(notnull==true)
			{
				if(str!=null)
				{
					if(str.length()<=size)
						{ 
							char[] characters=str.toCharArray();
							for(char xyz:characters)
							{
								if((Character.isLetterOrDigit(xyz)))
								{
									String x=Character.toString(xyz);
									
									System.out.println("======>true-string verified");
									return true;
								}
							}
						}
			
				}	
				
				System.out.println("=====>false-enter a valid string");
				return false;
			}
		else 
			if(notnull==false)
			{
				if(str!=null)
				{
					if(str.length()<=size)
						{
							char[] characters=str.toCharArray();
							for(char xyz:characters)
							{
								if((Character.isLetterOrDigit(xyz)))
								{
									String x=Character.toString(xyz);
									System.out.println("======>true-string verified");
									return true;
								}
								System.out.println("======>false enter a valid string");
								return false;
						
							}
						}
				}
			
			}
				System.out.println("=======>false-enter a valid string");
				return false;
		}
		
}
	


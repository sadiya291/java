package com.nucleus.validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.*;

import com.nucleus.connection1.ConnectionSetup;

public class CustomerValidation {
	public boolean isValidRecord_Status(String Record_Status)
	{
		if(Record_Status!=null)
		{
			if(Record_Status.equals("N")||Record_Status.equals("M")||Record_Status.equals("D")||Record_Status.equals("A")||Record_Status.equals("R"))
			{
				return true;
			}
		}	return false;
	}
	
//----------------------------------------------------------------------------------------------------------	
	
	public boolean isValidActive_Inactive_Flag(String Active_Inactive_Flag )
	{
		if(Active_Inactive_Flag!=null)
		{
			if(Active_Inactive_Flag.equals("A")||Active_Inactive_Flag.equals("I"))
			{
				return true;
			}
		} return false;
	}
	
//-----------------------------------------------------------------------------------------------	
	
	public boolean isValid_String(String string,int size, boolean mandatory)
	{
		if(mandatory==true)
		{
			if(string!=null)
			{
				if(string.length()<=size)
					{ 
						char[] chars=string.toCharArray();
						for(char xyz:chars)
						{
							if((Character.isLetterOrDigit(xyz)))
							{
								String ch=Character.toString(xyz);
								return true;
							}
						}
				}
		
		}return false;
	}
	else 
		if(mandatory==false)
		{
			if(string!=null)
			{
				if(string.length()<=size)
					{
					char[] chars=string.toCharArray();
					for(char xyz:chars)
					{
						if((Character.isLetterOrDigit(xyz)))
						{
							String ch=Character.toString(xyz);
						return true;
					}return false;
					
			}
		}
		}
		
	}return true;
	}
	
//-----------------------------------------------------------------------------------------	
	
	public boolean isValid_String(String string,int size)
	{
			if(string!=null)
			{
				if(string.length()<=size)
					{ 
						char[] chars=string.toCharArray();
						for(char xyz:chars)
						{
							if((Character.isLetterOrDigit(xyz)))
							{
								String ch=Character.toString(xyz);
								return true;
							}return false;
						}
				}
		
		}return true;
	}
	//----------------------------------------------------------------------------------------------
	public boolean isValidContact_Number(long num,int size)
	{
		String mno=String.valueOf(num);
		if(mno!=null)
		{
			if(mno.length()<=size)
				{	char[]charss=mno.toCharArray();
					for(char xyz:charss)
				{
					if((Character.isDigit(xyz)))
					{
						String ch=Character.toString(xyz);
						return true;
					}return false;
				}
			}
		}return false;
		}	
	//--------------------------------------------------------------------------
public boolean isValidCustomer_Pincode(long num,int size)
{
	String mob=String.valueOf(num);
	if(mob!=null)
	{
		if(mob.length()<=size)
			{	char[]charss=mob.toCharArray();
				for(char xyz:charss)
			{
				if((Character.isDigit(xyz)))
				{
					String ch=Character.toString(xyz);
					return true;
				}return false;
			}
		}
	}return false;
	}	
	//------------------------------------------------------------------------

	public boolean isValidFileFormat(String strg)
	{
	if(strg.contains(".txt"))
		{ return true;
	
		}
		return false;
		
	}
	
	//-----------------------------------------------------------
	public boolean isValidDate(String date)
	{
		if(date!=null)
		{return true;
		}return false;
		
	}
//----------------------------------------------
	public boolean isValidEmail_Address(String email, int size) {
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
				+"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
					
					if(email!=null)
					{
						if(email.length()<=size)
						{
						if(String.valueOf(email).matches(emailRegex))
						{
							return true;
						} 
						return false;
					}
						
	}return false;
	
		}
	
	//---------------------------------------------------------------
	public boolean isPrimary_Key(String string,int size)
	{
		if(string!=null)
			{
			if(string.length()<=size)
			{
				ConnectionSetup connectionSetup=new ConnectionSetup();
				Connection con=connectionSetup.getConnection();
				PreparedStatement pstmt;
				try {
					pstmt = con.prepareStatement("select * from SANDY_CUSTOMER_MASTER");
				
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					String user=rs.getString(2);
					if(user.equals(string))
					{	return false;
					
					}
				}return true;
				} catch (SQLException e) 
				{
					
				
					e.printStackTrace();
				}
			}
			
		}return false;
	}
	//--------------------------------------------------------------------------
/*public boolean notNULL(String s)
	{
		if(s.equals(""))
		{	return false;
		}
		else
			return true;
	}*/
//--------------------------------------------------------------------------
	
		public boolean CustomerNameValid(String CustomerName)
		{
			char[] c=CustomerName.toCharArray();
			int l=c.length;
			for(char ch: c)
				if(!Character.isLetterOrDigit(ch))
				{
					String c1=Character.toString(ch);
					if(!c1.equals(" "))
						return false;
				}return true;
			}
//---------------------------------------------------------
		public boolean ValidateNUL(String s) {
			if(s.equals(""))
			{
				
			return false;
			}
			else
				return true;
}
}
	

	
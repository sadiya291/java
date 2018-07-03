package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import com.nucleus.connection.ConnectionSetup;
import com.nucleus.domain.CustomerRecord;

public class CustomerRecordCondition
{
	CustomerRecord customerRecord=new CustomerRecord();   //making the object of record class
	ConnectionSetup connectionSetup=new ConnectionSetup();   //making the connction of connection class
	Connection con=connectionSetup.getConnection();          //calling the object

   
	
	public boolean CustomerNamecheck(String name)          //for name........
   {
	   if(name.equals(""))
	   {
		  return false;
	   }
	   char[] chars = name.toCharArray();
          for(char customerRecord : chars)
          {
	      if(!(Character.isLetterOrDigit(customerRecord)))
	      {  String ch=Character.toString(customerRecord);
	    	  if(!ch.equals(" "))
	            return false;
	      }
	    }

	  return true;
   }
   
  
 	public boolean EmailValidcheck(String email)             //for email...
	 {
		   if(email.equals(""))
			   return false;
		   if(email.length()>100)
			   return false;
	       Pattern pat = Pattern.compile("^.+@.+\\..+$");
				 if (email == null)
				  return false;
		return pat.matcher(email).matches();
	   }
	
	
	
   //for pin code
   public boolean CustomerPinCodecheck(long pinCode)            //for pin code
   {	  String str= Long.toString(pinCode);
	  if(str.equals(""))
		  return false;
	  if(str.length()==6)
		  return true;
	  return false;
   }
   
   
   public boolean RecordStatuscheck(String recordStatus)              // for record status
   {
	   String r=recordStatus.toUpperCase();
	   if(r.equals(""))
		   return false;
	   if(r.length()==1&&(r.equals("N")||r.equals("M")||r.equals("D")||r.equals("A")||r.equals("R")))
			   {
		     return true;
			   }
	   return false;
   }
   
   
  
   public boolean ActiveInactiveFlagcheck(String flag)           //for active and inactive
   {
	   String str=flag.toUpperCase();
	   if(str.equals(""))
		 return false;
	   if(str.length()==1&&(str.equals("A")||str.equals("I")))
	   {
		   return true;
	   }
	   return false;
   }
   
   
   /*public boolean lengthfor30(String line) //size =30
   {
	   if(line.length()>30)
		   {return false;}
	   else{return true;}
   }*/
   
   /*public boolean addresscheck(String line)  //size=100
   {
	   if(line.length()>100)
		   {return true;}
	   else{return false;}
   }*/
   
  /* public boolean size10check(String line)  //size=10
   {
	   if(line.length()>10)
		   {return false;}
	   else{return true;}
   }
   
   public boolean size20check(String line)  //size=20
   {
	   if(line.length()>20)
		   {return true;}
	   else{return false;}
   }
   */
   
   /*public boolean unique(String CustomerCode)    //checq unique.......
	{
		try {
			PreparedStatement psmt = con.prepareStatement("select * from table168");
			ResultSet resultSet = psmt.executeQuery();
			while(resultSet.next())
			{ 
			          String CustomerCodedb=resultSet.getString(2);
				if((CustomerCodedb.equals(CustomerCode)))
						{
					        return false;
						}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
   */
   
   
   public boolean Null(String line)           //for null
   {
    if(line.equals("")) 
		 return false;
	 return true;
  }
}

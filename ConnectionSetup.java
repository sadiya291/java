package com.nucleus.connection1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionSetup 
{
	Connection con;
	public  Connection getConnection()
	{
		
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");  //connecting to driver
				con=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");  //conneting to oracle
		
			}
				catch (ClassNotFoundException e) 
				{
			
					e.printStackTrace();
				}
				catch (SQLException e) {
			
					e.printStackTrace();
				}
					return con;
	
	}

		public void closeConnection()
		{
			try {
				con.close();
				} 	
					catch (SQLException e) 
					{
		
						e.printStackTrace();
					}	
		}
	
	

}



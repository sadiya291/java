package com.nucleus.dao;



public class DAOFactory {
	public static CustomerDAO getCustomerDaoImpl(String implType)
	{
		if(implType.equals("rdms"))
		{
			return new CustomerDaoImp();
		}
		else if(implType.equals("xml"))
		{
			return new CustomerXmlDaoimpl();
		}
		else
		{
			return null;
		}
	}
}
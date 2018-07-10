
package com.nucleus.dao;
import com.nucleus.domain.CustomerMaster;


public interface CustomerDAO {
	public void Reader(CustomerMaster customerMaster,String file,String rej);
	public void Writer(CustomerMaster customerMaster,String rej);
}


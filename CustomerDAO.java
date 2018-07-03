package com.nucleus.dao;
import com.nucleus.domain.CustomerMaster;

public interface CustomerDAO {
	public void Reader(CustomerMaster customerMaster);
	public void Writer(CustomerMaster customerMaster);
}

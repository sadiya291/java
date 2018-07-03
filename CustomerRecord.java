package com.nucleus.domain;

public class CustomerRecord {

	private int CustomerID; 
	private String CustomerCode; 
	private String CustomerName ;
	private String CustomerAddress1; 
	private String CustomerAddress2;
	private long CustomerPinCode;
	private String Emailaddress;
	private long ContactNumber;
	private String PrimaryContactPerson;
	private String RecordStatus ;
	private String ActiveInactive; 
	private String CreateDate ;
	private String CreatedBy;
	private String ModifiedDate; 
	private String ModifiedBy ;
	private String AuthorizedDate;
	private String AuthorizedBy ;
	
	//getter n setter begin....
	public int getCustomerID() {
	   return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getCustomerCode() {
		return CustomerCode;
	}
	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress1() {
		return CustomerAddress1;
	}
	public void setCustomerAddress1(String customerAddress1) {
		CustomerAddress1 = customerAddress1;
	}
	public String getCustomerAddress2() {
		return CustomerAddress2;
	}
	public void setCustomerAddress2(String customerAddress2) {
		CustomerAddress2 = customerAddress2;
	}
	public long getCustomerPinCode() {
		return CustomerPinCode;
	}
	public void setCustomerPinCode(long customerPinCode) {
		CustomerPinCode = customerPinCode;
	}
	public String getEmailaddress() {
		return Emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		Emailaddress = emailaddress;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getPrimaryContactPerson() {
		return PrimaryContactPerson;
	}
	public void setPrimaryContactPerson(String primaryContactPerson) {
		PrimaryContactPerson = primaryContactPerson;
	}
	public String getRecordStatus() {
		return RecordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		RecordStatus = recordStatus;
	}
	public String getActiveInactive() {
		return ActiveInactive;
	}
	public void setActiveInactive(String activeInactive) {
		ActiveInactive = activeInactive;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getModifiedDate() {
		return ModifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		ModifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return ModifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}
	public String getAuthorizedDate() {
		return AuthorizedDate;
	}
	public void setAuthorizedDate(String authorizedDate) {
		AuthorizedDate = authorizedDate;
	}
	public String getAuthorizedBy() {
		return AuthorizedBy;
	}
	public void setAuthorizedBy(String authorizedBy) {
		AuthorizedBy = authorizedBy;
	}
	//getter n setter end.
	
	//tostring....
	public String toString() {
		return "CustomerRecord [CustomerID=" + CustomerID + ", CustomerCode="
				+ CustomerCode + ", CustomerName=" + CustomerName
				+ ", CustomerAddress1=" + CustomerAddress1
				+ ", CustomerAddress2=" + CustomerAddress2
				+ ", CustomerPinCode=" + CustomerPinCode + ", Emailaddress="
				+ Emailaddress + ", ContactNumber=" + ContactNumber
				+ ", PrimaryContactPerson=" + PrimaryContactPerson
				+ ", RecordStatus=" + RecordStatus + ", ActiveInactive="
				+ ActiveInactive + ", CreateDate=" + CreateDate
				+ ", CreatedBy=" + CreatedBy + ", ModifiedDate=" + ModifiedDate
				+ ", ModifiedBy=" + ModifiedBy + ", AuthorizedDate="
				+ AuthorizedDate + ", AuthorizedBy=" + AuthorizedBy + "]";
	}
	
	

}

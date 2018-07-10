package com.nucleus.domain;

public class CustomerMaster {
	
	private int Customer_ID;
	private String Customer_Code;
	private String Customer_Name;
	private String Customer_Address1;
	private String Customer_Address2;
	private long Customer_Pincode;
	private String Email_address;
	private long Contact_Number;
	private String Primary_Contact_Person;
	private String Record_Status;
	private String Active_Inactive_Flag;
	private String Create_Date;
	private String Created_By;
	private String Modified_Date;
	private String Modified_By;
	private String Authorized_Date;
	private String Authorized_By;
	
	public int getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}
	public String getCustomer_Code() {
		return Customer_Code;
	}
	public void setCustomer_Code(String customer_Code) {
		Customer_Code = customer_Code;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_Address1() {
		return Customer_Address1;
	}
	public void setCustomer_Address1(String customer_Address1) {
		Customer_Address1 = customer_Address1;
	}
	public String getCustomer_Address2() {
		return Customer_Address2;
	}
	public void setCustomer_Address2(String customer_Address2) {
		Customer_Address2 = customer_Address2;
	}
	public long getCustomer_Pincode() {
		return Customer_Pincode;
	}
	public void setCustomer_Pincode(long customer_Pincode) {
		Customer_Pincode = customer_Pincode;
	}
	public String getEmail_address() {
		return Email_address;
	}
	public void setEmail_address(String email_address) {
		Email_address = email_address;
	}
	public long getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getPrimary_Contact_Person() {
		return Primary_Contact_Person;
	}
	public void setPrimary_Contact_Person(String primary_Contact_Person) {
		Primary_Contact_Person = primary_Contact_Person;
	}
	public String getRecord_Status() {
		return Record_Status;
	}
	public void setRecord_Status(String record_Status) {
		Record_Status = record_Status;
	}
	public String getActive_Inactive_Flag() {
		return Active_Inactive_Flag;
	}
	public void setActive_Inactive_Flag(String active_Inactive_Flag) {
		Active_Inactive_Flag = active_Inactive_Flag;
	}
	public String getCreate_Date() {
		return Create_Date;
	}
	public void setCreate_Date(String create_Date) {
		Create_Date = create_Date;
	}
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public String getModified_Date() {
		return Modified_Date;
	}
	public void setModified_Date(String modified_Date) {
		Modified_Date = modified_Date;
	}
	public String getModified_By() {
		return Modified_By;
	}
	public void setModified_By(String modified_By) {
		Modified_By = modified_By;
	}
	public String getAuthorized_Date() {
		return Authorized_Date;
	}
	public void setAuthorized_Date(String authorized_Date) {
		Authorized_Date = authorized_Date;
	}
	public String getAuthorized_By() {
		return Authorized_By;
	}
	public void setAuthorized_By(String authorized_By) {
		Authorized_By = authorized_By;
	}
	
	public String toString() {
		return "CustomerMaster [Customer_ID=" + Customer_ID
				+ ", Customer_Code=" + Customer_Code + ", Customer_Name="
				+ Customer_Name + ", Customer_Address1=" + Customer_Address1
				+ ", Customer_Address2=" + Customer_Address2
				+ ", Customer_Pincode=" + Customer_Pincode + ", Email_address="
				+ Email_address + ", Contact_Number=" + Contact_Number
				+ ", Primary_Contact_Person=" + Primary_Contact_Person
				+ ", Record_Status=" + Record_Status
				+ ", Active_Inactive_Flag=" + Active_Inactive_Flag
				+ ", Create_Date=" + Create_Date + ", Created_By=" + Created_By
				+ ", Modified_Date=" + Modified_Date + ", Modified_By="
				+ Modified_By + ", Authorized_Date=" + Authorized_Date
				+ ", Authorized_By=" + Authorized_By + "]";
	}
	


	
}

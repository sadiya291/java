<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="BackButton.jsp" %>
 <%@include file="FirstPage.jsp" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core " prefix="c" %>  
<body>
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Customers</h2></caption>
            <tr>
                <th>customer code</th>
                <th>customer name</th>
                <th>customer address1</th>
                <th>customer address2</th>
                <th>customer pin code</th>
                <th>email id</th>
                <th>contact number</th>
                <th>primary contact person</th>
                <th>record status</th>
                <th>active inactive flag</th>
            </tr>
            <c:forEach var="customer" items="${list}">
                <tr>
                    <td><c:out value="${customer.getCustomer_Code()}" /></td>
                    <td><c:out value="${customer.getCustomer_Name()}" /></td>
                    <td><c:out value="${customer.getCustomer_Address1()}" /></td>
                    <td><c:out value="${customer.getCustomer_Address2()}" /></td>
                    <td><c:out value="${customer.getCustomer_Pincode()}" /></td>
                    <td><c:out value="${customer.getEmail_address()}" /></td>
                    <td><c:out value="${customer.getContact_Number()}" /></td>
                    <td><c:out value="${customer.getPrimary_Contact_Person()}" /></td>
                    <td><c:out value="${customer.getRecord_Status()}" /></td>
                    <td><c:out value="${customer.getActive_Inactive_Flag()}" /></td>
                    <td>
                        <%-- <a href="/edit?id=<c:out value='${customer.getCustomerCode()}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=<c:out value='${customer.getCustomerCode()}' />">Delete</a>     --%>                 
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>    
</body>
</html>
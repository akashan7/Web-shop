<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
		<form id="books" action="/CRUD/administratorSite/books" method="get"></form>
		<form id="users" action="/CRUD/administratorSite/users" method="get"></form>
		
		<form id="categories" action="/CRUD/administratorSite/categories" method="get"></form>
		<form id="couponCodes" action="/CRUD/administratorSite/couponCodes" method="get"></form>
		<form id="orders" action="/CRUD/administratorSite/orders" method="get"></form>
		
		<form id="address" action="/CRUD/administratorSite/address" method="get"></form>
		
		<input type="submit" value="Books" form="books" />&nbsp;
		<input type="submit" value="Users" form="users" />&nbsp;
		
		<input type="submit" value="categories" form="categories" />&nbsp;
		<input type="submit" value="couponCodes" form="couponCodes" />&nbsp;
		<input type="submit" value="orders" form="orders" />&nbsp;
		
		<input type="submit" value="address" form="address" />&nbsp;
		
		
	</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>

	<center>
		<h2>Users</h2>
		<h2>
		<form action="${sessionScope.PROJECT_NAME}administratorSite/users/read" method="GET"><input type="submit" value="Read" /></form><br>
		<form action="${sessionScope.PROJECT_NAME}administratorSite/users/delete" method="GET"><input type="submit" value="Delete/Ban" /></form><br>
		<form action="${sessionScope.PROJECT_NAME}administratorSite/users/update" method="GET"><input type="submit" value="Update" /></form><br>
		<form action="${sessionScope.PROJECT_NAME}administratorSite/users/create" method="GET"><input type="submit" value="Create" /></form><br>
	</h2>
	
		<form id="Back" action="${sessionScope.PROJECT_NAME}administratorSite" method="get"></form>
		<input type="submit" value="Back" form="Back" />
	</center>
</body>
</html>
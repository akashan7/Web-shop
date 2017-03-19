<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Update</title>
</head>
<body>
�<form method="get" action="deleteUser">
��Name : �<input type="text" name="userName"  />
		<input align="top" type="submit" value="Delete" />
���</form>

	<c:if test="${msg != null}">
		<c:out value="${msg}"></c:out>
	</c:if>
	<center>
			<c:forEach items="${users}" var="user">
			<table border="0" width="13%">
			--------------------------------------------<br>
			<tr><c:out value="User id : ${user.id}"></c:out><br></tr>
			
			<tr><c:out value="Login : ${user.login}" /><br></tr>
			
			<tr><c:out value="Password : ${user.password}" /><br></tr>
			
			<tr><c:out value="Name : ${user.name}" /><br></tr>
			
			<tr><c:out value="Surname : ${user.surname}" /><br></tr>
			
			<tr><c:out value="E-mail : ${user.eMail}" /><br></tr>
			
			<tr><c:out value="Date of birth : ${user.dateBirth}" /><br></tr>
			
			<tr><c:out value="Country : ${address.getCountry()}" /><br></tr>
			
						 			<c:forEach items="${roles}" var="role">
				<c:forEach items="${role.getUser()}" var="userRole">
					<c:if test="${userRole.getId() == user.getId()}">
						<tr>Role : <c:out value="${role.getRole()}" /><br></tr>
					</c:if>
				</c:forEach>
			</c:forEach> 
			<br>
			
			�<form action="deleteUser/${user.id}">
				<input align="top" type="submit" value="Delete" />
��			�</form>
			</table>
			</c:forEach>
		</center>
</body>
</html>
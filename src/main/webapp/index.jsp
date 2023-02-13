 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>      
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring Security!</h1>

<h2>Pagina de Inicio!</h2>
	
	<p>
		Usuario: <security:authentication property="principal.username"/>
		Rol: <security:authentication property="principal.authorities"/>
	</p>
	
</body>
</html>

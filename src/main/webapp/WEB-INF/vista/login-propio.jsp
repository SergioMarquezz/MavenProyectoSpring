<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style"text-aling:center">Pagina de Login</h3>
	
	<form:form action="/autenticarUsuario" method="POST">
		
		Usuario: <input type="text" name="username"/>
		Contrasenia: <input type="text" name="password"/>
		
		<input type="submit" value="Iniciar"/>
		
	</form:form>
	
</body>
</html>
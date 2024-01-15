<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>simple demo</title>
</head>
<body>
<h2>sum of 2 nos</h2>
<%=20 + 30%>
<%=Math.random()%>
<%



out.println("welcome to jsp");
%>

<%!
int disp(){
	int a=100;
	int b=200;
	return(a+b);
}

%>
<%=disp() %>
</body>
</html>
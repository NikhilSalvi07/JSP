<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<jsp:useBean id="std" class="com.demo.bean.StudentBean"><!--create object as a std-->
<jsp:setProperty name="std" param="stdId" property="stdId"/>
<jsp:setProperty name="std" param="stdName" property="stdName"/>
<h4>ID </h4>

<jsp:getProperty name="std" property="stdId"/>
<h2>Name </h2>
<jsp:getProperty name="std" property="stdName"/>
</jsp:useBean>
</body>
</html>
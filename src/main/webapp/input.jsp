<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enter your name</title>
</head>
<body>
	<s:form action="Hello.action">
	<s:textfield name="name" label="enter your name"></s:textfield>
	<s:submit value="submit" type="submit"></s:submit>
	</s:form>
</body>
</html>
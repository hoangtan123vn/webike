<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri = "http://tiles.apache.org/tags-tiles" prefix = "tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Base Layout</title>
</head>
<body>
	<tiles:insertAttribute name = "header"/>
	<tiles:insertAttribute name = "body" />
	<tiles:insertAttribute name = "footer" />
</body>
</html>
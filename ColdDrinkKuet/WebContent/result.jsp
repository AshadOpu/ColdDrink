<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ColdDrinksBrandsJSP</title>
</head>
<body>
	<h1 align = "center">Cold Drinks Brands JSP</h1>
	<p>
	
	<%
		List L2 = (List)request.getAttribute("abc");
	Iterator itr = L2.iterator();
	
	while(itr.hasNext())
	{
		out.println("<br> Brands : " + itr.next());
	}
	
	%>
	
	
</body>
</html>
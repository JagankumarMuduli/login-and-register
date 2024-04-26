<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<body>
    <%
        // Retrieve the session object
        HttpSession session = request.getSession(false);
    	if(currentSession !=null)
    	{
    		currentSession.invalidate();
    	}

         response.sendRedirect("index.html");
        
    %>


</body>
</body>
</html>
<%-- 
    Document   : admin
    Created on : Sep 25, 2016, 10:04:19 AM
    Author     : ables
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <div>
            <div>
                <c:url var="newbook" value="/newBook.jsp"/>
                <a href="newbook">Add new book</a> 
            <a href="#">Delete Book</a>
            <a href="#">All Books</a>
            </div>
        </div>
    </body>
</html>

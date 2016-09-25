<%-- 
    Document   : newBook
    Created on : Sep 25, 2016, 10:56:40 AM
    Author     : ables
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <div>
                <form:form method="POST" action="">
                    <div>
                        <form:label path="title">Title</form:label>
                        <form:input path="title"/>
                    </div>
                    
                </form:form>
            </div>
        </div>
    </body>
</html>

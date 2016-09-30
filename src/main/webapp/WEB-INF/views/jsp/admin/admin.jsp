<%-- 
    Document   : admin
    Created on : Sep 25, 2016, 10:04:19 AM
    Author     : ables
--%>

<%@taglib  uri="/struts-tags" prefix="s" %>
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
                <ol>
                    <li>
                        <s:url action="newBook.action" var="newbook"/>
                        <s:set var=
                        <s:a href="%{newbook}">New Book</s:a>
                    </li>
                </ol>
            </div>
        </div>
    </body>
</html>

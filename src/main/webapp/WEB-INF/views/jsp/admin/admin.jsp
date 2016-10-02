<%-- 
    Document   : admin
    Created on : Sep 25, 2016, 10:04:19 AM
    Author     : ables
--%>

<%@taglib  uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>
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
                <ul>
                    <li>
                        <s:url action="act" var="newbook">
                            <s:param name="type">form</s:param>
                        </s:url>
                        <s:a href="%{newbook}">New Book</s:a>
                    </li>
                    
                    <li>
                    <s:url action="cat" var="newcategory">
                        <s:param name="type">form</s:param>
                    </s:url>
                    <s:a href="%{newcategory}">New Category</s:a>
                    </li>
                    <li>
                    </li>
                </ul>
            </div>
        </div>
    </body>
</html>

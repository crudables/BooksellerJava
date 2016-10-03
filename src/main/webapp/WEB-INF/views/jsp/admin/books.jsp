<%-- 
    Document   : books
    Created on : 03-Oct-2016, 10:23:12
    Author     : Ables
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib  uri="/struts-jquery-tags" prefix="sj" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books</title>
    </head>
    <body>
        <div>
            <div>
                <p>List of Books</p>
                <ul>
                    <s:iterator value="allbooks" var="book">
                    <s:if test="#allbooks == null">
                        <p>You have no record for any book</p>
                    </s:if>
                        <li><s:property value="#book.title"/></li>
                </s:iterator>
                </ul>
            </div>
        </div>
    </body>
</html>

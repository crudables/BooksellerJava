<%-- 
    Document   : newCategory
    Created on : Sep 30, 2016, 1:15:06 PM
    Author     : ables
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Category</title>
    </head>
    <body>
        <s:div>
            <s:div>
                <s:form action="newcat" method="post">
                    <s:textfield name="name" label="Category" key="category.name"/>
                    <s:submit  name="save" value="Save"/>
                </s:form>
            </s:div>
        </s:div>
    </body>
</html>

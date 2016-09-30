<%-- 
    Document   : newbook
    Created on : Sep 30, 2016, 8:42:07 AM
    Author     : ables
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="/struts-tags" prefix="s" %>
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
                <s:form method="post" action="regBook">
                    <s:textfield name="title" label="Title" labelposition="left"/>
                    <s:textfield name="author" label="Author" />
                    <s:textfield name="isbn" label="ISBN"/>
                    <s:textfield name="publisher" label="Publisher"/>
                    <s:textfield name="price" label="Price" />
                    <s:select name="lang" label="Language" list="{'Language','English','French','Spanish'}" />
                </s:form>
            </div>
        </div>
    </body>
</html>

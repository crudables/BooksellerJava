<%-- 
    Document   : category
    Created on : Oct 2, 2016, 3:25:25 PM
    Author     : ables
--%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<%@taglib  uri="/struts-jquery-tags" prefix="sj" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categories</title>
    </head>
    <body>
        <div>
            <div>
                <s:iterator value="categories">
                    <s:if test="#categories == null">
                        <p>The category list is empty</p>
                    </s:if>
                    <s:property value="#categories.name" />
                </s:iterator>
            </div>
        </div>
    </body>
</html>

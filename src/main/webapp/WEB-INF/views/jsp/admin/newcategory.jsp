`<%-- 
    Document   : newCategory
    Created on : Sep 30, 2016, 1:15:06 PM
    Author     : ables
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <sj:head/>
        <title>New Category</title>
    </head>
    <body>
        <s:div>
            <s:div>
                <s:form action="cat" method="post">
                    <s:hidden name="type" value="submit" />
                    <s:textfield name="cat.name" label="Category" key="category.name" size="10"/>
                    <sj:datepicker name="cat.createdDate" label="Created Date" displayFormat="dd/mm/yy" size="4" timepicker="true"/>
                    <sj:datepicker name="cat.updatedDate" label="Updated Date" displayFormat="dd/mm/yy" size="4" timepicker="true" />
                    <s:submit  name="save" value="Save"/>
                </s:form>
            </s:div>
        </s:div>
    </body>
</html>

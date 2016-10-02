<%-- 
    Document   : newbook
    Created on : Sep 30, 2016, 8:42:07 AM
    Author     : ables
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head/>
    </head>
    <body>
        <div>
            <div>
                <s:form method="post" action="act">
                    <s:hidden name="type" value="submit" />
                    <s:textfield name="title" label="Title" labelposition="left"/>
                    <s:textfield name="author" label="Author" />
                    <s:textfield name="isbn" label="ISBN"/>
                    <s:textfield name="publisher" label="Publisher"/>
                    <s:textfield name="price" label="Price"  maxlength="4"/>
                    <s:textfield name="oldPrice" label="Old Price" maxLength="4" />
                    <s:textfield name="ordered" label="Quanity Ordered"/>
                    <s:textfield name="instock" label="Quanitty in Stock"/>
                    <s:select name="lang" label="Language" list="{'Language','English','French','Spanish'}" />
                    <s:checkbox label="Active" name="active"/>
                    <sj:datepicker  name="createddate" displayFormat="dd-mm-yy" label="Created Date"/>
                    <sj:datepicker name="updateddate" displayFormat="dd-mm-yy" label="Updated Date" />
                    <sj:datepicker name="releaseddate" displayFormat="dd-mm-yy" label="Released Date" />
                    
                    <s:textarea name="about" label="About" />
                    <s:submit value="Submit" />
                </s:form>
            </div>
        </div>
    </body>
</html>

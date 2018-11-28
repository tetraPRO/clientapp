<%-- 
    Document   : benefitInfo
    Created on : Nov 26, 2018, 12:49:47 PM
    Author     : philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Benefit Info</title>
    </head>
    <body>
        <h1>Beneficiary Information</h1>
        
        <%
            String[] params = (String[])request.getAttribute("data");
        %>
        
        First Name:<%=params[0]%><br/>
        Middle Initial:<%=params[1]%><br/>
        Last Name:<%=params[2]%><br/>
        Relationship to Owner:<%=params[3]%><br/>
        Address:<%=params[4]%><br/>
        Apt Number:<%=params[5]%><br/>
        City:<%=params[6]%><br/>
        State:<%=params[7]%><br/>
        Zip Code:<%=params[8]%><br/>
        Phone Number: <%=params[9]%><br/>
        Contingent First name:<%=params[10]%><br/>
        Contingent Last Name:<%=params[11]%><br/>
        Contingent Relationship to Owner:<%=params[12]%><br/>

         
        
    </body>
</html>

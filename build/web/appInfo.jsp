<%@page import="java.sql.Connection"%>
<%@page import="utils.DBUtils"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : appInfo
    Created on : Nov 25, 2018, 8:27:52 AM
    Author     : philip
--%>

<%@page import="utils.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String[] params = (String[]) request.getAttribute("data");          
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clients</title>
    </head>
    <body>
        <h1>Welcome <%=params[0]%></h1>
        
        <table border="0" cellspacing="1" cellpadding="1">
            <tbody>
                <tr>
                    <td>First Name:</td>
                    <td><%=params[0]%></td>
                </tr>
                <tr>
                    <td>Middle Initial:</td>
                    <td><%=params[1]%></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%=params[2]%></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><%=params[3]%></td>
                </tr>
                <tr>
                    <td>Apt Number:</td>
                    <td><%=params[12]%></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><%=params[4]%></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td><%=params[5]%></td>
                </tr>
                <tr>
                    <td>Zip:</td>
                    <td><%=params[11]%></td>
                </tr>
                <tr>
                    <td> Phone:</td>
                    <td><%=params[6]%></td>
                </tr>
                <tr>
                    <td>Social Number:</td>
                    <td><%=params[7]%></td>
                </tr>
                <tr>
                    <td>Date of Birth:</td>
                    <td><%=params[8]%></td>
                </tr>
                <tr>
                    <td>Is self: </td>
                    <td><%=params[9]%></td>
                </tr>
                <tr>
                    <td> Sex:</td>
                    <td><%=params[10]%></td>
                </tr>                
            </tbody>
        </table>
   </body>
</html>

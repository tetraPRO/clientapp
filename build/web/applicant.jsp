<%-- 
    Document   : applicant
    Created on : Nov 25, 2018, 8:51:31 AM
    Author     : philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <form action="${pageContext.request.contextPath}/AppInfo" method="POST">
    <center>
        <h1>Welcome to our simple 1 page app!</h1>
    <table border="0" cellspacing="1" cellpadding="1">
        <tbody>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" required="true"/></td>
            </tr>
             <tr>
                <td>Middle Initial:</td>
                <td><input type="text" name="middle" required="true"/></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" required="true"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" required="true"/></td>
            </tr>
            <tr>
                <td>Apt. Number</td>
                <td><input type="text" name="aptNum" /></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><input type="text" name="city" required="true"/></td>
            </tr>
            <tr>
                <td>State:</td>
                <td><input type="text" name="state" required="true"/></td>
            </tr>
            <tr>
                <td>Zipcode:</td>
                <td><input type="text" name="zip" required="true"/></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><input type="text" name="phone" required="true"/></td>
            </tr>
            <tr>
                <td>Social Security:</td>
                <td><input type="text" name="socialNum" required="true"/></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><input type="text" name="birthDate" required="true"/></td>
            </tr>
            <tr>
                <td>Relationship to Owner:</td>
                <td><input type="checkbox" name="self" value="self"/>Self</td>
            </tr>
            <tr>
                <td>Sex:</td>
                <td><input type="checkbox" name="sex" value="male"/>Male
                <input type="checkbox" name="sex" value="female"/>Female</td>
            </tr>             
            <tr>
                 <td><input type="submit" value="Got it!"/></td>                            
            </tr>
        </tbody>
    </table>
    </center>
</form>
<%-- 
    Document   : beneficiary
    Created on : Nov 26, 2018, 12:13:42 PM
    Author     : philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<center>
    <form action="${pageContext.request.contextPath}/Beneficiary" method="POST">
        <table border="0" width="1" cellspacing="1" cellpadding="1">
            <tbody>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName" required="true"/></td>
                </tr>
                <tr>
                    <td>Middle Initial</td>
                    <td><input type="text" name="middle" required="false"/></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName" required="true"/></td>
                </tr>
                <tr>
                    <td>Relationship to Owner:</td>
                    <td><input type="text" name="relationship" required="true"/></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type="text" name="address" required="true"/></td>
                </tr>
                <tr>
                    <td>Apt Number:</td>
                    <td><input type="text" name="aptNum"/></td>
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
                    <td>Zip code:</td>
                    <td><input type="text" name="zip" required="true"/></td>
                </tr>
                <tr>
                    <td>Phone Number:</td>
                    <td><input type="text" name="phone" required="true"/></td>
                </tr>
                <tr>
                    <td>First Name Contingent:</td>
                    <td><input type="text" name="firstNameContingent" required="false"/></td>
                </tr>
                <tr>
                    <td>Last Name Contingent:</td>
                    <td><input type="text" name="lastNameContingent" required="false"/></td>
                </tr>
                <tr>
                    <td>Relationship to Owner Contingent:</td>
                    <td><input type="text" name="relatContin_owner" required="false"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add Info"/></td>
                </tr>
            </tbody>
        </table>

    </form>
</center>
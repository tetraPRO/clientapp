<%-- 
    Document   : index
    Created on : Nov 25, 2018, 8:11:39 AM
    Author     : philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client App</title>
    </head>
    <body>
        
        <div id="applicant_info">
            <jsp:include page="applicant.jsp"/>
        </div>
        <br/>
        <div id="beneficiary_info">
            <jsp:include page="beneficiary.jsp"/>
        </div>
        <br/>
        <div id="riders">
            
        </div>
        
        <div id="plan_payment_duedate">
            
        </div>
        
        <div id="coverage_amount">
            
        </div>
        
        <div id="health_questionair">
            
        </div>
        
        <div id="replacement_apl_deliv">
            
        </div>
        
        <div id="signatures">
            
        </div>
        
        
    </body>
</html>

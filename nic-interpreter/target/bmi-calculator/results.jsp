<%-- 
    P.M.I Chamara
    110067U
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="nicPackage.NicInterpreter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center"><u>Results</u></h1>
        
        <%  try{ 
             String number =  request.getParameter("nicNumber");
             NicInterpreter nic = new NicInterpreter(number);
        %>
        <br>
        <% out.println("BirthDay : "); %>
        <% out.println("Year : "+ nic.getYear()); %>
        <% out.println("Month : "+ nic.getMonth()); %>
        <% out.println("Date : "+ nic.getDate()); %>
        <br>
        <% out.println("Gender : "+nic.getGender()); %>
        <br>
        <% out.println("Is voter: "+nic.isVoter());
            }catch(Exception ex){
                    out.println("Plese enter a valid NIC number");
                }
        %>
           
            
    </body>
</html>

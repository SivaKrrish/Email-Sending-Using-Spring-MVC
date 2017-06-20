<%-- 
    Document   : Result
    Created on : 10 Nov, 2014, 6:08:52 PM
    Author     : SivaKrrish
--%>
<%@ page import = "javax.servlet.RequestDispatcher" %>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="background-color: burlywood;height: 100px;width:100%;text-align: center;padding-top: 5px;padding-bottom: 5px">
            <i style="font-size: 25px;font-weight: bold" >  Sending e-mail with Spring MVC </i>
            <br/>
            <div style="float:right;padding-right:10px;padding-bottom:15px "><i > 5010 Project 2 <br/> Submitted By : P Siva Rama Krishna </i><br/><i > Student ID : 18137255 </i>
            </div>
        </div>
    <center>
          <div style="padding-top: 70px;height:400px;padding-bottom: 90px">
        <h1>Thank you for sending email</h1><br />
        <form method="post" action="sendEmail.do">
        <table>
            <tr>
                <td colspan="2" style="text-align: right"><input type = "text" name="count" size="1" align="right" value=${cnt}></td>
            </tr>
            <tr>
            <td>From:</td>
            <td><input type = "text" name = "Fromadd" size = "69" /></td>
            </tr> 
            <tr>
                <td>To:</td>
                <td><input type="text" name="Toadd" size="69" /></td>
            </tr>
            <tr>
                <td>Subject:</td>
                <td><input type="text" name="Subject" size="69" /></td>
            </tr>
            <tr>
                <td>Message:</td>
                <td><textarea cols="50" rows="10" name="Message"></textarea></td>
            </tr>               
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Send E-mail" />
                </td>
            </tr>
        </table>
            </form>
          </div>
            <div style="background-color: burlywood;height: 30px;width:100%;text-align: center">
                <i > Copyright  2014 </i>
            </div>
    </center>
</body>
</html>






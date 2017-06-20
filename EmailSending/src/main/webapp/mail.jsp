<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email with Spring MVC</title>
    </head>
    <body>

        <div style="background-color: burlywood;height: 100px;width:100%;text-align: center;padding-top: 5px;padding-bottom: 5px">
            <i style="font-size: 25px;font-weight: bold" >  Sending e-mail with Spring MVC </i>
            <br/>
            <div style="float:right;padding-right:10px;padding-bottom:15px "><i > 5010 Project 2 <br/> Submitted By : P Siva Rama Krishna </i><br/><i > Student ID : 18137255 </i>
            </div>
        </div>
        <center>

            <div style="padding-top: 100px;height:400px;padding-bottom: 70px">
                <form method="post" action="sendEmail.do">

                    <table border="0" width="40%">

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
                            <td><textarea cols="50" rows="8" name="Message"></textarea></td>
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
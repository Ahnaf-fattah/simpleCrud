<%-- 
    Document   : home
    Created on : Dec 11, 2020, 10:09:44 AM
    Author     : naaff
--%>

<%@page import="io.project.model.sales"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>list stuff</title>
    </head>
    
    <style>
        td{
            text-align: center;
        }
        th{
            text-align: center;
        }
        
        .btn{
            background-color: white;
            color: black;
        }
        
        .btn:hover{
            color: grey;
            
        }
    </style>
    <body style="background-color: grey">
        
        
        <h1 style="text-align: center;color: white" >simple crud app</h1>
        <div class="container">
            <table class="table table-striped table-dark">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Barang</th>
                    <th>Jumlah</th>
                    <th>Edit</th>
                </tr>
            </thead>
            <tbody>
                      	
                <c:forEach items="${Sales}" var="sales">
                    <tr>
                    <td ><c:out value="${sales.ID}"/></td>
                    <td><c:out value="${sales.barang}"/></td>
                    <td><c:out value="${sales.jumlah}"/></td>                    
                
                    <td>
                        <a href="edit?ID=<c:out value='${sales.ID}'/>" class="btn">
                            EDIT
                        </a>
                          <a href="del?ID=<c:out value='${sales.ID}'/>" class="btn">
                            DELETE
                        </a>
                    </td>  
                </tr>
            
                    </c:forEach>
            </tbody>
        </table>
            <a href="add" class="btn btn-dark">Add Data</a>
        </div>
        
    </body>
</html>
<%-- 
    Document   : add
    Created on : Dec 13, 2020, 1:58:42 PM
    Author     : naaff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add data</title>
    </head>
    <body style="background-color:  grey">
        x
        <!-- Default form contact -->
        <div class="container ">
            <h1 style="text-align: center;color: white" >Add Data </h1>
        </div>
        <div class="container " style="margin-top:  150px">
            
            <div class="row" >
                 <div class="col-4"> 
                    
                </div>
                
                <form class="text-center col-4" action="add" method="POST" >
                    

                    <!-- Barang -->
                    <input type="text" name="barang" id="defaultContactFormName" class="form-control mb-5" placeholder="Barang">

                    <!-- Jumlah -->
                    <input type="text" name="jumlah" id="defaultContactFormEmail" class="form-control mb-5" placeholder="Jumlah">

                     <!-- Tombol Tambah -->
                    <button class="btn btn-dark btn-block mt-4" type="submit">Tambah</button>
                    
                </form>
                
            </div>
            
        </div>

        
    </body>
</html>

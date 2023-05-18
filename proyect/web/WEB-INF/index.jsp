<%-- 
    Document   : index
    Created on : 17/05/2023, 06:26:09 PM
    Author     : Paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body> 
        <div class="container-col-lg-3">
            <form action="principal.jsp">
                <div class="form-group">
                    <p><strongh>Registrar materiales</strongh></p>
                </div>
                <div class="form-group"></div>
                <label>Id Material</label>
                <div class="form-group">
                    <label>Nombre material</label>
                    <input type="text" name="name">
                </div>
                <div class="form-group">
                    <label>Precio material</label>
                    <input type="text" name="name">
                </div>
                <div class="form-group">
                    <label>Descripcion material</label>
                    <input type="text" name="name">
                </div>
                <div class="form-group">
                    <label>Color material</label>
                    <input type="text" name="name">
                </div>
                <div class="form-group">
                    <label>Material</label>
                    <select>
                        <option values="1">Cuero</option>
                        <option values="2">Terciopelo</option>
                        <option values="3">Loneta</option>
                    </select>
                <input class="btn btn-danger btn-block" type="submit" name="action" value="Ingresar"
            
                </div>
            </form>

                <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

                <h1>Hello World!</h1>
                </body>
                </html>

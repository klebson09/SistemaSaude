<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page errorPage = "error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <title>Login</title>
    </head>
    <body>
        <div id="divCenter">
            <form style=""class="form-container" method="POST" action="<%=request.getContextPath()%>/ControllerLogin" >
                <div class="form-title"><h2>Login</h2></div>
                <div class="form-title">Nome</div>
                <input class="form-field" type="text" name="name" /><br />
                <div class="form-title">Senha</div>
                <input class="form-field" type="text" name="password" /><br />
                <div class="submit-container">
                    <input class="submit-button" type="submit" value="Entrar" />
                </div>
            </form>
        </div>



    </body>
</html>
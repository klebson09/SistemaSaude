<%-- 
    Document   : testeConexao
    Created on : 11/12/2015, 17:22:27
    Author     : klebsonsantana
--%>

<%@page import="com.dao.ConexaoMySQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>TESTE CONEXAO!</h1>
        
        Sua conexão antes de conectar:
        <%

            out.println(ConexaoMySQL.statusConection());

        %>
        <br>
        Após criar uma instancia da conexão:
        <%            ConexaoMySQL.getConexaoMySQL();

            out.println(ConexaoMySQL.statusConection());

        %>
    </body>
</html>

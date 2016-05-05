<%@page import="servlet.LoginBean"%>  

<p>Você está logado!</p>  
<%
    LoginBean bean = (LoginBean) request.getAttribute("bean");
    out.print("Bem vindo, " + bean.getName()); out.print("</br>");
    out.print("Sua sessão está definida pela seguinte ID:" + session.getId()); 
%>  
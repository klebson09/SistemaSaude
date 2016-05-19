package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ControllerLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);
        request.setAttribute("bean", bean);

        System.out.println("pegando o email e password ------->>>");
        System.out.println(name + password);
        boolean status = true;
//                System.out.println("exibe o email e password ------->>>");

        try {
            status = bean.validate(name, password);
            System.out.println("passou login");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("nao passou");
        }
        if (status) {
            // Create a session object if it is already not  created.
            // se o usuário tiver tido sua sessão invalidada e você desejar criar outra
            session = request.getSession(true);
            // Get session creation time.
            Date createTime = new Date(session.getCreationTime());
            // Get last access time of this web page.
            Date lastAccessTime = new Date(session.getLastAccessedTime());

            //Para invalidar uma sessão pode usar      
            // session.invalidate();  
           
            
/*
Utilizando-se dos métodos
    session.setAttribute(String nome,Object valor);   
    session.getAttribute(String nome);              
*/            
            
            // Check if this is new comer on your web page.
            if (session.isNew()) {
                session.setAttribute("name", name);
//                RequestDispatcher rd = request.getRequestDispatcher("jsps/login-success.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("jsps/cadastrarPaciente.jsp");
                rd.forward(request, response);
                System.out.println("OK ----> nova session");
            } else {System.out.println("---->>session failed");
                RequestDispatcher rd = request.getRequestDispatcher("jsps/cadastrarPaciente.jsp");
                
                rd.forward(request, response);
                
            }
           
        } else {
            throw new ServletException("Campos vazios");
//            RequestDispatcher rd = request.getRequestDispatcher("jsps/login-error.jsp");
//            rd.forward(request, response);
        }

    }

}

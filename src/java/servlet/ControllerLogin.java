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

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        LoginBean bean = new LoginBean();
        bean.setEmail(email);
        bean.setPassword(password);
        request.setAttribute("bean", bean);

//        System.out.println("exibe o email e password ------->>>");
//        System.out.println(name + password);
        boolean status = false;

        try {
            status = bean.validate(email, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (status) {
            // Create a session object if it is already not  created.
            session = request.getSession(true);
            // Get session creation time.
            Date createTime = new Date(session.getCreationTime());
            // Get last access time of this web page.
            Date lastAccessTime = new Date(session.getLastAccessedTime());

            // Check if this is new comer on your web page.
            if (session.isNew()) {
                session.setAttribute("name", email);
//                RequestDispatcher rd = request.getRequestDispatcher("jsps/login-success.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("jsps/indexLogado.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("jsps/indexLogado.jsp");
                rd.forward(request, response);
            }
           
        } else {
            throw new ServletException("Campos vazios");
//            RequestDispatcher rd = request.getRequestDispatcher("jsps/login-error.jsp");
//            rd.forward(request, response);
        }

    }

}

package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Pessoa;

public class LoginBean {

    private String email, password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(String email, String senha) throws SQLException, ClassNotFoundException {
        boolean retorno = false;
        Connection conn = null;
        PreparedStatement ps;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ficha_saude", "root", "");
        ps = conn.prepareStatement("select * from pessoa where email = " + "'" + email + "'" + " and pwd = " + "'" + senha + "'");
        ResultSet rs = ps.executeQuery();
        retorno = rs.next();
        return retorno;
    }
}

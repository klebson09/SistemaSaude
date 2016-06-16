package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Pessoa;

public class LoginBean {

    private String name, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(String nome, String senha) throws SQLException, ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ficha_saude", "root", "");

        ps = conn.prepareStatement("select * from pessoa where nome = " + "'" + nome + "'" + " and pwd = " + "'" + senha + "'");
        ResultSet rs = ps.executeQuery();

        Pessoa pessoa = new Pessoa();
        while (rs.next()) {

            
//            System.out.println("verificando o select-------------->>>>>");
//            System.out.println(rs);
            pessoa.setNome(nome);
            pessoa.setPwd(senha);        
        }
        conn.close();
        if (pessoa.getNome().equals(nome) && pessoa.getPwd().equals(senha)) {
             System.out.println("chegou em loginBean.java  --->>>"+nome + senha);
            return true;
        } else {
            
            //System.out.println("Login e/ou senha incorreta");
            return false;   
        }

    }
}

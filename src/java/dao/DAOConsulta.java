package dao;

import model.Consulta;
import com.mysql.jdbc.Statement;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOConsulta implements Serializable {

    public void adicionar(Consulta consulta) {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/bd_sistema_ficha_saude";
        String sql = "insert into consulta "
                + "(Paciente_idPaciente, Paciente_numSUS, MEdico_idMEdico, MEdico_CRM, tipo_consulta, observacao, arquivo_consulta)"
                + " values (?,?,?,?,?,?,?)";

        try {

            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver

            con = DriverManager.getConnection(url, "root", "root");
            // seta os valores
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, consulta.getPacienteidPaciente());
            stmt.setString(2, consulta.getPacientenumSUS());
            stmt.setInt(3, consulta.getMedicoidMEdico());
            stmt.setString(4, consulta.getMedicoCRM());
            stmt.setString(5, consulta.getTipoConsulta());
            stmt.setString(6, consulta.getObservacao());
          //  stmt.setByte(7, consulta.getArquivoConsulta());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete() {
    }

    public void list() throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Consulta consulta = null;
        String url = "jdbc:mysql://localhost:3306/bd_sistema_ficha_saude";
        String query = "SELECT Paciente_idPaciente, Paciente_numSUS, MEdico_idMEdico, MEdico_CRM, tipo_consulta, observacao, arquivo_consulta=";
        try {
            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver
            con = DriverManager.getConnection(url, "root", "root");
            //conectando stmt = con.createStatement(); //criando um statement
            rs = stmt.executeQuery(query); //executando a query

            // o result set contém os resultados da operação
            if (rs.next()) {

                consulta = new Consulta();

//Recuperando os dados do result set.
                consulta.setIdConsulta(Integer.MIN_VALUE);
                consulta.setPacienteidPaciente(rs.getInt("Paciente_idPaciente"));
                consulta.setPacientenumSUS(rs.getString("Paciente_numSUS"));
                consulta.setMedicoidMEdico(rs.getInt("MEdico_idMEdico"));
                consulta.setMedicoCRM(rs.getString("MEdico_CRM"));
                consulta.setTipoConsulta(rs.getString("tipo_consulta"));
                consulta.setObservacao(rs.getString("observacao"));
                consulta.setArquivoConsulta(rs.getBytes("arquivo_consulta"));
                System.out.println(consulta);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            //Problemas no carregamento do driver
            ex.printStackTrace();
        }
        //principal exceção JDBC
         finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {

                ex.printStackTrace();

            }

        }
    }

    public Consulta find() {
        return null;
    }

}

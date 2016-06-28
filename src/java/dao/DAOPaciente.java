package dao;

import model.Paciente;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Endereco;
import model.Pessoa;

public class DAOPaciente {

    //DAOPessoa daoPessoa = new DAOPessoa();
    // DAOPaciente daopaciente = new DAOPaciente();
    //DAOEndereco daoEndereco = new DAOEndereco();
    public void adicionar(Paciente paciente) {
//public void adicionar(Paciente paciente, Pessoa pessoa, Endereco endereco) {

        //daoPessoa.adicionar(pessoa);
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/bd_sistema_ficha_saude";
        String sql = "insert into paciente "
                + "(numSUS, Pessoa_idPessoa)"
                + " values (?, ?)";

        try {

            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver

            con = DriverManager.getConnection(url, "root", "");
            // seta os valores
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, paciente.getNumSUS());
            stmt.setInt(2, paciente.getPessoaIdPessoa());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //daoEndereco.adicionar(endereco);
    }

    public void pegaIdPessoa(int idPessoa) throws SQLException, IOException {
        int idresult = 0;
        Connection con = null;
        PreparedStatement SQL;
        
        

           
        try {
            
            String url = "jdbc:mysql://localhost:3306/bd_sistema_ficha_saude";
            SQL = con.PreparedStatement("Select * from pessoa where idPessoa = ?");
            SQL.setInt(1, idPessoa);
			ResultSet rs = SQL.executeQuery();
            if (rs.next()) {
				int lastIsertedId = rs.getInt("idcliente");
				bean.setIdcliente(lastIsertedId);
				idresult = bean.getIdcliente();
			} else {
				System.out.println("Cliente não encontrado");
			}
			rs.close();
			SQL.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Erro de SQL" + e);
		}
		try {
			con = ConexaoEstoque.getConexao();  
			PreparedStatement ps2 = con.prepareStatement("insert into compra(idcliente, produto) values (?, ?)");
			ps2.setInt(1, idresult);
			ps2.setString(2, bean.getProduto());
			ps2.execute();
			ps2.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Erro no SQL2" + e);
		}
	}
    

    public void delete() {
    }

    public void list() throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Paciente paciente = null;
        String url = "jdbc:mysql://localhost:3306/bd_sistema_ficha_saude";
        String query = "SELECT Paciente_numSUS, idPaciente=";
        try {
            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver
            con = DriverManager.getConnection(url, "root", "");
            //conectando stmt = con.createStatement(); //criando um statement
            rs = stmt.executeQuery(query); //executando a query

            // o result set contém os resultados da operação
            if (rs.next()) {

                paciente = new Paciente();

//Recuperando os dados do result set.
                //paciente.setIdPaciente(Integer.MIN_VALUE);
                paciente.setNumSUS(rs.getInt("Paciente_numSUS"));
                System.out.println(paciente);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            //Problemas no carregamento do driver
            ex.printStackTrace();
        } //principal exceção JDBC
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

    public Paciente find() {
        return null;
    }

}

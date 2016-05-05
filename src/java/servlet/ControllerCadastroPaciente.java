package servlet;

import dao.DAOPessoa;
import model.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *OBS NÃO ESTÁ CADASTRANDO EM 2 TABELAS (ENDERECO E PESSOA)
 * @author klebsonsantana
 */
public class ControllerCadastroPaciente extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String nome = request.getParameter("nome");
        String dataNasc = request.getParameter("dataNasc");//pegando dados de um formulário WEB 
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        
        String logradouro = request.getParameter("logradouro");
        int numero = Integer.parseInt(request.getParameter("numero"));
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String cep = request.getParameter("cep");
        
        System.out.println("mostra nome: " + nome + "  dat nascimento: :" + dataNasc + "  CPF: " + cpf + "  Rg: " + rg + "  EMAIL: " + email + "  SENHA: " + pwd + "  ");
        System.out.println("mostra logradouro: " + logradouro + "  numero :" + numero + "  complemento: " + complemento + "  cidade: " + cidade + "  estado: " + estado + "  cep: " + cep + "  ");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setDataNasc(dataNasc);
        pessoa.setCpf(cpf);
        pessoa.setRg(rg);
        pessoa.setEmail(email);
        pessoa.setPwd(pwd);
        
        pessoa.setLogradouro(logradouro);
        pessoa.setNumero(numero);
        pessoa.setComplemento(complemento);
        pessoa.setCidade(cidade);
        pessoa.setEstado(estado);
        pessoa.setCep(cep);

        DAOPessoa daopessoa = new DAOPessoa();
        daopessoa.adicionar(pessoa);

         
        RequestDispatcher rd = request.getRequestDispatcher("jsps/cadastroSucesso.jsp");
        rd.forward(request, response);
    }
}

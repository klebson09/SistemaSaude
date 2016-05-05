package servlet;

//package com.servlet;
//
//import com.dao.DAOEndereco;
//import com.dao.DAOPessoa;
//import com.model.Endereco;
//import com.model.Pessoa;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *OBS NÃO ESTÁ CADASTRANDO EM 2 TABELAS (ENDERECO E PESSOA)
 * @author klebsonsantana
 */
//public class ControllerCadastroPaciente_erro extends HttpServlet {

//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        String nome = request.getParameter("nome");
//        String dataNasc = request.getParameter("dataNasc");//pegando dados de um formulário WEB 
//        String cpf = request.getParameter("cpf");
//        String rg = request.getParameter("rg");
//        String email = request.getParameter("email");
//        String pwd = request.getParameter("pwd");
//        System.out.println("mostra nome: " + nome + "  dat nascimento: :" + dataNasc + "  CPF: " + cpf + "  Rg: " + rg + "  EMAIL: " + email + "  SENHA: " + pwd + "  ");
////        System .out.println("mostra logradouro " +nome+ "complemento:" + dataNasc + "n:" + cpf + "cidade:" + rg + "estado:" + email + "cep:" + pwd + "");
//        Pessoa pessoa = new Pessoa();
//        // pessoa.setIdPessoa(Integer.MIN_VALUE);
//        pessoa.setNome(nome);
//        pessoa.setDataNasc(dataNasc);
//        pessoa.setCpf(cpf);
//        pessoa.setRg(rg);
//        pessoa.setEmail(email);
//        pessoa.setPwd(pwd);
//
//        DAOPessoa daopessoa = new DAOPessoa();
//        daopessoa.adicionar(pessoa);
//
//        //----------------------------------------------------------------------
////        ENDEREÇO 
//        DAOEndereco daoendereco = new DAOEndereco();
//
//        System.out.println("----------------->>>>>>>>>>        <<<<<_____-----");
//        System.out.println(daoendereco.pegaUltimaPessoa());
//        int idPessoa = Integer.parseInt(request.getParameter("idPessoa"));
//
//        String IdEndereco = request.getParameter("IdEndereco");
//        String logradouro = request.getParameter("logradouro");
//        int numero = Integer.parseInt(request.getParameter("numero"));
//        String complemento = request.getParameter("complemento");
//        String cidade = request.getParameter("cidade");
//        String estado = request.getParameter("estado");
//        String cep = request.getParameter("cep");
//
//        System.out.println("mostra logradouro " + logradouro + "complemento:" + complemento + "n:" + numero + "cidade:" + cidade + "estado:" + estado + "cep:" + cep + "");
//
//        Endereco endereco = new Endereco();
//
//        endereco.setLogradouro(logradouro);
//        endereco.setNumero(numero);
//        endereco.setComplemento(complemento);
//        endereco.setCidade(cidade);
//        endereco.setEstado(estado);
//        endereco.setCep(cep);
//        //passar o valor de pegaUltimaPessoa
////        String idPessoa = daoendereco..pegaUltimaPessoa();
//
//        daoendereco.adicionar(endereco);
//
//    }
//}

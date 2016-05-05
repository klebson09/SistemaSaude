package servlet;

import dao.DAOEndereco;
import model.Endereco;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerEndereco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        Endereco endereco;
        //  String IdEndereco = request.getParameter("IdEndereco");
        String logradouro = request.getParameter("logradouro");
        //todo valor que vem do formulario html ou jsp é string e precisa converter para int
        //obs. tipo data, tbm converter
        int numero = Integer.parseInt(request.getParameter("numero"));
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String cep = request.getParameter("cep");
        //como ele utiliza três objetos (endereço, pessoa e paciente) eu não sei como passar todos os dados para 
        //os respectivos objetos
        // ERRO SOLUCIONADO era esperado um construtor de set paramentros (como esta especificado na classe pessoa) porem só existia 6 parametros
        System.out.println("mostra logradouro " +logradouro+"complemento:"+complemento+"n:"+numero+"cidade:"+cidade+"estado:"+estado+"cep:"+cep+"");
        Endereco endereco = new Endereco();
        // endereco.setIdEndereco(Integer.MIN_VALUE);
        //converter string para data
//        pessoa.setDataNasc(dataNasc);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setComplemento(complemento);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        
        DAOEndereco daoendereco  = new DAOEndereco();
        daoendereco.adicionar(endereco);

    }
}

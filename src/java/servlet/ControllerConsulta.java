package servlet;

import dao.DAOConsulta;
import model.Consulta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerConsulta extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //        Consulta Consulta;
        //  String IdConsulta = request.getParameter("IdConsulta");
        //todo valor que vem do formulario html ou jsp é string e precisa converter para int
        //obs. tipo data, tbm converter
        
   // int idConsulta = integer.parseInt(request.getParameter("idConsulta"));
    //int pacienteidPaciente = integer.parseInt(request.getParameter("pacienteidPaciente"));
    String pacientenumSUS = request.getParameter("pacientenumSUS");
  //  int MedicoidMEdico = request.getParameter("MedicoidMEdico");
    String MedicoCRM = request.getParameter("MedicoCRM");
    //static final long serialVersionUID = 1L;
    String tipoConsulta = request.getParameter("tipoConsulta");
    String observacao = request.getParameter("observacao");
   // byte[] arquivoConsulta = request.getParameter("arquivoConsulta");
    //   ------>>>> SÃO OS DADOS DO ENDEREÇO <<<<-------
//    int numero = Integer.parseInt(request.getParameter("numero"));
//    String complemento = request.getParameter("complemento");
//    String cidade = request.getParameter("cidade");
//    String estado = request.getParameter("estado");
//    String cep = request.getParameter("cep");
        //como ele utiliza três objetos (endereço, pessoa e paciente) eu não sei como passar todos os dados para 
    //os respectivos objetos
    // ERRO SOLUCIONADO era esperado um construtor de set paramentros (como esta especificado na classe pessoa) porem só existia 6 parametros

   // System.out.println ( "mostra consulta " +consulta+"complemento:"+complemento+"n:"+numero+"cidade:"+cidade+"estado:"+estado+"cep:"+cep+"");
        Consulta consulta = new Consulta();
        // Consulta.setIdConsulta(Integer.MIN_VALUE);
    //converter string para data
//        pessoa.setDataNasc(dataNasc);

    consulta.setPacientenumSUS(pacientenumSUS);
    consulta.setMedicoCRM(MedicoCRM);
    consulta.setTipoConsulta(tipoConsulta);
    consulta.setObservacao(observacao);

    DAOConsulta daoConsulta = new DAOConsulta();
    daoConsulta.adicionar (consulta);

}
@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
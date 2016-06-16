package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listarConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--META-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <title>Listar Consultas-SFS</title>\n");
      out.write("\n");
      out.write("        <!--STYLESHEETS-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--SCRIPTS-->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js\"></script>\n");
      out.write("        <!--Slider-in icons-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>  <br/>  </h1>\n");
      out.write("            <form name=\"cadastro-form\" class=\"cadastro-form\"method=\"POST\" action=\"CadastroServlet\">\n");
      out.write("                <!--HEADER-->\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <!--TITLE-->\n");
      out.write("                    <h1 align=\"center\">Lista de Consultas-SFS</h1>\n");
      out.write("                    <!--END TITLE-->\n");
      out.write("\n");
      out.write("                    <!--DESCRIPTION-->\n");
      out.write("                    <span>Para acessar é necessário.</span>\n");
      out.write("                    <!--END DESCRIPTION-->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("\n");
      out.write("                    <div class=\"table\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Dados da Consulta</legend>\n");
      out.write("                            Tipo Consulta\n");
      out.write("                            <select name=tipo_consulta>\n");
      out.write("                                <option>Clinico Geral</option>\n");
      out.write("                                <option>Coloproctologista</option>\n");
      out.write("                                <option>Nutricionista</option>\n");
      out.write("                                <option>Traumatologia</option>\n");
      out.write("                            </select><br> <br>\n");
      out.write("                            Médico\n");
      out.write("                            <select name=medico>\n");
      out.write("                                <option>João Marcos</option>\n");
      out.write("                                <option>Francisco José</option>\n");
      out.write("                                <option>Mary Jane</option>\n");
      out.write("                                <option>Leonardo Gonçalves</option>\n");
      out.write("                            </select><br> <br>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("\n");
      out.write("                    <div class=\"table\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Consultas</legend>\n");
      out.write("                            <table>\n");
      out.write("\n");
      out.write("                                <colgroup span=\"4\"></colgroup>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Médico Responsável</th>\n");
      out.write("                                    <th >Paciente</th>\n");
      out.write("                                    <th>Data da Consulta</th>\n");
      out.write("                                    <th>Local</th>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>João Marcos</td>\n");
      out.write("                                    <td>Marco Augusto</td>\n");
      out.write("                                    <td>14/10/2015 </td>\n");
      out.write("                                    <td>Hospital Barão de Lucena</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>João Marcos</td>\n");
      out.write("                                    <td>Lucas Andrade</td>\n");
      out.write("                                    <td>30/10/2015</td>\n");
      out.write("                                    <td>Hospital da Restauração</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <!--<input type=\"hidden\" name=\"tarefa\" value=\"cadastrar\"/>\n");
      out.write("                    <button type=\"submit\">Cadastrar</button> -->\n");
      out.write("                    <img class=\"imagem-wrap\" src=\"logo_portal.jpg\" alt=\"Tim Berners-Lee\" width=\"500\" height=\"50\" />\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--GRADIENT--><div class=\"gradient\"></div><!--END GRADIENT-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

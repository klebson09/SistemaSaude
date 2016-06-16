package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Cadastro Form</title>\n");
      out.write("\n");
      out.write("        <!--STYLESHEETS-->\n");
      out.write("        <link href=\"jsps/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <!--SCRIPTS-->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js\"></script>\n");
      out.write("        <!--Slider-in icons-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".username\").focus(function () {\n");
      out.write("                    $(\".user-icon\").css(\"left\", \"-48px\");\n");
      out.write("                });\n");
      out.write("                $(\".username\").blur(function () {\n");
      out.write("                    $(\".user-icon\").css(\"left\", \"0px\");\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\".password\").focus(function () {\n");
      out.write("                    $(\".pass-icon\").css(\"left\", \"-48px\");\n");
      out.write("                });\n");
      out.write("                $(\".password\").blur(function () {\n");
      out.write("                    $(\".pass-icon\").css(\"left\", \"0px\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>  <br/>  </h1>\n");
      out.write("            <form name=\"cadastro-form\" class=\"cadastro-form\"method=\"POST\" action=\"CadastroServlet\">\n");
      out.write("                <!--HEADER-->\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <!--TITLE--><h1>Consulta  - SFS</h1><!--END TITLE-->\n");
      out.write("                    <!--DESCRIPTION--><span>Para acessar é necessário.</span><!--END DESCRIPTION-->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("\n");
      out.write("                    <div class=\"pessoal\">\n");
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
      out.write("                            Observação\n");
      out.write("                            <textarea rows=\"4\" cols=\"50\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                            </textarea>  <br>\n");
      out.write("                            Selecionar Arquivo <br>\n");
      out.write("                            <input id=\"inputCep\" type=\"file\" name=\"arquivo_consulta\" class=\"\" /><br>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                    <!--OBS. FALTA INSERIR NA TABELA DO BANCO DE DADOS TELEFONE, Celular E Sexo Naturalidade-->\n");
      out.write("                    <div class=\"endereco\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Endereço</legend>\n");
      out.write("                            <label for=\"inputRua\">Rua</label> <BR>\n");
      out.write("                            <input id=\"inputRua\" type=\"text\" name=\"rua\"  class=\"input username\" /> <br>\n");
      out.write("                            <label for=\"inputRua\">Complemento</label> <BR>\n");
      out.write("                            <input id=\"inputRua\" type=\"text\" name=\"rua\"  class=\"input username\" /> <br>\n");
      out.write("                            <label for=\"inputNumero\">Número</label> <br>\n");
      out.write("                            <input id=\"inputNumero\" type=\"text\" name=\"numero\" class=\"input username\" /><br>\n");
      out.write("                            <label for=\"inputBairro\">Bairro</label> <BR>\n");
      out.write("                            <input id=\"inputBairro\" type=\"text\" name=\"bairro\"  class=\"input username\" /> <br>\n");
      out.write("                            <label for=\"inputCidade\">Cidade</label> <br>\n");
      out.write("                            <input id=\"inputCidade\" type=\"text\" name=\"cidade\" class=\"input username\" /><br>\n");
      out.write("                            <label for=\"inputEstado\">Estado</label> <BR>\n");
      out.write("                            <input id=\"inputEstado\" type=\"text\" name=\"estado\"  class=\"input username\" /> <br>\n");
      out.write("                            <label for=\"inputCep\">CEP</label> <br>\n");
      out.write("                            <input id=\"inputCep\" type=\"text\" name=\"cep\" class=\"input username\" /><br>\n");
      out.write("                        </fieldset> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <!--<input type=\"hidden\" name=\"tarefa\" value=\"cadastrar\"/>\n");
      out.write("                    <button type=\"submit\">Cadastrar</button> -->\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Inserir\" class=\"button\"  />\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Cancelar\" class=\"register\"  />\n");
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

package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarExame_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<!--META-->\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<title>Cadastro Form</title>\n");
      out.write("\n");
      out.write("\t\t<!--STYLESHEETS-->\n");
      out.write("                <link href=\"jsps/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\t\t<!--SCRIPTS-->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js\"></script>\n");
      out.write("\t\t<!--Slider-in icons-->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\".username\").focus(function() {\n");
      out.write("\t\t\t\t$(\".user-icon\").css(\"left\",\"-48px\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".username\").blur(function() {\n");
      out.write("\t\t\t\t$(\".user-icon\").css(\"left\",\"0px\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\".password\").focus(function() {\n");
      out.write("\t\t\t\t$(\".pass-icon\").css(\"left\",\"-48px\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".password\").blur(function() {\n");
      out.write("\t\t\t\t$(\".pass-icon\").css(\"left\",\"0px\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>  <br/>  </h1>\n");
      out.write("            <form name=\"cadastro-form\" class=\"cadastro-form\"method=\"POST\" action=\"CadastroServlet\">\n");
      out.write("                <!--HEADER-->\n");
      out.write("\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t<!--TITLE--><h1>Cadastrar Médico - SFS</h1><!--END TITLE-->\n");
      out.write("\t\t\t\t\t<!--DESCRIPTION--><span>Para acessar é necessário.</span><!--END DESCRIPTION-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"pessoal\">\n");
      out.write("\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t  <legend>Dados Pessoais</legend>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputNome\" >Nome</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputNome\" type=\"text\" name=\"nome\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputDataNasc\">Data de Nascimento</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputDataNasc\" type=\"data\" name=\"dataNasc\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\tSexo\n");
      out.write("\t\t\t\t\t\t<select name=Sexo>\n");
      out.write("\t\t\t\t\t\t\t<option>Masculino</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Feminino</option>\n");
      out.write("\t\t\t\t\t\t</select><br> <br>\n");
      out.write("\t\t\t\t\t\tEstado Civil\n");
      out.write("\t\t\t\t\t\t<select name=Sexo>\n");
      out.write("\t\t\t\t\t\t\t<option>Solteiro</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Casado</option>\n");
      out.write("\t\t\t\t\t\t</select><br><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputNome\" >Naturalidade</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputNome\" type=\"text\" name=\"nome\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputRG\">RG</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputRG\" type=\"text\" name=\"rg\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputCPF\">CPF</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputCPF\" type=\"text\" name=\"cpf\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputRG\">Nº CRM</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputRG\" type=\"text\" name=\"rg\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputCPF\">Telefone</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputCPF\" type=\"text\" name=\"cpf\"  class=\"input username\" /> <br>\t\t\n");
      out.write("\t\t\t\t\t\t<label for=\"inputRG\">Celular</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputRG\" type=\"text\" name=\"rg\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputCPF\">E-mail</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputCPF\" type=\"text\" name=\"cpf\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--OBS. FALTA INSERIR NA TABELA DO BANCO DE DADOS TELEFONE, Celular E Sexo Naturalidade-->\n");
      out.write("\t\t\t\t\t<div class=\"endereco\">\n");
      out.write("\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t  <legend>Endereço</legend>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputRua\">Rua</label> <BR>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputRua\" type=\"text\" name=\"rua\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputRua\">Complemento</label> <BR>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputRua\" type=\"text\" name=\"rua\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputNumero\">Número</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputNumero\" type=\"text\" name=\"numero\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputBairro\">Bairro</label> <BR>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputBairro\" type=\"text\" name=\"bairro\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputCidade\">Cidade</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputCidade\" type=\"text\" name=\"cidade\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEstado\">Estado</label> <BR>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputEstado\" type=\"text\" name=\"estado\"  class=\"input username\" /> <br>\n");
      out.write("\t\t\t\t\t\t<label for=\"inputCep\">CEP</label> <br>\n");
      out.write("\t\t\t\t\t\t<input id=\"inputCep\" type=\"text\" name=\"cep\" class=\"input username\" /><br>\n");
      out.write("                    </fieldset> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t  <legend>Acesso</legend>\n");
      out.write("\t\t\t\t\t<div class=\"acesso\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail\">Senha</label> \n");
      out.write("\t\t\t\t\t\t<input id=\"inputEmail\" type=\"text\" name=\"email\"  class=\"input username\" /> \n");
      out.write("\t\t\t\t\t\t<label for=\"inputSenha\">Repetir Senha</label> \n");
      out.write("\t\t\t\t\t\t<input id=\"inputSenha\" type=\"text\" name=\"senha\" class=\"input username\" /><br>\n");
      out.write("\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t\t<!--<input type=\"hidden\" name=\"tarefa\" value=\"cadastrar\"/>\n");
      out.write("\t\t\t\t\t<button type=\"submit\">Cadastrar</button> -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Cadastrar\" class=\"button\"  />\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Cancelar\" class=\"register\"  />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("<!--GRADIENT--><div class=\"gradient\"></div><!--END GRADIENT-->\n");
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

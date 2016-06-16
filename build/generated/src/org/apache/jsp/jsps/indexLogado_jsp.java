package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlet.LoginBean;

public final class indexLogado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index Logado</title>\n");
      out.write("\n");
      out.write("        <!--STYLESHEETS-->\n");
      out.write("        <!--        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />-->\n");
      out.write("        <!--        <link href=\"jsps/css/style_indexLogado.css\" rel=\"stylesheet\" type=\"text/css\" />-->\n");
      out.write("        <link href=\"jsps/css/style_indexLogado.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"jsps/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"jsps/css/gallery.prefixed.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"jsps/css/gallery.theme.css\">\n");
      out.write("        <!--SCRIPTS-->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js\"></script>\n");
      out.write("        <!--Slider-in icons-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"gallery autoplay items-3\">\n");
      out.write("            <div id=\"item-1\" class=\"control-operator\"></div>\n");
      out.write("            <div id=\"item-2\" class=\"control-operator\"></div>\n");
      out.write("            <div id=\"item-3\" class=\"control-operator\"></div>\n");
      out.write("\n");
      out.write("            <figure class=\"item\">\n");
      out.write("                <img src=\"jsps/images/img1.png\" alt=\"imagem 1\"/>\n");
      out.write("            </figure>\n");
      out.write("\n");
      out.write("            <figure class=\"item\">\n");
      out.write("                <br/><br/>\n");
      out.write("                <img src=\"jsps/images/img2.png\" alt=\"imagem 1\"/>\n");
      out.write("                <img src=\"jsps/images/img2b.png\" alt=\"imagem 1\"/>\n");
      out.write("            </figure>\n");
      out.write("\n");
      out.write("            <figure class=\"item\">\n");
      out.write("               \n");
      out.write("    \n");
      out.write("\n");
      out.write("                <h1>Você está logado!</h1>  \n");
      out.write("                ");

                    LoginBean bean = (LoginBean) request.getAttribute("bean");
                    out.print("Bem vindo, " + bean.getName());
                    out.print("</br>");
                    out.print("Sua sessão está definida pela seguinte ID:" + session.getId());
                
      out.write(" \n");
      out.write("                <br/><br/><br/><br/><br/><br/>\n");
      out.write("                <img src=\"jsps/images/img3.png\" alt=\"imagem 1\" width=\"720\" height=\"205\"/>\n");
      out.write("            </figure>\n");
      out.write("\n");
      out.write("            <div class=\"controls\">\n");
      out.write("                <a href=\"#item-1\" class=\"control-button\">•</a>\n");
      out.write("                <a href=\"#item-2\" class=\"control-button\">•</a>\n");
      out.write("                <a href=\"#item-3\" class=\"control-button\">•</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"menu\">\n");
      out.write("\n");
      out.write("            <!--            <button class=\"button\">Button</button>-->\n");
      out.write("            <form name=\"formButton\" action=\"");
      out.print( request.getContextPath());
      out.write("/ControladorDeRedirecionamento\" method=\"POST\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"Home\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"CadastrarExame\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"CadastrarExame\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"ListarConsulta\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"ListarExame\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"CadastrarPaciente\">\n");
      out.write("                <input type=\"submit\" name=\"opcao\" class=\"button\" value=\"Sair\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--        <div id=\"cssmenu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class='active'><a href='#'>Home</a></li>\n");
      out.write("                        <li><a href='#'>Consulta</a></li>\n");
      out.write("                        <form name=\"acao\" action=\"\">\n");
      out.write("                            <input type=\"hidden\" />\n");
      out.write("                            <li><a href='#'>Cadastrar Consulta</a></li>\n");
      out.write("                        </form>\n");
      out.write("                        <li><a href='#'>Cadastrar Exame</a></li>\n");
      out.write("                        <li><a href='#'>Listar Exame</a></li>\n");
      out.write("                        <li><a href='#'>Sair</a></li>\n");
      out.write("                    </ul>\n");
      out.write("        \n");
      out.write("                </div>    Fim class=\"menu\"-->\n");
      out.write("\n");
      out.write("        <div class=\"conteudo\">\n");
      out.write("            <div class=\"conteudo1\">\n");
      out.write("\n");
      out.write("                <img src=\"jsps/images/im1.jpg\" alt=\"imagem 1\"/>\n");
      out.write("                <h1> Saiba como elaborar um plano alimentar saudável</h1>\n");
      out.write("\n");
      out.write("            </div> <!--   Fim class=\"conteudo1\"-->\n");
      out.write("\n");
      out.write("            <div class=\"conteudo2\">\n");
      out.write("                <img src=\"jsps/images/im2.png\" alt=\"imagem 1\" width=\"290\" height=\"164\"/>\n");
      out.write("                <h1> Nova doença transmitida pelo Aedes chega ao Brasil</h1>\n");
      out.write("                A idntificação de três casos de doença provocada por um vírus que jamais circulou no \n");
      out.write("                Brasil colocou o Ministério da Saúde em alerta. Sobretudo porque ela é transmitida \n");
      out.write("                pelo mosquito Aedes aegypti, o mesmo da dengue. A entrada do vírus da febre Chikungunya \n");
      out.write("                no País ocorre num momento em que o número de Aedes é elevado em diversos locais. \n");
      out.write("                E em que epidemia de dengue, no Rio e em outras cidades, não está descartada.\n");
      out.write("                Segundo o ministério, de agosto a novembro três brasileiros - um carioca da Barra e \n");
      out.write("                dois moradores de São Paulo - tiveram a febre Chikungunya. Tida do que a dengue - devido \n");
      out.write("                à quantidade menor de casos fatais - a Chikungunya se caracteriza por febre alta e \n");
      out.write("                dores intensas nas articulações das mãos e pés, que podem se prolongar por até um ano, \n");
      out.write("                impossibilitando a pessoa de desenvolver sua rotina.\n");
      out.write("\n");
      out.write("                \"Tivemos três casos importados. Tudo leva a crer que não houve transmissão no País. \n");
      out.write("                Todas as medidas de prevenção, como a busca de focos de mosquito nas proximidades \n");
      out.write("                das residências dos pacientes, aplicação de fumacê e rastreamento de novos casos foram \n");
      out.write("                feitas\", afirmou o coordenador do Programa de Controle da Dengue do Ministério da Saúde, \n");
      out.write("                Giovanini Coelho.\n");
      out.write("\n");
      out.write("            </div> <!--   Fim class=\"conteudo2\"-->\n");
      out.write("\n");
      out.write("        </div> <!--   Fim class=\"conteudo\"-->\n");
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

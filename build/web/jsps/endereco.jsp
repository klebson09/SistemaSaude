<%-- 
    Document   : endereco
    Created on : 11/12/2015, 19:50:05
    Author     : klebsonsantana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>



        <!--META-->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Cadastro Form</title>

        <!--SCRIPTS-->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
        <!--Slider-in icons-->
        <script type="text/javascript">
            $(document).ready(function() {
                $(".username").focus(function() {
                    $(".user-icon").css("left", "-48px");
                });
                $(".username").blur(function() {
                    $(".user-icon").css("left", "0px");
                });

                $(".password").focus(function() {
                    $(".pass-icon").css("left", "-48px");
                });
                $(".password").blur(function() {
                    $(".pass-icon").css("left", "0px");
                });
            });
        </script>
    </head>
    <body>
        <h1>  <br/>  </h1>
        <form name="cadastro-form" class="cadastro-form" method="POST" action="<%= request.getContextPath()%>/ControllerEndereco">
            <!--HEADER-->
            <div class="header">
                <!--TITLE--><h1>Cadastrar Médico - SFS</h1><!--END TITLE-->
                <!--DESCRIPTION--><span>Para acessar é necessário.</span><!--END DESCRIPTION-->
            </div>

            <div class="content">

                <div class="pessoal">
                </div>
                <!--OBS. FALTA INSERIR NA TABELA DO BANCO DE DADOS TELEFONE, Celular E Sexo Naturalidade-->
                <div class="endereco">
                    <fieldset>
                        <legend>Endereço</legend>
                        <label for="inputRua">Rua</label> <BR>
                        <input id="inputRua" type="text" name="logradouro"  class="input username" /> <br>
                        <label for="inputRua">Complemento</label> <BR>
                        <input id="inputRua" type="text" name="complemento"  class="input username" /> <br>
                        <label for="inputNumero">Número</label> <br>
                        <input id="inputNumero" type="text" name="numero" class="input username" /><br>
                        <!--                            <label for="inputBairro">Bairro</label> <BR>
                                                    <input id="inputBairro" type="text" name="bairro"  class="input username" /> <br>-->
                        <label for="inputCidade">Cidade</label> <br>
                        <input id="inputCidade" type="text" name="cidade" class="input username" /><br>
                        <label for="inputEstado">Estado</label> <BR>
                        <input id="inputEstado" type="text" name="estado"  class="input username" /> <br>
                        <label for="inputCep">CEP</label> <br>
                        <input id="inputCep" type="text" name="cep" class="input username" /><br>
                    </fieldset> 
                </div>
            </div>
            <div class="footer">
<!--                <input type="hidden" name="tarefa" value="cadastrar"/>-->
                <button type="submit">Cadastrar</button> 

<!--                <a href="/jsps/endereco.jsp" style="margin-left:30px;">Cadastrar Novo Usuário</a>-->
                <!--            <input type="submit" value="Cadastrar" class="button"  />-->
                <!--            <input type="submit" name="submit" value="Cancelar" class="register"  />-->
            </div>
        </form>
    </div>




    <!--GRADIENT--><div class="gradient"></div><!--END GRADIENT-->
</body>
</html>

<%-- 
    Document   : cadastrarExame
    Created on : 14/10/2015, 09:30:33
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		
		

		<!--META-->
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Cadastro Exame</title>

		<!--STYLESHEETS-->
                <link href="jsps/css/style.css" rel="stylesheet" type="text/css" />

		<!--SCRIPTS-->
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
		<!--Slider-in icons-->
		<script type="text/javascript">
		$(document).ready(function() {
			$(".username").focus(function() {
				$(".user-icon").css("left","-48px");
			});
			$(".username").blur(function() {
				$(".user-icon").css("left","0px");
			});
			
			$(".password").focus(function() {
				$(".pass-icon").css("left","-48px");
			});
			$(".password").blur(function() {
				$(".pass-icon").css("left","0px");
			});
		});
		</script>
    </head>
    <body>

        <div>
            <h1>  <br/>  </h1>
            <form name="cadastro-form" class="cadastro-form"method="POST" action="CadastroServlet">
                <!--HEADER-->
				<div class="header">
					<!--TITLE--><h1>Cadastrar Exame - SFS</h1><!--END TITLE-->
					<!--DESCRIPTION--><span></span><!--END DESCRIPTION-->
				</div>
				
				<div class="content">
				
					<div class="pessoal">
					<fieldset>
					  <legend>Exames</legend>
						<label for="inputTipoExame" >Tipo do Exame</label> <br>
						<input id="inputTipoExame" type="text" name="tipoExame"  class="input username" /> <br>
						<label for="inputEspecialidade">Especialidade</label> <br>
						<input id="inputEspecialidade" type="data" name="especialidade" class="input username" /><br>
<!--						Sexo
						<select name=Sexo>
							<option>Masculino</option>
							<option>Feminino</option>
						</select><br> <br>
						Estado Civil
						<select name=Sexo>
							<option>Solteiro</option>
							<option>Casado</option>
						</select><br><br>-->
						<label for="inputObservacao" >Observação</label> <br>
						<input id="inputObservacao" type="text" maxlength="55" name="observacao"  class="input username" /> <br>
						<label for="inputDataDoExame">Data do Exame</label> <br>
						<input id="inputDataDoExame" type="text" name="dataExame" class="input username" /><br>
						
					</fieldset>
					</div>
					<!--OBS. FALTA INSERIR NA TABELA DO BANCO DE DADOS TELEFONE, Celular E Sexo Naturalidade-->
<!--					<div class="endereco">
					<fieldset>
					  <legend>Endereço</legend>
						<label for="inputRua">Rua</label> <BR>
						<input id="inputRua" type="text" name="rua"  class="input username" /> <br>
						<label for="inputRua">Complemento</label> <BR>
						<input id="inputRua" type="text" name="rua"  class="input username" /> <br>
						<label for="inputNumero">Número</label> <br>
						<input id="inputNumero" type="text" name="numero" class="input username" /><br>
						<label for="inputBairro">Bairro</label> <BR>
						<input id="inputBairro" type="text" name="bairro"  class="input username" /> <br>
						<label for="inputCidade">Cidade</label> <br>
						<input id="inputCidade" type="text" name="cidade" class="input username" /><br>
						<label for="inputEstado">Estado</label> <BR>
						<input id="inputEstado" type="text" name="estado"  class="input username" /> <br>
						<label for="inputCep">CEP</label> <br>
						<input id="inputCep" type="text" name="cep" class="input username" /><br>
                    </fieldset> 
					</div>-->
<!--					<fieldset>
					  <legend>Acesso</legend>
					<div class="acesso">
					
						<label for="inputEmail">Senha</label> 
						<input id="inputEmail" type="text" name="email"  class="input username" /> 
						<label for="inputSenha">Repetir Senha</label> 
						<input id="inputSenha" type="text" name="senha" class="input username" /><br>
					</fieldset>-->
					</div>
					
					
				</div>

				<div class="footer">
					<!--<input type="hidden" name="tarefa" value="cadastrar"/>
					<button type="submit">Cadastrar</button> -->
					
					<input type="submit" name="submit" value="Cadastrar" class="button"  />
					<input type="submit" name="submit" value="Cancelar" class="register"  />
				</div>
            </form>
        </div>

		
		
		
<!--GRADIENT--><div class="gradient"></div><!--END GRADIENT-->
    </body>
</html>

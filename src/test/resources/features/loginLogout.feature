#language: pt
#encoding: utf-8
#autor: Bruno Mesquita

Funcionalidade: Login e Logout sistema

		Esquema do Cenario: Login do sistema <Idteste>
				Dado que tento acessar o sistema com o login "<user>" e senha "<senha>"
				E clicar no botao "Login"
				Entao o sistema apresenta <Idteste> e exibe "<retorno>"
			 
			Exemplos:
			| user           | senha      | Idteste |retorno                                                                                    |	
			| bruno.mesquita |            |  1      |Your account may be disabled or blocked or the username/password you entered is incorrect. |	
			|                | B1993@mesq |  2      |Your account may be disabled or blocked or the username/password you entered is incorrect. |
			| bruno.mesq     | B1993@mesq |  3      |Your account may be disabled or blocked or the username/password you entered is incorrect. |
			| bruno.mesquita | B1993@mesq |  4      |Logged in as: bruno.mesquita (Bruno Mesquita - reporter)                                   |
			
		@Logout	
		Esquema do Cenario: Logout do sistema <IdtesteLog>
				Dado que tento acessar o sistema com o login "<userLog>" e senha "<senhaLog>"
				E clicar no botao "Login"
				Entao o sistema apresenta <IdtesteLog> e exibe "<retornoLog>"
				E clicar no botao "Logout"
				Entao o sistema redireciona para a pagina inicial
			
			Exemplos:
			| userLog           | senhaLog      | IdtesteLog |retornoLog                                                | 
			| bruno.mesquita    | B1993@mesq    |  5         |Logged in as: bruno.mesquita (Bruno Mesquita - reporter)  |
			
			
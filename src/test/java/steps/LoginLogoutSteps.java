package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginLogoutPages;
import static utils.Utils.Na;

import org.junit.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;


@Epic("Login Testes")
@Feature("Login e Logout sistema")
public class LoginLogoutSteps {
	LoginLogoutPages llp = new LoginLogoutPages(); 
	
	@Test
    @Description("Dado que tento acessar o sistema com o login \"<user>\" e senha \"<senha>\"")
	@Dado("que tento acessar o sistema com o login {string} e senha {string}")
	public void queTentoAcessarOSistemaComOLoginESenha(String user, String pass) throws Exception {
		Na(LoginLogoutPages.class).efetuarLogin(user, pass);
	}
	
	@Test
    @Description("E clicar no botao \"Login\"")
	@Quando("clicar no botao {string}")
	public void clicarNoBotao(String tipo) throws Exception {
		Na(LoginLogoutPages.class).pressionarBotao(tipo);
	}
	
	@Test
    @Description("Entao o sistema apresenta <Idteste> e exibe \"<retorno>\"")
	@Entao("o sistema apresenta {int} e exibe {string}")
	public void oSistemaApresentaEExibe(Integer idTipo, String msg) throws Exception {
		Na(LoginLogoutPages.class).verificaLogin(idTipo, msg);
	}
	
	@Test
    @Description("Entao o sistema redireciona para a pagina inicial")
	@Entao("o sistema redireciona para a pagina inicial")
	public void oSistemaRedirecionaParaAPaginaInicial() throws Exception {
		Na(LoginLogoutPages.class).verificaLogin(6, "");
	}
}

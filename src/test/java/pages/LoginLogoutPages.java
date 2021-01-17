package pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutPages {
	
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")
	private WebElement campoUserLogin;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")
	private WebElement campoPasswordLogin;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[4]/td[2]/input")
	private WebElement campoRememberLogin;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[5]/td[2]/input")
	private WebElement campoSecureLogin;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[6]/td/input")
	private WebElement campoBotaoLogin;
	
	@FindBy(xpath = "/html/body/div[4]/span/a")
	private WebElement campoLostLogin;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/a[7]")
	private WebElement campoBotaoLogout;
	
	@FindBy(xpath = "//font[@color = 'red']")
	private WebElement msgErro;
	
	@FindBy(className = "login-info-left")
	private WebElement msgSucess;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[1]/td[1]")
	private WebElement verificaLogout;
	

	public void efetuarLogin(String user, String pass) {
		campoUserLogin.sendKeys(user);
		campoPasswordLogin.sendKeys(pass);
	}
	
	public void verificaLogin(int idTipo, String msg) {
		
		switch (idTipo) {
			case 1:
				String texto1 = msgErro.getText();
		        assertEquals(msg, texto1);
				break;
				
			case 2:
				String texto2 = msgErro.getText();
		        assertEquals(msg, texto2);
				break;
				
			case 3:
				String texto3 = msgErro.getText();
		        assertEquals(msg, texto3);
				break;
				
			case 4:
				String texto4 = msgSucess.getText();
		        assertEquals(msg, texto4);
				break;
				
			case 5:
				String texto5 = msgSucess.getText();
				assertEquals(msg, texto5);				
		        break;
				
			case 6:
				String texto6 = verificaLogout.getText();

		        if(texto6.equals("Login") == false) {
					throw new Error("Falha no Logout!");
				}
				break;
		}
	}
	
	public void pressionarBotao(String tipo) throws Exception {
		switch (tipo) {
			case "Login":
				campoBotaoLogin.click();
				break;
				
			case "Logout":
				if(campoBotaoLogout.isDisplayed()) {
					campoBotaoLogout.click();
				}
				
				break;

		}
		
	}
}

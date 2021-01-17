package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyViewPages {
	@FindBy(xpath = "/html/body/div[1]/a/img")
	private WebElement logoView;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[1]/span[2]")
	private WebElement usuarioLogado;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[3]/form/select")
	private WebElement campoSelect;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[3]/form/select/option[5]")
	private WebElement campoSelectOption;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[3]/form/input")
	private WebElement campoBotaoSwitch;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/form/input[1]")
	private WebElement campoSearchIssue;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/form/input[2]")
	private WebElement campoJumpIssue;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/a")
	private WebElement campoUnassigned;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/span/a")
	private WebElement campoUnassignedPage;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[1]/span/a")
	private WebElement campoUnassignedId;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[1]/td[2]/table/tbody/tr/td/a")
	private WebElement campoReported;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[1]/td[2]/table/tbody/tr/td/span/a")
	private WebElement campoReportedPage;	
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[1]/table/tbody/tr/td/a")
	private WebElement campoResolved;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[1]/table/tbody/tr/td/span/a")
	private WebElement campoResolvedPage;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]/span/a")
	private WebElement campoResolvedId;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td/a")
	private WebElement campoRecently;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td/span/a")
	private WebElement campoRecentlyPage;
	
	@FindBy(xpath = "/html/body/div[3]/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/span/a")
	private WebElement campoRecentlyId;
	
}

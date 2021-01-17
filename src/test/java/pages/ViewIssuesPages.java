package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewIssuesPages {
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/a[2]")
	private WebElement pageViewIssues;
	
	@FindBy(xpath = "//*[@id=\"reporter_id_filter\"]")
	private WebElement reporter_id_filter;
	
	@FindBy(xpath = "//*[@id=\"user_monitor_filter\"]")
	private WebElement user_monitor_filter;
	
	@FindBy(xpath = "//*[@id=\"handler_id_filter\"]")
	private WebElement handler_id_filter;
	
	@FindBy(xpath = "//*[@id=\"show_category_filter\"]")
	private WebElement show_category_filter;
	
	@FindBy(xpath = "//*[@id=\"show_severity_filter\"]")
	private WebElement show_severity_filter;
	
	@FindBy(xpath = "//*[@id=\"show_resolution_filter\"]")
	private WebElement show_resolution_filter;
	
	@FindBy(xpath = "//*[@id=\"show_profile_filter\"]")
	private WebElement show_profile_filter;
	
	@FindBy(xpath = "//*[@id=\"show_status_filter\"]")
	private WebElement show_status_filter;
	
	@FindBy(xpath = "//*[@id=\"show_priority_filter\"]")
	private WebElement show_priority_filter;	
	
	@FindBy(xpath = "//*[@id=\"per_page_filter\"]")
	private WebElement per_page_filter;
	
	@FindBy(xpath = "//*[@id=\"view_state_filter\"]")
	private WebElement view_state_filter;
	
	@FindBy(xpath = "//*[@id=\"sticky_issues_filter\"]")
	private WebElement sticky_issues_filter;
	
	@FindBy(xpath = "//*[@id=\"highlight_changed_filter\"]")
	private WebElement highlight_changed_filter;
	
	@FindBy(xpath = "//*[@id=\"do_filter_by_date_filter\"]")
	private WebElement do_filter_by_date_filter;
	
	@FindBy(xpath = "//*[@id=\"relationship_type_filter\"]")
	private WebElement relationship_type_filter;
	
	@FindBy(xpath = "//*[@id=\"platform_filter\"]")
	private WebElement platform_filter;
	
	@FindBy(xpath = "//*[@id=\"os_filter\"]")
	private WebElement os_filter;
	
	@FindBy(xpath = "//*[@id=\"os_build_filter\"]")
	private WebElement os_build_filter;
	
	@FindBy(xpath = "//*[@id=\"tag_string_filter\"]")
	private WebElement tag_string_filter;
	
	@FindBy(xpath = "//*[@id=\"note_user_id_filter\"]")
	private WebElement note_user_id_filter;
	
	@FindBy(xpath = "//*[@id=\"show_sort_filter\"]")
	private WebElement show_sort_filter;
	
	@FindBy(xpath = "//*[@id=\"project_id_filter\"]")
	private WebElement project_id_filter;
	
	@FindBy(xpath = "//*[@id=\"match_type_filter\"]")
	private WebElement match_type_filter;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[1]/input[1]")
	private WebElement campoSearch;	
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[1]/input[2]")
	private WebElement campoSearchBotton;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[2]/span/a")
	private WebElement campoBottonFilters;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[3]/form[1]/select")
	private WebElement campoResetFilter;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[3]/form[1]/input[2]")
	private WebElement useFilter;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[11]/td[3]/form[2]/input")
	private WebElement manageFilter;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td/span[2]/span[1]/a")
	private WebElement printReports;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td/span[2]/span[2]/a")
	private WebElement csvExport;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td/span[2]/span[3]/a")
	private WebElement excelExport;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[4]/td[1]/input")
	private WebElement campoCheckboxIssue;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[4]/td[1]/input")
	private WebElement campoAnexoIssue;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[4]/td[1]/input")
	private WebElement campoUpdatedIssue;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[54]/td/span[1]/select")
	private WebElement campoActionView;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[54]/td/span[1]/input[2]")
	private WebElement campoOkActionView;
	
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

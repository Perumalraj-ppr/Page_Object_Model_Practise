package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Objects {

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p")
	public static WebElement leave;

	@FindBy(xpath = "//button[@type='button'][contains(@class,'oxd-icon-button oxd-icon-button--suc')]")
	public static WebElement leaveButton;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public static WebElement textBox;

	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input--before']")
	public static WebElement autoSearchBefore;

	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input--after']")
	public static WebElement autoSearchAfter;

	@FindBy(xpath = "//button[contains(@class,'secondary orangehrm-left-space')]")
	public static WebElement searchButton;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/comment()[1]")
	public static WebElement dropDown;

	@FindBy(xpath = "//span[contains(text(),'Charlie  Carter')]")
	public static WebElement dropdown1;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div")
	public static WebElement employeeName;

	@FindBy(xpath = "(//button[@type='button'][@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[1]")
	public static WebElement approvalButton;

	@FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]")
	public static WebElement allCheckBox;
}

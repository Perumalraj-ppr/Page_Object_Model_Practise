package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Objects {

	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	public static WebElement adminButton;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public static WebElement userRoleDropDown;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	public static WebElement selectAdmin;

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	public static WebElement statusDropDown;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	public static WebElement selectEnabled;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement search;

	@FindBy(xpath = "(//div[text()='Admin'])[3]")
	public static WebElement userRoleValue;

	@FindBy(xpath = "(//div[text()='Enabled'])[2]")
	public static WebElement statusValue;
}

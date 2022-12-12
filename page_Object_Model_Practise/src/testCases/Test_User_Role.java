package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageobjects.Login_Page_Objects;
import pageobjects.User_Role_Page_Objects;

public class Test_User_Role extends CommonFunctions {

	public void loginDetails() {
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.passWord.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.clickButton.click();
	}

	public void moveToAdmin() {
		// PageFactory.initElements(driver,User_Role_Page_Objects.class);
		User_Role_Page_Objects.adminButton.click();
	}

	public void selectUserRole() {
		User_Role_Page_Objects.userRoleDropDown.click();
		User_Role_Page_Objects.selectAdmin.click();
	}

	public void selectStatusAndSearch() {
		User_Role_Page_Objects.statusDropDown.click();
		User_Role_Page_Objects.selectEnabled.click();
		User_Role_Page_Objects.search.click();
	}

	@Test
	public void checkUserRoleValueAndStatusValue() {
		// loginDetails();
		PageFactory.initElements(driver, User_Role_Page_Objects.class);
		moveToAdmin();
		selectUserRole();
		selectStatusAndSearch();
		String actualUserRollValue = User_Role_Page_Objects.userRoleValue.getText();
		String actualStatusValue = User_Role_Page_Objects.statusValue.getText();
		assertEquals(actualUserRollValue, "Admin");
		assertEquals(actualStatusValue, "Enabled");

	}

}

package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageobjects.Dashboard_Page_Objects;
import pageobjects.Login_Page_Objects;

public class Test_Pending_Leave_Request extends CommonFunctions {

	public void loginDetails() {
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.passWord.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.clickButton.click();
	}

	public void leavePage() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		Dashboard_Page_Objects.leaveButton.click();
	}

	public void searchName() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		Dashboard_Page_Objects.textBox.sendKeys("char");
		Dashboard_Page_Objects.dropdown1.click();
		Dashboard_Page_Objects.searchButton.click();

	}

	public void leaveApproval() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		String acctualText = Dashboard_Page_Objects.employeeName.getText();
		System.out.println(acctualText);
		assertEquals(acctualText, "Charlie Carter");
		Dashboard_Page_Objects.approvalButton.click();
	}

	public void approveLeaveAll() {
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		Dashboard_Page_Objects.allCheckBox.click();
	}

	@Test
	public void checkLeaveRequest() {
		// PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		loginDetails();
		leavePage();
		searchName();
		// leaveApproval();
		approveLeaveAll();
	}

}

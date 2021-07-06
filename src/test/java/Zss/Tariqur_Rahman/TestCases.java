package Zss.Tariqur_Rahman;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Zss.Tariqur_Rahman.PatientsPage;
import Zss.Tariqur_Rahman.LoginPage;

public class TestCases {

	WebDriver driver = new ChromeDriver();
	LoginPage loginpage = new LoginPage (driver);
	PatientsPage patientspage = new PatientsPage(driver);

	
	@BeforeTest
	public void before_test() throws IOException {
		driver.get("https://nmed-c.zssbd.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void verify () throws InterruptedException{
		loginpage.ProvideUsername("testdoc");
		loginpage.ProvidePassword("Test123456");
		loginpage.ClickLoginButton();
		patientspage.ClickPatientsTab();
		patientspage.ClickAddButton();
		patientspage.ProvidePatientID("123456789102");
		patientspage.ClickCheckButton();
		patientspage.ClickAddPatientButton();
		patientspage.ProvideUsername("12345");
		patientspage.ProvideFirstname("Tariqur");
		patientspage.ProvideLastname("Rahman");
		patientspage.ProvideDOB("02-02-02");
		patientspage.ProvideEmail("valid@valid.com");
		patientspage.ProvideMobile("1191234567");
		patientspage.ClickConfirmAddButton();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(patientspage.ConfirmButton));
		patientspage.ClickConfirmButton();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(patientspage.ConfirmButton));
		patientspage.ClickPatientsTab();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(driver.getPageSource().contains("Tariqur"));
		patientspage.Logout();
	}
	
	@AfterTest
	public void after_test() {
		driver.close();
	}
}

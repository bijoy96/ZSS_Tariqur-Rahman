package Zss.Tariqur_Rahman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By UsernameInput = By.id("id_username");
	
	By PasswordInput = By.id("id_password");

	By LoginButton = By.id("clinicianLogin");
	
	public void ProvideUsername(String username) {
		driver.findElement(UsernameInput).sendKeys(username);
	}
	
	public void ProvidePassword(String password) {
		driver.findElement(PasswordInput).sendKeys(password);
	}
	
	public void ClickLoginButton() {
		driver.findElement(LoginButton).click();
	}
}

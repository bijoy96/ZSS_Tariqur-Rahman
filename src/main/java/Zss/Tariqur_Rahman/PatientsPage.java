package Zss.Tariqur_Rahman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PatientsPage {
	
	WebDriver driver;
	public PatientsPage(WebDriver driver) {
		this.driver= driver;
	}
	By PatientsTab = By.linkText("Patients");
	
	By AddButton = By.id("add-btn");
	
	By PatientsIDInput = By.name("clinic_patient_ref");
	
	By CheckButton = By.xpath("//INPUT[@type='submit']");
	
	By AddPatientButton = By.xpath("//A[@href='/patient/add/123456789102'][text()='ADD PATIENT']");
	
	By UsernameInput = By.id("id_username");
	
	By FirstnameInput = By.id("id_first_name");
	
	By LastnameInput = By.id("id_surname");
	
	By DOBInput = By.id("datepicker");
	
	By EmailInput = By.id("id_email");
	
	By MobileInput = By.id("id_mobile");
	
	By ConfirmAddButton = By.id("confirmPatientForm");
	
	By ConfirmButton = By.id("proceedCreatePatient");
	
	By LogoutDropdown = By.xpath("//SPAN[@class='username-block'][text()='TestDoc']");
	
	By LogoutButton = By.linkText("Logout");
	
	public void ClickPatientsTab() {
		driver.findElement(PatientsTab).click();
	}
	public void ClickAddButton() {
		driver.findElement(AddButton).click();
	}
	public void ProvidePatientID(String ID) {
		driver.findElement(PatientsIDInput).sendKeys(ID);
	}
	public void ClickCheckButton() {
		driver.findElement(CheckButton).click();
	}
	public void ClickAddPatientButton() {
		driver.findElement(AddPatientButton).click();
	}
	public void ProvideUsername(String username) {
		driver.findElement(UsernameInput).sendKeys(username);
	}
	public void ProvideFirstname(String firstname) {
		driver.findElement(FirstnameInput).sendKeys(firstname);
	}
	public void ProvideLastname(String lastname) {
		driver.findElement(LastnameInput).sendKeys(lastname);
	}
	public void ProvideDOB(String dob) {
		driver.findElement(DOBInput).sendKeys(dob);
	}
	public void ProvideEmail(String email) {
		driver.findElement(EmailInput).sendKeys(email);
	}
	public void ProvideMobile(String mobile) {
		driver.findElement(MobileInput).sendKeys(mobile);
	}
	public void ClickConfirmAddButton() {
		driver.findElement(ConfirmAddButton).click();
	}
	public void ClickConfirmButton() {
		driver.findElement(ConfirmButton).click();
	}
	public void Logout() {
		driver.findElement(LogoutDropdown).click();
		driver.findElement(LogoutButton).click();
	}
	
}

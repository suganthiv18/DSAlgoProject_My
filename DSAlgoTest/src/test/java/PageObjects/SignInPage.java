package PageObjects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Utilities.ReadExcel;
import io.cucumber.java.AfterAll;

public class SignInPage {
	
	static WebDriver driver = new ChromeDriver();


   // @FindBy (xpath="//a[@href='/register']")WebElement RegistrationPage;
   // @FindBy (xpath="//a[@href='/register']")WebElement register;
    
    
    public void loginPage() {
    	
    	driver.get("https://dsportalapp.herokuapp.com/login");
    }
    
	public void clickRegistration() {
		WebElement RegistrationPage= driver.findElement(By.xpath("//a[@href='/register']"));
		RegistrationPage.click();
	}
	
	public String register_page() {

		String Title = driver.getTitle();
		System.out.println("Print statement"+Title);
		return Title;
	}
	
	public void enterUsernamePassword(String username1, String password1) {
		WebElement username = driver.findElement(By.xpath("//*[@id='id_username']"));
		WebElement password= driver.findElement(By.xpath("//*[@id='id_password']"));
		//username.clear();
		//password.clear();
		username.sendKeys(username1);
		password.sendKeys(password1);
		
	}
	
	public void clickLogin() {
		WebElement LoginBtn= driver.findElement(By.xpath("//*[@value='Login']"));
		LoginBtn.click();
	}
	
	
	public void excelInputs()  {
		
	}
	
	@AfterAll
	public static void after() {
		driver.quit();
	}
}

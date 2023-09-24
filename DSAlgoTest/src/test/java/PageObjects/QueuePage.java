package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Log4j;
import io.cucumber.java.AfterAll;

public class QueuePage {

	static WebDriver driver = new ChromeDriver();
	//Queue URLs
	String queueurl = "https://dsportalapp.herokuapp.com/queue/";
	String impofqpython1url = "https://dsportalapp.herokuapp.com/queue/implementation-lists/";
	String impcolldq2url = "https://dsportalapp.herokuapp.com/queue/implementation-collections/";
    String impusingarray3url="https://dsportalapp.herokuapp.com/queue/Implementation-array/";
    String queueoperations4url = "https://dsportalapp.herokuapp.com/queue/QueueOp/";
	String editorurl = "https://dsportalapp.herokuapp.com/tryEditor";
	String qpracquesurl = "https://dsportalapp.herokuapp.com/queue/practice";
	
	Log4j Logs = new Log4j();
	   
	@FindBy(xpath = "//a[@class='btn btn-info']")WebElement TryHere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement editorInput;
	@FindBy(xpath = "//button[@type='button']")WebElement runButton;
	@FindBy(id = "output")WebElement output;
	
	
public QueuePage() {

	PageFactory.initElements(driver, this);
}
	
	public void clickQueuePage() {
		driver.get(queueurl);
		Logs.info(driver.getTitle());
	}
	
	public void clickImplQueuePython() {
		driver.get(impofqpython1url);
		Logs.info(driver.getTitle());
	}
	
	public void clickImplQueueColl() {
		driver.get(impcolldq2url);
		Logs.info(driver.getTitle());
	}
	
	public void clickImplArray() {
		driver.get(impusingarray3url);
		Logs.info(driver.getTitle());
	}
	
	public void clickQueueOperations() {
		driver.get(queueoperations4url);
		Logs.info(driver.getTitle());
	}
	
	public void clickQueuePracticeQtns() {
		driver.get(qpracquesurl);
		Logs.info(driver.getTitle());
	}
	
	public void clickEditorUrl() {
			
			driver.get(editorurl);
			Logs.info(driver.getTitle());
	}
	
	public void clickRun() throws InterruptedException {
		Thread.sleep(2000);
			runButton.click();
		}
	
	
	public void runValidPythonCode(String validPythonCode) throws InterruptedException {
			Thread.sleep(2000);
		editorInput.sendKeys(validPythonCode);
	}
	
   public void runInvalidPythonCode(String InvalidPythonCode) throws InterruptedException {
	   Thread.sleep(2000);
			   editorInput.sendKeys(InvalidPythonCode);
			   Logs.info(InvalidPythonCode);
	}
   public void clickTryHere() {

	   TryHere.click();
   }
   
   public String getDriverTitle() {
	  String Title = driver.getTitle();
	  return Title;
	 }
   
   public void getOutput() throws InterruptedException {
	   Thread.sleep(2000);
		
     	String outputtext = output.getText();
	   
   }
   
   public void getErrorText() {
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
	}
   
   public void back() {
	   driver.navigate().back();
   }
   
   public void close() {
	   driver.close();
   }
   
@AfterAll
	public static void after() {
		driver.quit();
	}
   
}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Log4j;
import io.cucumber.java.AfterAll;

public class TreePage {

	static WebDriver driver = new ChromeDriver();
	//Tree URLs
	
	String Treepage="https://dsportalapp.herokuapp.com/tree/";
	String overviewoftrees="https://dsportalapp.herokuapp.com/tree/overview-of-trees/";
	String terminologiespage="https://dsportalapp.herokuapp.com/tree/terminologies/";
	String typesoftrees="https://dsportalapp.herokuapp.com/tree/types-of-trees/";
	String treetraversals="https://dsportalapp.herokuapp.com/tree/tree-traversals/";
	String traversalillustration="https://dsportalapp.herokuapp.com/tree/traversals-illustration/";
	String binarytrees="https://dsportalapp.herokuapp.com/tree/binary-trees/";
	String typesofbinarytrees="https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/";
	String ImplementationinPython="https://dsportalapp.herokuapp.com/tree/implementation-in-python/";
	String BinaryTreeTraversals="https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/";
	String ImplementationOfBinaryTrees="https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/";
	String ApplicationsOfBinaryTrees="https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/";
	String BinarySearchTrees="https://dsportalapp.herokuapp.com/tree/binary-search-trees/";
	String ImplementationOfBST="https://dsportalapp.herokuapp.com/tree/implementation-of-bst/";
	String editorurl = "https://dsportalapp.herokuapp.com/tryEditor";
	String qpracquesurl = "https://dsportalapp.herokuapp.com/queue/practice";
	
	Log4j Logs = new Log4j();
	   
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement TryHere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement editorInput;
	@FindBy(xpath = "//button[@type='button']")WebElement runButton;
	@FindBy(id = "output")WebElement output;
	
	
	public TreePage() {

		PageFactory.initElements(driver, this);
	}
		
	public void clickTreePage() {
		driver.get(Treepage);
	}
	public void clickoverviewoftrees() {
		driver.get(overviewoftrees);
	}
	
	 public String getDriverTitle() {
		  String Title = driver.getTitle();
		  return Title;
		 }
	 
	  public void clickTryHere() {

		   TryHere.click();
	   }

	  
	  @AfterAll
	  	public static void after() {
	  		driver.quit();
	  	}
	     
}

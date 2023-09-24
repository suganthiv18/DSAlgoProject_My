package Hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;

public class Hooks {
	private static WebDriver driver;
	
	@AfterAll
	public static void after() {
		driver.quit();
	}

}

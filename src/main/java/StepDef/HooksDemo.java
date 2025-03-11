package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utility.BaseDemo;

public class HooksDemo extends Utility.BaseDemo {

	private static Utility.BaseDemo base;



	@Before
	public void initBrowser() {
		System.out.println("Opening the browser");
		base.driver = new ChromeDriver();
	}

	@After
	public void tearBrowser(Scenario scenario) {

		System.out.println("Closing the browser");
		base.driver.quit();
	}

}
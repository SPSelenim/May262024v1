package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.Home;
import pomSearch.Search1;

public class SearchTest {

	public WebDriver driver = null;

	@BeforeClass
	public void tearSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void f() {
		System.out.println("Start TestNG : " + this.getClass().getSimpleName());
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		driver.manage().window().maximize();
		Search1 ss = new Search1(driver);
		ss.clickDevelopment();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		driver.navigate().back();
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
ss.getTitle1();
		ss.clickQA();
		ss.getTitle1();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		System.out.println("END TestNG : " + this.getClass().getSimpleName());
		driver.quit();
	}

}

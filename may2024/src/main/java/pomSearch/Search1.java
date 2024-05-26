package pomSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search1 {

	public String myDevelopment="//a[@name='Development']";
	public String myQA="//a[@name='QA']";
	public String myHeader="//b";
	
	
	public WebDriver driver=null;
	
	public Search1(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public WebElement getMyDevelopment()
	{
		WebElement myDevelopmet =driver.findElement(By.xpath(myDevelopment));
		return myDevelopmet;
	}
	
	public WebElement getMyQA()
	{
		WebElement myQA1 =driver.findElement(By.xpath(myQA));
		return  myQA1;
	}
	
	public void clickDevelopment()
	{
		getMyDevelopment().click();
	}
	public void clickQA()
	{
		getMyQA().click();
	}
	
	public WebElement getTitle()
	{
	WebElement myTitle=driver.findElement(By.xpath(myHeader));
	return  myTitle;
	}
	
	public void getTitle1()
	{
	System.out.println("TITLE iS : "+getTitle().getText());
	}
}
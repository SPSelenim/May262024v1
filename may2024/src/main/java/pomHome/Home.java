package pomHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//added comments
//added by Sateesh
public class Home {
	public WebDriver driver = null;

	public String First = "fname";
	public String Last = "lname";

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getElementFirstName()
	{
		WebElement fname1 = driver.findElement(By.id(First));
		return fname1;
	}


	public WebElement getElementLastName()
	{
		WebElement last1 = driver.findElement(By.id(Last));
		return last1;
	}
	public void enterFirstDataIntoString(String Data)
	{
		getElementFirstName().sendKeys(Data);;
	
	}
	
	public void enterLastDataIntoString(String Data)
	{
		getElementLastName().sendKeys(Data);;
	
	}
	
	
	
	
}

package SMECSPRegression;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import SMECSPRegression.SMEFunctions;

public class CheckDashboardTabs {

	@Test
	public void CheckDashboard()
	{
		WebDriver driver = SMEFunctions.openPage();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement element;
		try
		{
		driver.findElement(By.xpath("//button[text()='Got it!']")).click();
		} catch (NoSuchElementException e)
		{
			System.out.println("e");
		}
		
		//PreProd
		driver.findElement(By.id("email")).sendKeys("cspuser102@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Purdydog13");
		
		//SIT
		//driver.findElement(By.id("email")).sendKeys("b2bsanity03@pradeep.co.uk");
		//driver.findElement(By.id("password")).sendKeys("Agoodday10");
		
		//driver.findElement(By.xpath("//div[@class='btn-container']//button[@class='slds-button slds-button_brand btn']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		WebDriverWait wait = new WebDriverWait(driver,500);
		
		wait.until(ExpectedConditions.titleContains("Home"));
		
		//String title = driver.getTitle().contains("home");
		//title.co
		//Exception e;
		//if (driver.getTitle().contains("home"))
			//{
				//System.out.println("True");
				//raise e;
			//}
		
		
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class = 'btn']"))));
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//span[@class = 'btn']"));
		
			
		List<String> ls = Arrays.asList("View Invoices", "Go to Payments", "Meter Readings", "View Contracts", "View Details", "Help & Support") ;
		
		System.out.println(ls.size());
		
		for (int x=0; x<ls.size(); x++)
		{
			System.out.println("Start of For Loop List Element" + ls.get(x));
			
			Boolean match = false;
			
			for (int i=0; i<listOfElements.size();i++)
			{
				//System.out.println("Before If " + ls.get(x) + "  " + listOfElements.get(i).getText());
				String lstvalue = listOfElements.get(i).getText();
				
				
				if (lstvalue.equalsIgnoreCase(ls.get(x)))
				{
					System.out.println("Match Found:" + listOfElements.get(i).getText() + "  " + ls.get(x) );
					match = true;
					break;
					
				}
				
				
			
			}
			
			if (!match)
				{
				org.testng.Assert.fail(ls.get(x) + " Not Found");
				break;
				}
						
		}
}

}









	
	



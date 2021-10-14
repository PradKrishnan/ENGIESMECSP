package SMECSPRegression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import SMECSPRegression.SMEFunctions;

public class LoginToCSP {

	@Test
	public void LoginSME() throws IOException
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
		driver.findElement(By.id("email")).sendKeys("prad.krish5+test310@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Agoodday10");
		
		//SIT
		//driver.findElement(By.id("email")).sendKeys("b2bsanity03@pradeep.co.uk");
		//driver.findElement(By.id("password")).sendKeys("Agoodday10");
				
		//driver.findElement(By.xpath("//div[@class='btn-container']//button[@class='slds-button slds-button_brand btn']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);		
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
		
		//driver.close();
		
				
	}

}






	
	



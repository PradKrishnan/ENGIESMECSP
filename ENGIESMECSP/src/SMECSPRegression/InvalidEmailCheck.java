package SMECSPRegression;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import SMECSPRegression.SMEFunctions;;

public class InvalidEmailCheck {
	
	@Test
	public void invalidEmail()
	{
		WebDriver Drive = SMEFunctions.openPage();
		Drive.manage().window().maximize();
		System.out.println(Drive.getTitle());
		WebElement element;
		try
		{
			Drive.findElement(By.xpath("//button[text()='Got it!']")).click();
		} catch (NoSuchElementException e)
		{
			System.out.println("e");
		}
		
		Drive.findElement(By.id("email")).sendKeys("cspuser102@gmail.co");
		Drive.findElement(By.id("password")).sendKeys("Purdydog13");
		//driver.findElement(By.xpath("//div[@class='btn-container']//button[@class='slds-button slds-button_brand btn']")).click();
		Drive.findElement(By.xpath("//button[text()='Sign In']")).click();
		WebDriverWait wait = new WebDriverWait(Drive,100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tooltip-txt error top-error']")));
		String ErrorText = Drive.findElement(By.xpath("//div[@class='tooltip-txt error top-error']")).getText();
		
		System.out.println(ErrorText);		
		//if ErrorText = "The email entered is not registered yet."
		Assert.assertEquals(ErrorText, "The email entered is not registered yet.", "Wron Error Displayed");
	}

}









	
	



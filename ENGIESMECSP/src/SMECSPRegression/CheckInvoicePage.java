package SMECSPRegression;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckInvoicePage {

		@Test
		public void CheckInvoice() throws InterruptedException, IOException
		{
			WebDriver driver = SMEFunctions.openPage();
			//driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			WebElement element;
			try
			{
			driver.findElement(By.xpath("//button[text()='Got it!']")).click();
			} catch (NoSuchElementException e)
			{
				System.out.println("e");
			}
			
			//WebDriverWait wait1 = new WebDriverWait(driver, 50000);
			//PreProd
			driver.findElement(By.id("email")).sendKeys("cspuser102@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Purdydog13");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 900000);		
			wait.until(ExpectedConditions.titleContains("Home"));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class = 'btn']"))));
			driver.findElement(By.partialLinkText("Invoices")).click();
			
			System.out.println("Clicked Invoices");
			wait.until(ExpectedConditions.titleContains("Invoices"));
			System.out.println("Clicked " + driver.getTitle());
			
			
			System.out.println("Clicked Invoices2");
			Boolean disp;
			//disp = driver.findElement(By.partialLinkText("direct")).isDisplayed();
			//disp= driver.findElement(By.cssSelector("div.btn.directDebit")).isDisplayed();
			//Thread.sleep(29000);
			disp=driver.findElement(By.xpath("//div[@class='totalBalance']")).isDisplayed();
			
			if (disp)
			{
				System.out.println("Displayed");
			}
			
			System.out.println("Clicked Invoices3");
			//wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='btn directDebit']"))));
			
			//wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("direct-debit"))));
			
			System.out.println("Clicked Invoices4");
			System.out.println("I have loaded ");
			
			//System.out.println("Acciunt Number" + driver.findElement(By.xpath("//div[@class='accountNumber']")).getText());
			//div[@class='accountNumber']
			
			//			driver.findElement(By.xpath("//span[text()='View Invoices']")
			
			
		}
}

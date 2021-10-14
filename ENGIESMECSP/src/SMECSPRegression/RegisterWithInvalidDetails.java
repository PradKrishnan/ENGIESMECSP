package SMECSPRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SMECSPRegression.SMEFunctions;
public class RegisterWithInvalidDetails {

	public void InvalidRegistrationCheck()
	{
		WebDriver driver = SMEFunctions.openPage();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
		// Wait till Register window gets opened
		WebDriverWait wait = new WebDriverWait(driver,500);		
		wait.until(ExpectedConditions.titleContains("Register"));
		
		
	}
	
	
}

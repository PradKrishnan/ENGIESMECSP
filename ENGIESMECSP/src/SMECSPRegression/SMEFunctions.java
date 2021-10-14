package SMECSPRegression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Predicate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SMEFunctions {

	public static String readprop(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fio = new FileInputStream("C:\\PradeepBackup\\Eclipse\\workspace\\ENGIESMECSP\\src\\SMECSPRegression\\config.properties");
		prop.load(fio);
		String val = prop.getProperty("website");
		return val;
	}
	public static WebDriver openPage() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\PradeepBackup\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String add = readprop("website");
		//PreProd
		//driver.get("https://int-engie-uk.cs108.force.com/s/login/");
		driver.get(add);
		//SIT
		//driver.get("https://sit-engie-uk.cs110.force.com/s/login/");
		
		return driver;
	}
	
	static void waitForPageLoad(WebDriver wdriver) {
	    WebDriverWait wait = new WebDriverWait(wdriver, 60);

	    Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {


	        public boolean apply(WebDriver input) {
	            return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
	        }

	    };
	    wait.until(pageLoaded);
	}
}

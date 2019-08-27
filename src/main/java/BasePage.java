

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.qa.amazon.util.TestUtil;
public class BasePage {

	public static WebDriver driver;
	public String browser = "chrome";


public BasePage() {
	if (driver == null) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\selenium jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
}
}
public void setText(WebElement element, String name) {
	if (name != null) {
		element.click();
		element.clear();
		element.sendKeys(name);
	}
}
	/*
	 * public boolean elementFound(WebElement element) { boolean res = false; try {
	 * res = element.isDisplayed(); } catch (Exception e) { e.printStackTrace(); }
	 * return res; }
	 */

	public void quitDriver() {
		driver.quit();
	}
	public boolean elementFound(WebElement women) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			res = women.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}

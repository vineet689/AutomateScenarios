package handleWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	    driver.findElement(By.id("alert")).click();
	    Alert myalert= driver.switchTo().alert();
	    myalert.accept();
	    driver.close();
	
	}

}

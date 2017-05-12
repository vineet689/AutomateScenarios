package handleDynamicWebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch new Browser
	Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
	Get the value from cell ‘Dubai’ and print it on the console
	Click on the link ‘Detail’ of the first row and last column
 */


public class Exercise1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		String cellValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(cellValue);
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		Thread.sleep(3000);
		
		driver.quit();
	}

}

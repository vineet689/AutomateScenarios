package handleDynamicWebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch new Browser
	Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
	Get the value from cell ‘Dubai’ with using dynamic xpath
	Print all the column values of row ‘Clock Tower Hotel’
 */

public class Exercise2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String sRow= "1";
		String sCol= "2";
		
		String cellValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" +sRow+ "]/td[" + sCol + "]")).getText();
		System.out.println(cellValue);
		
		String rowValue= "Clock Tower Hotel";
		
		// First loop will find the 'ClOCK TWER HOTEL' in the first column
		for(int i =1; i<=5;i++){
			String sValue=null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
			if(sValue.equalsIgnoreCase(rowValue)){
				// If the sValue match with the description, it will initiate
				// one more inner loop for all the columns of 'i' row
				for(int j= 1;j<=5;j++){
					String sColumnValue = driver
							.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();
					System.out.println(sValue);
				}
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
				}
			
		

		
		
		
	}



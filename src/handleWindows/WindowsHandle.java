package handleWindows;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-switch-windows");
		String SuperWindow= d.getWindowHandle();
		System.out.println("Super Window name is: " +SuperWindow);
		 d.findElement(By.id("button1")).click();
		
		Set<String> Getwindows = d.getWindowHandles();
		System.out.println("Äll windows name is:" +Getwindows);
		for(String w1: Getwindows){
			d.switchTo().window(w1);
			String pass= d.getTitle();
			System.out.println(pass);
			d.close();	
		}
		
		
		d.switchTo().window(SuperWindow);
		
	

	}

}

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getcolors {
	WebDriver driver;
	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-switch-windows/");
		String Fontcolor= d.findElement(By.id("colorVar")).getCssValue("color");
		System.out.println("Font Color is: " +Fontcolor);
		String backgroundcolor= d.findElement(By.id("doubleClick")).getCssValue("text-decoration");
		System.out.println(backgroundcolor);
		
	}
	@Test
	  public void test() throws InterruptedException 
	  {
	  try {
		  System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		  driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	    java.util.List<WebElement> no = driver.findElements(By.tagName("a"));
	    int nooflinks = no.size(); 
	    System.out.println(nooflinks);
	    for (WebElement pagelink : no)
	         {
	          String linktext = pagelink.getText();
	          String link = pagelink.getAttribute("href"); 
	          System.out.println(linktext+" ->");
	          System.out.println(link);
	          }
	   }catch (Exception e){
	             System.out.println("error "+e);
	         }
	           
	  }
	
}

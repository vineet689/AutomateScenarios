package findAllLinksOnWebpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Link Size is: " +links.size());
		for(int i = 0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
			
		}
		
	}
	
	


/*
 * The same way you can easily be able to find any type of WebElements on a
 * WebPage: Find total number of Checkboxes on a Webpage :
 * 
 * java.util.List&lt;WebElement&gt; checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
 * System.out.println(checkboxes.size());
 * 
 */

/*
 * Find total number of Menus on a Webpage
 * 
 * java.util.List;WebElement&gt; dropdown = driver.findElements(By.tagName("select"));
 * System.out.println(dropdown.size());
 */

/*
 * Find total number of TextBoxes on a Webpage :
 * 
 * java.util.List;WebElement&gt; textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
 * System.out.println(textboxes.size());
 * 
 * 
 */

}

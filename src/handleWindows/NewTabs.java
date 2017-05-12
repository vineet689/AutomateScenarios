package handleWindows;

	import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
	
	public class NewTabs{

	public static WebDriver driver;

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "F://Data//ChromeDriver//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		    String homewindow= driver.getWindowHandle();
		    System.out.println("Home Window name: "+homewindow);
		    WebElement WebElement= driver.findElement(By.xpath("//button[@onclick='newBrwTab()']"));
		    Actions act = new Actions(driver);
		    act.contextClick(WebElement).perform();
		    
		 
		    Set<String> windowsname= driver.getWindowHandles();
		    System.out.println("Windows name: " +windowsname);
		    for(String handle: driver.getWindowHandles())
		    	if(!windowsname.equals(homewindow)){
		    	System.out.println("Windows name: " +handle);
		    	driver.switchTo().window(handle);
		    	
		    driver.close();
		     driver.quit();
		
		}

		}
	}

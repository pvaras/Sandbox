import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Invoke Chrome Browser
			//System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
			//WebDriver driver=new ChromeDriver();
			//Using Safari driver due to limitations with Chrome driver and excessive DIVs
			//WebDriver driver=new SafariDriver();
			System.setProperty("webdriver.gecko.driver", "/Users/patrickvaras/Downloads/geckodriver");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://echoecho.com/htmlforms10.htm");
			driver.manage().window().maximize();
			System.out.println("Test site invoked - Radio Buttons");
			System.out.println("         ");
			
			
			//NOTE - Click arg. does NOT work with Chromedriver due to excessive DIV's in statement. Works
			//fine with Safari and FF. Chromedriver can be used but with other methods that need to be researched.
			//Chromedriver will sort of work with sendkeys arg with \n
			
			
			//Selecting radio buttons	
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			//driver.findElement(By.xpath("//input[@name='group1']")).getSize();
			
			System.out.println("Milk Selected");
			
			//Count number of checkboxes in a group
			System.out.println(driver.findElement(By.xpath("//input[@name='group1']")).getSize());
			

	}

}

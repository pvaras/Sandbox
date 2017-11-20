import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Test site invoked");
	
		//Search query
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Dress");
		System.out.println("Enter 'Dress' in Search Field");
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		System.out.println("Search initiated");
		//driver.findElement(By.xpath("//*[@id='center_column']/h1/span[2]"));
		driver.findElement(By.cssSelector(".heading-counter"));
		System.out.println("Results returned");
		driver.findElement(By.xpath("//*[@id='header_logo']/a/img")).click();
		System.out.println("Navigate back to homepage");
		//System.out.println("Test ended");
		
		//Registration
		System.out.println("Begin Registration");
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		System.out.println("Select Sign in");
		driver.findElement(By.cssSelector(".is_required")).sendKeys("pvaras@yahoo.com");
		driver.findElement(By.cssSelector("#SubmitCreate")).click();
		System.out.println("Button clicked");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Enter registration info
		//driver.findElements(By.cssSelector("#uniform-id_gender1"));
	
		//DOB Dropdowns
		Select s=new Select(driver.findElement(By.cssSelector("div#uniform-days")));
		//s.selectByValue("10");
		System.out.println("Select Month 10 (October)");
		
		
		
	
		
		
		

	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
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
=======
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("Test site invoked");
		
		//GIT CHANGE
		//Another git change
	
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
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Enter registration info
		//driver.findElements(By.cssSelector("#uniform-id_gender1"));
	
		//DOB Dropdowns
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='26']")));
		
		
		driver.findElement(By.xpath("//*[@value='26']")).click();
		System.out.println("26");
		
		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='10']")));
		
		driver.findElement(By.xpath("//*[@value='10']")).click();
		System.out.println("October");
		driver.findElement(By.xpath("//*[@value='1966']")).click();
		System.out.println("1966");
		
		
		//Select s=new Select(driver.findElement(By.xpath("//*[@id='days']")).
		//s.selectByValue("10");
		//System.out.println("Select Month 10"));
>>>>>>> branch 'develop' of https://github.com/pvaras/Sandbox
		
		
		
	
		
		
		

	}

}

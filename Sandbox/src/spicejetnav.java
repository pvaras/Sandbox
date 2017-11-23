
		
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class spicejetnav {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
			
				
				System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.spicejet.com/");
				System.out.println("Test site invoked");
				System.out.println("          ");
				
				System.out.println("Experimenting with GIT");
				System.out.println("          ");
				
				System.out.println("Push from Dev to Stage");
				System.out.println("          ");
				
				//Wait for first dropdown to become available before clicking
				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")));		
				
				//Departure City Dropdown		
				driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
				System.out.println("Departure City Dropdown selected");
				driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[2]/li[3]/a")).click();
				System.out.println("GOA Selected");
				
				//Arrival City Dropdown;
				driver.findElement(By.xpath("(//*[@id='dropdownGroup1'])[2]/div/ul[2]/li[4]/a")).click();
				System.out.println("Departure City Dropdown selected");
				driver.findElement(By.xpath("(//*[@id=\'dropdownGroup1\'])[2]/div/ul[2]/li[4]/a"));
				System.out.println("HYD Selected");
			}
			
		
		


	}



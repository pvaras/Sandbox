import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		System.out.println("Test site invoked");
		System.out.println("         ");
		
		//Checkboxes
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")));
		System.out.println("BEGIN TESTING CHECKBOXES");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println("Round Trip");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_Unmr']")).click();
		System.out.println("Unaccompanied Minor");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println("Family and Friends");
		
		driver.findElement(By.xpath("//*[@id='StudentDiv']/label")).click();
		System.out.println("Student");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_IndArm']/label")).click();
		System.out.println("Indian Armed Forces");
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		//System.out.println("Senior Citizen");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		
		//Wait for Departure City dropdown to become available before clicking
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")));		
		
		//Departure City Dropdown	
		System.out.println("BEGIN TESTING DEPARTURE CITY DROPDOWN");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		System.out.println("Departure City Dropdown selected");
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[2]/li[3]/a")).click();
		System.out.println("GOA Selected");
		System.out.println("         ");
		
		
		//Arrival City Dropdown. NOTE 2nd index box reference
		System.out.println("BEGIN TESTING ARRIVAL CITY DROPDOWN");
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1'])[2]/div/ul[2]/li[4]/a")).click();
		System.out.println("Arrival City Dropdown selected");
		driver.findElement(By.xpath("(//*[@id=\'dropdownGroup1\'])[2]/div/ul[2]/li[4]/a"));
		System.out.println("HYD Selected");
		System.out.println("         ");
		
		//DOB Dropdowns
		System.out.println("BEGIN TESTING DATE OF BIRTH DROPDOWNS");
		
		//Wait for DOB Dropdown element to load before proceeding
		//WebDriverWait wait11 = new WebDriverWait(driver, 40);
		//wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		//Wait statement end
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("5");
		System.out.println("Select 5 number of adults");
		Select a=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		a.selectByValue("3");
		System.out.println("Select 3 number of children");
		Select b=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']")));
		b.selectByValue("3");
		System.out.println("Select 3 number of infants");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");	
		
		//Currency dropdown
		System.out.println("BEGIN TESTING CURRENCY DROPDOWN");
		Select c=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		c.selectByVisibleText("AED");
		System.out.println("Select currency type");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		
		//Trip type radio buttons
		System.out.println("BEGIN TESTING TRIP TYPE RADIO BUTTONS");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println("Round Trip");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
		System.out.println("One Way");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		System.out.println("End Run");
		
	
		
	
		
		
		
		
		
		
		
		

	}

}

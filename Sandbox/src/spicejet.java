import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Change commit to Github
		System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		System.out.println("Test site invoked");
		System.out.println("         ");
		
		//DOB Dropdowns
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("BEGIN TESTING DATE OF BIRTH DROPDOWNS");
		Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("5");
		System.out.println("Select 5 number of adults");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Select a=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		a.selectByValue("3");
		System.out.println("Select 3 number of childeren");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Select b=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']")));
		b.selectByValue("3");
		System.out.println("Select 3 number of infants");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		//System.out.println("End Run");
		
		//Currency dropdown
		System.out.println("BEGIN TESTING CURRENCY DROPDOWN");
		Select c=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		c.selectByVisibleText("AED");
		System.out.println("Select currency type");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		//System.out.println("End Run");
		
		//Trip type radio buttons
		System.out.println("BEGIN TESTING TRIP TYPE RADIO BUTTONS");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println("Round Trip");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
		System.out.println("One Way");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		//System.out.println("End Run");
		
		//Checkboxes
		System.out.println("BEGIN TESTING CHECKBOXES");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println("Round Trip");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_Unmr']")).click();
		System.out.println("Unaccompanied Minor");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println("Family and Friends");
		driver.findElement(By.xpath("//*[@id='StudentDiv']/label")).click();
		System.out.println("Student");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_IndArm']/label")).click();
		System.out.println("Indian Armed Forces");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println("Senior Citizen");
		System.out.println("***TESTS PASSED***");
		System.out.println("         ");
		System.out.println("End Run");
		
		
		
		
		
		

	}

}

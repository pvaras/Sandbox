import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Invoke Chrome Browser
			System.setProperty("webdriver.chrome.driver", "/Users/patrickvaras/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("http://echoecho.com/htmlforms10.htm");
			System.out.println("Test site invoked - Radio Buttons");
			System.out.println("         ");
			
		//Selecting radio buttons
			driver.findElement(By.xpath("//input[@value='Milk']")).sendKeys("Keys.Return");
			System.out.println("Milk Selected");

	}

}

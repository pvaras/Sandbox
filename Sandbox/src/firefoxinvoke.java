import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefoxinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/patrickvaras/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cnn.com");
		System.out.println("Firefox invoked - Geko Driver invoke");
		

	}

}

package springmvc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browserLaunchTest {
	

	
	//@Test
	public void broweserMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://localhost:8095/springmvc/");
		driver.close();
	}

}

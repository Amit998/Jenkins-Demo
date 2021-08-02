package springmvc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mulTest {
	//@Test
	public void mulTesting() {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://localhost:8095/springmvc/");
		driver.manage().window().maximize();

		WebElement calButton = driver.findElement(By.id("calBtn"));
		calButton.click();

		
		 WebElement num1 = driver.findElement(By.id("num1")); 
		 WebElement num2 =driver.findElement(By.id("num2")); 
		 WebElement mulBtn =driver.findElement(By.id("mul"));
		  
		 num1.sendKeys("2"); 
		 num2.sendKeys("5");
		 

		 mulBtn.click();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.close();
	}

}

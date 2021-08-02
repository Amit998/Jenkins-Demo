package springmvc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class AddTest {

	//@Test
	public void addTesting() {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://localhost:8095/springmvc/");
		driver.manage().window().maximize();

		WebElement calButton = driver.findElement(By.id("calBtn"));
		calButton.click();

		
		 WebElement num1 = driver.findElement(By.id("num1")); 
		 WebElement num2 =driver.findElement(By.id("num2")); 
		 WebElement addBtn =driver.findElement(By.id("add"));
		  
		 num1.sendKeys("2"); 
		 num2.sendKeys("5");
		 

		 addBtn.click();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.close();
	}

}

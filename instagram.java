package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		//driver.findElement(By.name("useraname")).sendKeys("monika7103");
		//driver.findElement(By.name("username")).submit();
		
		
		WebElement username=driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).submit();
		
		
		 WebElement password=driver.findElement(By.id("password"));
		 driver.findElement(By.id("password")).submit();
		 
		 
		 






		
		
		
	}

}

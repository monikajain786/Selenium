package sel;

	import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;	
	
	public class Gmailsearch {




	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stubpackage mytest;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/" );
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\JAIN\\eclipse-workspace\\selenium");
		Files.copy(scrFile,destFile);
		System.out.println("screenshot completed");
		driver.findElement(By.linkText("Gmail")).click();
		
		
		//driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//
		Set<String>  s= driver.getWindowHandles();
		
		System.out.println(s.size());
		for(String win : s) {
			
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Gmail")) {
				
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("monika6.jain2015@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		 
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("omsainath7869");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]")).click();


		
		
					
			}
		}
		
	


	}

}

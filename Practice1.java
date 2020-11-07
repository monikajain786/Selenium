package sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		//get title and url
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		//print url and title 
		System.out.println("title " +title);
		System.out.println("url " +url);
		
		
		//screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("c:\\tmp\\screenshot.png"));
		FileHandler.copy(src, new File("C:\\Users\\JAIN\\Desktop\\screenshot.png"));
	    System.out.println("img is saved");
		
		
		//find all a tag from yahoo.com
		List<WebElement> els=  driver.findElements(By.tagName("a"));
		System.out.println(els.size());
		
		for(WebElement el: els) {
			System.out.println(el.getText());
			
			
		}
		
		
		
		//
		//driver.close();//close current instance
		
		driver.quit();//close all ,reference of driver


	}

}

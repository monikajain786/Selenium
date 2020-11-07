package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("monika6.jain2015@gmail.com");
		driver.findElement(By.id("email")).submit();
		
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("omsainath786");
		driver.findElement(By.xpath("//input[@id='u_0_4']")).submit();
		
		
		
		List<WebElement> els=  driver.findElements(By.tagName("a"));
		System.out.println(els.size());
		
		for(WebElement el: els) {
			System.out.println(el.getText());
			
		}
			
			




		

	}

}

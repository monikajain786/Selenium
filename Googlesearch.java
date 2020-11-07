package sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googlesearch {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			
			driver.findElement(By.name("q")).sendKeys("selenium interview questions");
			driver.findElement(By.name("q")).submit();
			
			//*[@id="rso"]/div[1]/div/div[1]/div/div/div[1]/a
			
			
			String m = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a")).getText();
			System.out.println(m);
			
		
		}

	}


	

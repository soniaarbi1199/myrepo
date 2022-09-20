package practice.intpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class letsgo {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonia\\eclipse-workspace\\intpractice\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement signin= driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		
		Actions ob=new Actions(driver);
		ob.moveToElement(signin).build().perform();
		WebElement accnt=driver.findElement(By.xpath("//*[text()='Account']"));
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		accnt.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
	}
	
	

}

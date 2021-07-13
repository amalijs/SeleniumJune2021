package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("jsamali1983@gmail.com");
		driver.findElementByXPath("//input[@value ='Append ']").sendKeys("Test Leaf");
		String text = driver.findElementByXPath("//input[@name ='username']").getAttribute("value");
		System.out.println(text);
		driver.findElementByXPath("//input[@value ='Clear me!!']").clear();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		driver.close();
	}

}

package week4.day1Classroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//to get confirmation box
		driver.findElement(By.xpath("//button[text() ='Confirm Box']")).click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		//alert1.dismiss();
		
		
		driver.findElement(By.xpath("//button[text() ='Prompt Box']")).click();
		Alert alerttext2 = driver.switchTo().alert();
		String text2 = alerttext2.getText();
		System.out.println(text2);
		alerttext2.sendKeys("Test");
		alerttext2.accept();
		//alerttext2.dismiss();
	}

}

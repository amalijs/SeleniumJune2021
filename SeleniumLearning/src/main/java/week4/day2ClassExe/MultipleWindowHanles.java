package week4.day2ClassExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHanles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//step -1
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//2. Click OK on the Alert
		driver.findElement(By.xpath("//button[@type ='submit' and @class ='btn btn-primary']")).click();
		//driver.findElement(By.xpath("//button[text() = 'OK']")).click();
		
		//3. Click on FLIGHTS
		driver.findElementByLinkText("FLIGHTS").click();
		
		//4. Switch to the new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(1));
		
		//	5. Read the text from "flights@irctc.co.in" WebElement and print it in console
		WebElement findElement = driver.findElement(By.xpath("//a[@class ='d-block font-weight-bold chromexPathFinder1']").linkText("flights@irctc.co.in"));
		System.out.println(findElement.getText());
		
		
		//	6. Close the new window alone
		driver.close();
		
		//	7. Print the title of the first window
		driver.switchTo().window(listHandles.get(0));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		

	}

}

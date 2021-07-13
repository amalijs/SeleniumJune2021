package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[@id ='home']").click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("TestLeaf"))
		{
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		driver.findElementByXPath("//img[@alt ='Buttons']").click();
		
		Point location = driver.findElementByClassName("innerblock").getLocation();
		System.out.println(location);
		
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println("(R,G,B)"+ cssValue);
		
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("(width,height)" + size);
		driver.close();

	}

}

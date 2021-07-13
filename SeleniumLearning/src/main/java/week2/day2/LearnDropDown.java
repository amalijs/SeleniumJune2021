package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement webEleSource = driver.findElement(By.id("dropdown1"));
		Select drpDown = new Select(webEleSource);
		// to find out the last but one value in the dropdown.
		drpDown.selectByValue("3");
		
	

		
		

	}

}

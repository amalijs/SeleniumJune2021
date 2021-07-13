package week4.day1Classroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnIneractElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Get the count of number of colmns

		//Get the count of number of rows
		
		//To get the In progress value of "Learn to interact with Elements"
		WebElement webTable = driver.findElement(By.xpath("(//table[@id = 'table_id']//tr)[3]/td[2]"));
		String text = webTable.getText();
		System.out.println("Learn to interact with Elements:" + "" + text);
		
		//to get the value of Least completed Progress
		//table[@id = 'table_id']
		WebElement webTable1 = driver.findElement(By.id("//table[@id = 'table_id']"));
		driver.findElement(By.tagName("tr"));
	}

}

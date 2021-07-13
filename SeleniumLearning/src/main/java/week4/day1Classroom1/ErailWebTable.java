package week4.day1Classroom1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.inject.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS", Keys.TAB);	
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Mdu", Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
		
	/*	ArrayList<String> obtainedList = new ArrayList<String>(); 
			for(int i = 0; i<tableRows.size(); i++) {
			String rowText = tableRows.get(i).getText();
			//System.out.println(rowText);
			obtainedList.add(rowText);
			Collections.sort(obtainedList);
			System.out.println(obtainedList);
			
		
		}*/
		
		ArrayList<String> obtainedList = new ArrayList<String>(); 
		for (WebElement temp : tableRows) {
			obtainedList.add(temp.getText());
		}
			Collections.sort(obtainedList);
			System.out.println(obtainedList);		
		
	}

}

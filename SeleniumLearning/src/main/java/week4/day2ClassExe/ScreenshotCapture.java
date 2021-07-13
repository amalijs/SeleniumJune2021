package week4.day2ClassExe;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotCapture {
	
		public static void main(String[] args) throws IOException {
			
		Date sDate = new Date();
		String newDate = sDate.toString().replace(":", "");
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//to take the screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		//to store in the target
		File target = new File("./snaps/screenshot/lg_"+newDate+" .png");
		
		//to copy the file
		FileUtils.copyFile(screenshotAs, target);
		

	}

}

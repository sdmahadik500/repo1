package Handson;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		//take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy from src and save it in dest folder
		File dest= new File("C:\\Users\\sdilipma\\Downloads\\Selenium screenshot\\login.png");
		//FileUtils.copyFile(src, dest);
		Files.copy(src, dest);

	
	}

}

package Handson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main (String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.greenstechnologys.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement course = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		//context click
		a.contextClick(course).perform();
		//down key
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//ENTER KEY
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

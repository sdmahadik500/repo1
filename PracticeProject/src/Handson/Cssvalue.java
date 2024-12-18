package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssvalue {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement previous = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[1]"));
		String color = previous.getCssValue("color");
		System.out.println(color);
		String bgcolor = previous.getCssValue("background-color");
		System.out.println(bgcolor);
		String fontsize = previous.getCssValue("font-size");
		System.out.println(fontsize);
		String width = previous.getCssValue("width");
		System.out.println(width);
		String fam = previous.getCssValue("font-family");
		System.out.println(fam);
		
		WebElement txtHighlight = driver.findElement(By.xpath("//*[@id=\"main\"]/h1"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//highlighting text in webpage
		js.executeScript("arguments[0].setAttribute('style','background:red')",txtHighlight);
		

	}

}

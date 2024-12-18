package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.automationtesting.in/Frames.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		//switch to outer iframe
		WebElement outerIframe =  driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerIframe);
		
		//switch to inner iframe
		WebElement innerIframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerIframe);
		
		//Actions inside innerframe
		WebElement iframeTextbox1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		Thread.sleep(5000);
		iframeTextbox1.sendKeys("Automation Testing");
		Thread.sleep(5000);
		iframeTextbox1.clear();		
				
		//switch back
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		
		
		

	}

}

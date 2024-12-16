package Demo;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class css_value {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/*driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().timeouts();
	driver.manage().window().maximize();
	driver.manage().timeouts();
	WebElement table = driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/div[4]/a[1]"));
	String color = table.getCssValue("color");
	System.out.println(color);
	WebElement txtHighlight = driver.findElement(By.xpath("//*[@id=\"main\"]/p[1]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//highlighting text in webpage
	js.executeScript("arguments[0].setAttribute('style','background:yellow')",txtHighlight);
	
	
	//navigate to next url
	driver.navigate().to("https://www.guru99.com");
	Thread.sleep(3000);
	//to go to previous page
	driver.navigate().back();
	Thread.sleep(3000);
	//to go to next page
	driver.navigate().forward();
	Thread.sleep(3000);
	//to refresh the page
	driver.navigate().refresh();
	driver.close(); */
	
	/*driver.get("https://www.guru99.com");
	driver.manage().window().maximize();
	driver.manage().timeouts();
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	/*WebElement searchb = driver.findElement(By.xpath("//*[@id=\"post-451\"]/div/header/h1"));
	searchb.sendKeys("machine learning");*/
	
	//explicit wait
	
	/*driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/div[2]/span[1]/a/img")).click();
	//webdriver wait
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-1299\"]/div/header/h1")));
	driver.findElement(By.xpath("//*[@id=\"post-1299\"]/div/header/div/div[2]/div/div/a[3]")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"linkedin-logo\"]/path")));
	*/
	
	
	//iframes
	/*driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.manage().timeouts();
	//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi");
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	WebElement outerIframe =  driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerIframe);
	WebElement innerIframe = driver.findElement(By.xpath("//iframe[@src=SingleFrame.html']"));
	driver.switchTo().frame(innerIframe);)
	WebElement iframeTextbox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	Thread.sleep(5000);
	//iframeTextbox.clear();
	//Thread.sleep(5000);
	iframeTextbox.sendKeys("Automation Testing");*/
	
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
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
	
	//switch back
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}

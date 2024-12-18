package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		country.click();
		
		//Select class to select webelement
		Select s = new Select (country);
		
		//to select required webelement using index
		s.selectByIndex(5);
		Thread.sleep(3000);
		
		//to select using value
		s.selectByValue("IND");
		Thread.sleep(3000);
		
		//to select using visible text 
		s.selectByVisibleText("Italy");
		
		
		//need to test deselect on different multiselect website
		
		//to select required webelement using index
		s.deselectByIndex(5);
		Thread.sleep(3000);
				
		//to select using value
		s.deselectByValue("IND");
		Thread.sleep(3000);
				
		//to select using visible text 
		s.deselectByVisibleText("Italy");
		
		
		
	}

}

package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement chtsht = driver.findElement(By.xpath("//*[@id=\"menu-item-6898\"]/a"));
		//to check whether webelement is displayed
		boolean displayed = chtsht.isDisplayed();
		System.out.println(displayed);
		
		//to check whether webelement is enabled
		boolean enabled = chtsht.isEnabled();
		System.out.println(enabled);
		
		//to check whether webelement is selected
		driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[103]"));
		country.click();
		boolean selected = country.isSelected();
		System.out.println(selected);
		
		
		
		
		

	}

}

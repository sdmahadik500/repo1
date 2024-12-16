package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class practice {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String url= "https://www.guru99.com";
		driver.get(url);
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//to get title of the webpage launched
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the url of the current page
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		//to quit the browser
		//driver.quit();
		/*driver.manage().timeouts();
		WebElement searchbar = driver.findElement(By.id("gsc-i-id1"));  
		searchbar.sendKeys("Machine Learning");
		driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
		driver.manage().timeouts();
		driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[1]")).click();
		*/
		
		//declare action class
		Actions a=new Actions(driver);
		
		//to move mouse point
		/*WebElement software = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/div[2]/span[1]/a/img"));
		a.moveToElement(software).perform();
		Thread.sleep(3000);
		a.doubleClick(software).perform();
		driver.close();
		
		//a.contextClick(software).perform();*/
		
		//drag and drop
		/*String url2 = "https://demo.automationtesting.in/Static.html";
		driver.get(url2);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"Accepted Elements\"]")).click();
		//driver.manage().timeouts();		
		WebElement sour = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		a.dragAndDrop(sour, dest).perform();
		Thread.sleep(2000);
		WebElement sour1 = driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		WebElement dest1 = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		a.dragAndDrop(sour1, dest1).perform();
		Thread.sleep(2000);
		WebElement sour2 = driver.findElement(By.xpath("//*[@id=\"node\"]"));
		WebElement dest2 = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		a.dragAndDrop(sour2, dest2).perform();
		Thread.sleep(2000);
		a.dragAndDrop(sour2, dest2).perform();
		Thread.sleep(5000);
		*/
		//driver.close();
		
		/*String url3 = "https://www.greenstechnologys.com/";
		driver.get(url3);
		driver.manage().window().maximize();
		//Robot class declaration
		Robot r = new Robot();
		WebElement courses = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		//a.moveToElement(courses).perform();
		//a.doubleClick(courses).perform();
		a.contextClick(courses).perform();
		//a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		int i;
		for (i=0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		/*String url4 = "https://demo.automationtesting.in/Alerts.html";
		driver.get(url4);
		driver.manage().window().maximize();
		*/
		
		/*
		//Switching into simple alert
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();	
		Alert al = driver.switchTo().alert();
		//to accept
		Thread.sleep(3000);
		al.accept();
		
		//switching to confirm alert
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Alert ab = driver.switchTo().alert();
		Thread.sleep(3000);
		al.dismiss();
		
		
		//switching to prompt alert
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert ad = driver.switchTo().alert();
		Thread.sleep(2000);
		ad.sendKeys("Sanket");		
		Thread.sleep(3000);
		al.accept();
		*/
		
		//Javascript Executor
		/*String url5 = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url5);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtScroll = driver.findElement(By.xpath("//*[@id=\"login\"]/ul/li[2]"));
		//scroll down
		js.executeScript("arguments[0].scrollIntoView(true)",txtScroll);
		Thread.sleep(2000);
		//pass values in textbox
		WebElement txtEmail = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','student')",txtEmail);
		//retrieve the user entered text
		Object object = js.executeScript("return arguments[0].getAttribute('value')",txtEmail);
		//upcasting
		String s1 = (String)object;
		System.out.println(s1);
		Thread.sleep(2000);
		WebElement txtPass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','Password123')",txtPass);
		//button click using javascript
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js.executeScript("arguments[0].click()",btnLogin);
		
		//typecasting
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy from src and save it in dest folder
		File dest= new File("C:\\Users\\sdilipma\\Downloads\\Selenium_screenshots\\login.png");
	    //FileUtils.copyFile(src, dest);
		Files.copy(src, dest);
		*/
		
		//Visibility of Webelement
		/*String url6 = "https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette";
		driver.get(url6);
		driver.manage().window().maximize();
		WebElement abt = driver.findElement(By.xpath("//*[@id=\"menu-item-53896\"]/a"));
		//to check whether webelement is displayed
		boolean displayed = abt.isDisplayed();
		System.out.println(displayed);
		//to check whether webelement is enabled
		boolean enabled = abt.isDisplayed();
		System.out.println(enabled);
		//to check whether element is selected
		driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[103]"));
		country.click();
		boolean selected = country.isSelected();
		System.out.println(selected);
		
		
		/*WebElement selected=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select selected2 =new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		Thread.sleep(2000);
		selected2.selectByIndex(3);
		boolean select = .isSelected();	    
	    System.out.println(select);*/
		
		/*driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		//switching into frame using string id
		driver.switchTo().frame("login_page");
		Thread.sleep(2000);
		
		WebElement customerid = driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input"));
		customerid.sendKeys("234938023");
		WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/a"));
		continuebutton.click();
		
		//to switch control from frame to main*/
		
		/*driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw9Km3BhDjARIsAGUb4nwlJX12P_AnKpH2jl-8V1JDDXDjvf6Hyvp5G_87ftcD8lffPOcgOxYaAqI_EALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/button/span[2]")).click();  
		driver.manage().timeouts();
		
		
		//to get parent window id
		String parentWind = driver.getWindowHandle();
		System.out.println(parentWind);
		
		//to get child window id
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		//to switch into child window
		for (String cd : child) {
			if(!(parentWind.equals(cd))) {
				//switch to child window
				driver.switchTo().window(cd);
			}
		}
		
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/p/a[1]")).click(); 
		
		//to switch to parent window
		driver.switchTo().defaultContent();

		//driver.switchTo().defaultContent();	*/
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/button/span[2]")).click();  
		driver.manage().timeouts();		
		
		

	}

	private static WebElement selectByIndex(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void alert() {
		// TODO Auto-generated method stub
		
	}

}

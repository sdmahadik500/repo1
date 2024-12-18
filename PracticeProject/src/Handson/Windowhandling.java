package Handson;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String url = "https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw9Km3BhDjARIsAGUb4nwlJX12P_AnKpH2jl-8V1JDDXDjvf6Hyvp5G_87ftcD8lffPOcgOxYaAqI_EALw_wcB&gclsrc=aw.ds";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/button/span[2]")).click();  
		driver.manage().timeouts();
		
		//to get parent window id
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		
		//to get child window id
		Set<String> childwin = driver.getWindowHandles();
		System.out.println(childwin);
		
		//to switch to child window
		for (String cd : childwin) {
			if(!(parentwin.equals(cd))) {
				//switch to child window
				driver.switchTo().window(cd);
			}
		}
		
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/p/a[1]")).click(); 
		
		//to switch to parent window
		driver.switchTo().defaultContent();*/
		
	
		
		/*driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw9Km3BhDjARIsAGUb4nwlJX12P_AnKpH2jl-8V1JDDXDjvf6Hyvp5G_87ftcD8lffPOcgOxYaAqI_EALw_wcB&gclsrc=aw.ds");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/button/span[2]").click();
		String defaultWindow = driver.getWindowHandle();
		Set<String> AllWindows =driver.getWindowHandles();
		Iterator<String> itr = AllWindows.iterator();
		itr.next(); 
		//first windowHandle
		String childWindow=itr.next(); 
		//second window handle
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(defaultWindow);*/
		
	
			
			
			
		
		
		
		
	}

}


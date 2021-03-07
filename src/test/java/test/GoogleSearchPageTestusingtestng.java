package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPageTestusingtestng {
	private static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		//String projectpath=  System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\Automation\\SeleniumJavaFramework\\Drivers\\geckodriver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		
	}
	
	/*
	 * //@Test public void googleSearchTest() { GoogleSearchPageObjects
	 * searchPageObj=new GoogleSearchPageObjects(driver);
	 * driver.get("https://www.google.com/");
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * searchPageObj.setTextInSearchBox("A B C D");
	 * searchPageObj.clickSearchButton();
	 * 
	 * 
	 * }
	 */
	@Test
	public void scrolldownTest() {
			
		driver.get("https://www.amazon.com/");
		
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
			System.out.println("Success");
			
		}
	@Test
	public void titleTest() {
			
		driver.get("https://www.amazon.com/");
		 String actualTitle = driver.getTitle();
		
			
			String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, expected);
			System.out.println("Success");
		}
	@AfterTest
	public void tearDownTest()
	{
		System.out.println("Success");
		//driver.close();
	}

}

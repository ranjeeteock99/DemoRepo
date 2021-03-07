package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class scroll {

	public static void main(String[] args) {
		//String projectpath=  System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\Automation\\SeleniumJavaFramework\\Drivers\\geckodriver\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 String actualTitle = driver.getTitle();
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
			System.out.println("Success");
			String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, expected);
			driver.close();

	}

}

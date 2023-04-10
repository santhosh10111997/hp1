package org.test;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom.ProductSelect;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Asoss extends BaseClass {
	
	@BeforeClass 
	private void before() {
		
		BrowserLaunch("chrome");
		urlLaunch("https://www.asos.com/");
		maximize();
		implicitlyWait(10);
//	WebDriverManager.chromedriver().setup();
//	 driver=new ChromeDriver();
//	 driver.get("https://www.asos.com/");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//	 driver.manage().window().maximize();
	 
	}
	@AfterClass
		private void after() {
			System.out.println("after class");
      //  driver.quit();
		}
	@BeforeMethod 
	private void BeforeMethod() {
		System.out.println("before bethod");	
      Date d=new Date();
      System.out.println("start timr"+d);
		}
		
	@AfterMethod
	private void aftermethod() {
		System.out.println("after method");
        Date d= new Date();
		System.out.println("end time"+d);
		}
		
		
	@Test
	private void test() throws InterruptedException {
//		BrowserLaunch("chrome");
//		urlLaunch("https://www.asos.com/men/");
//		
//		WebElement f1 = driver.findElement(By.xpath("//input[@id='chrome-search']"));
//		f1.click();
//		f1.sendKeys("sarees");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//		WebElement f3 = driver.findElement(By.xpath("(//img[@class='lazy_O2gfl show_moazN image_sJ7bk'])[4]"));
//		f3.click();
//		System.out.println("done");
//		WebElement f3 = driver.findElement(By.xpath("//select[@id='main-size-select-0']"));
//		Select s=new Select(f3);
//		s.selectByIndex(2);
		ProductSelect p1=new ProductSelect();
        sendKeys(p1.getSearch(), "sarees");
		Click(p1.getClick());
		//Click(p1.getSelect());
		selectByIndex(p1.getSelect(), 2);
Click(p1.getAddtocard());
String text = getText(p1.getText());
System.out.println(text);
	}
	

}

package org.maveric.fb;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	public static WebDriver driver;
	@BeforeClass
	private void getBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\LabSeries\\Facebook\\dri\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
@BeforeMethod
private void date() {
Date d=new Date();
System.out.println(d);
}
@Test
private void tc1() {
 driver.findElement(By.id("email")).sendKeys("sathya");
 driver.findElement(By.id("pass")).sendKeys("1234");
// driver.findElement(By.id("//input[@type='submit']")).click();
}
@Test
private void tc2() {
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sathya");
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("p");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9876543356");
}
@Test
private void tc3() {
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("MITHRAN");
}
@AfterMethod
private void date1() {
Date d=new Date();
System.out.println(d);
}
@AfterClass
private void end() {
driver.close();
}

}
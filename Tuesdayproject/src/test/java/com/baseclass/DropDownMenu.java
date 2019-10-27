package com.baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select s=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
			s.selectByVisibleText("Amazon Fresh");
			scrnsh.scshot(driver, "dropdown");
	} 
}

package Testingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Selenium Code
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qaclickacademy.com"); //Get to hit the URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}

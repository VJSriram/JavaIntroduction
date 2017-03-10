package Testingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Internet Explorer driver
		 System.setProperty("webdriver.ie.driver", "C:\\iedriverserver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.youtube.com");
		driver.close();

	}

}

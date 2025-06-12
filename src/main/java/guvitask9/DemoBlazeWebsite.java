package guvitask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeWebsite {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();

driver.get("https://www.demoblaze.com/index.html");

driver.manage().window().maximize();

String title = driver.getTitle();

System.out.println("The page title is : "+title);

if(title.equals("STORE")) {

	System.out.println("Page landed on correct website");

}

	else {

		System.out.println("Page not landed on correct website");

	}

driver.close();

}}

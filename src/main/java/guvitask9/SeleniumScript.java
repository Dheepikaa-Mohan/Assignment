package guvitask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {
		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();

		String url=	"https://www.google.com";

			driver.manage().window().maximize();

			driver.get(url);

			String currenturl = driver.getCurrentUrl();

			System.out.println("The current url is: "+currenturl);

			driver.navigate().refresh();

			driver.navigate().to(currenturl);

			driver.close();
		}}

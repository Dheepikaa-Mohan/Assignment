package guvitask9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wikipedia {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.wikipedia.org/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");

		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//span[text()='History']")).click();

		String text =driver.findElement(By.xpath("//h2[text()='History']")).getText();

		System.out.println(text);
	}}

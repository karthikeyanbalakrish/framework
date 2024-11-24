package excelimport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fb {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
	
	WebElement s = driver.findElement(By.xpath("//a[text()=' String ']"));
	WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions action = new Actions(driver);
	action.dragAndDrop(s,d).perform();
	Thread.sleep(3000);
	
	WebElement s1 = driver.findElement(By.xpath("//a[text()=' List ']"));
	WebElement d1 = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	Actions action1 = new Actions(driver);
	action1.dragAndDrop(s1,d1).perform();
	Thread.sleep(3000);

}
}

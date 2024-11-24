package excelimport;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
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
	
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' Actions ']"));
		WebElement d2 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(s2,d2).perform();
		Thread.sleep(3000);
		
		
		WebElement s3 = driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
		WebElement d3 = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		Actions action3 = new Actions(driver);
		action3.dragAndDrop(s3,d3).perform();
	
		
	}
}

package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		
		driver.findElement(By.ByClassName.xpath("//input[@name='pass']")).sendKeys("dgsgs");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String  value=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		
		System.out.println(value);
		
		
		
		
		
		
		
		

	}

}

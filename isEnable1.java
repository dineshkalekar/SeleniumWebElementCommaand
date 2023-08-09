package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
	boolean	e1=driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
	
	System.out.println(e1);
		if(e1) {
			System.out.println("Test Case Pass");
		}else
			System.out.println("Testcase fail");
		
		
		


	}

}

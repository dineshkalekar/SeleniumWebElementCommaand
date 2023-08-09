package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
    boolean e2=driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
    
    System.out.println(e2);
    
    //1.condition can be if(e2==false)
    //2.condition can be id(!e2)
	
		if(e2) 
		 {
			System.out.println("Test Case FAIL");
		}else
			System.out.println("Test case PASS");
		
		

	}

}

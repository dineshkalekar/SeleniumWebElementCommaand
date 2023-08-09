package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSvalueMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testkru.com/Elements/Buttons");
		
		String buttoncolor=driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background");
		
		System.out.println(""+buttoncolor);
		
		String expectedcolor="rgb(255, 186, 0)";
		
		String ActualColor=buttoncolor;
		
		if(ActualColor.contains(expectedcolor)) 
		{
			System.out.println("expected color is match with actual ");
			
		}else 
			System.out.println("expected color is not match with actual");
		
	}

}

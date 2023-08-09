package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
    String value=driver.findElement(By.xpath("//input[@type='text']")).getTagName();
    
    System.out.println("TagName for username "+value);
    
    String value2=driver.findElement(By.xpath("//input[@type='password']")).getTagName();
    
    System.out.println("TagName For Password "+value2);
    
    String username=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("id");
    
    System.out.println("Get username Attribute by id ===  "+username);
    
    String pass = driver.findElement(By.xpath("//input[@type='password']")).getAttribute("id"); 
    
    System.out.println("Get Atrribute of PassWord by id==== "+pass);
    
    

	}

}

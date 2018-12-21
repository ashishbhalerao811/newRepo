package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
	public static  void main(String [] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("inputBox"));
		Actions action=new Actions(driver);
		action.sendKeys(Keys.RETURN);//Enter key
		action.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_UP); //TAB and Arrow up
		action.contextClick(); //Right-click
		
		
		
	}

}

package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestUtilities {
	
	public void moveToElementAndClick(WebDriver driver,By element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(element)).click().build().perform();
	}
	
	public void selectValueFromDropDown(WebDriver driver,By element,String value)
	{
		Select select = new Select(driver.findElement(element));
		select.selectByValue(value);
	}
	

}

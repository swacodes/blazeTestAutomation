package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {


	public By findFlights = By.xpath("//input[@value='Find Flights']");
	
	public By toPort = By.name("toPort");
	
	public By fromPort = By.name("fromPort");
	
	
	
}

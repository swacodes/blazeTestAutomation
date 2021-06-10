package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightSelectingPage {

	public By chooseFlight= By.xpath("//table//following::tr[1]//descendant::input[@value='Choose This Flight']");
	public By departureCity= By.xpath("//table//thead//descendant::th[contains(text(),'Departs')]");
	public By arrivalCity= By.xpath("//table//thead//descendant::th[contains(text(),'Arrives')]");
	
}


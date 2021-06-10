package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.SearchPage;
import utilities.TestUtilities;

public class FlightSearchPageClass extends SearchPage{

	private WebDriver driver;
	TestUtilities utility = new TestUtilities();
	public FlightSearchPageClass(WebDriver driver) {
			this.driver=driver;
	}

	public void searchFlights(String departureCity,String destinationCity)
	{
		utility.moveToElementAndClick(driver,fromPort);
		utility.selectValueFromDropDown(driver,fromPort,departureCity);
		
		utility.moveToElementAndClick(driver,toPort);
		utility.selectValueFromDropDown(driver,toPort,destinationCity);
		
		utility.moveToElementAndClick(driver,findFlights);
	}

}

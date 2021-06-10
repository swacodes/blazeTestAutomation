package pageclass;

import org.openqa.selenium.WebDriver;

import pages.ConfirmationPage;
import utilities.TestUtilities;

public class FlightConfirmationPageClass extends ConfirmationPage{
	
	private WebDriver driver;
	TestUtilities utility= new TestUtilities();
	public FlightConfirmationPageClass(WebDriver driver) {
			this.driver=driver;
	}
	
	public boolean verifyIdCaptured()
	{	
		if(!(driver.findElement(confirmationID).getText().isEmpty()))
			return true;
		else
			return false;			
	}
	
	public boolean verifyStatusCaptured()
	{	
		if(driver.findElement(confirmationStatus).getText().equals("PendingCapture"))
			return true;
		else
			return false;			
	}

}

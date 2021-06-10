package pageclass;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import pages.BookingInformationPage;
import utilities.TestUtilities;

public class FlightBookingPageClass extends BookingInformationPage{

	private WebDriver driver;
	TestUtilities utility= new TestUtilities();
	public FlightBookingPageClass(WebDriver driver) {
			this.driver=driver;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean verifySelectedFlightInformation(Map<String,String> hashMap)
	{		
		if(hashMap.get("Airline").equals(airline) && (hashMap.get("FlightNumber").equals(flightNumber)) && (hashMap.get("Price").equals(price)))
			return true;
		return false;
		
	}
	
	public void bookingFlight(	String name,String address,String city,
								String state,String zipcode,String cardType,
								String creditcardNumber,String month,String year,
								String nameOnCard,String rememberMeOption)
	{
		driver.findElement(inputName).clear();
		driver.findElement(inputName).sendKeys(name);
		
		driver.findElement(inputAddress).clear();
		driver.findElement(inputAddress).sendKeys(address);
		
		driver.findElement(inputCity).clear();
		driver.findElement(inputCity).sendKeys(city);
		
		driver.findElement(inputState).clear();
		driver.findElement(inputState).sendKeys(state);
		
		driver.findElement(inputzipCode).clear();
		driver.findElement(inputzipCode).sendKeys(zipcode);
		
		driver.findElement(inputcreditCardMonth).clear();
		driver.findElement(inputcreditCardMonth).sendKeys(month);
		
		driver.findElement(inputcreditCardYear).clear();
		driver.findElement(inputcreditCardYear).sendKeys(year);
		
		utility.selectValueFromDropDown(driver, inputcardType, cardType);
		driver.findElement(inputcreditCardNumber).clear();
		driver.findElement(inputcreditCardNumber).sendKeys(creditcardNumber);
		
		driver.findElement(inputnameOnCard).clear();
		driver.findElement(inputnameOnCard).sendKeys(nameOnCard);
		
		if(rememberMeOption.equals("Yes"))
		{
			driver.findElement(inputrememberMe).click();
		}
		
		driver.findElement(purchaseFlight).click();
	}

}

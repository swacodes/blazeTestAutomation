package testsuite;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.BasePage;
import config.BaseTest;
import pageclass.FlightBookingPageClass;
import pageclass.FlightSearchPageClass;
import pageclass.*;

public class FlightBookingTestSuite extends BaseTest{

	private WebDriver driver;
	private BasePage basePage;
	private FlightSearchPageClass flightSearch;
	private pageclass.FlightBookingPageClass flightBooking;
	private FlightSelectingPageClass flightSelect;
	private FlightConfirmationPageClass flightConfirm;

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}

	@Test(priority = 1)
	public void verifyFlightSearch() {
		try {
			basePage = new BasePage(driver);
			flightSearch = new FlightSearchPageClass(driver);
			System.out.println("Searching Page");
			flightSearch.searchFlights("Boston","Berlin");
		}

		catch(Exception e) {
			e.printStackTrace();
		}


	}

	@Test(priority = 2)
	public void verifyFlightSelect() {
		try {
			basePage = new BasePage(driver);
			flightSelect= new FlightSelectingPageClass(driver);
			flightBooking= new FlightBookingPageClass(driver);
			System.out.println("Verifying the flight information");
			Assert.assertTrue(flightSelect.verifyFlightInformation("Boston","Berlin"),"Validating the right cities are fetched");

			Map<String, String> selectedFlightDetailsMap = flightSelect.chooseFlight("12");
			//This Assertion will always fail since the page gives only a static information
			Assert.assertTrue(flightBooking.verifySelectedFlightInformation(selectedFlightDetailsMap),"Verifying the Details of the selected flight are correct");

		}

		catch(Exception e) {
			e.printStackTrace();
		}


	}

	@Test(priority = 3)
	public void verifyFlightBooking() {
		try {
			basePage = new BasePage(driver);
			flightBooking = new FlightBookingPageClass(driver);

			System.out.println("Booking the flight");
			flightBooking.bookingFlight("Swathi", "123 Main Street", "Berlin", "Germany", "1234567", "amex", "1234567897654321", "11", "2017", "swathi","Yes");

		}

		catch(Exception e) {
			e.printStackTrace();
		}


	}

	@Test(priority = 4)
	public void verifyFlightBookingConfirmation() {
		try {
			basePage = new BasePage(driver);
			flightConfirm= new FlightConfirmationPageClass(driver);

			System.out.println("Booking Confirmed");
			Assert.assertTrue(flightConfirm.verifyIdCaptured(),"Verifying generationg of booking ID ");
			Assert.assertTrue(flightConfirm.verifyStatusCaptured(),"Verifying Status of the booking");
		}

		catch(Exception e) {
			e.printStackTrace();
		}


	}



}

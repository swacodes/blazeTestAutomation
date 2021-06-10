package pageclass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.FlightSelectingPage;
import utilities.TestUtilities;

public class FlightSelectingPageClass extends FlightSelectingPage{

	private WebDriver driver;
	TestUtilities utility = new TestUtilities();
	public FlightSelectingPageClass(WebDriver driver) {
		this.driver=driver;
	}

	public Map<String,String> chooseFlight(String flightNumber)
	{
		Map<String,String> chosenFlightMap = new HashMap<String,String>();

		try {
			WebElement webtable = driver.findElement(By.xpath("//table"));
			List<WebElement> rows = webtable.findElements(By.xpath("//table//tbody//tr"));
			int i=0;
			for(i =1; i<rows.size(); i++) 
			{	
				WebElement element =  driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[2]")));
				if(element.getText().equals(flightNumber))
				{
					chosenFlightMap.put("FlightNumber", driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[2]"))).getText());
					chosenFlightMap.put("Airline", driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[3]"))).getText());
					chosenFlightMap.put("DepartTime", driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[4]"))).getText());
					chosenFlightMap.put("ArrivalTime", driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[5]"))).getText());
					chosenFlightMap.put("Price", driver.findElement(By.xpath(("//table//tbody//tr["+i+"]//td[6]"))).getText());
				}
			}
			driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]")).click();
			utility.moveToElementAndClick(driver, chooseFlight);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return chosenFlightMap;
	}
	public boolean verifyFlightInformation(String departCity,String destinationCity)
	{
		if((driver.findElement(departureCity).getText()).contains(departCity) && driver.findElement(arrivalCity).getText().contains(destinationCity))
			return true;
		else
			return false;
	}
}

package pages;

import org.openqa.selenium.By;
public class BookingInformationPage {

	public By inputName= By.id("inputName");
	public By inputAddress = By.id("address");

	public By inputCity = By.id("city");

	public By inputState =By.id("state");

	public By inputzipCode =By.id("zipCode");

	public By inputcreditCardNumber=By.id("creditCardNumber");

	public By inputcreditCardMonth=By.id("creditCardMonth");

	public By inputcreditCardYear=By.id("creditCardYear");

	public By inputcardType=By.id("cardType");

	public By inputnameOnCard =By.id("nameOnCard");

	public By inputrememberMe =By.id("rememberMe");

	public By purchaseFlight =By.xpath("//input[@value='Purchase Flight']");

	public By airline= By.xpath("//div//descendant::p[contains(text(),'Airline')]");
	public By flightNumber= By.xpath("//div//descendant::p[contains(text(),'Flight Number')]");
	public By price= By.xpath("//div//descendant::p[contains(text(),'Price')]");




}

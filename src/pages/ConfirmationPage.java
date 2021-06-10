package pages;

import org.openqa.selenium.By;

public class ConfirmationPage {
	
	public By confirmationID= By.xpath("//table//tbody//descendant::td[contains(text(),'Id')]//following-sibling::td");
	public By confirmationStatus= By.xpath("//table//tbody//descendant::td[contains(text(),'Status')]//following-sibling::td");
	

}

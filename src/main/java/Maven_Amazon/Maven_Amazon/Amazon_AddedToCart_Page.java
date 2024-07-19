package Maven_Amazon.Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddedToCart_Page 
{
	WebDriver driver;
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuy_button;
	
	public void proceedtobuy_button_click()
	{
		proceedtobuy_button.click();
	}
	public Amazon_AddedToCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

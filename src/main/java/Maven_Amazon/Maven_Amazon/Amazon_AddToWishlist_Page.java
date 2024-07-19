package Maven_Amazon.Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddToWishlist_Page
{
	WebDriver driver;
	@FindBy(id="continue-shopping")
	WebElement continueshopping_button;
	
	public void continue_shopping()
	{
		continueshopping_button.click();
	}
	public boolean continue_shopping_button_display()
	{
		return continueshopping_button.isDisplayed();
	}
	public Amazon_AddToWishlist_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

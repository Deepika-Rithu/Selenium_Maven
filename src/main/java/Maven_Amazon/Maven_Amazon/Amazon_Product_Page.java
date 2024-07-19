package Maven_Amazon.Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page
{
	WebDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist_button;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart_button;
	
	public void add_to_wishlist()
	{
		wishlist_button.click();
	}
	public void add_to_cart()
	{
		addtocart_button.click();
	}
	public Amazon_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}

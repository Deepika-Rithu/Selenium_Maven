package Maven_Amazon.Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Listeners_DDT.DDT_FetchValue;

public class Amazon_Login_Page extends DDT_FetchValue
{
	WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void un()
	{
		username.sendKeys(user_name);
	}
	public void continue_click()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password.sendKeys(pass_word);
	}
	public void signin_click()
	{
		signin_button.click();
	}

	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

package Maven_Amazon.Maven_AmazonTestcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners_DDT.DDT_FetchValue;
import Listeners_DDT.Listeners_Screenshot;
import Maven_Amazon.Maven_Amazon.Amazon_AddToWishlist_Page;
import Maven_Amazon.Maven_Amazon.Amazon_Home_Page;
import Maven_Amazon.Maven_Amazon.Amazon_Login_Page;
import Maven_Amazon.Maven_Amazon.Amazon_Product_Page;
import Maven_Amazon.Maven_Amazon.Amazon_SearchResult_Page;

@Listeners(Listeners_Screenshot.class) 
public class Testcase4 extends Listeners_Screenshot
{
	@Test
	public void Login_Search_ClickFirstProduct_AddToWishlist_AddToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Amazon_Login_Page a1=new Amazon_Login_Page(driver);
		DDT_FetchValue d1=new DDT_FetchValue();
		d1.Data_fetching();
		a1.un();
		a1.continue_click();
		a1.pwd();
		a1.signin_click();
		
		Amazon_Home_Page a2=new Amazon_Home_Page(driver);
		a2.search();
		
		Amazon_SearchResult_Page a3=new  Amazon_SearchResult_Page(driver);
		a3.firstproduct_click();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> pcid=s1.iterator();
		pcid.next();
		String childid=pcid.next();
		driver.switchTo().window(childid);
		
		Amazon_Product_Page a4=new Amazon_Product_Page(driver);
		a4.add_to_wishlist();
		
		Amazon_AddToWishlist_Page a5=new Amazon_AddToWishlist_Page(driver);
		a5.continue_shopping();
		Thread.sleep(2000);
		a4.add_to_cart();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart","Product not added to cart");
	
	}
}

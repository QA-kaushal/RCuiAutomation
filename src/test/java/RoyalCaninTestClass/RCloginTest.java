package RoyalCaninTestClass;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RCloginTest extends BaseTest{
	
	@Test(priority=1,dataProvider="loginMOBno", dataProviderClass=DataInventory.class)
	public void mobileNumber(String mobNo) throws IOException, InterruptedException {
		System.out.println("hi");
		lp.Enter_MObNo(mobNo);
		System.out.println("mobi pass");
	     lp.getSend_OTP();
	     lp.Mob_clear();
	     
	}
	
	@Test(priority=2)
	public void sendOTP() throws IOException, InterruptedException {	
		
			 System.out.println("landed on OTP page");
   }

	@Test(priority=3,dataProvider="loginOTP",dataProviderClass=DataInventory.class)
	public void enterOTP(String OTP) throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Resend OTP']")));
		wait.until(ExpectedConditions.visibilityOf(lp.getEnter_OTP()));	
		lp.getEnter_OTP().click();
		lp.getEnter_OTP().sendKeys(OTP);
		lp.getVerify_OTP();
		lp.OTP_clear();	
	}
	
	@Test(priority=4)
	public void submit() throws IOException, InterruptedException {
		
			  System.out.println("landed on Landing Screen");
	}
	

	
}

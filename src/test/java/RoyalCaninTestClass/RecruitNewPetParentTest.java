package RoyalCaninTestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Android.AndroidActions;

public class RecruitNewPetParentTest extends BaseTest {

	
	@Test(priority=1)
	public void Landing_New_PetParent_recruitment() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[contains(@content-desc,\"Recruit New Pet Parent \")]")));
		RPP.getRecruitNewPetParent().click();
     
	}
	
	@Parameters({"PetParent_Number"})
	@Test(priority=2)
	public void Mobile_number(String Mobile_Number) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.widget.ImageView[1]")));
		RPP.getMobile_Number().click();
		Thread.sleep(2000);
		RPP.getMobile_Number().sendKeys(Mobile_Number);
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void OTP_Time() throws InterruptedException {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Mobile Number Validated Successfully.\"]"))).getText();
		RPP.getRequestOTP().click();
		System.out.println("Please Enter OTP ");
		Thread.sleep(30000);                                          //30sec for enter OTP manually
		System.out.println("OTP Entered Thank you! we are verifying");
		
	}
	
	@Test(priority=4)
	public void VerifyOTP() throws InterruptedException {
		RPP.getVerifyOTP().click();
		String toastMSG=RPP.getToast().getText();
		System.out.println(toastMSG);
		Thread.sleep(2000);
		Assert.assertEquals(toastMSG, "OTP verified successfully");
		 if(toastMSG.equals("OTP verified successfully")) {
		        System.out.println("You have entered the correct OTP.");
		    } else {
		    	RPP.getRequestOTP().click();
		    	System.out.println("Please Enter OTP ");
				Thread.sleep(30000);                                          
				System.out.println("OTP Entered Thank you! we are verifying");
				RPP.getVerifyOTP().click();
				System.out.println(toastMSG);
		    }
		 
	}
	
	@Test(priority=5)
	public void Title() throws InterruptedException {
		
		RPP.getTital().click();
		Thread.sleep(2000);
	RPP.clickFirstOptionInDropdown(3);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();

	}
	
	@Test(priority=6)
	public void First_Name() throws InterruptedException {
		RPP.getFirst_Name().click();
		RPP.getFirst_Name().sendKeys("kaushal");
		driver.hideKeyboard();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=7)
	public void Last_Name() throws InterruptedException {
		
		RPP.getLast_Name().click();
		RPP.getLast_Name().sendKeys("G");
		driver.hideKeyboard();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void Permanent_Address() throws InterruptedException {
		RPP.getPermanent_Address().click();
		Thread.sleep(1000);
        RPP.getchange_InXpath_for_Adrress().sendKeys("India");
        Thread.sleep(2000);
        driver.hideKeyboard();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=9)
	public void state() throws InterruptedException {
		RPP.getState().click();
		Thread.sleep(2000);
		RPP.clickFirstOptionInDropdown(3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
     	ac.scrollToDown((float) 4.3);
     	Thread.sleep(2000);
     	
	}
	
	@Test(priority=10)
	public void City() throws InterruptedException {
		RPP.getCity().click();
		Thread.sleep(2000);
		RPP.clickFirstOptionInDropdown(0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
     	ac.scrollToDown((float) 4.2);
     	Thread.sleep(2000);
     	
	}
	
	@Test(priority=11)
	public void Pin_Code() throws InterruptedException {
		RPP.getPin_Code().click();
		Thread.sleep(2000);
		RPP.clickFirstOptionInDropdown(0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
     	ac.scrollToDown((float) 4.15);
     	Thread.sleep(2000);
     	
	}
	
	@Test(priority=12)
	public void Date_Of_Birth() throws InterruptedException {
		RPP.getPet_Date_of_Birth().click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
     	ac.scrollToDown((float) 2);
     	ac.scrollToDown((float) 2);
     	Thread.sleep(2000);
	}
	
	@Test(priority=13)
	public void PetType() throws InterruptedException {
		RPP.getPet_Type().click();
		Thread.sleep(1000);
		RPP.clickFirstOptionInDropdown(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
     	Thread.sleep(2000);
     	ac.scrollToDown((float) 2); 	
	}
	
	@Test(priority=14)
	public void PetBreed() throws InterruptedException {
		
		RPP.getPet_Breed().click();
		Thread.sleep(1000);
		RPP.clickFirstOptionInDropdown(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();
		AndroidActions ac = new AndroidActions(driver);
		Thread.sleep(2000);
		ac.scrollToDown((float) 2);  	
	}
	
	@Test(priority=15)
     public void PetName() throws InterruptedException {
    	 RPP.getPet_Name().click();
    	 RPP.getPet_Name().sendKeys("Sheru");
    	 driver.hideKeyboard();
    	 Thread.sleep(2000);
     }
	
	
	@Parameters({"HamperCode"})
	@Test(priority=16)
	public void HamperCode(String HamperCode) throws InterruptedException {
		RPP.getHamper_Code().click();
		System.out.println("Please Enter Hamper Code");
		RPP.getHamper_Code().sendKeys(HamperCode);
		String hamperMSG=RPP.getToast().getText();
		
		driver.hideKeyboard();
		if(hamperMSG.equals("hamper code verified.")) {
			System.out.println(hamperMSG);
		}else {
			System.out.println("ERROR: "+hamperMSG);
			driver.close();
		}
   	       Thread.sleep(2000);
	}
	
	@Test(priority=17)
	public void save() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Save\")]")));
		RPP.getsave().click();
	}
	
	@Test(priority=18)
	public void Side_Menu() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[contains(@content-desc,\"Recruit New Pet Parent \")]")));
		RPP.getSidemenu().click();
	}
	
	@Test(priority=19)
	public void Log_Out() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@content-desc,\"Log Out\")]")));
		RPP.Log_Out().click();
	}
	
	@Test(priority=20, dependsOnMethods= "Log_Out" )
	public void LoginPage() {
		System.out.println("Landing on Login Page");
	}
}


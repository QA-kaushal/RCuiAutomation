package RoyalCaninTestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class Redeem_Food_CouponTest extends BaseTest {
	
	public String CoupanCode="abcdeg";
	
	@Test(priority=1)
	public void Redeem_Food_Coupon() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Redeem Food Coupon\"]")));	
	FC.getRedeem_Food_Coupon().click();
	
	}
	
	@Test(priority=2)
	public void Mobile_Number() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"TDS Deduction:\"]")));
		FC.getMobile_number().click();
        FC.getMobile_number().sendKeys("9021336929");
        driver.hideKeyboard();
	}
	
	@Test(priority=3)
	public void Coupon_Code() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[contains(@content-desc, \"Save\")]")));
		FC.getCoupan_Code().click();
		FC.getCoupan_Code().sendKeys(CoupanCode);
	}
	
	@Test (priority=4)
	public void products() {
		FC.getProducts().click();
        FC.clickFirstOptionInDropdown(0);
      
	}
	@Test(priority=5)
	public void OK() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
		FC.getOK().click();
	}
	
	@Test(priority=6)
	public void getYou_will_get_discount_code_redumption_in() {
		FC.getYou_will_get_discount_code_redumption_in().click();
		FC.clickFirstOptionInDropdown(0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")));
		FC.getOK().click();
	}

	
	
}

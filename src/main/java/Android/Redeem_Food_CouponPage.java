package Android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Redeem_Food_CouponPage {
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Redeem Food Coupon\"]")
	private WebElement Redeem_Food_Coupon;

	@FindBy(xpath="(//android.widget.ImageView)[1]")
	private WebElement Mobile_number;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Request OTP\"]")
	private WebElement Request_OTP;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Verify\"]")
	private WebElement Verify;
	
	@FindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement Coupan_Code;
	
	@FindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement products;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
	private WebElement OK;
	
	@FindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement You_will_get_discount_code_redumption_in;
	
	@FindBy(xpath = "//android.view.View[contains(@clickable,'true')]")
	 private List<WebElement> clickableElements;
	
	public WebElement getOK() {
		return OK;
	}
	
	public void clickFirstOptionInDropdown(int num) {
	    if (!clickableElements.isEmpty()) {
	        clickableElements.get(num).click();
	    }
	  }

	public WebElement getRedeem_Food_Coupon() {
		return Redeem_Food_Coupon;
	}

	public WebElement getMobile_number() {
		return Mobile_number;
	}

	public WebElement getRequest_OTP() {
		return Request_OTP;
	}

	public WebElement getVerify() {
		return Verify;
	}

	public WebElement getCoupan_Code() {
		return Coupan_Code;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getYou_will_get_discount_code_redumption_in() {
		return You_will_get_discount_code_redumption_in;
	}
	
}


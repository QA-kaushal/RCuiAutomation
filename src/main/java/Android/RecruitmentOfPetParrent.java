package Android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentOfPetParrent {

	
 @FindBy(xpath="//android.widget.ImageView[contains(@content-desc,\"Recruit New Pet Parent \")]")
 private WebElement RecruitNewPetParent;
 
 @FindBy(xpath="(//android.widget.ImageView)[1]")
	private WebElement Mobile_Number;
 
 @FindBy(xpath="//android.widget.Button[@content-desc=\"Request OTP\"]")
 private WebElement Request_OTP;
 
 @FindBy(xpath="//android.widget.Button[@content-desc=\"Verify\"]")
 private WebElement Verify_OTP;
 
 @FindBy(xpath="(//android.widget.ImageView)[2]")
	private WebElement Tital;
 
 @FindBy(xpath="(//android.widget.ImageView)[3]")
	private WebElement First_Name;
 
 @FindBy(xpath="(//android.widget.ImageView)[4]")
	private WebElement Last_Name;
 

 @FindBy(xpath="(//android.widget.ImageView)[6]")
	private WebElement Permanent_Address;
 
 @FindBy(xpath="(//android.widget.ImageView)[7]")
	private WebElement State;
 
 @FindBy(xpath="(//android.widget.ImageView)[7]")
	private WebElement City;
 
 @FindBy(xpath="(//android.widget.ImageView)[7]")
 private WebElement Pin_Code;
 
 @FindBy(xpath="(//android.widget.ImageView)[7]")
 private WebElement Pet_Date_of_Birth;
 
 @FindBy(xpath="(//android.widget.ImageView)[2]")
 private WebElement Pet_Type;
 
 @FindBy(xpath="(//android.widget.ImageView)[2]")
 private WebElement Pet_Breed;
 
 @FindBy(xpath="(//android.widget.ImageView)[3]")
 private WebElement Pet_Name;
 
 @FindBy(xpath="(//android.widget.ImageView)[4]")
 private WebElement Hamper_Code;
 
 @FindBy(xpath="//*[contains(@content-desc,\"Save\")]")
 private WebElement Save;
 
 @FindBy(xpath = "//android.view.View[contains(@clickable,'true')]")
 private List<WebElement> clickableElements;
 
 
 @FindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
 private WebElement OK;
 
 @FindBy(xpath="//android.widget.ImageView[5]")
 private WebElement change_InXpath_for_Adrress;
 
 @FindBy(xpath="(//android.widget.Toast)[1]")
 private WebElement Toast;
 
 @FindBy(xpath="(//android.widget.ImageView)[1]")
 private WebElement sidemenu;
 
 @FindBy(xpath="//*[contains(@content-desc,\"Log Out\")]")
 private WebElement Log_Out;
 
 public WebElement  Log_Out() {
	 return Log_Out;
 }
 
 public WebElement getSidemenu() {
	 return sidemenu;
 }
 
 
 public WebElement getToast() {
	 return Toast;
 }
 
 public WebElement getchange_InXpath_for_Adrress() {
	return change_InXpath_for_Adrress;
	 
  }
 
 public WebElement getsave() {
	 return Save;
 }
 
 public WebElement OK() {
	 return OK;
 }
 
 public WebElement getRecruitNewPetParent() {
	return RecruitNewPetParent;
}

public WebElement getMobile_Number() {
	return Mobile_Number;
}

public WebElement getRequestOTP() {
	return Request_OTP;
}

public WebElement getVerifyOTP() {
	return Verify_OTP;
}
public WebElement getTital() {
	return Tital;
}

public WebElement getFirst_Name() {
	return First_Name;
}

public WebElement getLast_Name() {
	return Last_Name;
}

public WebElement getPermanent_Address() {
	return Permanent_Address;
}

public WebElement getState() {
	return State;
}

public WebElement getCity() {
	return City;
}

public WebElement getPin_Code() {
	return Pin_Code;
}

public WebElement getPet_Date_of_Birth() {
	return Pet_Date_of_Birth;
}

public WebElement getPet_Type() {
	return Pet_Type;
}

public WebElement getPet_Breed() {
	return Pet_Breed;
}

public WebElement getPet_Name() {
	return Pet_Name;
}

public WebElement getHamper_Code() {
	return Hamper_Code;
}

public void clickFirstOptionInDropdown(int num) {
    if (!clickableElements.isEmpty()) {
        clickableElements.get(num).click();
    }
  }



 
}

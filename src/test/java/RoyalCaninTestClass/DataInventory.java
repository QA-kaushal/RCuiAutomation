package RoyalCaninTestClass;

import org.testng.annotations.DataProvider;

public class DataInventory {
	
	@DataProvider(name="loginMOBno")
	public  Object[] MOBnumberData() {
		Object[] data=new Object[7];
		data[0]="";
		data[1]="12472415424165";
		data[2]="123dhsgg12";
		data[3]="sdgfuggbgu";
		data[4]="213354678";
		data[5]="3425666666";
		data[6]="7498493462";
		return data;
		
	}
	
	@DataProvider(name = "loginOTP")
	public Object[] OTPdata() {
	    Object[] data = new Object[6];
	    data[0] = ""; // Empty OTP
	    data[1] = "124724"; // Valid OTP
	    data[2] = "567890"; // Another valid OTP
	    data[3] = "98765876874"; // Yet another valid OTP
	    data[4] = "156"; // A common test OTP
	    data[5] = "1111"; // Maximum possible value for testing
	    return data;
	}

	
	
}

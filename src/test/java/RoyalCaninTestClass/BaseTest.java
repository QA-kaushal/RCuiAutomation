package RoyalCaninTestClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Android.RecruitmentOfPetParrent;
import Android.Redeem_Food_CouponPage;
import Android.loginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	public  WebDriverWait wait;
	
	public loginPage lp;
	public RecruitmentOfPetParrent RPP;
	public Redeem_Food_CouponPage FC;
	  
	public String path=".//filexcel//SomanyUserData.xlsx";
	
	@BeforeClass(alwaysRun=true)
public void start() throws MalformedURLException, InterruptedException {
		System.out.println("a");
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android SDK built for x86");
		System.out.println("a2"); 
		
      //options.setApp("C:\\Users\\kaushal.golangade\\eclipse-workspace\\Somany\\src\\test\\java\\resource\\Somany_19.apk");		
	//options.setChromedriverExecutable("C:\\Users\\kaushal.golangade\\Desktop\\Chromedriver");
		
		System.out.println("a3");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 Thread.sleep(2000);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			
			lp = PageFactory.initElements(driver, loginPage.class);
			RPP = PageFactory.initElements(driver, RecruitmentOfPetParrent.class);
			FC=PageFactory.initElements(driver,Redeem_Food_CouponPage.class);
}
	@AfterClass(alwaysRun=true)
	public void end() {
		
	} 
	
	      
}
	


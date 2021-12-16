package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddFriend {
	
static AppiumDriver<MobileElement>driver;

	
	
	@BeforeTest
	public void config() throws MalformedURLException
		{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("Device Name", "M2003J15SC");
		cap.setCapability("udid", "205a78720409");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.avercast.fanbuku_app");
		cap.setCapability("appActivity", "com.avercast.fanbuku_app.activity.SplashScreenActivity");//activity.MainActivity");//activity.LoginActivity");// - Calculator
		
		URL url=new URL("http://localhost:4723/wd/hub");//http://localhost:4723/wd/hub
		driver=new AppiumDriver<MobileElement>(url,cap);

		System.out.println("Application Started........");
		try {
		Thread.sleep(3000);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		
		
		
	@Test(priority=1)
	public void login()
		{
			
			driver.findElement(By.className("android.widget.EditText")).sendKeys("aman.aman@sharklasers.com");
			
			driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("Aman@12345");
			
			driver.findElement(By.className("android.widget.Button")).click();
			

			try {
				Thread.sleep(1000);
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
			
			

		}
	@Test(priority=2)
	public void addFriend() throws InterruptedException
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search tournaments and people']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/search_button")).click();//sendKeys("sukrut");
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/search_src_text")).sendKeys("Amanullah");
		
		Thread.sleep(3000);

		driver.findElement(By.id("com.avercast.fanbuku_app:id/ib_SearchTournamentForwardArrow")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnAddFriend")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/dialogBtnAddFriend")).click();
		
		Thread.sleep(3000);

		driver.navigate().back();
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/imageview_hamburger")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/tvProfileSetting")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnProfileViewFriendList")).click();
		
		Thread.sleep(3000);
	}

}

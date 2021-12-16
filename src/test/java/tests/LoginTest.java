package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTest {
	
	static AppiumDriver<MobileElement>driver;
	@BeforeTest
	public static void openFanbuku() throws MalformedURLException
	{
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("Device Name", "M2003J15SC");
		cap.setCapability("udid", "205a78720409");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.avercast.fanbuku_app");
		cap.setCapability("appActivity", "com.avercast.fanbuku_app.activity.SplashScreenActivity");//activity.MainActivity");//activity.LoginActivity");// - Calculator
		
		URL url=new URL("http://192.168.1.3:4723/wd/hub");//http://localhost:4723/wd/hub
		driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started........");
		try {
		Thread.sleep(6000);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=7)
	public void login()
	{
		//driver.findElement(By.className("android.widget.EditText")).click();
		driver.findElement(By.className("android.widget.EditText")).clear();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("username");
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("password");
		driver.findElement(By.className("android.widget.Button")).click();
		
		
		

		driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_enter")).click();
		


	}
	
	@Test(priority=6)
	public void loginInvalidUser()
	{
		driver.findElement(By.className("android.widget.EditText")).clear();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("username");
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("password");
		driver.findElement(By.className("android.widget.Button")).click();
		
	}
	
	@Test(priority=5)
	public void loginInvalidPass()
	{
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("username");
	
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("password");
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	@Test(priority=4)
	public void loginInvalid()
	{
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("username");
	
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("password");
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	@Test(priority=3)
	public void loginPassBlank()
	{
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("username");
	
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("");
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	@Test(priority=2)
	public void loginUserBlank()
	{
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("");
	
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("password");
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	@Test(priority=1)
	public void loginBlank()
	{
	driver.findElement(By.className("android.widget.EditText")).clear();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("");
	
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).click();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).clear();
	driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("");
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	
}

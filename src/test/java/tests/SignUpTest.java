package tests;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpTest {
	
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
		
		URL url=new URL("http://192.168.1.3:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started........");
		try {
		Thread.sleep(6000);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void signUp() throws InterruptedException
	{
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/create_account")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("android.widget.EditText")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("vishal");
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Ansari");
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("ansari0682@gmail.com");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='+1']")).click();;
		driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();;
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_phone_no_sign_up")).sendKeys("7903811240");
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("Amanullah@786");

		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnCreateAccountOne")).click();

		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("03-04-1998");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Male']")).click();
		//driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='0']")).click();
		driver.findElement(By.id("android:id/text1")).click();

		//driver.findElement(By.xpath("//android.widget.CheckBox[@index='0']")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();



	}

}

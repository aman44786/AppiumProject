package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement>driver;
	
	@BeforeTest
	public void setUp()
	{
		try
		{
		DesiredCapabilities cap=new DesiredCapabilities();

		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "M2003J15SC");
		cap.setCapability(MobileCapabilityType.UDID, "205a78720409");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url=new URL("http://192.168.1.3:4723/wd/hub");

		driver=new AppiumDriver<MobileElement>(url,cap);
		

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	@Test
	public void sampleTest()
	{
		System.out.println("I am in the inside");
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}

}

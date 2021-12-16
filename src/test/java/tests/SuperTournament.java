package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SuperTournament {

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
	public void superTour() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnSuperTournament")).click();

//		Thread.sleep(3000);
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/addSuperTournament")).click();
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/editSuperBracketName")).sendKeys("Aman");
//		
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/create_bracket_btn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/ib_admin_edit")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='MidWest']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MidWest']")).click();
		

		Thread.sleep(5000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_one_textView")).click();
		Thread.sleep(5000);
		

		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_Two_textView")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='UNLV']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='Northern Iowa']")).click();
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='Michigan State']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='New Mexico State']")).click();
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='Maryland']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='Houston']")).click();
		Thread.sleep(5000);
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,360)");
		
		MobileElement listItem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"UCSB\"))"));


//		String st="UCSB";
//		 WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+st+"\").instance(0))"));
//		   element.click();
//		MobileElement element= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
//		         ".scrollIntoView(new UiSelector().text(\"UCSB\"))"));
//		 

		driver.findElement(By.xpath("//android.widget.TextView[@text='Tennesse']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='San Diego State']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='Georgetown']")).click();
		Thread.sleep(5000);
		

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio']")).click();
		Thread.sleep(5000);
		

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Oklahoma State']")).click();
		Thread.sleep(5000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='Richmond']")).click();
		Thread.sleep(5000);
		

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio State']")).click();
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='UCSB']")).click();
		Thread.sleep(5000);
		

		//MobileElement listItem1=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"UNLV\"))"));
		
		//element.click();
//		Thread.sleep(4000);
//		WebElement a1 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,638][343,748]']"));
//		a1.click();
//		System.out.println(a1.getText()); 
//	
//		
//		Thread.sleep(4000);
//		WebElement a2 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,886][343,996]']"));
//		a2.click();
//		System.out.println(a2.getText()); 
//		
//		
//		Thread.sleep(4000);
//		WebElement a3 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,1024][343,1134]']"));
//		a3.click();
//		System.out.println(a3.getText()); 
//		
//		
//		Thread.sleep(4000);
//		WebElement a4 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,1272][343,1382]']"));
//		a4.click();
//		System.out.println(a4.getText()); 
//		
//		
//		Thread.sleep(4000);
//		WebElement a5 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,1410][343,1520]']"));
//		a5.click();
//		System.out.println(a5.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a6 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,1658][343,1768]']"));
//		a6.click();
//		System.out.println(a6.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a7= driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,1796][343,1906]']"));
//		a7.click();
//		System.out.println(a7.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a8 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[68,2044][343,2110]']"));
//		a8.click();
//		System.out.println(a8.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a9 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a9.click();
//		System.out.println(a9.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a10 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a10.click();
//		System.out.println(a10.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a11 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a11.click();
//		System.out.println(a11.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a12 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a12.click();
//		System.out.println(a12.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a13 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a13.click();
//		System.out.println(a13.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a14 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a14.click();
//		System.out.println(a14.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a15 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a15.click();
//		System.out.println(a15.getText()); 
//		
//		
//		Thread.sleep(5000);
//		WebElement a16 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//		a16.click();
//		System.out.println(a16.getText()); 
//		
		
		
	}
}




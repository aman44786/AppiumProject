package tests;


import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




public class CreateTournament {
	
	static AppiumDriver<MobileElement>driver;

	
	
@BeforeTest
public void createTour() throws MalformedURLException
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
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("ansari0682@gmail.com");
		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_password")).sendKeys("Amanullah@786");
		
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
public void createTournament()
	{

		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.id("com.avercast.fanbuku_app:id/img_tour_home")).click();
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 

			 
			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_next")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.id("com.avercast.fanbuku_app:id/btn_next")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.id("com.avercast.fanbuku_app:id/iv_create_bracket")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

			driver.findElement(By.id("com.avercast.fanbuku_app:id/et_tournamentName")).click();
		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_tournamentName")).sendKeys("newtour");

		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnCreateTournament")).click();
 

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.navigate().back();
		driver.navigate().back();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

//	
//@Test(priority=3)
//public void createBrackets()
//		{
//	   driver.findElement(By.xpath("//*[@id='img_bracket_home']")).click();
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	
//		driver.findElement(By.xpath("//*[@id='iv_create_bracket']")).click();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@text='Amant']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id='et_bracket_name']")).sendKeys("demo");
//		driver.findElement(By.xpath("//*[@text='CREATE']")).click();
//
//
////		 driver.findElement(By.xpath("//*[@text='Brackets']")).click();
////	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='iv_create_bracket']")));
////	        driver.findElement(By.xpath("//*[@id='iv_create_bracket']")).click();
////	        driver.findElement(By.xpath("//*[@text='MyNewTournament']")).click();
////	        driver.swipe(657, 992, 657, 346, 695);
////	        driver.swipe(657, 830, 657, -138, 857);
////	        driver.swipe(657, 992, 657, 507, 775);
////	        driver.swipe(657, 992, 657, -300, 836);
////	        driver.swipe(657, 1638, 657, 1800, 573);
////	        driver.findElement(By.xpath("//*[@text='Amant']")).click();
////	        driver.findElement(By.xpath("//*[@id='et_bracket_name']")).sendKeys("chess");
////	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CREATE']")));
////	        driver.findElement(By.xpath("//*[@text='CREATE']")).click();
//	    
//
//		
////		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Progress Bar\").instance(0))";
////
////		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator(scrollElement).click();
//		
//		
//		
//		
//		
//		//driver.findElement(By.id("com.avercast.fanbuku_app:id/img_bracket_home")).click();
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/bracket_icon_next")).click();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/iv_create_bracket")).click();
//
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.id("android:id/text1")).click();
//		
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		AndroidElement list=(AndroidElement) driver.findElement(By.id("android:id/text1"));
//		
//		MobileElement listItem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector()").name("Amant"));
//
//					listItem.click();
//		
//		
////		WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(Amant).instance(0))" ));
////		  element.click();
//		
//		
//		//driver.findElement(By.xpath("//android.widget.TextView[@text='MyNewTournament']")).click();
////        driver.swipe(657, 992, 657, 346, 695);
////        driver.swipe(657, 830, 657, -138, 857);
////        driver.swipe(657, 992, 657, 507, 775);
////        driver.swipe(657, 992, 657, -300, 836);
////        driver.swipe(657, 1638, 657, 1800, 573);
////        driver.findElement(By.xpath("//android.widget.TextView[@text='Amant']")).click();
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//
//
//		
//		driver.findElement(By.className("android.widget.TextView")).click();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/et_bracket_name")).sendKeys("Aman brack");
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/btnCreateBracket")).click();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/iv_more_option")).click();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		driver.findElement(By.id("com.avercast.fanbuku_app:id/content")).click();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.id("android:id/text1")).click();
//
//
//		}
@Test(priority=3)
public void createBracket() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.findElement(By.id("com.avercast.fanbuku_app:id/img_bracket_home")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@text='NEXT']")).click();
	Thread.sleep(2000);
    driver.findElement(By.id("com.avercast.fanbuku_app:id/iv_create_bracket")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("com.avercast.fanbuku_app:id/tournamentListSpinner")).click();
    Thread.sleep(1000);
    String item="newtour";
    WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+item+"\").instance(0))"));
    element.click();
    Thread.sleep(1000);
    driver.findElement(By.id("com.avercast.fanbuku_app:id/et_bracket_name")).sendKeys("demo1");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@text='CREATE']")).click();
	
	
	driver.findElement(By.id("android:id/text1")).click();
	
	 String item1="newtour";
	    WebElement element1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+item1+"\").instance(0))"));
	    element1.click();
	    
		driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("android:id/text1")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("android:id/text1")).click();
		
		//Thread.sleep(1000);
		
		//android.widget.ImageButton[@bounds='[9,288][144,318]']

		

	}
@Test(priority=4)
	public void FirstQuad() throws InterruptedException
	{
	
//	Thread.sleep(2000);
//	WebElement a1 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a1.click();
//	Thread.sleep(8000);
//	a1.click();
//	Thread.sleep(8000);
//	System.out.println(a1.getText()); 
//
//	WebElement a2 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,829][335,939]']"));
//	a2.click();
//	Thread.sleep(5000);
//	a2.click();
//	Thread.sleep(5000);
//	System.out.println(a2.getText()); 
//	
//	
//	WebElement a3 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,967][335,1077]']"));
//	a3.click();
//	Thread.sleep(5000);
//	a3.click();
//	Thread.sleep(5000);
//	System.out.println(a3.getText()); 
//	
//	WebElement a4 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,1215][335,1325]']"));
//	a4.click();
//	Thread.sleep(5000);
//	a4.click();
//	Thread.sleep(5000);
//	System.out.println(a4.getText()); 
//	
//	WebElement a5 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,1353][335,1463]']"));
//	a5.click();
//	Thread.sleep(5000);
//	a4.click();
//	Thread.sleep(5000);
//	System.out.println(a5.getText()); 
//	
//	WebElement a6 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,1601][335,1711]']"));
//	a6.click();
//	Thread.sleep(5000);
//	a4.click();
//	Thread.sleep(5000);
//	System.out.println(a6.getText()); 
//	
//	WebElement a7= driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,1739][335,1849]']"));
//	a7.click();
//	Thread.sleep(5000);
//	a4.click();
//	Thread.sleep(5000);
//	System.out.println(a7.getText()); 
//	
//	WebElement a8 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,1987][335,2097]']"));
//	a8.click();
//	Thread.sleep(5000);
//	a4.click();
//	Thread.sleep(5000);
//	System.out.println(a8.getText()); 
//	
//	WebElement a9 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a9.click();
//	System.out.println(a9.getText()); 
//	
//	WebElement a10 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a10.click();
//	System.out.println(a10.getText()); 
//	
//	WebElement a11 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a11.click();
//	System.out.println(a11.getText()); 
//	
//	WebElement a12 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a12.click();
//	System.out.println(a12.getText()); 
//	
//	WebElement a13 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a13.click();
//	System.out.println(a13.getText()); 
//	
//	WebElement a14 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a14.click();
//
//	System.out.println(a14.getText()); 
//	
//	WebElement a15 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a15.click();
//	System.out.println(a15.getText()); 
//	
//	WebElement a16 = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[60,581][335,691]']"));
//	a16.click();
//	System.out.println(a16.getText()); 
//	
	
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_one_textView")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_one_textView")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_Two_textView")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.avercast.fanbuku_app:id/cell_one_team_Two_textView")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='UNLV']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='UNLV']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Northern Iowa']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Northern Iowa']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Michigan State']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Michigan State']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='New Mexico State']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='New Mexico State']")).click();
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='Maryland']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Maryland']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Houston']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Houston']")).click();
		Thread.sleep(5000);

		//String st="UCSB";
		 //WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+st+"\").instance(0))"));
		   //element.click();
		 

		driver.findElement(By.xpath("//android.widget.TextView[@text='Tennesse']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Tennesse']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='San Diego State']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='San Diego State']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Georgetown']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Georgetown']")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio']")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Oklahoma State']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Oklahoma State']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Richmond']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Richmond']")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio State']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Ohio State']")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='UCSB']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='UCSB']")).click();
		Thread.sleep(5000);


	}


	}

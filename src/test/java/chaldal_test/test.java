package chaldal_test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test {

	public static AppiumDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException  
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\Desktop\\apk\\com.chaldal.poached_2022-05-31.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");

		driver=new AppiumDriver<MobileElement>(url,cap);
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public void test_por() throws InterruptedException {


		//app update required button click
		driver.findElement(By.id("android:id/button2")).click();

		// click on chaldal without browsering
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Chaldal\")")).click();

		//click on one time button
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		Thread.sleep(3000);

		//click search button
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search\")")).click();
		Thread.sleep(3000);

		//	Search Products using keyboard
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search Products\")")).sendKeys("toothbrush");

		driver.navigate().back();
		Thread.sleep(3000);


		Thread.sleep(3000);

		//Create an object of android  actions class
		AndroidTouchAction ta=new AndroidTouchAction(driver);

		Dimension dimension=driver.manage().window().getSize();

		int start_x=(int) (dimension.width)/2;
		int start_y=(int) (dimension.height*8)/9;

		int end_x=(int) (dimension.width)/2;
		int end_y=(int) (dimension.height)/9;

		ta.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(2000); 

		//	Dabur Red Toothpaste (Free Toothbrush)	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dabur Red Toothpaste (Free Toothbrush)\")")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("android.view.ViewGroup")).click();
		//		




		// click on + button for increasing items
		Thread.sleep(1000);
		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup").click();

		Thread.sleep(1000);


		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup").click();

		driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup").click();
		//Close
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Close\")")).click();

		//tab on cart button

		Thread.sleep(3000);

		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"৳254\")")).click();
		Thread.sleep(3000);

		// click on + button for decreasing items

		Thread.sleep(1000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
		//close 
		Thread.sleep(1000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
		//close 
		Thread.sleep(1000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup").click();
		//close 
		Thread.sleep(3000);
		//print Nothing to see here
		Thread.sleep(2000);
		System.out.println("Verifying Text: "+driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Nothing to see here\")")).getText());
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Nothing to see here\")")).getText();




	}


}

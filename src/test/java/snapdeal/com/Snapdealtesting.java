package snapdeal.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Snapdealtesting {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability("udid", "HT73F0202135");
		cp.setCapability("deviceName", "Google Pixel XL");
		cp.setCapability("platformName", "Android");
		cp.setCapability("platformVersion", "10.0");
		cp.setCapability("appPackage", "com.snapdeal.main");
		cp.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivityDefault");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cp);
	//	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	//	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	//	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	//	driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
		
		
		
		
		
		
		
	}
}

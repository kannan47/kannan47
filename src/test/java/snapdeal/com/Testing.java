package snapdeal.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Testing {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilites = new  DesiredCapabilities();
		capabilites.setCapability("udid", "HT73F0202135");
		capabilites.setCapability("deviceName", "Google Pixel XL");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("platformVersion", "10.0");
		capabilites.setCapability("appPackage", "com.snapdeal.main");
		capabilites.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivityDefault");
		
		URL rel = new URL("http://localhost:4723/wp/hub");
		
		driver = new AppiumDriver<MobileElement>(rel,capabilites);
	}
	
	
}

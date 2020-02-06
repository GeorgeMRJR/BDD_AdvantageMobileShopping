package br.com.rsinet.HUB_BDD.suporte;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Driver {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
		return (driver == null) ? criarDriver() : driver;
	}

	private static AndroidDriver<MobileElement> criarDriver() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.Advantage.aShopping");
		desiredCapabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriverWait getWait() {
		return new WebDriverWait(driver, 10);
	}

	public static void fecharDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}

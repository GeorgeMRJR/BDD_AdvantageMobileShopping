package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import br.com.rsinet.HUB_BDD.suporte.Driver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

//	public BasePage(WebDriver driver) {
//	}

//	public static void scrollAndClick(AndroidDriver driver, String visibleText) {
//		driver.findElementByAndroidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
//						+ visibleText + "\").instance(0))")
//				.click();
//	}
//
	public void scrollToText(AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}

	public void clickToText(AndroidDriver driver, String visibleText) {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")"))
				.click();
	}

	public WebElement elementToText(AndroidDriver driver, String visibleText) {
		return driver
				.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")"));
	}

	public void scroll(double inicio, double fim) throws MalformedURLException {
		Dimension size = Driver.getDriver().manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		(new TouchAction<>(Driver.getDriver())).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();

	}

}

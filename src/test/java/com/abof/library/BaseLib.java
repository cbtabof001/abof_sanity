/***********************************************************************
* @author 			:		Srinivas Hippargi,Raghukiran,Prerana Bhatt
* @description		: 		TestNG annotated methods with launching app and closing app,
* 							common methods usable in all page class
*/
package com.abof.library;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.abof.pageobjects.BrowsePlpPdpPO;
import com.abof.pageobjects.ShoppingBagPO;
import com.google.common.base.Function;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class BaseLib {
	public static AndroidDriver driver;
	public AppiumDriverLocalService services;
	static public String sDirPath = System.getProperty("user.dir");
	public String apkpath = sDirPath + "/abof.apk";
	public String abofSitApkPath = sDirPath + "/abofsit.apk";
	public File abofSitFile = new File(abofSitApkPath);
	public String abofProdApkPath = sDirPath + "/abofprod.apk";
	public File abofProdFile = new File(abofProdApkPath);
	public static String sTestDataFile = sDirPath + "/Abof.xlsx";
	public static String sConfigFile = sDirPath + "/Config.Properties";
	public static String FB = GenericLib.getCongigValue(sConfigFile, "FBPackage");
	DesiredCapabilities capabilities;
	static WebElement wElement;
	static Dimension dSize;
	Wait wait;
	static int sStatusCnt = 0;

	/*
	 * @author:Srinivas Hippargi Description:Desired capabilities to launch app
	 */
	@Parameters("Env")
	@BeforeClass
	public void setUp(String env) throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				GenericLib.getCongigValue(sConfigFile, "AutomationName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				GenericLib.getCongigValue(sConfigFile, "PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				GenericLib.getCongigValue(sConfigFile, "PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				GenericLib.getCongigValue(sConfigFile, "DeviceName"));
		if (env.equalsIgnoreCase("SIT")) {
			capabilities.setCapability("app", abofSitFile.getAbsolutePath());
		} else {
			capabilities.setCapability("app", abofProdFile.getAbsolutePath());
		}
		capabilities.setCapability("appPackage", GenericLib.getCongigValue(sConfigFile, "AbofPackage"));
		capabilities.setCapability("appActivity", GenericLib.getCongigValue(sConfigFile, "AbofActivity"));
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", false);
		//capabilities.setCapability("autoWebview", true);
		driver = new AndroidDriver(new URL(GenericLib.getCongigValue(sConfigFile, "AppiumServer_Url")), capabilities);
		NXGReports.setWebDriver(driver);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	/*
	 * @author:Srinivas Hippargi Description:Explicit wait for element to load
	 */
	public static void waitForElement(WebElement ele, String expResult, String actResult) {
		Wait<AndroidDriver> wait = new FluentWait<AndroidDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MICROSECONDS).ignoring(NoSuchElementException.class);
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(ele)) != null, actResult);
		NXGReports.addStep(expResult, LogAs.PASSED, null);
	}
	/*
	 * @author:Srinivas Hippargi Description:swipe Right to left,Left to
	 * right,Bottom to top,Top to bottom for elements
	 */

	public static void swipeRightToLeft(double startX, double endX) {
		dSize = driver.manage().window().getSize();
		int startx = (int) (dSize.width * startX);
		int endx = (int) (dSize.width * endX);
		int starty = dSize.height / 2;
		driver.swipe(startx, starty, endx, starty, 3000);
	}

	public static void swipeLeftToRight(double startX, double endX) {
		dSize = driver.manage().window().getSize();
		int startx = (int) (dSize.width * startX);
		int endx = (int) (dSize.width * endX);
		int starty = dSize.height / 2;
		driver.swipe(endx, starty, startx, starty, 3000);
	}

	public static void swipeBottomToTop(double startY, double endY) {
		dSize = driver.manage().window().getSize();
		int starty = (int) (dSize.height * startY);
		int endy = (int) (dSize.height * endY);
		int startx = dSize.width / 2;
		driver.swipe(startx, starty, startx, endy, 3000);
	}

	public static void swipeTopToBottm(double startY, double endY) {
		dSize = driver.manage().window().getSize();
		int starty = (int) (dSize.height * startY);
		int endy = (int) (dSize.height * endY);
		int startx = dSize.width / 2;
		driver.swipe(startx, starty, startx, endy, 3000);
	}

	/*
	 * @author:Srinivas Hippargi Description: handles webwiew and native_app
	 * mode
	 */
	public static void switchToView() {
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			if (contextName.contains("NATIVE_APP")) {
				driver.context(contextName);
				System.out.println(contextName);
			} else {
				driver.context(contextName);
				System.out.println(contextName);
			}
		}
	}

	/*
	 * @author:Srinivas Hippargi Description:verifies toast message displayed or
	 * not
	 */
	public static String verifyToastMessage(AppiumDriver driver) throws IOException {
		String result = null;
		File scfile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scfile, new File("C:\\Users\\Administrator\\git\\abof\\screen.png"));
		ITesseract instance = new Tesseract();
		try {
			result = instance.doOCR(scfile);
		} catch (TesseractException e) {
		}
		return result;
	}

	/*
	 * @author:Srinivas Hippargi Description:Scroll to exact webelement
	 */
	public static void scrollToElement(int maxScroll, String scrollType, double start, double end, WebElement element) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		while (maxScroll != 0) {
			try {
				if (element.isDisplayed()) {
					// element.click();
					maxScroll++;
					break;
				}

			} catch (Exception e) {
				switch (scrollType.toUpperCase()) {
				case "UP":
					swipeBottomToTop(start, end);
					break;

				case "DOWN":
					swipeTopToBottm(start, end);
					break;

				case "LEFT":
					swipeRightToLeft(start, end);
					break;

				case "RIGHT":
					swipeLeftToRight(start, end);
					break;

				default:
					NXGReports.addStep("Scroll to element", LogAs.INFO, null);
					break;
				}
			}
			maxScroll--;
		}

	}

	/*
	 * @author:Prerana Bhatt Description:check the list of webelemnts.
	 */
	public void navigateBackToHomePage() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		BrowsePlpPdpPO browsePlpPdpPo = new BrowsePlpPdpPO(driver);
		ShoppingBagPO shoppingbagpo = new ShoppingBagPO(driver);
		try {

			while (browsePlpPdpPo.getEleBackBtn().isDisplayed() == true) {
				browsePlpPdpPo.getEleBackBtn().click();
			}
		} catch (Exception e) {
			shoppingbagpo.getEleCloseIcon().click();
			shoppingbagpo.getEleAllowBtn().click();
		}
	}

	/*
	 * @author:Prerana Bhatt Description:Check the element status whether it is
	 * displayed,enabled or selected
	 */
	public static void elementStatus(WebElement element, String elementName, String checkType)

	{
		switch (checkType) {
		case "displayed":
			try {
				element.isDisplayed();
				NXGReports.addStep(elementName + " is displayed", LogAs.PASSED, null);
			} catch (Exception e) {
				sStatusCnt++;
				NXGReports.addStep(elementName + " is not displayed", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			break;
		case "enabled":
			try {
				element.isEnabled();
				NXGReports.addStep(elementName + " is enabled", LogAs.PASSED, null);
			} catch (Exception e) {
				sStatusCnt++;
				NXGReports.addStep(elementName + " is not enabled", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			break;
		case "selected":
			try {
				element.isSelected();
				NXGReports.addStep(elementName + " is selected", LogAs.PASSED, null);
			} catch (Exception e) {
				sStatusCnt++;
				NXGReports.addStep(elementName + " is not selected", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			break;
		}
	}

	public void visibilityOfElementWait(WebElement webElement, String elementName) {
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		} catch (Exception e) {
			NXGReports.addStep(elementName + " is not Visible", LogAs.FAILED, null);
		}
	}

	/*
	 * @author:Prerana Bhatt Description:check the list of webelemtns.
	 */
	public static void IsListDisplayed(List lst, String lstName) {
		try {
			if (lst.size() > 0) {
				NXGReports.addStep(lstName + " List is displayed", LogAs.PASSED, null);
			}
		} catch (Exception e) {
			NXGReports.addStep(lstName + " List is not displayed", LogAs.FAILED, null);
		}

	}

	public static void handleNavigation(WebElement ele) throws InterruptedException {
		while (!ele.isDisplayed()) {
			driver.navigate().back();
		}
	}

	public static void tapOnElement(double x, double y) throws InterruptedException {
		Thread.sleep(5000);
		dSize = driver.manage().window().getSize();
		int sx1 = driver.manage().window().getSize().getWidth();
		int sx2 = driver.manage().window().getSize().getHeight();
		int sX = (int) (dSize.width * x);
		int sY = (int) (dSize.height * y);
		driver.tap(1, sX, sY, 1);
	}

	public static void waitforElement(AndroidDriver driver, WebElement ele, String actResult) {

		
	}

	@AfterMethod
	public void restapp() {
		driver.resetApp();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

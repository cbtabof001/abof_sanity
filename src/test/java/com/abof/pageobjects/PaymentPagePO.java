/***********************************************************************
* @author 			:		RaghuKiram MR
* @description		: 		Page objects and re-usbale methods for Payment screen
* @module			:		Payment
* @reusable methods : 		paymentOption(),checkPaymentMethod(),addPayemntDetails(),selectMonthYear()
*/
package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.abof.library.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaymentPagePO {
	AndroidDriver driver;
	String sData[] = null;

	public PaymentPagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']//android.widget.TextView")
	private List<WebElement> eleAmountDetails;

	public List<WebElement> getEleAmountDetails() {
		return eleAmountDetails;
	}
	
	@FindBy(id="com.abof.android:id/edtCardNo")
	private WebElement eleEditCardNoTxtBox;
	public WebElement getEleEditCardNoTxtBox(){
		return eleEditCardNoTxtBox;
	}

	@FindBy(id = "com.abof.android:id/txtOtherPayment")
	private WebElement elePaymentMethodText;

	public WebElement getElePaymentMethodText() {
		return elePaymentMethodText;
	}

	@FindBy(id = "com.abof.android:id/layDebitCard")
	private WebElement eleDebitCardOption;

	public WebElement getEleDebitCardOption() {
		return eleDebitCardOption;
	}

	@FindBy(id = "com.abof.android:id/layCreditCard")
	private WebElement eleCreditCardOption;

	public WebElement getEleCreditCardOption() {
		return eleCreditCardOption;
	}

	@FindBy(id = "com.abof.android:id/layNetBanking")
	private WebElement eleNetBankingOption;

	public WebElement getEleNetBankingOption() {
		return eleNetBankingOption;
	}

	@FindBy(id = "com.abof.android:id/layWallet")
	private WebElement eleWalletOption;

	public WebElement getEleWalletOption() {
		return eleWalletOption;
	}

	@FindBy(id = "com.abof.android:id/layCashOnDelivery")
	private WebElement eleCashOnDeliveryOption;

	public WebElement getEleCashOnDeliveryOption() {
		return eleCashOnDeliveryOption;
	}

	@FindBy(id = "com.abof.android:id/layOrderSummary")
	private WebElement eleOrderSummaryOption;

	public WebElement getEleOrderSummaryOption() {
		return eleOrderSummaryOption;
	}

	@FindBy(id = "com.abof.android:id/txtAddressDetails")
	private WebElement eleAddressDetailsTxt;

	public WebElement getEleAddressDetailsTxt() {
		return eleAddressDetailsTxt;
	}

	@FindBy(id = "com.abof.android:id/pay_securely_btn")
	private WebElement elePaymentPayBtn;

	public WebElement getElePaymentPayBtn() {
		return elePaymentPayBtn;
	}

	@FindBy(id = "com.abof.android:id/edtCardExpMonth")
	private WebElement eleExpiryMonthTxtBox;

	public WebElement getEleExpiryMonthTxtBox() {
		return eleExpiryMonthTxtBox;
	}

	@FindBy(id = "com.abof.android:id/txtValue")
	private WebElement eleSelectMothBtn;

	public WebElement getEleSelectMothBtn() {
		return eleSelectMothBtn;
	}

	@FindBy(id = "com.abof.android:id/edtCardExpYear")
	private WebElement eleExpiryYearTxtBox;

	public WebElement getEleExpiryYearTxtBox() {
		return eleExpiryYearTxtBox;
	}

	@FindBy(id = "com.abof.android:id/edtCardName")
	private WebElement eleCardNameTxtBox;

	public WebElement getEleCardNameTxtBox() {
		return eleCardNameTxtBox;
	}

	@FindBy(id = "com.abof.android:id/txtValue")
	private WebElement eleExpiryYearBtn;

	public WebElement getEleExpiryYearBtn() {
		return eleExpiryYearBtn;
	}

	@FindBy(id ="com.abof.android:id/edtCVVNo")
	private WebElement eleCVVNoTxtBox;

	public WebElement getEleCVVNoTxtBox() {
		return eleCVVNoTxtBox;
	}

	@FindBy(xpath = "//android.view.View[@text='This is just a demo bank page.']")
	private WebElement eleRazorpayDemoPageTxt;

	public WebElement getEleRazorpayDemoPageTxt() {
		return eleRazorpayDemoPageTxt;
	}

	@FindBy(xpath = "//android.widget.Button[@index='0']")
	private WebElement eleRazorpaySuccessBtn;

	public WebElement getEleRazorpaySuccessBtn() {
		return eleRazorpaySuccessBtn;
	}

	@FindBy(xpath = "//android.widget.Button[@index='1']")
	private WebElement eleRazorpayCancelBtn;

	public WebElement getEleRazorpayCancelBtn() {
		return eleRazorpayCancelBtn;
	}

	@FindBy(id = "com.abof.android:id/rate_it_now")
	private WebElement eleRateItNowBtn;

	public WebElement getEleRateItNowBtn() {
		return eleRateItNowBtn;
	}

	@FindBy(id = "com.abof.android:id/do_later")
	private WebElement eleIWillDoItLaterBtn;

	public WebElement getEleIWillDoItLaterBtn() {
		return eleIWillDoItLaterBtn;
	}

	@FindBy(id = "com.abof.android:id/txtThankYou")
	private WebElement eleThankYouTxt;

	public WebElement getEleThankYouTxt() {
		return eleThankYouTxt;
	}

	@FindBy(id = "com.abof.android:id/txtOrderText")
	private WebElement eleOrderText;

	public WebElement getEleOrderText() {
		return eleOrderText;
	}

	@FindBy(id = "com.abof.android:id/txtOrderDetails")
	private WebElement eleOrderDetailsText;

	public WebElement getEleOrderDetailsText() {
		return eleOrderDetailsText;
	}

	@FindBy(id = "com.abof.android:id/txtPaymentDetails")
	private WebElement elePaymentDetailsText;

	public WebElement getElePaymentDetailsText() {
		return elePaymentDetailsText;
	}

	@FindBy(id = "com.abof.android:id/confirm_btn")
	private WebElement eleContinueShoppingBtn;

	public WebElement getEleContinueShoppingBtn() {
		return eleContinueShoppingBtn;
	}
	@FindBy(id="com.abof.android:id/title")
	private WebElement eletitleCardOption;
	public WebElement getEletitleCardOption(){
		return eletitleCardOption;
	}
	
	@FindBy(id="com.abof.android:id/edtCardNo")
	private WebElement eleCardNoTextBox;
	public WebElement getEleCardTextBox(){
		return eleCardNoTextBox;
	}
	
	@FindBy(id="com.abof.android:id/saveCard")
	private WebElement eleCheckBoxSaveCard;
	public WebElement getEleCheckBoxSaveCard(){
		return eleCheckBoxSaveCard;
	}
	
	@FindBy(id="com.abof.android:id/chkProSavedCard")
	private WebElement eleRadioButtonSaveCard;
	public WebElement getEleRadioButtonSaveCard()
	{
		return eleRadioButtonSaveCard;
	}
	
	@FindBy(id="com.abof.android:id/cardImage")
	private WebElement eleCardImage;
	public WebElement getEleCardImage(){
		return eleCardImage;
	}
	@FindBy(id="com.abof.android:id/txtSavedCard")
	private WebElement eleSavedCardSectionTxt;
	public WebElement getEleSavedCardSectionTxt(){
		return eleSavedCardSectionTxt;
	}
	@FindBy(xpath="android.widget.LinearLayout[@index='2']//android.widget.TextView")
	private List<WebElement> eleCardDetails;
	public List<WebElement> getEleCardDetails(){
		return eleCardDetails;
	}
	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for paymentoption
	 */
	public void paymentoption() throws Exception {
		try {
				Thread.sleep(4000);			
				checkPaymentMethod();
			for (WebElement eleAmountdetails : getEleAmountDetails()) {
				Assert.assertTrue(eleAmountdetails.isDisplayed(),
						eleAmountdetails.getText() + "The amount details is not displayed");
				NXGReports.addStep(eleAmountdetails.getText() + " The amount details is  displayed", LogAs.PASSED,
						null);
			}
			BaseLib.elementStatus(getEleOrderSummaryOption(), "The OrderSummary text ", "displayed");
			getEleOrderSummaryOption().click();
			BaseLib.swipeBottomToTop(.90, .22);
			for (int i = 1; i <= 5; i++) {
				List<WebElement> Ordersummarydetails = driver.findElements(
						By.xpath("//android.widget.RelativeLayout[@index='" + i + "']//android.widget.TextView"));
				for (WebElement eleOrdersummarydetailstext : Ordersummarydetails) {
					Assert.assertTrue(eleOrdersummarydetailstext.isDisplayed(),
							eleOrdersummarydetailstext.getText() + " is dispalyed in the oder summary");
					NXGReports.addStep(eleOrdersummarydetailstext.getText() + "is dispalyed in the oder summary",
							LogAs.PASSED, null);
				}

			}
			BaseLib.elementStatus(getEleAddressDetailsTxt(), "The OrderSummary text ", "displayed");
			getEleAddressDetailsTxt().click();
			List<WebElement> AddressDetailsTxt = driver.findElements(By.xpath(
					"//android.widget.LinearLayout[@index='7']//android.widget.LinearLayout[@index='0']//android.widget.TextView"));
			for (WebElement eleAddressDetailsTxt : AddressDetailsTxt) {
				Assert.assertTrue(eleAddressDetailsTxt.isDisplayed(),
						eleAddressDetailsTxt.getText() + " is dispalyed in the Address Details text");
				NXGReports.addStep(eleAddressDetailsTxt.getText() + "is dispalyed in the Address Details text",
						LogAs.PASSED, null);
			}
			Thread.sleep(4000);
			BaseLib.swipeBottomToTop(.22, .90);
			Thread.sleep(4000);

		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for checkPaymentMethod
	 */
	public void checkPaymentMethod() throws InterruptedException {
		try {
			Thread.sleep(4000);
			BaseLib.swipeBottomToTop(.90, .22);
			Thread.sleep(4000);
			BaseLib.elementStatus(getEleDebitCardOption(), "The Debit Card Option ", "displayed");
			getEleDebitCardOption().click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleCreditCardOption(), "The Credit Card Option ", "displayed");
			getEleCreditCardOption().click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleNetBankingOption(), "The NetBanking  Option ", "displayed");
			getEleNetBankingOption().click();
			//driver.navigate().back();
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleWalletOption(), "The Wallet Option ", "displayed");
			getEleWalletOption().click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleCashOnDeliveryOption(), "The CashOnDelivery Option", "displayed");
			Thread.sleep(2000);
			getEleCashOnDeliveryOption().click();
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(2000);
		} catch (Exception e) {
			throw e;
		}

	}

	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for addpaymentdetails
	 */
	public void addpaymentdetailswithoutsSaveCard() throws Exception {
		try {
			sData = GenericLib.toReadExcelData("Login", "TC_PMT_001");
			LoginPagePO loginpo = new LoginPagePO(driver);
			Thread.sleep(2000);
			getEleDebitCardOption().click();
			BaseLib.elementStatus(getEleDebitCardOption(), "The Debit card textbox", "displayed");
			Thread.sleep(4000);
			getEleDebitCardOption().sendKeys(sData[2]);
			Thread.sleep(6000);
			loginpo.handleKeyboard();
			getEleExpiryMonthTxtBox().click();
			selectMothYear(sData[5], sData[6]);
			BaseLib.elementStatus(getEleCardNameTxtBox(), "The CardName Text box", "displayed");
			getEleCardNameTxtBox().sendKeys(sData[3]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getEleCVVNoTxtBox(), "The CVV number Text box", "displayed");
			getEleCVVNoTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			getElePaymentPayBtn().click();
			Thread.sleep(5000);
			//verifyContentPaymentThankYouMessage();
			
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for addpaymentdetailsWithSaveCard
	 */
	
	public void addpaymentdetailsWithSaveCard() throws Exception {
		try {
			sData = GenericLib.toReadExcelData("Login", "TC_PMT_001");
			LoginPagePO loginpo = new LoginPagePO(driver);
			Thread.sleep(2000);
			getEleDebitCardOption().click();
			//BaseLib.elementStatus(getEleDebitCardOption(), "The Debit card textbox", "displayed");
			Thread.sleep(4000);
			try{
			getEleDebitCardOption().sendKeys(sData[2]);
			}catch(Exception e){
				getEleEditCardNoTxtBox().sendKeys(sData[2]);
			}
			Thread.sleep(6000);
			loginpo.handleKeyboard();
			getEleExpiryMonthTxtBox().click();
			selectMothYear(sData[5], sData[6]);
			BaseLib.elementStatus(getEleCardNameTxtBox(), "The CardName Text box", "displayed");
			getEleCardNameTxtBox().sendKeys(sData[3]);
			loginpo.handleKeyboard();
			//BaseLib.elementStatus(getEleCVVNoTxtBox(), "The CVV number Text box", "displayed");
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='6']//android.widget.EditText[@resource-id='com.abof.android:id/edtCVVNo']")).sendKeys("123");
			//getEleCVVNoTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			getEleCheckBoxSaveCard().click();
			getElePaymentPayBtn().click();	
			Thread.sleep(5000);
		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for selectMothYear
	 */
	public void selectMothYear(String text, String value) throws Exception {
		try {

			WebElement Month = driver.findElement(By.xpath("//android.widget.TextView[@text='" + text + "']"));
			Month.click();
			Thread.sleep(3000);
			WebElement Year = driver.findElement(By.xpath("//android.widget.TextView[@text='" + value + "']"));
			Year.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			throw e;
		}
	}
	/*
	 * @author: RaghuKiran MR 
	 * Description: Method for savecard
	 */
	
	public void savecard() throws Exception{
		sData = GenericLib.toReadExcelData("Login", "TC_PMT_001");
		LoginPagePO loginpo = new LoginPagePO(driver);
		try{
			Thread.sleep(3000);
			BaseLib.elementStatus(getEleSavedCardSectionTxt(), "The SavedCardSection text", "displayed");
			BaseLib.elementStatus(getEleRadioButtonSaveCard(), "The Save card Radio button", "displayed");
			BaseLib.elementStatus(getEleCardImage(), "The Save card image", "displayed");
			for (WebElement eleCardDetails :getEleCardDetails()) {
				Assert.assertTrue(eleCardDetails.isDisplayed(),
						eleCardDetails.getText() + " is dispalyed in the card Details text");
				NXGReports.addStep(eleCardDetails.getText() + "is dispalyed in the card Details text",
						LogAs.PASSED, null);
			}
			getEleRadioButtonSaveCard().click();
			BaseLib.elementStatus(getEleCVVNoTxtBox(), "The CVV NO textbox", "displayed");
			getEleCVVNoTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getElePaymentPayBtn(), "The Payment pay button", "displayed");
			getElePaymentPayBtn().click();
			Thread.sleep(4000);
		}catch(Exception e){
			throw e;
		}
	}
	public void verifyContentPaymentThankYouMessage() throws Exception{
	try{
	
	BaseLib.elementStatus(getEleRazorpayDemoPageTxt(), "The RazorpayDemoPage text", "displayed");
	getEleRazorpaySuccessBtn().click();
	Thread.sleep(4000);
	BaseLib.elementStatus(getEleIWillDoItLaterBtn(), "The Will do later button", "displayed");
	BaseLib.elementStatus(getEleRateItNowBtn(), "The Rate it now button", "displayed");
	getEleIWillDoItLaterBtn().click();
	BaseLib.elementStatus(getEleThankYouTxt(), "The Thank You message text", "displayed");
	BaseLib.elementStatus(getEleOrderText(), "The Order message text", "displayed");
	BaseLib.elementStatus(getEleOrderDetailsText(), "The Order details text", "displayed");
	BaseLib.elementStatus(getElePaymentDetailsText(), "The Payment summary text", "displayed");
	BaseLib.swipeBottomToTop(.90, .22);
	BaseLib.elementStatus(getEleAddressDetailsTxt(), "The Address details text", "displayed");
	BaseLib.elementStatus(getEleContinueShoppingBtn(), "The continue shopping button", "displayed");
	Thread.sleep(4000);
	}catch(Exception e){
		throw e;
	}
		
	}
	
	public void creditcard() throws Exception{
		sData = GenericLib.toReadExcelData("Login", "TC_PMT_002");
		LoginPagePO loginpo = new LoginPagePO(driver);
		try{
			Thread.sleep(4000);
			getEleCreditCardOption().click();
			BaseLib.elementStatus(getEleEditCardNoTxtBox(), "The CardName Text box", "displayed");
			getEleEditCardNoTxtBox().sendKeys(sData[2]);
			loginpo.handleKeyboard();
			getEleExpiryMonthTxtBox().click();
			Thread.sleep(2000);
			selectMothYear(sData[5], sData[6]);
			BaseLib.elementStatus(getEleCardNameTxtBox(), "The CardName Text box", "displayed");
			getEleCardNameTxtBox().sendKeys(sData[3]);
			loginpo.handleKeyboard();
			Thread.sleep(4000);
			BaseLib.elementStatus(getEleCVVNoTxtBox(), "The CVV number Text box", "displayed");
			getEleCVVNoTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			getEleCheckBoxSaveCard().click();
			getElePaymentPayBtn().click();	
			Thread.sleep(4000);
		}catch(Exception e){
			throw e;
		}
	}

}

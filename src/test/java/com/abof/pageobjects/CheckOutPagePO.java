/***********************************************************************
* @author 			:		RaghuKiran MR
* @description		: 		Page objects and re-usbale methods for CheckOut screen
* @module			:		SavedCard
* @reusable methods : 		fillCheckOutDetails()
*/
package com.abof.pageobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.abof.library.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;

public class CheckOutPagePO {
	AndroidDriver driver;
	String sData[] = null;

	public CheckOutPagePO(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "com.abof.android:id/pincode")
	private WebElement elePincodeTxtBox;

	public WebElement getElePincodeTxtBox() {
		return elePincodeTxtBox;
	}

	@FindBy(id = "com.abof.android:id/rdbOffice")
	private WebElement eleOfficeRadioBtn;

	public WebElement getEleOfficeRadioBtn() {
		return eleOfficeRadioBtn;
	}

	@FindBy(id = "com.abof.android:id/rdbHome")
	private WebElement eleHomeRadioBtn;

	public WebElement getEleHomeRadioBtn() {
		return eleHomeRadioBtn;
	}

	@FindBy(id = "com.abof.android:id/state")
	private WebElement eleStateTxtBox;

	public WebElement getEleStateTxtBox() {
		return eleStateTxtBox;
	}

	@FindBy(id = "com.abof.android:id/city")
	private WebElement eleCityTxtBox;

	public WebElement getEleCityTxtBox() {
		return eleCityTxtBox;
	}

	@FindBy(id = "com.abof.android:id/first_name")
	private WebElement eleFirstNameTxtBox;

	public WebElement getEleFirstNameTxtBox() {
		return eleFirstNameTxtBox;
	}

	@FindBy(id = "com.abof.android:id/last_name")
	private WebElement eleLastNameTxtBox;

	public WebElement getEleLastNameTxtBox() {
		return eleLastNameTxtBox;
	}

	@FindBy(id = "com.abof.android:id/address")
	private WebElement eleAddressTxtBox;

	public WebElement getEleAddressTxtBox() {
		return eleAddressTxtBox;
	}

	@FindBy(id = "com.abof.android:id/landmark")
	private WebElement eleLandMarkTxtBox;

	public WebElement getEleLandMarkTxtBox() {
		return eleLandMarkTxtBox;
	}

	@FindBy(id = "com.abof.android:id/mobile_no")
	private WebElement eleMobileNoTxtBox;

	public WebElement getEleMobileNoTxtBox() {
		return eleMobileNoTxtBox;
	}

	@FindBy(id = "com.abof.android:id/continue_btn")
	private WebElement eleSaveContinueBtn;

	public WebElement getEleSaveContinueBtn() {
		return eleSaveContinueBtn;
	}

	@FindBy(id = "com.abof.android:id/select_address")
	private WebElement eleSelectAddressTxt;

	public WebElement getEleSelectAddressTxt() {
		return eleSelectAddressTxt;
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']//android.widget.RelativeLayout[@index='1']//android.widget.TextView")
	private List<WebElement> eleCheckOutAddressDetailsTxt;

	public List<WebElement> getEleCheckOutAddressDetailsTxt() {
		return eleCheckOutAddressDetailsTxt;
	}

	@FindBy(id = "com.abof.android:id/deliver_address")
	private WebElement eleDeliverAddressBtn;

	public WebElement getEleDeliverAddressBtn() {
		return eleDeliverAddressBtn;
	}

	@FindBy(id = "com.abof.android:id/edit")
	private WebElement eleCheckOutEditIcon;

	public WebElement getEleCheckOutEditIcon() {
		return eleCheckOutEditIcon;
	}

	@FindBy(id = "com.abof.android:id/delete")
	private WebElement eleCheckOutDeleteIcon;

	public WebElement getEleCheckOutDeleteIcon() {
		return eleCheckOutDeleteIcon;
	}

	@FindBy(id = "com.abof.android:id/add_new_address")
	private WebElement eleAddNewAddressIcon;

	public WebElement getEleAddNewAddressIcon() {
		return eleAddNewAddressIcon;
	}
	
	@FindBy(id="com.abof.android:id/alert_description")
	private WebElement eleAlertDescriptionTxt;
	public WebElement getEleAlertDescriptionTxt(){
		return eleAlertDescriptionTxt;
	}
	
	@FindBy(id="com.abof.android:id/cancel_btn")
	private WebElement eleShoppingCancelBtn;
	public WebElement getEleShoppingCancelbtn(){
		return eleShoppingCancelBtn;
	}
	
	@FindBy(id="com.abof.android:id/confirm_btn")
	private WebElement eleYesBtn;
	public WebElement getEleYesBtn(){
		return eleYesBtn;
	}
	
	/*
	*@author: RaghuKiran MR
	 *Description: Method for Fill checkout details 
	 */

	public void fillCheckOutDetails() {

		sData = GenericLib.toReadExcelData("Login", "TC_SC_001");
		LoginPagePO loginpo = new LoginPagePO(driver);

		try {
			getEleHomeRadioBtn().click();
			Assert.assertTrue(getElePincodeTxtBox().isDisplayed(),
					getElePincodeTxtBox().getText() + "The Pincode text is not displayed");
			NXGReports.addStep(getElePincodeTxtBox().getText() + " The Pincode text is displayed", LogAs.PASSED, null);
			Assert.assertTrue(getEleStateTxtBox().isDisplayed(),
					getEleStateTxtBox().getText() + "The State Text is not displayed");
			NXGReports.addStep(getEleStateTxtBox().getText() + " The State Text is displayed.", LogAs.PASSED, null);
			Assert.assertTrue(getEleCityTxtBox().isDisplayed(),
					getEleCityTxtBox().getText() + "The City Text is not displayed");
			NXGReports.addStep(getEleCityTxtBox().getText() + " The City Text is displayed.", LogAs.PASSED, null);
			BaseLib.swipeBottomToTop(.90, .22);
			BaseLib.elementStatus(getEleFirstNameTxtBox(), "The FirstName Textbox ", "displayed");
			getEleFirstNameTxtBox().sendKeys(sData[2]);
			BaseLib.elementStatus(getEleLastNameTxtBox(), "The LastName Textbox ", "displayed");
			getEleLastNameTxtBox().sendKeys(sData[3]);
			BaseLib.elementStatus(getEleAddressTxtBox(), "The Address Textbox ", "displayed");
			getEleAddressTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getEleLandMarkTxtBox(), "The LandMark Textbox ", "displayed");
			getEleLandMarkTxtBox().sendKeys(sData[5]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getEleMobileNoTxtBox(), "The MobileNumbers Textbox ", "displayed");
			getEleMobileNoTxtBox().sendKeys(sData[6]);
			loginpo.handleKeyboard();
			getEleSaveContinueBtn().click();

		} catch (RuntimeException e) {

			for (WebElement eleCheckOutAddressDetails : getEleCheckOutAddressDetailsTxt()) {
				Assert.assertTrue(eleCheckOutAddressDetails.isDisplayed(),
						eleCheckOutAddressDetails.getText() + "The CheckOutAddressDetails is not displayed");
				NXGReports.addStep(eleCheckOutAddressDetails.getText() + " The CheckOutAddressDetails is  displayed",
						LogAs.PASSED, null);
			}
			BaseLib.elementStatus(getEleDeliverAddressBtn(), "The DeliverAddress button", "displayed");
			BaseLib.elementStatus(getEleCheckOutEditIcon(), "The CheckOutEditIcon", "displayed");
			BaseLib.elementStatus(getEleCheckOutDeleteIcon(), "The CheckOutDeleteIcon", "displayed");
			BaseLib.elementStatus(getEleAddNewAddressIcon(), "The AddNewAddress icon", "displayed");
			getEleAddNewAddressIcon().click();
			Assert.assertTrue(getElePincodeTxtBox().isDisplayed(),
					getElePincodeTxtBox().getText() + "The Pincode text is not displayed");
			NXGReports.addStep(getElePincodeTxtBox().getText() + " The Pincode text is displayed", LogAs.PASSED, null);
			Assert.assertTrue(getEleStateTxtBox().isDisplayed(),
					getEleStateTxtBox().getText() + "The State Text is not displayed");
			NXGReports.addStep(getEleStateTxtBox().getText() + " The State Text is displayed.", LogAs.PASSED, null);
			Assert.assertTrue(getEleCityTxtBox().isDisplayed(),
					getEleCityTxtBox().getText() + "The City Text is not displayed");
			NXGReports.addStep(getEleCityTxtBox().getText() + " The City Text is displayed.", LogAs.PASSED, null);
			BaseLib.swipeBottomToTop(.90, .22);
			BaseLib.elementStatus(getEleFirstNameTxtBox(), "The FirstName Textbox ", "displayed");
			getEleFirstNameTxtBox().sendKeys(sData[2]);
			BaseLib.elementStatus(getEleLastNameTxtBox(), "The LastName Textbox ", "displayed");
			getEleLastNameTxtBox().sendKeys(sData[3]);
			BaseLib.elementStatus(getEleAddressTxtBox(), "The Address Textbox ", "displayed");
			getEleAddressTxtBox().sendKeys(sData[4]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getEleLandMarkTxtBox(), "The LandMark Textbox ", "displayed");
			getEleLandMarkTxtBox().sendKeys(sData[5]);
			loginpo.handleKeyboard();
			BaseLib.elementStatus(getEleMobileNoTxtBox(), "The MobileNumbers Textbox ", "displayed");
			getEleMobileNoTxtBox().sendKeys(sData[6]);
			loginpo.handleKeyboard();
			getEleSaveContinueBtn().click();
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	public void handleEditDelete() throws Exception {
		sData = GenericLib.toReadExcelData("Login", "TC_SC_001");
		LoginPagePO loginpo = new LoginPagePO(driver);
		try{
				Thread.sleep(3000);
				BaseLib.elementStatus(getEleCheckOutEditIcon(), "The CheckOutEdit Icon", "displayed");
				getEleCheckOutEditIcon().click();
				Thread.sleep(4000);
				getEleFirstNameTxtBox().clear();
				getEleFirstNameTxtBox().sendKeys(sData[7]);
				loginpo.handleKeyboard();
				BaseLib.swipeBottomToTop(.90, .22);
				BaseLib.elementStatus(getEleSaveContinueBtn(), "The CheckOutSaveContinue button", "displayed");
				getEleSaveContinueBtn().click();
				Thread.sleep(4000);
				driver.navigate().back();
				BaseLib.elementStatus(getEleCheckOutDeleteIcon(), "The CheckOutDelete icon", "displayed");
				getEleCheckOutDeleteIcon().click();
				BaseLib.elementStatus(getEleYesBtn(), "The Yes button", "displayed");
				BaseLib.elementStatus(getEleShoppingCancelbtn(), "The CANCEL button", "displayed");
				BaseLib.elementStatus(getEleAlertDescriptionTxt(), "The Alert description text", "displayed");
				getEleYesBtn().click();
				Thread.sleep(3000);
				getEleAddNewAddressIcon().click();
				Thread.sleep(3000);
				BaseLib.elementStatus(getEleFirstNameTxtBox(), "The FirstName Textbox ", "displayed");
				getEleFirstNameTxtBox().sendKeys(sData[2]);
				loginpo.handleKeyboard();
				BaseLib.elementStatus(getEleLastNameTxtBox(), "The LastName Textbox ", "displayed");
				getEleLastNameTxtBox().sendKeys(sData[3]);
				loginpo.handleKeyboard();
				BaseLib.elementStatus(getEleAddressTxtBox(), "The Address Textbox ", "displayed");
				getEleAddressTxtBox().sendKeys(sData[4]);
				loginpo.handleKeyboard();
				BaseLib.elementStatus(getEleLandMarkTxtBox(), "The LandMark Textbox ", "displayed");
				getEleLandMarkTxtBox().sendKeys(sData[5]);
				loginpo.handleKeyboard();
				BaseLib.elementStatus(getEleMobileNoTxtBox(), "The MobileNumbers Textbox ", "displayed");
				getEleMobileNoTxtBox().sendKeys(sData[6]);
				loginpo.handleKeyboard();
				getEleSaveContinueBtn().click();
		}catch(Exception e){
			throw e;
			
		}
	}

}

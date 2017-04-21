/***********************************************************************
* @author 			:		Srinivas Hippargi 
* @description		: 		Page objects and re-usbale methods for Sign Up and Login screen
* @module			:		Login
* @reusable methods : 		signUser(),loginApp(),handleOkGotIt(),handleKeyboard()
*/
package com.abof.pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.abof.library.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import groovyjarjarantlr.CommonHiddenStreamToken;
import io.appium.java_client.android.AndroidDriver;

public class LoginPagePO {
	public AndroidDriver driver;
	String sData[] = null;

	public LoginPagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// For login with facebbok
	@FindBy(id = "com.abof.android:id/fb_login_btn")
	private WebElement eleSignInFacebookLnkTab;

	public WebElement getEleSignInFacebookLnkTab() {
		return eleSignInFacebookLnkTab;
	}

	@FindBy(xpath = "//android.widget.EditText[@text='Email address or phone number']")
	private WebElement eleWoEmailorPhoneTxtBox;

	public WebElement getWoEleEmailorPhoneTxtBox() {
		return eleWoEmailorPhoneTxtBox;
	}

	@FindBy(xpath = "//android.widget.EditText[@index='1']")
	private WebElement eleWoFbPasswordTxtBox;

	public WebElement getWoEleFbPasswordTxtBox() {
		return eleWoFbPasswordTxtBox;
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='Log In ']")
	private WebElement eleWoFbLoginBtn;

	public WebElement getWoEleFbLoginBtn() {
		return eleWoFbLoginBtn;
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='OK ']")
	private WebElement eleWoFbOkBtn;

	public WebElement getEleWoFbOkBtn() {
		return eleWoFbOkBtn;
	}

	@FindBy(xpath = "//android.view.View[@text='Create account']")
	private WebElement eleWoFbCreateAccBtn;

	public WebElement getWoEleFbCreateAccBtn() {
		return eleWoFbCreateAccBtn;
	}

	@FindBy(xpath = "//android.webkit.WebView[@content-desc='Welcome to Facebook']//android.widget.EditText[@content-desc='Email address or phone number']")
	private WebElement eleWtEmailorPhoneTxtBox;

	public WebElement getWtEleWEmailorPhoneTxtBox() {
		return eleWtEmailorPhoneTxtBox;
	}
	
	@FindBy(xpath = "//android.webkit.WebView//android.widget.Button[@content-desc='Continue']")
	private WebElement eleContinueBtn;

	public WebElement getEleContinueBtn() {
		return eleContinueBtn;
	}

	@FindBy(id = "//android.webkit.WebView[@content-desc='Welcome to Facebook']//android.widget.EditText[@resource-id='u_0_2']")
	private WebElement eleWtFbPasswordTxtBox;

	public WebElement getWtEleFbPasswordTxtBox() {
		return eleWtFbPasswordTxtBox;
	}
	

	@FindBy(xpath = "//android.widget.Button[contains(@text,'Account')]")
	private WebElement eleFaceBookSignBtn;

	public WebElement getEleFaceBookSignBtn() {
		return eleFaceBookSignBtn;
	}
	
	@FindBy(xpath = "//android.widget.ListView[@index='0']//com.facebook.fbui.widget.contentview.ContentView[@index='9']")
	private WebElement eleFaceBookLogOutBtn;

	public WebElement getEleFaceBookLogOutBtn() {
		return eleFaceBookLogOutBtn;
	}

	@FindBy(xpath = "//android.webkit.WebView[@content-desc='Welcome to Facebook']//android.widget.Button[@content-desc='Log In ']")
	private WebElement eleWtFbLoginBtn;

	public WebElement getWtEleFbLoginBtn() {
		return eleWtFbLoginBtn;
	}

	@FindBy(id = "com.facebook.katana:id/login_create_account_flat_button")
	private WebElement eleWtFbCreateAccBtn;

	public WebElement getWtEleFbCreateAccBtn() {
		return eleWtFbCreateAccBtn;
	}

	@FindBy(name = "Sign up for an account.")
	private WebElement eleFBLoginErrorTXtn;

	public WebElement getEleWoFBLoginErrorTxt() {
		return eleFBLoginErrorTXtn;
	}

	// Gmail Login
	@FindBy(id = "com.abof.android:id/google_login_btn")
	private WebElement eleSignInGoogleLnkTab;

	public WebElement getEleSignInGoogleLnkTab() {
		return eleSignInGoogleLnkTab;
	}

	@FindBys({ @FindBy(id = "com.google.android.gms:id/select_dialog_listview") })
	List<WebElement> eleChooseAccLst;

	public List<WebElement> getEleChooseAccLst() {
		return eleChooseAccLst;
	}

	public WebElement getEleChooseAcc(String chooseAcc) {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + chooseAcc + "']"));
	}

	@FindBy(id = "android:id/button1")
	private WebElement eleChooseAccOKBtn;

	public WebElement getEleChooseAccOKBtn() {
		return eleChooseAccOKBtn;
	}

	@FindBy(id = "android:id/button2")
	private WebElement eleChooseAccCancelBtn;

	public WebElement getEleChooseAccCancelBtn() {
		return eleChooseAccCancelBtn;
	}

	// Add gmail account webelements
	@FindBy(xpath = "//android.webkit.WebView//android.widget.EditText[@resource-id='identifierId']")
	private WebElement eleAddGmailEmailTxtBx;

	public WebElement getEleAddGmailEmailTxtBx() {
		return eleAddGmailEmailTxtBx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.view.View[@content-desc='NEXT']")
	private WebElement eleAddGmailNextBtn;

	public WebElement getEleAddGmailNextBtn() {
		return eleAddGmailNextBtn;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.widget.EditText[@resource-id='password']")
	private WebElement eleAddGmailPasswordTxtBx;

	public WebElement getEleAddGmailPasswordTxtBx() {
		return eleAddGmailPasswordTxtBx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.view.View[@content-desc='This account already exists on your device']")
	private WebElement eleAddGmailErrorTxtBx;

	public WebElement getEleAddGmailErrorTxtBx() {
		return eleAddGmailErrorTxtBx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.view.View[@content-desc='ACCEPT']")
	private WebElement eleAddGmailAcceptBtn;

	public WebElement getEleAddGmailAcceptBtn() {
		return eleAddGmailAcceptBtn;
	}

	@FindBy(id = "com.google.android.gms:id/accept_button")
	private WebElement eleAddGmailAllowBtn;

	public WebElement getEleAddGmailAllowBtn() {
		return eleAddGmailAllowBtn;
	}

	// Abof User
	@FindBy(id = "com.abof.android:id/login_email_edt")
	private WebElement eleEmailAddressTxtBox;

	public WebElement getEleEmailAddressTxtBox() {
		return eleEmailAddressTxtBox;
	}

	@FindBy(id = "com.abof.android:id/login_password_edt_edt")
	private WebElement elePasswordTxtBox;

	public WebElement getElePasswordTxtBox() {
		return elePasswordTxtBox;
	}

	@FindBy(id = "com.abof.android:id/abof_login_btn")
	private WebElement eleSignInBtn;

	public WebElement getEleSignInBtn() {
		return eleSignInBtn;
	}

	@FindBy(id = "com.abof.android:id/closeView")
	private WebElement eleLoginCloseBtn;

	public WebElement getEleLoginCloseBtn() {
		return eleLoginCloseBtn;
	}

	@FindBy(id = "com.abof.android:id/autoFillEmail")
	private WebElement eleAutoFillBtn;

	public WebElement getEleAutoFillBtn() {
		return eleAutoFillBtn;
	}

	@FindBy(id = "com.abof.android:id/txtVisiblePwd")
	private WebElement elePasswordShowBtn;

	public WebElement getElePasswordShowBtn() {
		return elePasswordShowBtn;
	}

	@FindBy(id = "com.abof.android:id/landing_okay_gt_it_btn")
	private WebElement eleOkayBtn;

	public WebElement getEleOkayBtn() {
		return eleOkayBtn;
	}

	@FindBy(id = "com.abof.android:id/skip")
	private WebElement eleSkipBtn;

	public WebElement getEleSkipBtn() {
		return eleSkipBtn;
	}

	// Sign UP for Abof User

	@FindBy(id = "com.abof.android:id/abof_newcustomer_btn")
	private WebElement eleJoinToday;

	public WebElement getEleJoinToday() {
		return eleJoinToday;
	}

	@FindBy(id = "com.abof.android:id/signup_email_edt")
	private WebElement eleSignUpEmailTxtBox;

	public WebElement getEleSignUpEmailTxtBox() {
		return eleSignUpEmailTxtBox;
	}

	@FindBy(id = "com.abof.android:id/signup_password_edt_edt")
	private WebElement eleSignUpPasswordTxtBox;

	public WebElement getEleSignUpPasswordTxtBox() {
		return eleSignUpPasswordTxtBox;
	}

	@FindBy(id = "com.abof.android:id/signup_name")
	private WebElement eleSignUpFirstNameTxtBox;

	public WebElement getEleSignUpFirstNameTxtBox() {
		return eleSignUpFirstNameTxtBox;
	}

	@FindBy(id = "com.abof.android:id/signup_last_name")
	private WebElement eleSignUpLastNameTxtBox;

	public WebElement getEleSignUpLastNameTxtBox() {
		return eleSignUpLastNameTxtBox;
	}

	@FindBy(id = "com.abof.android:id/signup_mobile")
	private WebElement eleSignUpMobileTxtBox;

	public WebElement getEleSignUpMobileTxtBox() {
		return eleSignUpMobileTxtBox;
	}

	@FindBy(id = "com.abof.android:id/radioGroupButton_male")
	private WebElement eleSignUpMaleRdBtn;

	public WebElement getEleSignUpMaleRdBtn() {
		return eleSignUpMaleRdBtn;
	}

	@FindBy(id = "com.abof.android:id/radioGroupButton_female")
	private WebElement eleSignUpFemaleRdBtn;

	public WebElement getEleSignUpFemaleRdBtn() {
		return eleSignUpFemaleRdBtn;
	}

	@FindBy(id = "com.abof.android:id/abof_signup_btn")
	private WebElement eleSignUpJoinAbofBtn;

	public WebElement getEleSignUpJoinAbofBtn() {
		return eleSignUpJoinAbofBtn;
	}

	@FindBy(id = "com.abof.android:id/email_valid_txt")
	private WebElement eleEmailAlreadyUseTxt;

	public WebElement getEleEmailAlreadyUseTxt() {
		return eleEmailAlreadyUseTxt;
	}

	@FindBy(id = "com.abof.android:id/terms_conditions")
	private WebElement eleSignUpTermsAndCondLnk;

	public WebElement getEleSignUpTermsAndCondLnk() {
		return eleSignUpTermsAndCondLnk;
	}

	// SignUp for gmail user with app
	@FindBy(xpath = "//android.view.View[@content-desc='Or create a new account']")
	private WebElement eleCreateGmailAccountLnk;

	public WebElement getEleCreateGmailAccountLnk() {
		return eleCreateGmailAccountLnk;
	}

	@FindBy(xpath = "//android.widget.EditText[@content-desc='First name']")
	private WebElement eleGmailFirstNameTxtBox;

	public WebElement getEleCreateGmailFirstNameTxtBox() {
		return eleGmailFirstNameTxtBox;
	}

	@FindBy(id = "lastName")
	private WebElement eleGmailLastNameTxtBox;

	public WebElement getEleCreateGmailLastNameTxtBox() {
		return eleGmailLastNameTxtBox;
	}

	@FindBy(xpath = "//android.view.View[@content-desc='NEXT']")
	private WebElement eleCreateGmailNextBtn;

	public WebElement getEleCreateGmailNextBtn() {
		return eleCreateGmailNextBtn;
	}

	@FindBy(id = "month")
	private WebElement eleCreateGmalMonthDrpDwn;

	public WebElement getEleCreateGmalMonthDrpDwn() {
		return eleCreateGmalMonthDrpDwn;
	}

	// choose month from gmail account creation
	public WebElement chooseCreateGmailMonth(String month) {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + month + "']"));
	}

	@FindBy(id = "day")
	private WebElement eleGmalDayTxtBox;

	public WebElement getEleGmalDayTxtBox() {
		return eleGmalDayTxtBox;
	}

	@FindBy(id = "year")
	private WebElement eleGmalYearTxtBox;

	public WebElement getEleGmalYearTxtBox() {
		return eleGmalYearTxtBox;
	}

	@FindBy(id = "gender-label")
	private WebElement eleGmalGenderDrpDwn;

	public WebElement getEleGmalGenderDrpDwn() {
		return eleGmalGenderDrpDwn;
	}

	// choose Gender for gmail account creation
	public WebElement chooseGmailUserGender(String gender) {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + gender + "']"));
	}

	@FindBy(id = "username")
	private WebElement eleCreateGmalUserNameTxtBox;

	public WebElement getEleCreateGmalUserNameTxtBox() {
		return eleCreateGmalUserNameTxtBox;
	}

	@FindBy(id = "passwd")
	private WebElement eleCreateGmalPasswordTxtBox;

	public WebElement getEleCreateGmalPasswordTxtBox() {
		return eleCreateGmalPasswordTxtBox;
	}

	@FindBy(id = "passwd-again")
	private WebElement eleConfirmGmalPasswordTxtBox;

	public WebElement getEleConfirmGmalPasswordTxtBox() {
		return eleConfirmGmalPasswordTxtBox;
	}

	@FindBy(id = "altAction")
	private WebElement eleGmailPhoneSkipBtn;

	public WebElement getEleGmailPhoneSkipBtn() {
		return eleGmailPhoneSkipBtn;
	}

	@FindBy(id = "more")
	private WebElement eleGmailMoreBtn;

	public WebElement getEleGmailMoreBtn() {
		return eleGmailMoreBtn;
	}

	@FindBy(xpath = "//android.widget.CheckedTextView[@text='I AGREE']")
	private WebElement eleGmailIAgreeBtn;

	public WebElement getEleGmailIAgreeBtn() {
		return eleGmailIAgreeBtn;
	}

	// SignUp for facebook with app installed
	@FindBy(id = "com.facebook.katana:id/login_create_account_button")
	private WebElement eleCreateNewFBAccBtn;

	public WebElement getEleCreateNewFBAccBtn() {
		return eleCreateNewFBAccBtn;
	}

	@FindBy(id = "com.facebook.katana:id/finish_button")
	private WebElement eleCreateNewFBNextBtn;

	public WebElement getEleCreateNewFBNextBtn() {
		return eleCreateNewFBNextBtn;
	}

	@FindBy(id = "com.facebook.katana:id/first_name_input")
	private WebElement eleCreateFBFirstNameTxtBx;

	public WebElement getEleCreateFBFirstNameTxtBx() {
		return eleCreateFBFirstNameTxtBx;
	}

	@FindBy(id = "com.facebook.katana:id/last_name_input")
	private WebElement eleCreateFBLastNameTxtBx;

	public WebElement getEleCreateFBLastNameTxtBx() {
		return eleCreateFBLastNameTxtBx;
	}

	@FindBy(id = "com.facebook.katana:id/country_name_selector")
	private WebElement eleCreateFBCountryDrpDwn;

	public WebElement getEleCreateFBCountryDrpDwn() {
		return eleCreateFBCountryDrpDwn;
	}

	@FindBy(id = "com.facebook.katana:id/country_search_edit_text")
	private WebElement eleCreateFBCountySearchBx;

	public WebElement getEleCreateFBCountySearchBx() {
		return eleCreateFBCountySearchBx;
	}

	@FindBy(id = "com.facebook.katana:id/phone_input")
	private WebElement eleCreateFBMobileTxtBx;

	public WebElement getEleCreateFBMobileTxtBx() {
		return eleCreateFBMobileTxtBx;
	}

	@FindBy(id = "com.facebook.katana:id/button1")
	private WebElement eleFBConfirmBirthDayYesBtn;

	public WebElement getEleFBConfirmBirthDayYesBtn() {
		return eleFBConfirmBirthDayYesBtn;
	}

	@FindBy(id = "com.facebook.katana:id/password_input")
	private WebElement eleCreateFBPasswordTxtBx;

	public WebElement getEleCreateFBPasswordTxtBx() {
		return eleCreateFBPasswordTxtBx;
	}

	@FindBy(id = "com.facebook.katana:id/secondary_button")
	private WebElement eleCreateFBSkipBtn;

	public WebElement getEleCreateFBSkipBtn() {
		return eleCreateFBSkipBtn;
	}

	@FindBy(id = "com.facebook.katana:id/finish_without_contacts")
	private WebElement eleSignUpWithoutContanctsBtn;

	public WebElement getEleSignUpWithoutContanctsBtn() {
		return eleSignUpWithoutContanctsBtn;
	}

	@FindBy(id = "com.facebook.katana:id/fragment_nux_step_profile_picture_choose_button")
	private WebElement eleFBChooseFromGalleryBtn;

	public WebElement getEleFBChooseFromGalleryBtn() {
		return eleFBChooseFromGalleryBtn;
	}

	@FindBy(id = "com.facebook.katana:id/image")
	private WebElement eleFBSelectProfileImg;

	public WebElement getEleFBSelectProfileImg() {
		return eleFBSelectProfileImg;
	}

	@FindBy(id = "com.facebook.katana:id/primary_named_button")
	private WebElement eleFBSelectProfileDoneBtn;

	public WebElement getEleFBSelectProfileDoneBtn() {
		return eleFBSelectProfileDoneBtn;
	}

	// choosing country and gender date for FB with app
	public WebElement chooseCountryForFB(String countryName) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text='" + countryName + "']"));
	}

	public WebElement chooseGenderForFB(String gender) {
		return driver.findElement(By.xpath("//android.widget.RadioButton[@text='" + gender + "']"));
	}

	public WebElement chooseMonthForFB(String month) {
		return driver.findElement(
				By.xpath("//android.widget.NumberPicker[@index='0']//android.widget.EditText[@text='" + month + "']"));
	}

	public WebElement chooseDayForFB(String day) {
		return driver.findElement(
				By.xpath("//android.widget.NumberPicker[@index='1']//android.widget.EditText[@text='" + day + "']"));
	}

	public WebElement chooseYearForFB(String Year) {
		return driver.findElement(
				By.xpath("//android.widget.NumberPicker[@index='2']//android.widget.EditText[@text='" + Year + "']"));
	}

	// Abof user forgot Password
	@FindBy(id = "com.abof.android:id/forget_txt")
	private WebElement eleAbofForgotYourPasswordtLnk;

	public WebElement getEleAbofForgotYourPasswordtLnk() {
		return eleAbofForgotYourPasswordtLnk;
	}

	@FindBy(id = "com.abof.android:id/forgot_passwd_mail")
	private WebElement eleAbofForgotPasswordEmailTxtBx;

	public WebElement getEleAbofForgotPasswordEmailTxtBx() {
		return eleAbofForgotPasswordEmailTxtBx;
	}

	@FindBy(id = "com.abof.android:id/email_reset_link_button")
	private WebElement eleAbofEmailResetLinkBtn;

	public WebElement getEleAbofEmailResetLinkBtn() {
		return eleAbofEmailResetLinkBtn;
	}

	@FindBy(xpath = "//android.view.View[contains(@content-desc,'abof, Password Reset Link')]")
	private WebElement eleAbofPassResetGmailLnk;
	public WebElement getEleAbofPassResetGmailLnk() {
		return eleAbofPassResetGmailLnk;
	}

	@FindBy(xpath = "//android.view.View[@content-desc='Reset Password Link']")
	private WebElement eleGmailResetPassLnk;

	public WebElement getEleGmailResetPassLnk() {
		return eleGmailResetPassLnk;
	}

	@FindBy(xpath = "//android.view.View[@content-desc='Show quoted text']")
	private WebElement eleShowQuotedTxtLnk;

	public WebElement getEleShowQuotedTxtLnk() {
		return eleShowQuotedTxtLnk;
	}

	@FindBy(id = "android:id/button_always")
	private WebElement eleAlwaysAndriodBtn;

	public WebElement getEleAlwaysAndriodBtn() {
		return eleAlwaysAndriodBtn;
	}
	
	@FindBy(id="com.facebook.katana:id/login_username")
	private WebElement eleFaceBookUserNameTextBox;
	public WebElement getEleFaceBookUserNameTextBox(){
		return  eleFaceBookUserNameTextBox;
	}
	
	@FindBy(id="com.facebook.katana:id/login_password")
	private WebElement eleFaceBookPasswordTextBox;
	public WebElement getEleFaceBookPasswordTextBox(){
		return  eleFaceBookPasswordTextBox;
	}
	
	@FindBy(id="com.facebook.katana:id/login_login")
	private WebElement eleFaceBookLoginBtn;
	public WebElement getEleFaceBookLoginBtn(){
		return  eleFaceBookLoginBtn;
	}
	
	

	@FindBy(id = "com.abof.android:id/confirm_password")
	private WebElement eleNewPasswordTxtbx;

	public WebElement getEleNewPasswordTxtbx() {
		return eleNewPasswordTxtbx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.widget.EditText[@resource-id='logonPassword']")
	private WebElement eleLogonPasswordTxtBx;

	public WebElement getEleLogonPasswordTxtBx() {
		return eleLogonPasswordTxtBx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.widget.EditText[@resource-id='logonPasswordVerify']")
	private WebElement eleLogonPasswordVerifyTxtBx;

	public WebElement getEleLogonPasswordVerifyTxtBx() {
		return eleLogonPasswordVerifyTxtBx;
	}

	@FindBy(xpath = "//android.webkit.WebView//android.widget.Button[@resource-id='WC_PasswordResetForm_Link_2']")
	private WebElement eleWebResetSubmitBtn;

	public WebElement getEleWebResetSubmitBtn() {
		return eleWebResetSubmitBtn;
	}

	@FindBy(id = "com.abof.android:id/reconfirm_password")
	private WebElement eleConfirmPasswordTxtbx;

	public WebElement getEleConfirmPasswordTxtbx() {
		return eleConfirmPasswordTxtbx;
	}

	@FindBy(id = "com.abof.android:id/confirm_btn")
	private WebElement eleResetPassSubmitBtn;

	public WebElement getEleResetPassSubmitBtn() {
		return eleResetPassSubmitBtn;
	}

	@FindBy(id = "com.abof.android:id/autoFillResetEmail")
	private WebElement eleAbofAutoFillResetEmailBtn;

	public WebElement getEleAbofAutoFillResetEmailBtn() {
		return eleAbofAutoFillResetEmailBtn;
	}

	@FindBy(id = "com.abof.android:id/cancel_text")
	private WebElement eleAbofEmailResetCancelBtn;

	public WebElement getEleAbofEmailResetCancelBtn() {
		return eleAbofEmailResetCancelBtn;
	}

	@FindBy(id = "com.abof.android:id/signin_register")
	private WebElement eleSigninRegister;

	public WebElement getEleSigninRegister() {
		return eleSigninRegister;
	}

	/*
	 * @author: Srinivas Hippargi Description: Method for Sign up as Abof,Gmail
	 * or facebook user
	 */
	public void signUpUser(String user, String sTestCaseID) throws InterruptedException {
		switch (user) {
		case "ABOF":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			BaseLib.elementStatus(getEleJoinToday(), "Join Today Element", "displayed");
			getEleJoinToday().click();

			getEleSignUpEmailTxtBox().sendKeys(sData[2]);
			getEleSignUpPasswordTxtBox().sendKeys(sData[3]);
			getEleSignUpFirstNameTxtBox().sendKeys(sData[4]);
			getEleSignUpLastNameTxtBox().sendKeys(sData[5]);
			getEleSignUpMobileTxtBox().sendKeys(sData[6]);
			if (sData[7].equals("Female")) {
				getEleSignUpFemaleRdBtn().click();
			} else {
				getEleSignUpMaleRdBtn().click();
			}
			handleKeyboard();
			getEleSignUpJoinAbofBtn().click();
			break;
		case "GMAIL":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleSignInGoogleLnkTab(), "Sign in with Google Element", "displayed");
			getEleSignInGoogleLnkTab().click();
			BaseLib.elementStatus(getEleChooseAcc("Add account"), "Add account Element", "displayed");
			getEleChooseAcc("Add account").click();
			BaseLib.elementStatus(getEleChooseAccOKBtn(), "Ok Element", "displayed");
			getEleChooseAccOKBtn().click();
			Thread.sleep(10000);
			// BaseLib.elementStatus(getEleCreateGmailAccountLnk(), "Or create
			// new gmail account Element", "enabled");
			getEleCreateGmailAccountLnk().click();
			// BaseLib.elementStatus(getEleCreateGmailFirstNameTxtBox(),
			// "Firstname Element", "displayed");
			getEleCreateGmailFirstNameTxtBox().sendKeys("navkant");
			BaseLib.elementStatus(getEleCreateGmailLastNameTxtBox(), "Lastname Element", "displayed");
			getEleCreateGmailLastNameTxtBox().sendKeys("andra");
			getEleCreateGmailNextBtn().click();
			BaseLib.elementStatus(getEleCreateGmalMonthDrpDwn(), "Month Dropdown Element", "displayed");
			getEleCreateGmalMonthDrpDwn().click();
			BaseLib.elementStatus(chooseCreateGmailMonth("Jan"), chooseCreateGmailMonth("Jan").getText() + " Element",
					"displayed");
			chooseCreateGmailMonth("Jan").click();
			getEleGmalDayTxtBox().sendKeys("02");
			getEleGmalYearTxtBox().sendKeys("1990");
			BaseLib.elementStatus(getEleGmalGenderDrpDwn(), " Gender Element", "displayed");
			getEleGmalGenderDrpDwn().click();
			BaseLib.elementStatus(chooseGmailUserGender("Male"), chooseGmailUserGender("Male").getText() + " Element",
					"displayed");
			chooseGmailUserGender("Male").click();
			getEleCreateGmailNextBtn().click();
			getEleCreateGmalUserNameTxtBox().sendKeys("abofqa.navakantcbt");
			getEleCreateGmailNextBtn().click();
			getEleCreateGmalPasswordTxtBox().sendKeys("navkant_49");
			getEleConfirmGmalPasswordTxtBox().sendKeys("navkant_49");
			getEleCreateGmailNextBtn().click();
			getEleGmailPhoneSkipBtn().click();
			for (int i = 1; i <= 3; i++) {
				getEleGmailMoreBtn().click();
			}
			getEleGmailIAgreeBtn().click();
			break;
		case "FB":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			BaseLib.elementStatus(getEleSignInFacebookLnkTab(), "SignIn with Facebook", "displayed");
			getEleSignInFacebookLnkTab().click();
			Thread.sleep(5000);
			BaseLib.elementStatus(getEleCreateNewFBAccBtn(), "Create New Facebook account", "displayed");
			getEleCreateNewFBAccBtn().click();
			getEleCreateNewFBNextBtn().click();
			getEleCreateFBFirstNameTxtBx().sendKeys("Abofqa");
			getEleCreateFBLastNameTxtBx().sendKeys("srinicbtt");
			getEleCreateNewFBNextBtn().click();
			if (getEleCreateFBCountryDrpDwn().getText().equals("India")) {
				NXGReports.addStep("Default country is choosen as India", LogAs.INFO, null);
			} else {
				getEleCreateFBCountryDrpDwn().click();
				getEleCreateFBCountySearchBx().sendKeys("India");
				chooseCountryForFB("India").click();
			}
			getEleCreateFBMobileTxtBx().sendKeys("9731431443");
			try {
				getEleCreateNewFBNextBtn().click();
				getEleFBConfirmBirthDayYesBtn().click();
			} catch (RuntimeException e) {
				chooseMonthForFB("Mar").click();
				chooseDayForFB("05").click();
				chooseYearForFB("1990").click();
			} catch (Exception e) {
				throw e;
			}
			chooseGenderForFB("Male").click();
			getEleCreateNewFBNextBtn().click();
			getEleCreateFBPasswordTxtBx().sendKeys("srini_49");
			getEleCreateNewFBNextBtn().click(); // clicked as signup
			getEleFBChooseFromGalleryBtn().click();
			getEleFBSelectProfileImg().click();
			getEleFBSelectProfileDoneBtn().click();
			getEleFBSelectProfileDoneBtn().click();
			getEleFBSelectProfileDoneBtn().click();

		}
	}

	/*
	 * @author: Srinivas Hippargi Description: Method for Login App as
	 * Abof,Gmail or facebook user
	 */
	public void loginApp(String user, String sTestCaseID) throws InterruptedException {
		switch (user) {
		case "ABOF":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			BaseLib.elementStatus(getEleEmailAddressTxtBox(), "Abof user EmailAddress element", "displayed");
			getEleEmailAddressTxtBox().sendKeys(sData[2]);
			NXGReports.addStep(sData[2] + " is entered", LogAs.PASSED, null);
			handleKeyboard();
			BaseLib.elementStatus(getElePasswordTxtBox(), "Abof user Password element", "displayed");
			getElePasswordTxtBox().sendKeys(sData[3]);
			NXGReports.addStep(sData[3] + " password is entered", LogAs.PASSED, null);
			handleKeyboard();
			BaseLib.elementStatus(getEleSignInBtn(), "SignIn button", "displayed");
			getEleSignInBtn().click();
			break;
		case "FB":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			BaseLib.elementStatus(getEleSignInFacebookLnkTab(), "SignIn element", "displayed");
			getEleSignInFacebookLnkTab().click();
			// code for FB installed app
			if (driver.isAppInstalled(BaseLib.FB)) {
				NXGReports.addStep("Facebook app is installed", LogAs.PASSED, null);
				BaseLib.waitForElement(getWtEleFbLoginBtn(), "Login button is displayed",
						"Login button is not displayed");
				getWtEleWEmailorPhoneTxtBox().clear();
				getWtEleWEmailorPhoneTxtBox().sendKeys(sData[2]);
				getWtEleFbPasswordTxtBox().sendKeys(sData[3]);
				getWtEleFbLoginBtn().click();
			}
			// ccode for FB uninstalled app
			else {
				BaseLib.waitForElement(getWtEleFbLoginBtn(), "Login button is displayed",
						"Login button is not displayed");
				getWoEleEmailorPhoneTxtBox().sendKeys("sbhippargi@gmail.com");
				handleKeyboard();
				getWoEleFbPasswordTxtBox().sendKeys("roza@2373");
				handleKeyboard();
				getWoEleFbLoginBtn().click();
				getEleWoFbOkBtn().click();
			}
			break;

		case "FBLogged":
			BaseLib.elementStatus(getEleSignInFacebookLnkTab(), "SignIn facebook element", "displayed");
			getEleSignInFacebookLnkTab().click();
			break;
		case "GMAIL":
			sData = GenericLib.toReadExcelData("Login", sTestCaseID);
			BaseLib.elementStatus(getEleSignInGoogleLnkTab(), "Sign In with google link", "displayed");
			getEleSignInGoogleLnkTab().click();
			BaseLib.elementStatus(getEleChooseAcc(sData[2]), sData[2], "displayed");
			getEleChooseAcc(sData[2]).click();
			BaseLib.elementStatus(getEleChooseAccOKBtn(), "Choosing account 'OK' button", "displayed");
			getEleChooseAccOKBtn().click();
			break;
		}

	}

	/*
	 * @author: Srinivas Hippargi 
	 * Description: Checking show and hide password
	 */
	public void verifyPasewordVisibility(String sTestCaseID) {
		sData = GenericLib.toReadExcelData("Login", sTestCaseID);
		BaseLib.elementStatus(getEleEmailAddressTxtBox(), "Abof user EmailAddress element", "displayed");
		getEleEmailAddressTxtBox().sendKeys(sData[2]);
		NXGReports.addStep(sData[2] + " is entered", LogAs.PASSED, null);
		handleKeyboard();
		BaseLib.elementStatus(getElePasswordTxtBox(), "Abof user Password element", "displayed");
		getElePasswordTxtBox().sendKeys(sData[3]);
		if (getElePasswordShowBtn().getText().equals("SHOW")) {
			Assert.assertTrue(getElePasswordTxtBox().getText().isEmpty(), "Password is not Hidden");
			NXGReports.addStep("Password is Hidden ", LogAs.PASSED, null);
			getElePasswordShowBtn().click();
			Assert.assertTrue(getElePasswordTxtBox().getText().equals(sData[3]));
			NXGReports.addStep("Password is visible ", LogAs.PASSED, null);
		}
	}
	/*
	 * @author: Srinivas Hippargi 
	 * Description: Switching to the generic email id
	 */

	public void switchToGmailAcc(String acc) throws InterruptedException {
		driver.findElement(By
				.xpath("//android.view.ViewGroup[@resource-id='com.google.android.gm:id/mail_toolbar']//android.widget.ImageButton[@index='0']"))
				.click();
		Thread.sleep(5000);
		if (driver.findElement(By.id("com.google.android.gm:id/account_address")).getText().equals(acc)) {
			NXGReports.addStep(acc + "Acc is already switched in gmail", LogAs.INFO, null);
			BaseLib.swipeRightToLeft(.80, .10);
		} else {
			driver.findElement(By.id("com.google.android.gm:id/account_list_button")).click();
			Thread.sleep(2000);
			List<WebElement> gmailAccList = driver.findElements(By.xpath(
					"//android.widget.ListView[@resource-id='android:id/list']//android.widget.TextView[@resource-id='com.google.android.gm:id/account_address']"));
			for (int i = 0; i < gmailAccList.size(); i++) {
				if (gmailAccList.get(i).getText().equalsIgnoreCase(acc)) {
					gmailAccList.get(i).click();
					break;
				}
			}
		}

	}

	/*
	 * @author: Srinivas Hippargi Description: Method for handle Ok button
	 * irrespectively
	 */
	public void handleOkayBtn() {
		try {
			getEleOkayBtn().click();
		} catch (Exception e) {
		}

	}

	/*
	 * @author: Srinivas Hippargi Description: Method for hide keyboard
	 * irrespectively
	 */
	public void handleKeyboard() {
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
	}
	
	public void facebookLogout(){
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		try{
			Thread.sleep(4000);
			driver.findElement(By.id("com.facebook.katana:id/bookmarks_tab")).click();
			for(int i=0;i<=5;i++){
				BaseLib.swipeBottomToTop(.90, .22);
			}
			if(getEleFaceBookLogOutBtn().isDisplayed()){
			getEleFaceBookLogOutBtn().click();
			}
			else{
				getEleFaceBookLogOutBtn().click();
				driver.findElement(By.id("com.facebook.katana:id/button1")).click();
			}
		}catch(Exception e){
			
		}
	}
	public void facebookSign(String Username,String password) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		try{
			driver.findElement(By.id("com.facebook.katana:id/login_another_account_text")).click();
			getEleFaceBookUserNameTextBox().sendKeys(Username);
			getEleFaceBookPasswordTextBox().sendKeys(password);
			getEleFaceBookLoginBtn().click();
			Thread.sleep(10000);
		}catch(Exception e){
			getEleFaceBookUserNameTextBox().sendKeys(Username);
			getEleFaceBookPasswordTextBox().sendKeys(password);
			getEleFaceBookLoginBtn().click();
			Thread.sleep(10000);
		}
	}
}

/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		Page objects and re-usbale methods for profile screen
* @module			:		SelfServices
* @reusable methods : 		
*/
package com.abof.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProfilePagePO {
	
	AndroidDriver driver;
	public ProfilePagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "com.abof.android:id/ABOF_logout_btn")
	private WebElement eleAbofLogoutBtn;

	public WebElement getEleAbofLogoutBtn() {
		return eleAbofLogoutBtn;
	}
	@FindBy(id = "com.abof.android:id/txtChangePassword")
	private WebElement eleChangePasswordLnk;

	public WebElement getEleChangePasswordLnk() {
		return eleChangePasswordLnk;
	}
	@FindBy(id = "com.abof.android:id/alert_description")
	private WebElement eleAlertDescTxt;

	public WebElement getEleAlertDescTxt() {
		return eleAlertDescTxt;
	}
	@FindBy(id = "com.abof.android:id/confirm_btn")
	private WebElement eleYesBtn;

	public WebElement getEleYesBtn() {
		return eleYesBtn;
	}
	
	
	
	
}
/***********************************************************************
* @author 			:		Srinivas Hippargi 
* @description		: 		Page objects and re-usbale methods for Hamburger Menu screen
* @module			:		Hamburger Menu
* @reusable methods : 		verifyHamburgerMenuOptions()
*/
package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;

public class HamburgerMenuPO {

	AndroidDriver driver;
	LoginPagePO loginPo = null;

	public HamburgerMenuPO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		loginPo = new LoginPagePO(driver);
	}

	@FindBy(id = "com.abof.android:id/whats_hot_text")
	private WebElement eleWhatshotLnk;

	public WebElement getElewhatshotLnk() {
		return eleWhatshotLnk;
	}

	@FindBy(id = "com.abof.android:id/men_text")
	private WebElement eleShopMenLnk;

	public WebElement getEleShopMenLnk() {
		return eleShopMenLnk;
	}

	@FindBy(id = "com.abof.android:id/women_text")
	private WebElement eleShopWomenLnk;

	public WebElement getEleShopWomenLnk() {
		return eleShopWomenLnk;
	}

	@FindBy(id = "com.abof.android:id/my_orders_text")
	private WebElement eleMyOrdersLnk;

	public WebElement getEleMyOrdersLnk() {
		return eleMyOrdersLnk;
	}

	@FindBy(id = "com.abof.android:id/fav_text")
	private WebElement eleMyfavouritesLnk;

	public WebElement getEleMyFavouritesLnk() {
		return eleMyfavouritesLnk;
	}

	@FindBy(id = "com.abof.android:id/refer_text")
	private WebElement eleReferaFriendLnk;

	public WebElement getEleReferaFriendLnk() {
		return eleReferaFriendLnk;
	}

	@FindBy(id = "com.abof.android:id/return_text")
	private WebElement eleReturnAndExchangeLnk;

	public WebElement getEleReturnAndExchangeLnk() {
		return eleReturnAndExchangeLnk;
	}

	@FindBy(id = "com.abof.android:id/bucks_text")
	private WebElement eleAbofBucksAndGiftCardLnk;

	public WebElement getEleAbofBucksAndGiftCardLnk() {
		return eleAbofBucksAndGiftCardLnk;
	}

	@FindBy(id = "com.abof.android:id/support_text")
	private WebElement eleAbofSupportLnk;

	public WebElement getEleAbofSupportLnk() {
		return eleAbofSupportLnk;
	}

	@FindBy(id = "com.abof.android:id/about_text")
	private WebElement eleAboutAbofLnk;

	public WebElement getEleAboutAbofLnk() {
		return eleAboutAbofLnk;
	}

	@FindBy(id = "com.abof.android:id/tc_text")
	private WebElement eleTermsAndConditionsLnk;

	public WebElement getEleTermsAndConditionsLnk() {
		return eleTermsAndConditionsLnk;
	}

	@FindBy(id = "com.abof.android:id/privacy_text")
	private WebElement elePrivacyPolicyLnk;

	public WebElement getElePrivacyPolicyLnk() {
		return elePrivacyPolicyLnk;
	}

	@FindBy(id = "com.abof.android:id/style_text")
	private WebElement eleStylePreferenceLnk;

	public WebElement getEleStylePreferenceLnk() {
		return eleStylePreferenceLnk;
	}

	@FindBy(id = "com.abof.android:id/bucks_text")
	private WebElement eleAbofBucksAndGiftCardsLnk;

	public WebElement getEleAbofBucksAndGiftCardsLnk() {
		return eleAbofBucksAndGiftCardsLnk;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/txtProductName") })
	private List<WebElement> eleMyFavoriteProductLst;

	public List<WebElement> getEleMyFavoriteProductLst() {
		return eleMyFavoriteProductLst;
	}

	@FindBy(id = "com.abof.android:id/user_profile")
	private WebElement eleUserProfileImg;

	public WebElement getEleUserProfileImg() {
		return eleUserProfileImg;
	}
	@FindBy(id = "com.abof.android:id/txtMyabof")
	private WebElement eleUserProfileNameTxt;

	public WebElement getEleUserProfileNameTxt() {
		return eleUserProfileNameTxt;
	}
	
	@FindBy(xpath = "//android.view.View/android.widget.ImageButton")
	private WebElement eleHambergurMenuBackBtn;

	public WebElement getEleHambergurMenuBackBtn() {
		return eleHambergurMenuBackBtn;
	}
	
	
	
	// For validating hamburger menu
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Refer a friend')]")
	private WebElement eleReferaFriendTitleTxt;

	public WebElement getEleReferaFriendTitleTxt() {
		return eleReferaFriendTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Returns/Exchanges')]")
	private WebElement eleReturnAndExchangeTitleTxt;

	public WebElement getEleReturnAndExchangeTitleTxt() {
		return eleReturnAndExchangeTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'abof Bucks & abof Gift Card')]")
	private WebElement eleAbofBucksandGiftCardTitleTxt;

	public WebElement getEleAbofBucksandGiftCardTitleTxt() {
		return eleAbofBucksandGiftCardTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'abof Support')]")
	private WebElement eleAbofSupportTitleTxt;

	public WebElement getEleAbofSupportTitleTxt() {
		return eleAbofSupportTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'About abof')]")
	private WebElement eleAboutAbofTitleTxt;

	public WebElement getEleAboutAbofTitleTxt() {
		return eleAboutAbofTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Terms & Conditions')]")
	private WebElement eleTermsAndConditionsTitleTxt;

	public WebElement getEleTermsAndConditionsTitleTxt() {
		return eleTermsAndConditionsTitleTxt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Privacy Policy')]")
	private WebElement elePrivacyPolicyTitleTxt;

	public WebElement getElePrivacyPolicyTitleTxt() {
		return elePrivacyPolicyTitleTxt;
	}
	
	
	
	@FindBy(xpath = "//	android.widget.TextView[contains(@text,'Favourites')]")
	private WebElement eleFavouritesTxt;

	public WebElement getEleFavouritesTxt() {
		return eleFavouritesTxt;
	}
	
	
	@FindBy(id="com.abof.android:id/ABOF_logout_btn")
	private WebElement eleLogoutBtn;

	public WebElement getEleLogoutBtn() {
		return eleLogoutBtn;
	}

	/*
	 * @author: Srinivas Hippargi Description: to check, after choosing an item
	 * as fav,whether it is available in favorite list
	 * 
	 */
	public void isProductAvailableInFavList(String product) {
		
		try
		{
		for (int i = 0; i <= getEleMyFavoriteProductLst().size() - 1; i++) {
			if (getEleMyFavoriteProductLst().get(i).getText().equals(product)) {
				NXGReports.addStep("Selected item is succesfully added favorite list", LogAs.PASSED, null);
				break;
			} else {
				BaseLib.swipeBottomToTop(.80, .20);
			}
		}

		}catch(Exception e)
		{
			NXGReports.addStep("Selected item is not in favorite list", LogAs.PASSED, null);
			Assert.fail();
		}
	}
	
	/*
	 * @author: PreranaBhatt
	 *  Description: to check, when item is removed from fav (PLP,PdP,Cart),it should not  available in favorite list.
	 * 
	 */
	
public void isProductUnavailableInFavList(String product) {
	
		int flag=0;
		for (int i = 0; i <= getEleMyFavoriteProductLst().size() - 1; i++) {
			if (getEleMyFavoriteProductLst().get(i).getText().equals(product)) {
				flag=1;
				break;
			} else {
				BaseLib.swipeBottomToTop(.80, .20);
			}
		}
		
		if(flag==1)
		{
			NXGReports.addStep("Product stil in favorite list instead of getting removed", LogAs.PASSED, null);
			Assert.fail();
			
		}
		else
		{
			NXGReports.addStep("Selected item is succesfully removed from favorite list", LogAs.PASSED, null);
		}

	
	
	}

	/*
	 * @author: Srinivas Hippargi 
	 * Description: Method for verifying each option
	 * is displayed in Hamburger menu
	 */

	public void verfyHamberMenuOptions() throws InterruptedException {
		BaseLib.elementStatus(getElewhatshotLnk(), "Whats Hot Option", "displayed");
		BaseLib.elementStatus(getEleShopMenLnk(), "Shop Men Option", "displayed");
		BaseLib.elementStatus(getEleShopWomenLnk(), "Shop WoMen Option", "displayed");
		BaseLib.elementStatus(getEleMyOrdersLnk(), "My Oders option", "displayed");
		BaseLib.elementStatus(getEleMyFavouritesLnk(), "My Oders option", "displayed");
		BaseLib.elementStatus(getEleReferaFriendLnk(), "Refer a friend option", "displayed");
		BaseLib.elementStatus(getEleReturnAndExchangeLnk(), "Return and Exchange option", "displayed");
		BaseLib.elementStatus(getEleAbofBucksAndGiftCardLnk(), "abof bucks & gift cards option", "displayed");
		BaseLib.elementStatus(getEleAbofSupportLnk(), "abof support option", "displayed");
		BaseLib.elementStatus(getEleAboutAbofLnk(), "About abof option ", "displayed");
		Thread.sleep(3000);
		BaseLib.swipeBottomToTop(.90, .70);
		BaseLib.elementStatus(getEleTermsAndConditionsLnk(), "Terms & Condition option ", "displayed");
		BaseLib.elementStatus(getElePrivacyPolicyLnk(), "Privacy Policy option", "displayed");

	}

	public void validateHamburgerMenuOptions(WebElement expElement, WebElement actElement) throws InterruptedException {
		Thread.sleep(2000);
		BaseLib.elementStatus(expElement, expElement.getText(), "displayed");
		expElement.click();
		Thread.sleep(2000);
		loginPo.handleOkayBtn();
		Thread.sleep(2000);
		Assert.assertTrue(actElement.isDisplayed(), actElement.getText() + "is not displayed");
		NXGReports.addStep(actElement.getText() + " Header Text is displayed", LogAs.PASSED, null);

	}

}

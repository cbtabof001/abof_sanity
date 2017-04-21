package com.abof.scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.abof.library.BaseLib;
import com.abof.library.GenericLib;
import com.abof.pageobjects.BrowsePlpPdpPO;
import com.abof.pageobjects.CheckOutPagePO;
import com.abof.pageobjects.HamburgerMenuPO;
import com.abof.pageobjects.HomePagePO;
import com.abof.pageobjects.LoginPagePO;
import com.abof.pageobjects.MyFavouritesPagePO;
import com.abof.pageobjects.PaymentPagePO;
import com.abof.pageobjects.ShoppingBagPO;
import com.abof.pageobjects.WhatsHotLandingPO;

public class Sanitysuite extends BaseLib {
	
	LoginPagePO loginPo = null;
	HomePagePO homePagePo = null;
	HamburgerMenuPO hamburgerMenuPo = null;
	WhatsHotLandingPO whatsHotLandingPo = null;
	BrowsePlpPdpPO browsePlpPdpPo = null;
	ShoppingBagPO shoppingBagPo = null;
	CheckOutPagePO checkOutPagePo = null;
	PaymentPagePO paymentPagePo = null;
	MyFavouritesPagePO myfavouritespagePo;
	String productSaveForLater = null;
	String removedProductFromFav = null;
	String[] sData = null;
	String size = null;
	String pin = null;
	String[] ss = null;
	String text = null;
	String PDP = null;
	String ProductName = null;
	String productName = null;
	@BeforeMethod
	public void init() {
		loginPo = new LoginPagePO(driver);
		homePagePo = new HomePagePO(driver);
		hamburgerMenuPo = new HamburgerMenuPO(driver);
		whatsHotLandingPo = new WhatsHotLandingPO(driver);
		browsePlpPdpPo = new BrowsePlpPdpPO(driver);
		shoppingBagPo = new ShoppingBagPO(driver);
		checkOutPagePo = new CheckOutPagePO(driver);
		paymentPagePo = new PaymentPagePO(driver);
		myfavouritespagePo = new MyFavouritesPagePO(driver);
	}
	/* @Description:Login as Guest user and add to cart and do the payment 
	  * @Author:RaghuKiran MR/Srinivas Hippargi /Prerana Bhatt*/
	@Parameters("device")
	@Test(enabled = true, priority = 1, description = "Login as Guest user Select the product and add to cart and do the payment")
	public void testGuestLoginPayment(String device) throws Exception {
		try{
			loginPo.getEleLoginCloseBtn().click();
			loginPo.handleOkayBtn();
			sData=GenericLib.toReadExcelData("Login", "TC_WHT_001");
			whatsHotLandingPo.getMenSubmenu(sData[2],sData[3]);
			loginPo.handleOkayBtn();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Plp");
			browsePlpPdpPo.checkPagination();
			browsePlpPdpPo.getEleProductImageLst().get(0).click();
			visibilityOfElementWait(browsePlpPdpPo.getElePdpSizeGuideLnk(), "sizeGuideLink");
			productName=browsePlpPdpPo.getElePdpProductName().getText();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Pdp");
			browsePlpPdpPo.getElePdpSizeGuideLnk().click();
			browsePlpPdpPo.getEleSizeGuideCloseBtn().click();
			sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
			browsePlpPdpPo.pdpFlow(sData[3], sData[2], sData[4], sData[5]);
			browsePlpPdpPo.pdpFlow(sData[7], sData[2], "", sData[6]);
			BaseLib.scrollToElement(2, "DOWN", .20, .80, browsePlpPdpPo.getEleCartIcon());
			browsePlpPdpPo.getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			browsePlpPdpPo.verifyViewBagStaus();
			shoppingBagPo.getEleShoppingBagIcon().click();
			shoppingBagPo.isProductAvailableInshoppingCart(productName);
			shoppingBagPo.verifyShoppingBagContent();
			BaseLib.scrollToElement(5, "UP", .90, .50, shoppingBagPo.getElePlaceOrderBtn());
			shoppingBagPo.getElePlaceOrderBtn().click();
			loginPo.loginApp("ABOF", "TC_Login_003");
			checkOutPagePo.fillCheckOutDetails();
			paymentPagePo.paymentoption();
			paymentPagePo.addpaymentdetailsWithSaveCard();
				paymentPagePo.verifyContentPaymentThankYouMessage();
		}catch(Exception e){
			throw e;
		}
	}
	
	/* @Description:Login as Normal user and add to cart and do the payment 
	  * @Author:RaghuKiran MR/Srinivas Hippargi /Prerana Bhatt*/
	@Parameters("device")
	@Test(enabled = true, priority = 2, description = "Login as Normal user Select the product and add to cart and do the payment")
	public void testNormalUserLoginPayment(String device) throws Exception {
		try{
			loginPo.loginApp("ABOF", "TC_Login_002");
			loginPo.handleOkayBtn();
			shoppingBagPo.removeItemInShopping();
			sData=GenericLib.toReadExcelData("Login", "TC_WHT_004");
			whatsHotLandingPo.getwomenSubmenu(sData[2],sData[3]);
			loginPo.handleOkayBtn();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Plp");
			browsePlpPdpPo.checkPagination();
			browsePlpPdpPo.getEleProductImageLst().get(0).click();
			visibilityOfElementWait(browsePlpPdpPo.getElePdpSizeGuideLnk(), "sizeGuideLink");
			productName=browsePlpPdpPo.getElePdpProductName().getText();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Pdp");
			browsePlpPdpPo.getElePdpSizeGuideLnk().click();
			browsePlpPdpPo.getEleSizeGuideCloseBtn().click();
			sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
			browsePlpPdpPo.pdpFlow(sData[3], sData[2], sData[4], sData[5]);
			browsePlpPdpPo.pdpFlow(sData[7], sData[2], "", sData[6]);
			BaseLib.scrollToElement(2, "DOWN", .20, .80, browsePlpPdpPo.getEleCartIcon());
			browsePlpPdpPo.getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			browsePlpPdpPo.verifyViewBagStaus();
			shoppingBagPo.getEleShoppingBagIcon().click();
			shoppingBagPo.isProductAvailableInshoppingCart(productName);
			shoppingBagPo.verifyShoppingBagContent();
			BaseLib.scrollToElement(5, "UP", .90, .50, shoppingBagPo.getElePlaceOrderBtn());
			shoppingBagPo.getElePlaceOrderBtn().click();
			checkOutPagePo.fillCheckOutDetails();
			paymentPagePo.paymentoption();
			paymentPagePo.addpaymentdetailsWithSaveCard();
			paymentPagePo.verifyContentPaymentThankYouMessage();
		}catch(Exception e){
			throw e;
		}
	}
	/* @Description:Login as facebook Normal user and add to cart and do the payment 
	  * @Author:RaghuKiran MR/Srinivas Hippargi /Prerana Bhatt*/
	@Parameters("device")
	@Test(enabled = true, priority = 3, description = "Login as Facebook user Select the product and add to cart and do the payment")
	public void testFaceBookUserLoginPayment(String device) throws Exception {
		try{
			loginPo.getEleSignInFacebookLnkTab().click();
			waitForElement(loginPo.getEleOkayBtn(), "Ok gotit icon is displayed", "Ok gotit icon is not displayed");
			loginPo.handleOkayBtn();
			shoppingBagPo.removeItemInShopping();
			whatsHotLandingPo.getMenSubmenu(sData[2],sData[3]);
			browsePlpPdpPo.toVerifyPageContentsDisplay("Plp");
			browsePlpPdpPo.checkPagination();
			browsePlpPdpPo.getEleProductImageLst().get(0).click();
			visibilityOfElementWait(browsePlpPdpPo.getElePdpSizeGuideLnk(), "sizeGuideLink");
			productName=browsePlpPdpPo.getElePdpProductName().getText();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Pdp");
			browsePlpPdpPo.getElePdpSizeGuideLnk().click();
			browsePlpPdpPo.getEleSizeGuideCloseBtn().click();
			sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
			browsePlpPdpPo.pdpFlow(sData[3], sData[2], sData[4], sData[5]);
			browsePlpPdpPo.pdpFlow(sData[7], sData[2], "", sData[6]);
			BaseLib.scrollToElement(2, "DOWN", .20, .80, browsePlpPdpPo.getEleCartIcon());
			browsePlpPdpPo.getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			browsePlpPdpPo.verifyViewBagStaus();
			shoppingBagPo.getEleShoppingBagIcon().click();
			shoppingBagPo.isProductAvailableInshoppingCart(productName);
			shoppingBagPo.verifyShoppingBagContent();
			BaseLib.scrollToElement(5, "UP", .90, .50, shoppingBagPo.getElePlaceOrderBtn());
			shoppingBagPo.getElePlaceOrderBtn().click();
			checkOutPagePo.fillCheckOutDetails();
			paymentPagePo.paymentoption();
			paymentPagePo.addpaymentdetailsWithSaveCard();
			paymentPagePo.verifyContentPaymentThankYouMessage();
		}catch(Exception e){
			throw e;
		}
	}
	/* @Description:Login as Gmail user and add to cart and do the payment 
	  * @Author:RaghuKiran MR/Srinivas Hippargi /Prerana Bhatt*/
	@Parameters("device")
	@Test(enabled = true, priority = 4, description = "Login as Gmail user Select the product and add to cart and do the payment")
	public void testGmailUserLoginPayment(String device) throws Exception {
		try{
			sData = GenericLib.toReadExcelData("Login", "TC_AddGmail_003");
			loginPo.getEleSignInGoogleLnkTab().click();
			loginPo.getEleChooseAcc(sData[2]).click();
			loginPo.getEleChooseAccOKBtn().click();
			waitForElement(loginPo.getEleOkayBtn(), "Ok gotit icon is displayed", "Ok gotit icon is not displayed");
			loginPo.handleOkayBtn();
			shoppingBagPo.removeItemInShopping();
			whatsHotLandingPo.getMenSubmenu(sData[2],sData[3]);
			loginPo.handleOkayBtn();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Plp");
			browsePlpPdpPo.checkPagination();
			browsePlpPdpPo.getEleProductImageLst().get(0).click();
			visibilityOfElementWait(browsePlpPdpPo.getElePdpSizeGuideLnk(), "sizeGuideLink");
			productName=browsePlpPdpPo.getElePdpProductName().getText();
			browsePlpPdpPo.toVerifyPageContentsDisplay("Pdp");
			browsePlpPdpPo.getElePdpSizeGuideLnk().click();
			browsePlpPdpPo.getEleSizeGuideCloseBtn().click();
			sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
			browsePlpPdpPo.pdpFlow(sData[3], sData[2], sData[4], sData[5]);
			browsePlpPdpPo.pdpFlow(sData[7], sData[2], "", sData[6]);
			BaseLib.scrollToElement(2, "DOWN", .20, .80, browsePlpPdpPo.getEleCartIcon());
			browsePlpPdpPo.getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			browsePlpPdpPo.verifyViewBagStaus();
			shoppingBagPo.getEleShoppingBagIcon().click();
			shoppingBagPo.isProductAvailableInshoppingCart(productName);
			shoppingBagPo.verifyShoppingBagContent();
			BaseLib.scrollToElement(5, "UP", .90, .50, shoppingBagPo.getElePlaceOrderBtn());
			shoppingBagPo.getElePlaceOrderBtn().click();
			checkOutPagePo.fillCheckOutDetails();
			paymentPagePo.paymentoption();
			paymentPagePo.addpaymentdetailsWithSaveCard();
		paymentPagePo.verifyContentPaymentThankYouMessage();
		}catch(Exception e){
			throw e;
		}
	}
	

}

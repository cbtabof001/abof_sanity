/***********************************************************************
* @author 			:		RaghuKiram MR
* @description		: 		Page objects and re-usbale methods for Shopping Bag screen
* @module			:		Payment
* @reusable methods : 		verifyShoppingBagContent()
*/
package com.abof.pageobjects;

import java.util.List;

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

import io.appium.java_client.android.AndroidDriver;

public class ShoppingBagPO {

	AndroidDriver driver;
	String sData[] = null;
	String size = null;
	String[] ss = null;
	String browsersize = null;

	public ShoppingBagPO(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "shopping bag")
	private WebElement eleShoppingBagTxt;

	public WebElement getEleShoppingBagTxt() {
		return eleShoppingBagTxt;

	}

	@FindBy(id = "com.abof.android:id/brand_name")
	private WebElement eleBrandName;

	public WebElement getEleBrandName() {
		return eleBrandName;
	}

	@FindBy(id = "com.abof.android:id/et_coupon_code")
	private WebElement eleShoppingBagApplycouponIcon;

	public WebElement getEleShoppingBagApplycouponIcon() {
		return eleShoppingBagApplycouponIcon;
	}

	@FindBy(id = "com.abof.android:id/list_save_for_later_txt")
	private WebElement eleMoveToFavouritesIcon;

	public WebElement getEleMoveToFavouritesIcon() {
		return eleMoveToFavouritesIcon;
	}

	@FindBy(id = "com.abof.android:id/delete_view")
	private WebElement eleShoppingBagDeleteIcon;

	public WebElement getEleShoppingBagDeleteIcon() {
		return eleShoppingBagDeleteIcon;
	}
	
	
	@FindBy(xpath = "//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement eleBackBtn;

	public WebElement getEleBackBtn() {
		return eleBackBtn;
	}
	
	@FindBy(id = "com.abof.android:id/delete_view")
	private List<WebElement> eleShoppingDeleteIcon;

	public List<WebElement> getEleShoppingDeleteIcon() {
		return eleShoppingDeleteIcon;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']//android.widget.TextView")
	private List<WebElement> eleShoppingBagContentTxt;

	public List<WebElement> getEleShoppingBagContentTxt() {
		return eleShoppingBagContentTxt;
	}

	@FindBy(className = "android.widget.RelativeLayout")
	private List<WebElement> eleShoppingBagProductDetailsTxt;

	public List<WebElement> getEleShoppingBagProductDetailsTxt() {
		return eleShoppingBagProductDetailsTxt;
	}

	@FindBy(id = "com.abof.android:id/cart_icn")
	private WebElement eleShoppingBagIcon;

	public WebElement getEleShoppingBagIcon() {
		return eleShoppingBagIcon;
	}

	@FindBy(id = "com.abof.android:id/search_clear_icon")
	private WebElement eleCloseIcon;

	public WebElement getEleCloseIcon() {
		return eleCloseIcon;
	}

	@FindBy(id = "com.abof.android:id/button_place_order")
	private WebElement elePlaceOrderBtn;

	public WebElement getElePlaceOrderBtn() {
		return elePlaceOrderBtn;

	}

	@FindBy(xpath = "//android.widget.TextView[@text='Price Details']")
	private WebElement eleShoppingBagPriceDetailsTxt;

	public WebElement getEleShoppingBagPriceDetailsTxt() {
		return eleShoppingBagPriceDetailsTxt;
	}

	// com.abof.android:id/btnViewBag
	@FindBy(id = "com.abof.android:id/btnViewBag")
	private WebElement eleViewBagBtn;

	public WebElement getEleViewBagBtn() {
		return eleViewBagBtn;
	}

	@FindBy(id = "com.abof.android:id/continueShopping")
	private WebElement eleContinueShoppingLink;

	public WebElement getEleContinueShoppingLink() {
		return eleContinueShoppingLink;
	}

	@FindBy(id = "com.abof.android:id/itemEditView")
	private WebElement eleShoppingBagEditIcon;

	public WebElement getEleShoppingBagEditIcon() {
		return eleShoppingBagEditIcon;
	}

	@FindBy(name = "Delivery Address")
	private WebElement eleDeliveryAddressTxt;

	public WebElement getEleDeliveryAddressTxt() {
		return eleDeliveryAddressTxt;

	}

	@FindBys({ @FindBy(id = "com.abof.android:id/brand_name") })
	private List<WebElement> eleShoppingCartProductLst;

	public List<WebElement> getEleShoppingCartProductLst() {
		return eleShoppingCartProductLst;
	}

	/*
	 * author: Prerana Captured element in edit segment
	 */
	@FindBy(id = "com.abof.android:id/list_edit")
	private WebElement eleEditIcon;

	public WebElement getEleEditIcon() {
		return eleEditIcon;

	}

	@FindBy(id = "com.abof.android:id/item_quantity")
	private WebElement eleShoppingItemQuantity;

	public WebElement getEleShoppingItemQuantity() {
		return eleShoppingItemQuantity;
	}

	@FindBy(id = "com.abof.android:id/button_update")
	private WebElement eleUpdateBtn;

	public WebElement getEleUpdateBtn() {
		return eleUpdateBtn;

	}

	/*
	 * author: Prerana Captured WebElements for Apply coupon
	 */

	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Enter Coupon Code')]")
	private WebElement eleApplycouponTxtBx;

	public WebElement getEleApplycouponTxtBx() {
		return eleApplycouponTxtBx;
	}

	@FindBy(id = "com.abof.android:id/view_offers_title")
	private WebElement eleApplyCouponTitle;

	public WebElement getEleApplyCouponTitle() {
		return eleApplyCouponTitle;

	}

	@FindBy(id = "com.abof.android:id/closeView")
	private WebElement eleApplyCouponCloseBtn;

	public WebElement getEleApplyCouponCloseBtn() {
		return eleApplyCouponCloseBtn;

	}

	@FindBy(id = "com.abof.android:id/txtAvailableCoupon")
	private WebElement eleAvailableCouponTxt;

	public WebElement getEleAvailableCouponTxt() {
		return eleAvailableCouponTxt;

	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Other Coupons')]")
	private WebElement eleOtherCouponTxt;

	public WebElement getEleOtherCouponTxt() {
		return eleOtherCouponTxt;

	}

	@FindBy(id = "com.abof.android:id/confirm_btn")
	private WebElement eleApplyBtn;

	public WebElement getEleApplyBtn() {
		return eleApplyBtn;

	}

	@FindBy(id = "com.abof.android:id/copon_error_txt")
	private WebElement eleApplyCouponErrorMsg;

	public WebElement getEleApplyCouponErrorMsg() {
		return eleApplyCouponErrorMsg;

	}

	@FindBy(id = "com.abof.android:id/alert_title")
	private WebElement eleAlertTitle;

	public WebElement getEleAlertTitle() {
		return eleAlertTitle;

	}

	@FindBy(id = "com.abof.android:id/close_view")
	private WebElement eleAlertCloseBtn;

	public WebElement getEleAlertCloseBtn() {
		return eleAlertCloseBtn;

	}

	@FindBy(xpath = "//android.widget.Button[contains(@text,'Proceed')]")
	private WebElement eleAlertProceedBtn;

	public WebElement getEleAlertProceedBtn() {
		return eleAlertProceedBtn;

	}

	@FindBy(id = "com.abof.android:id/cancel_btn")
	private WebElement eleAlertCancelBtn;

	public WebElement getEleAlertCancelBtn() {
		return eleAlertCancelBtn;

	}

	@FindBy(id = "com.abof.android:id/view_coupon_success")
	private WebElement eleApplySuccessMsg;

	public WebElement getEleApplySuccessMsg() {
		return eleApplySuccessMsg;

	}

	@FindBy(id = "com.abof.android:id/apply_coupon_text")
	private WebElement eleCouponAppliedTxt;

	public WebElement getEleCouponAppliedTxt() {
		return eleCouponAppliedTxt;

	}

	@FindBy(id = "com.abof.android:id/coupon_layout")
	private WebElement eleAppliedCouponName;

	public WebElement getEleAppliedCouponName() {
		return eleAppliedCouponName;

	}

	@FindBy(id = "com.abof.android:id/remove_coupon")
	private WebElement eleRemoveCoupon;

	public WebElement getEleRemoveCoupon() {
		return eleRemoveCoupon;

	}

	@FindBy(id = "com.abof.android:id/coupon_text")
	private WebElement eleCouponDiscount;

	public WebElement getEleCouponDiscount() {
		return eleCouponDiscount;

	}

	@FindBy(id = "com.abof.android:id/item_size")
	private WebElement eleShoppingItemSize;

	public WebElement getEleShoppingItemSize() {
		return eleShoppingItemSize;
	}

	@FindBy(id = "com.abof.android:id/item_quantity")
	private WebElement eleItemQuantitydrpdwn;

	public WebElement getEleItemQuantitydrpdwn() {
		return eleItemQuantitydrpdwn;

	}

	@FindBy(id = "com.abof.android:id/tv_coupon_charge")
	private WebElement eleCouponCharge;

	public WebElement getEleCouponCharge() {
		return eleCouponCharge;

	}

	@FindBy(id = "com.abof.android:id/badge_count")
	private WebElement eleBadgeCount;

	public WebElement getEleBadgeCount() {
		return eleBadgeCount;
	}

	@FindBy(id = "com.abof.android:id/bag_count")
	private WebElement eleShoppingBagCount;

	public WebElement getEleShoppingBagCount() {
		return eleShoppingBagCount;
	}

	/*
	 * @author:Prerana list of webElements for available coupon and quantity
	 * drpdwn
	 */

	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id,'com.abof.android:id/coupon_list_view']//android.widget.RadioButton") })
	private List<WebElement> eleAvailableCouponLst;

	public List<WebElement> getEleAvailableCouponLst() {
		return eleAvailableCouponLst;
	}

	@FindBy(id = "com.abof.android:id/button_update")
	private WebElement eleupdateBtn;

	public WebElement getEleupdateBtn() {
		return eleupdateBtn;
	}

	@FindBy(id = "com.abof.android:id/cart_icn")
	private WebElement eleAllowBtn;

	public WebElement getEleAllowBtn() {
		return eleAllowBtn;
	}

	@FindBys({ @FindBy(xpath = "//android.widget.ListView/android.widget.TextView") })
	private List<WebElement> eleQuantityDrpDwnLst;

	public List<WebElement> getEleQuantityDrpDwnLst() {
		return eleQuantityDrpDwnLst;
	}

	@FindBy(id = "com.abof.android:id/textView")
	private WebElement eleSearchTxt;

	public WebElement getEleSearchTxt() {
		return eleSearchTxt;
	}

	public void selectSize(String[] size) throws InterruptedException {

		try {

			String size1 = size[0];
			String size2 = size[1];

			driver.findElement(By
					.xpath("//android.widget.ListView[@index='0']//android.widget.LinearLayout//android.widget.TextView[contains(@text,'"
							+ size1 + "') or contains(@text,'" + size2 + "')]"))
					.click();

		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * @author: RaghuKiran MR Description: Method for verifyShoppingBagContent
	 */
	public void verifyShoppingBagContent() {
		try {
			Thread.sleep(5000);
			BaseLib.swipeBottomToTop(.90, .22);
			for (WebElement eleShoppingBagText : getEleShoppingBagContentTxt()) {
				Assert.assertTrue(eleShoppingBagText.isDisplayed(),
						eleShoppingBagText.getText() + " is dispalyed in the shopping page.");
				NXGReports.addStep(eleShoppingBagText.getText() + " is dispalyed in the shopping page.", LogAs.PASSED,
						null);
			}

			for (int i = 1; i <= 2; i++) {
				List<WebElement> ShoppingProductContentTxt = driver.findElements(
						By.xpath("//android.widget.RelativeLayout[@index='" + i + "']//android.widget.TextView"));
				for (WebElement eleShoppingBagProductPriceTxt : ShoppingProductContentTxt) {

					Assert.assertTrue(eleShoppingBagProductPriceTxt.isDisplayed(),
							eleShoppingBagProductPriceTxt.getText() + " is dispalyed in the shopping page.");
					NXGReports.addStep(eleShoppingBagProductPriceTxt.getText() + "is dispalyed in the shopping page.",
							LogAs.PASSED, null);
				}

			}
			BaseLib.elementStatus(getElePlaceOrderBtn(), "The PlaceOrder Button ", "displayed");
			BaseLib.elementStatus(getEleContinueShoppingLink(), "The Continue Shopping Link is ", "displayed");
		} catch (Exception e) {

		}
	}

	/*
	 * @author: Prerana Bhatt Description: this is to apply coupon based on
	 * given argument (valid/invalid/expired)
	 *
	 * By testBox/available Coupon list/Othercoupon List
	 */

	public void applyCoupon(String couponStatus, String selectCouponby, String couponName) throws InterruptedException {

		try {
			sData=GenericLib.toReadExcelData("Login", "TC_APCOU_002");
			//BaseLib.waitforElement(driver, getEleApplyCouponTitle(), " Apply Coupon Title is not displayed");
			if (selectCouponby.equals(sData[3])) {
				if (couponStatus.equals(sData[2])) {

					System.out.println(getEleApplycouponTxtBx().isDisplayed());

					getEleApplycouponTxtBx().click();

					getEleApplycouponTxtBx().sendKeys(sData[4]);
					driver.hideKeyboard();
					Thread.sleep(3000);
					getEleApplyBtn().click();
					BaseLib.elementStatus(getEleCouponAppliedTxt(), "CouponApplied", "displayed");

					if (getEleApplySuccessMsg().getText().contains(sData[4])) {
						BaseLib.scrollToElement(2, "UP", .80, .20, getEleCouponDiscount());
						if (getEleCouponCharge().getText().contains("(-)")) {
							NXGReports.addStep("Coupon  Entered in textBox is applied", LogAs.PASSED, null);
						}
					}
				} else {
					getEleApplycouponTxtBx().click();
					getEleApplycouponTxtBx().sendKeys("ABC");
					getEleApplyBtn().click();
					BaseLib.elementStatus(getEleApplyCouponErrorMsg(), "invalid coupon error message", "displayed");
				}
			} else {

				getEleAvailableCouponLst().get(0).click();
				getEleApplyBtn().click();
				
			}
		} catch (Exception e) {
			throw e;
		}
	}
	/*
	 * @author: Prerana Bhatt
	 * 
	 * Description: to update quantity at cart Page
	 * 
	 */

	public void updateQuantityAtCart(String size) throws InterruptedException {
		getEleEditIcon().click();
		BaseLib.waitforElement(driver, getEleItemQuantitydrpdwn(), " Item Quantity drpdwn is not displayed");
		getEleItemQuantitydrpdwn().click();
		Thread.sleep(1000);
		for (int i = 0; i <= getEleQuantityDrpDwnLst().size() - 1; i++) {
			if (getEleQuantityDrpDwnLst().get(i).getText().equals(size)) {
				getEleQuantityDrpDwnLst().get(i).click();
				break;
			}
		}
		BaseLib.waitforElement(driver, getEleUpdateBtn(), " UpdateBtn is not displayed");
		getEleUpdateBtn().click();

		String updatedquantity = driver.findElement(By.id("com.abof.android:id/product_qty_value")).getText();
		if (updatedquantity.equals("2")) {
			NXGReports.addStep("Quantity updated in shopping cart page", LogAs.PASSED, null);
		}
	}

	public void selectqty(int qty) {

		try {
			driver.findElement(
					By.xpath("//android.widget.ListView[@index='0']//android.widget.TextView[@text='" + qty + "']"))
					.click();
		} catch (Exception e) {

		}
	}

	public void editShoppingBag() {

		sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
		WhatsHotLandingPO whatsHotLandingPo = new WhatsHotLandingPO(driver);
		size = sData[2];
		ss = size.split(",");
		try {
			Thread.sleep(3000);
			BaseLib.elementStatus(getEleShoppingBagEditIcon(), "The ShoppingBag Edit Icon", "displayed");
			getEleShoppingBagEditIcon().click();
			BaseLib.elementStatus(getEleShoppingItemSize(), "The ShoppingBag item size ", "displayed");
			Thread.sleep(3000);
			getEleShoppingItemSize().click();
			selectSize(ss);
			getEleShoppingItemQuantity().click();
			selectqty(1);
			Thread.sleep(2000);
			BaseLib.elementStatus(getEleupdateBtn(), "The ShoppingBag update button", "displayed");
			getEleupdateBtn().click();
			Thread.sleep(4000);
			BaseLib.elementStatus(getEleBrandName(), "The Brand name text", "displayed");
			getEleBrandName().click();
		} catch (Exception e) {

		}
	}

	public void browserselectSize(String[] size) throws InterruptedException {
		try {

			String size3 = size[0];
			String size4 = size[1];

			driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'" + size3
					+ "') or contains(@text,'" + size4 + "')]")).click();

		} catch (Exception e) {
			throw e;
		}
	}
	public void removeItemInShoppingBag() throws InterruptedException{
		try{
		Thread.sleep(4000);
		getEleShoppingBagIcon().click();
		int count=getEleShoppingDeleteIcon().size();
		for(int i=0;i<=count;i++){
			getEleShoppingBagDeleteIcon().click();
		}
		
		}catch(Exception e){
			Thread.sleep(4000);
			getEleBackBtn().click();
			getEleBackBtn().click();
		}
		
	}
	
	public void removeItemInShopping() throws InterruptedException{
		try{
		Thread.sleep(4000);
		getEleShoppingBagIcon().click();
		int count=getEleShoppingDeleteIcon().size();
		for(int i=0;i<=count;i++){
			getEleShoppingBagDeleteIcon().click();
		}
		Thread.sleep(4000);
		getEleBackBtn().click();
		}catch(Exception e)
		{
			Thread.sleep(4000);
			getEleBackBtn().click();
		}
		}
	

	/*
	 * @author: Prerana Bhatt 
	 *  
	 * Description: to verify product added to cart is available in Shopping cart Page or not
	 * 
	 */
	public void isProductAvailableInshoppingCart(String productName) throws InterruptedException
	{
		try{
	
		for(int i=0;i<=getEleShoppingCartProductLst().size()-1;i++)
		{
			if(getEleShoppingCartProductLst().get(i).getText().contains(productName))
			{			
				NXGReports.addStep("Product available in shopping cart", LogAs.PASSED,null);
				break;
			}
		}
		}catch(Exception e)
		{
			NXGReports.addStep("Product is not available in shopping cart", LogAs.FAILED,null);
			throw e;
		}
	}
	
	
}



/***********************************************************************
* @author 			:		Prerana Bhatt
* @description		: 		Page objects and re-usbale methods for BrowsePLPPDP screen
* @module			:		BrowsePLPPDP
* @reusable methods : 		verifyPlpContentDisplayed(),verifyPdpContentDisplayed(),checkPagination()
* 							handleSizePopUp(),viewBagStatus(),validatePinCodeStatus(),validateSizeGuide(),selectSize()
*/
package com.abof.pageobjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import net.sourceforge.htmlunit.corejs.javascript.ast.VariableDeclaration;

//this page class will contain product related info and PLP and PDP verification
public class BrowsePlpPdpPO {

	AndroidDriver driver;
	String statusMsg = null;
	String selectsizeaction = "Y";
	LoginPagePO login = null;
	HomePagePO homePagePo = null;
	String[] sizeArr = null;
	List<WebElement> lst;
	String texta = null;

	public BrowsePlpPdpPO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * These webElements are similar for PLP and PDP. Captured web element of
	 * Action Bar .
	 */

	@FindBy(xpath = "//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement eleBackBtn;

	public WebElement getEleBackBtn() {
		return eleBackBtn;
	}

	@FindBy(id = "com.abof.android:id/fav_icn")
	private WebElement eleNotificationIcon;

	public WebElement getEleNotificationIcon() {
		return eleNotificationIcon;
	}

	@FindBy(id = "com.abof.android:id/cart_icn")
	private WebElement eleCartIcon;

	public WebElement getEleCartIcon() {
		return eleCartIcon;
	}

	@FindBy(id = "com.abof.android:id/badge_count")
	private WebElement eleBadgeCount;

	public WebElement getEleBadgeCount() {
		return eleBadgeCount;
	}

	/* Captured web element based on PLP Screen */
	@FindBy(id = "com.abof.android:id/title")
	private WebElement elePlpCategoryName;

	public WebElement getElePlpCategoryName() {
		return elePlpCategoryName;
	}

	@FindBy(id = "com.abof.android:id/txt_product_count")
	private WebElement elePlpProductFoundTxt;

	public WebElement getElePlpProductFoundTxt() {
		return elePlpProductFoundTxt;
	}

	@FindBy(id = "com.abof.android:id/switchtolist")
	private WebElement elePlpSwitchtoListIcon;

	public WebElement getElePlpSwitchtoListIcon() {
		return elePlpSwitchtoListIcon;
	}

	@FindBy(id = "com.abof.android:id/fave_img_view")
	private WebElement elePlpFavIcon;

	public WebElement getElePlpFavIcon() {
		return elePlpFavIcon;
	}

	@FindBy(id = "com.abof.android:id/prduct_name")
	private WebElement elePlpProductName;

	public WebElement getElePlpProductName() {
		return elePlpProductName;
	}

	@FindBy(id = "com.abof.android:id/imgSimilar")
	private WebElement elePlpViewSimilarIcon;

	public WebElement getElePlpViewSimilarIcon() {
		return elePlpViewSimilarIcon;
	}

	@FindBy(id = "com.abof.android:id/actual_price")
	private WebElement elePlpActualPrice;

	public WebElement getElePlpActualPrice() {
		return elePlpActualPrice;
	}

	@FindBy(id = "com.abof.android:id/offer_price")
	private WebElement elePlpProductOfferPrice;

	public WebElement getElePlpOfferPrice() {
		return elePlpProductOfferPrice;
	}

	@FindBy(id = "com.abof.android:id/discounts")
	private WebElement elePlpDiscount;

	public WebElement getElePlpDiscount() {
		return elePlpDiscount;
	}

	@FindBy(id = "com.abof.android:id/img_filter")
	private WebElement elePlpFilterIcon;

	public WebElement getElePlpFilterIcon() {
		return elePlpFilterIcon;
	}

	// PLP WEBElement Lists

	/* to get the list of products */
	@FindBys({ @FindBy(id = "com.abof.android:id/product_img_view") })
	private List<WebElement> eleProductImageLst;

	public List<WebElement> getEleProductImageLst() {
		return eleProductImageLst;
	}

	// to get list of fav icons
	@FindBys({ @FindBy(id = "com.abof.android:id/fave_img_view") })
	private List<WebElement> elePlpFavLst;

	public List<WebElement> getElePlpFavLst() {
		return elePlpFavLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/prduct_name") })
	private List<WebElement> eleProductNameLst;

	public List<WebElement> getEleProductNameLst() {
		return eleProductNameLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/offer_price") })
	private List<WebElement> elePlpOfferPriceLst;

	public List<WebElement> getElePlpOfferPriceLst() {
		return elePlpOfferPriceLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/fave_img_view") })
	private List<WebElement> eleDiscountPriceLst;

	public List<WebElement> getEleDiscountPriceLst() {
		return eleDiscountPriceLst;
	}
	// PDP WebElements

	@FindBy(id = "com.abof.android:id/indicator")
	private WebElement elePdpCirclingIcon;// need to check name

	public WebElement getElePdpCirclingIcon() {
		return elePdpCirclingIcon;
	}

	@FindBy(id = "com.abof.android:id/pdp_name")
	private WebElement elePdpProductName;

	public WebElement getElePdpProductName() {
		return elePdpProductName;
	}

	@FindBy(id = "com.abof.android:id/pdp_discount_price")
	private WebElement elePdpOfferPrice;

	public WebElement getElePdpOfferPrice() {
		return elePdpOfferPrice;
	}

	@FindBy(id = "com.abof.android:id/pdp_price")
	private WebElement elePdpActualPrice;

	public WebElement getElePdpActualPrice() {
		return elePdpActualPrice;
	}

	@FindBy(id = "com.abof.android:id/pdp_discount_price")
	private WebElement elePdpDiscount;

	public WebElement getElePdpDiscount() {
		return elePdpDiscount;
	}

	/* Captured web element based on Style Tip segment in PDP */

	@FindBy(id = "com.abof.android:id/pdp_style_tip_text")
	private WebElement elePdpStyleTipTxt;

	public WebElement getElePdpStyleTipTxt() {
		return elePdpStyleTipTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_style_tip_expandable")
	private WebElement eleStyleTipExpandableIcon;

	public WebElement getEleStyleTipExpandableIcon() {
		return eleStyleTipExpandableIcon;
	}

	/* captured Web element for Pin-code based delivery segment in PDP */

	@FindBy(id = "com.abof.android:id/pdp_delivery_text")
	private WebElement elePdpDeliveryTxt;

	public WebElement getElePdpDeliveryTxt() {
		return elePdpDeliveryTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_delivery_expandable")
	private WebElement eleDeliveryTxtExpandableIcon;

	public WebElement getEleDeliveryTxtExpandableIcon() {
		return eleDeliveryTxtExpandableIcon;
	}

	@FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.abof.android:id/pincode')]")
	private WebElement elePincodeTxtBx;

	public WebElement getElePincodeTxtBx() {
		return elePincodeTxtBx;
	}

	@FindBy(xpath = "//android.widget.Button[contains(@text,'Check')]")
	private WebElement eleCheckDeliveryBtn;

	public WebElement getEleCheckDeliveryBtn() {
		return eleCheckDeliveryBtn;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'This is not a place for sure! Please check the pin code again')]")
	private WebElement eleInvalidPincodeStatus;

	public WebElement getEleInvalidPincodeStatus() {
		return eleInvalidPincodeStatus;
	}
	
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Women')]")
	private WebElement eleWomenPlpPage;

	public WebElement getEleWomenPlpPage() {
		return eleWomenPlpPage;
	}
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Men')]")
	private WebElement eleMenPlpPage;

	public WebElement getEleMenPlpPage() {
		return eleMenPlpPage;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'You can get it by')]")
	private WebElement eleValidPincodeStatus;

	public WebElement getEleValidPincodeStatus() {
		return eleValidPincodeStatus;
	}

	/* Captured web element based on Info and care segment in PDP */

	@FindBy(id = "com.abof.android:id/pdp_infocare_text")
	private WebElement elePdpInfoCareTxt;

	public WebElement getElePdpInfoCareTxt() {
		return elePdpInfoCareTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_infocare_expandable")
	private WebElement eleInfoCareExpandableIcon;

	public WebElement getEleInfoCareExpandableIcon() {
		return eleInfoCareExpandableIcon;
	}

	@FindBy(id = "com.abof.android:id/pdp_infocare_details_text")
	private WebElement eleInfoCareDetailTxt;

	public WebElement getEleInfoCareDetailTxt() {
		return eleInfoCareDetailTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_infocare_materialcare_text")
	private WebElement eleMaterialAndCareTxt;

	public WebElement getEleMaterialAndCareTxt() {
		return eleMaterialAndCareTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_infocare_sizefit_text")
	private WebElement eleSizeAndFitTxt;

	public WebElement getEleSizeAndFitTxt() {
		return eleSizeAndFitTxt;
	}

	@FindBy(id = "com.abof.android:id/pdp_infocare_moreinfo_text")
	private WebElement eleMoreInfoTxt;

	public WebElement getEleMoreInfoTxt() {
		return eleMoreInfoTxt;
	}

	/* Captured web element for AddTOBAG Segment */

	@FindBy(id = "com.abof.android:id/pdp_save_for_later_icon2")
	private WebElement elePdpSaveForLaterLnk;

	public WebElement getElePdpSaveForLaterLnk() {
		return elePdpSaveForLaterLnk;
	}

	@FindBy(id = "com.abof.android:id/pdp_share2")
	private WebElement elePdpShareLnk;

	public WebElement getElePdpShareLnk() {
		return elePdpShareLnk;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='3']//android.widget.TextView")
	private List<WebElement> eleInfoCareTxt;

	public List<WebElement> getEleInfoCareTxt() {
		return eleInfoCareTxt;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Facebook')]")
	private WebElement eleShareFacebookLnk;

	public WebElement getEleShareFacebookLnk() {
		return eleShareFacebookLnk;
	}

	@FindBy(id = "com.facebook.katana:id/link_attachment_bottom_image_block")
	private WebElement eleSharedProductInfo;

	public WebElement getEleSharedProductInfo() {
		return eleSharedProductInfo;
	}

	@FindBy(id = "com.facebook.katana:id/button_share")
	private WebElement eleFacebookPostBtn;

	public WebElement getEleFacebookPostBtn() {
		return eleFacebookPostBtn;
	}

	@FindBy(id = "com.abof.android:id/add_to_cart_stickybutton2")
	private WebElement elePdpAddToBagBtn;

	public WebElement getElePdpAddToBagBtn() {
		return elePdpAddToBagBtn;
	}

	@FindBy(id = "com.abof.android:id/btnViewBag")
	private WebElement elePdpViewBagLnk;

	public WebElement getElePdpViewBagLnk() {
		return elePdpViewBagLnk;
	}

	@FindBy(id = "com.abof.android:id/txtViewBagStatusMessage")
	private WebElement elePdpViewBagStatusMsg;

	public WebElement getElePdpViewBagStatusMsg() {
		return elePdpViewBagStatusMsg;
	}

	/*
	 * captures web element from Goes Well With It and Recently viewed Segment
	 * in PDP
	 * 
	 * 
	 * productName discount captured in PLP product_img captures in PLP list
	 */

	@FindBy(id = "com.abof.android:id/txtGoesWellIt")
	private WebElement eleGoesWellWithItTxt;

	public WebElement getEleGoesWellWithItTxt() {
		return eleGoesWellWithItTxt;
	}

	@FindBy(id = "com.abof.android:id/txtRecentlyViewed")
	private WebElement eleRecentlyViewedTxt;

	public WebElement getEleRecentlyViewedTxt() {
		return eleRecentlyViewedTxt;
	}

	@FindBy(id = "com.abof.android:id/txtMoreLikeIt")
	private WebElement eleMoreLikeItTxt;

	public WebElement getEleMoreLikeItTxt() {
		return eleMoreLikeItTxt;
	}

	/*
	 * Captured web element in Select Size PopUp
	 */

	/* Captured web element in Select Size PopUp */

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Select Size')]")
	private WebElement eleSelectSizeTxt;

	public WebElement getEleSelectSizeTxt() {
		return eleSelectSizeTxt;
	}

	@FindBy(id = "com.abof.android:id/btnDone")
	private WebElement eleDoneBtn;

	public WebElement getEleDoneBtn() {
		return eleDoneBtn;
	}

	@FindBy(id = "com.abof.android:id/btnCancel")
	private WebElement eleCancelBtn;

	public WebElement getEleCancelBtn() {
		return eleCancelBtn;
	}

	/* Captured web element in SizeGuide Link */

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Size Guide')]")
	private WebElement elePdpSizeGuideLnk;

	public WebElement getElePdpSizeGuideLnk() {
		return elePdpSizeGuideLnk;
	}

	@FindBy(id = "com.abof.android:id/closeview")
	private WebElement eleSizeGuideCloseBtn;

	public WebElement getEleSizeGuideCloseBtn() {
		return eleSizeGuideCloseBtn;
	}

	@FindBy(xpath = "//android.view.View")
	private WebElement eleSizeGuideView;

	public WebElement getEleSizeGuideView() {
		return eleSizeGuideView;
	}

	/*
	 * Captured webElement based on filter screen
	 */

	@FindBy(id = "com.abof.android:id/filter_header_back_txt")
	private WebElement eleFilterCloseBtn;

	public WebElement getEleFilterCloseBtn() {
		return eleFilterCloseBtn;
	}

	@FindBy(id = "com.abof.android:id/filter_product_count")
	private WebElement eleFilterProductFound;

	public WebElement getEleFilterProductFound() {
		return eleFilterProductFound;

	}

	@FindBy(id = "com.abof.android:id/filter_clear_bt")
	private WebElement eleFilterClearAll;

	public WebElement getEleFilterClearAll() {
		return eleFilterClearAll;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Sort')]")
	private WebElement eleFilterSort;

	public WebElement getEleFilterSort() {
		return eleFilterSort;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Gender')]")
	private WebElement eleFilterGender;

	public WebElement getEleFilterGender() {
		return eleFilterGender;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/pdp_colorname") })
	private List<WebElement> elePdpColorLst;

	public List<WebElement> getElePdpColorLst() {
		return elePdpColorLst;
	}

	/*
	 * WebElemnts for search functionality Author: Srinivas Hippargi
	 */
	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.abof.android:id/searcherrorViewText']//android.widget.TextView") })
	private List<WebElement> eleInvalidResultsErrorMsgLst;

	public List<WebElement> getEleInvalidResultsErrorMsgLst() {
		return eleInvalidResultsErrorMsgLst;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'My Favourites')]")
	private WebElement eleSearchMyFavouriteBtn;

	public WebElement getEleSearchMyFavouriteBtn() {
		return eleSearchMyFavouriteBtn;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Our Recommendations')]")
	private WebElement eleSearchOurRecommendationsBtn;

	public WebElement getEleSearchOurRecommendationsBtn() {
		return eleSearchOurRecommendationsBtn;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.GridView[@resource-id='com.abof.android:id/searcherrorRecommendationGrid']//android.widget.TextView") })
	private List<WebElement> eleSearchViewErrorPagerProdLst;

	public List<WebElement> getEleSearchViewErrorPagerProdLst() {
		return eleSearchViewErrorPagerProdLst;
	}

	// Search Auto Suggestions elements
	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.abof.android:id/popular_layout']//android.widget.TextView") })
	private List<WebElement> elePopularSearchesLst;

	public List<WebElement> getElePopularSearchesLst() {
		return elePopularSearchesLst;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.abof.android:id/category_layout']//android.widget.TextView") })
	private List<WebElement> eleSearchCategoriesLst;

	public List<WebElement> getEleSearchCategoriesLst() {
		return eleSearchCategoriesLst;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.abof.android:id/brand_layout']//android.widget.TextView") })
	private List<WebElement> eleSearchBrandsLst;

	public List<WebElement> getEleSearchBrandsLst() {
		return eleSearchBrandsLst;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.abof.android:id/thumbnail_layout']//android.widget.TextView") })
	private List<WebElement> eleSearchProductLst;

	public List<WebElement> getEleSearchProductLst() {
		return eleSearchProductLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/prduct_name") })
	private List<WebElement> eleSearchPLPprodNameTxt;

	public List<WebElement> getEleSearchPLPprodNameTxt() {
		return eleSearchPLPprodNameTxt;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Recent Searches']")
	private WebElement eleRecentSearchesBtn;

	public WebElement getEleRecentSearchesBtn() {
		return eleRecentSearchesBtn;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Size')]")
	private WebElement eleFilterSize;

	public WebElement getEleFilterSize() {
		return eleFilterSize;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Brand')]")
	private WebElement eleFilterBrand;

	public WebElement getEleFilterBrand() {
		return eleFilterBrand;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Colour')]")
	private WebElement eleFilterColour;

	public WebElement getEleFilterColour() {
		return eleFilterColour;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Popularity')]")
	private WebElement eleFilterPopularity;

	public WebElement getEleFilterPopularity() {
		return eleFilterPopularity;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Newest')]")
	private WebElement eleFilterNewest;

	public WebElement getEleFilterNewest() {
		return eleFilterNewest;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Discount')]")
	private WebElement eleFilterDiscount;

	public WebElement getEleFilterDiscount() {
		return eleFilterDiscount;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Price-High to Low')]")
	private WebElement eleFilterPriceHighToLow;

	public WebElement getEleFilterPriceHighToLow() {
		return eleFilterPriceHighToLow;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/prduct_name") })
	private List<WebElement> elePlpProductNameLst;

	public List<WebElement> getElePlpProductNameLst() {
		return elePlpProductNameLst;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Price-Low to High')]")
	private WebElement eleFilterPriceLowToHigh;

	public WebElement getEleFilterPriceLowToHigh() {
		return eleFilterPriceLowToHigh;
	}

	@FindBy(id = "com.abof.android:id/img_filter_tick")
	private WebElement eleFilterTickBtn;

	public WebElement getEleFilterTickBtn() {
		return eleFilterTickBtn;
	}

	@FindBy(id = "com.abof.android:id/brand_search")
	private WebElement eleFilterSearchBtn;

	public WebElement getEleFilterSearchBtn() {
		return eleFilterSearchBtn;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/text") })
	private List<WebElement> eleFilterBrandLst;

	public List<WebElement> getEleFilterBrandLst() {
		return eleFilterBrandLst;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Product')]")
	private WebElement eleFilterProduct;

	public WebElement getEleFilterProduct() {
		return eleFilterProduct;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Price')]")
	private WebElement eleFilterPrice;

	public WebElement getEleFilterPrice() {
		return eleFilterPrice;
	}

	/* SKULT PLP webelements */

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Skult')]")
	private WebElement eleSkultTxt;

	public WebElement getEleSkultTxt() {
		return eleSkultTxt;
	}

	@FindBy(xpath = "//android.widget.Button[contains(@text,'View All Looks')]")
	private WebElement eleSkultViewAllLooksBtn;

	public WebElement getEleSkultViewAllLooksBtn() {
		return eleSkultViewAllLooksBtn;
	}

	@FindBy(xpath = "//android.widget.Button[contains(@text,'ADD TO BAG')]")
	private WebElement eleLookDetailAddToCartBtn;

	public WebElement getEleLookDetailAddToCartBtn() {
		return eleLookDetailAddToCartBtn;
	}

	@FindBy(id = "com.abof.android:id/look_detail_share")
	private WebElement eleLookDetailShareLnk;

	public WebElement getLookDetailShareLnk() {
		return eleLookDetailShareLnk;
	}

	@FindBy(id = "com.abof.android:id/look_detail_save_for_later_icon")
	private WebElement eleLookDetailFavIcon;

	public WebElement getEleLookDetailFavIcon() {
		return eleLookDetailFavIcon;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Total Price')]")
	private WebElement eleTotalPriceTxt;

	public WebElement getEleTotalPriceTxt() {
		return eleTotalPriceTxt;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/lookdetail_sizelayout") })
	private List<WebElement> elelookDetailsizeDrpdwnLst;

	public List<WebElement> getElelookDetailsizeDrpdwnLst() {
		return elelookDetailsizeDrpdwnLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/pdp_sizename") })
	private List<WebElement> eleSizeNameLst;

	public List<WebElement> getEleSizeNameLst() {
		return eleSizeNameLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/hor_layout_view") })
	private List<WebElement> eleSkultShopLooksCarousalLst;

	public List<WebElement> getEleSkultShopLooksCarousalLst() {
		return eleSkultShopLooksCarousalLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/look_detail_checkbox") })
	private List<WebElement> eleSkultLookDetailCheckboxLst;

	public List<WebElement> getEleSkultLookDetailCheckboxLst() {
		return eleSkultLookDetailCheckboxLst;
	}

	@FindBys({ @FindBy(id = "com.abof.android:id/discounts") })
	private List<WebElement> elePriceLst;

	public List<WebElement> getElePriceLst() {
		return elePriceLst;
	}
	
	@FindBy(id="com.abof.android:id/out_of_stock_txt")
	private WebElement eleOutofStockTxt;

	public WebElement getEleOutofStockTxt() {
		return eleOutofStockTxt;
	}

	/*
	 * Author: Prerana Bhatt description: this is to check the pagination in PLp
	 */
	public void checkPagination() {
		LoginPagePO loginpo=new LoginPagePO(driver);
		for (int i = 0; i <= 5; i++) {
			
			BaseLib.swipeBottomToTop(.80, .20);
			loginpo.handleOkayBtn();
			BaseLib.IsListDisplayed(getEleProductImageLst(), "DifferentProducts");
			BaseLib.IsListDisplayed(getElePlpProductNameLst(), "ProductNames");
			BaseLib.IsListDisplayed(getElePlpOfferPriceLst(), "OfferPrice");

		}

	}

	/*
	 * Author: Prerana Bhatt description: this method perform different action
	 * in PDP page ,start from selecting size,pincode,till add to bag
	 * 
	 * this method can be used for negative and positive scenarios based on
	 * argument passed
	 * 
	 */

	public void pdpFlow(String selectaction, String size, String popupconfirmation, String pincode)
			throws InterruptedException {

		sizeArr = size.split(",");

		if (selectsizeaction.equals(selectaction)) {

			driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'"
					+ sizeArr[0] + "') or contains(@text,'" + sizeArr[1] + "')]")).click();

		} else {

			getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'"
					+ sizeArr[0] + "') or contains(@text,'" + sizeArr[1] + "')]")).click();
			if (popupconfirmation.equals("cancel")) {
				getEleCancelBtn().click();
			} else {
				getEleDoneBtn().click();
				verifyViewBagStaus();
			}
		}

		if (pincode == "0") {

		} else {
			Thread.sleep(4000);
			BaseLib.scrollToElement(2, "UP", .80, .20, getElePdpDeliveryTxt());
			int length = pincode.length() - 1;
			if (length > 5 || length < 5) {
				getElePincodeTxtBx().click();
				for (int i = 0; i <= 5; i++) {
					driver.pressKeyCode(AndroidKeyCode.DEL);
				}
				getElePincodeTxtBx().sendKeys(pincode);
				driver.hideKeyboard();
				Thread.sleep(5000);
				getEleCheckDeliveryBtn().click();
				statusMsg = getEleInvalidPincodeStatus().getText();
				BaseLib.elementStatus(getEleInvalidPincodeStatus(), statusMsg, "displayed");
			} else {
				getElePincodeTxtBx().click();
				for (int i = 0; i <= 5; i++) {
					driver.pressKeyCode(AndroidKeyCode.DEL);
				}
				getElePincodeTxtBx().sendKeys(pincode);
				driver.hideKeyboard();
				Thread.sleep(5000);
				getEleCheckDeliveryBtn().click();
				statusMsg = getEleValidPincodeStatus().getText();
				BaseLib.elementStatus(getEleValidPincodeStatus(), statusMsg, "displayed");
			}

		}
	}
	
	
	public void skultpdpflow(String selectaction, String size, String popupconfirmation) throws InterruptedException{
		
		sizeArr = size.split(",");

		if (selectsizeaction.equals(selectaction)) {

			driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'"
					+ sizeArr[0] + "') or contains(@text,'" + sizeArr[1] + "')]")).click();

		} else {

			getElePdpAddToBagBtn().click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.TextView[contains(@text,'"
					+ sizeArr[0] + "') or contains(@text,'" + sizeArr[1] + "')]")).click();
			if (popupconfirmation.equals("cancel")) {
				getEleCancelBtn().click();
			} else {
				getEleDoneBtn().click();
				verifyViewBagStaus();
			}
		}
		
	}

	/*
	 * Author: Srinivas Hippargi description: verify search option based on
	 * valid and invalid input
	 */
	public void validateSearchOptions(String searchOption) throws InterruptedException, IOException {
		homePagePo = new HomePagePO(driver);
		NXGReports.addStep("Searching for " + searchOption, LogAs.INFO, null);
		homePagePo.getEleHomeSearchIcon().click();
		homePagePo.getEleSearchEdtBx().sendKeys(searchOption);
		Thread.sleep(5000);
		/*
		 * if (BaseLib.verifyToastMessage(driver).contains("No data available"))
		 * {
		 */
		try {
			if (searchOption.contains("%")) {
				String[] searchOpts = searchOption.split(" ");
				String searchOpt = searchOpts[searchOpts.length - 1];
				getEleRecentSearchesBtn().isDisplayed();
				BaseLib.tapOnElement(.98, .99);
				validateSearchProdycts(searchOpt);
				driver.navigate().back();
				driver.navigate().back();

			} else {
				getEleRecentSearchesBtn().isDisplayed();
				BaseLib.tapOnElement(.98, .99);
				Thread.sleep(10000);
				try {
					for (WebElement eleInvalidResultsTxt : getEleInvalidResultsErrorMsgLst()) {
						Assert.assertTrue(eleInvalidResultsTxt.isDisplayed(),
								eleInvalidResultsTxt.getText() + " element is not dispalyed in the Inavlid reult page");
						NXGReports.addStep(
								eleInvalidResultsTxt.getText() + " element is dispalyed in the Inavlid reult page",
								LogAs.PASSED, null);
					}
					Thread.sleep(5000);
					BaseLib.elementStatus(getEleSearchMyFavouriteBtn(), "My Favourite section element ", "displayed");
					getEleSearchMyFavouriteBtn().click();
					for (WebElement eleMyFavProd : getEleSearchViewErrorPagerProdLst()) {
						Assert.assertTrue(eleMyFavProd.isDisplayed(), eleMyFavProd.getText()
								+ " element is not dispalyed in the Inavlid serach my favourite list products");
						NXGReports.addStep(
								eleMyFavProd.getText()
										+ "element is dispalyed in the Inavlid serach my favourite list products",
								LogAs.PASSED, null);
					}
					BaseLib.elementStatus(getEleSearchOurRecommendationsBtn(), "Our Recommendations section element ",
							"displayed");
					getEleSearchOurRecommendationsBtn().click();
					for (WebElement eleOurRecommendationsProd : getEleSearchViewErrorPagerProdLst()) {
						Assert.assertTrue(eleOurRecommendationsProd.isDisplayed(), eleOurRecommendationsProd.getText()
								+ " element is not dispalyed in the Inavlid serach our recommendations list products");
						NXGReports.addStep(
								eleOurRecommendationsProd.getText()
										+ " element is dispalyed in the Inavlid serach our recommendations list products",
								LogAs.PASSED, null);
					}
					driver.navigate().back();
					driver.navigate().back();
				} catch (RuntimeException e) {
					// TODO: handle exception

					getEleSearchOurRecommendationsBtn().isDisplayed();
					NXGReports.addStep("Our Recommendations section is displayed", LogAs.PASSED, null);
					getEleSearchOurRecommendationsBtn().click();
					for (WebElement eleOurRecommendationsProd : getEleSearchViewErrorPagerProdLst()) {
						Assert.assertTrue(eleOurRecommendationsProd.isDisplayed(), eleOurRecommendationsProd.getText()
								+ " element is not dispalyed in the Inavlid serach our recommendations list products");
						NXGReports.addStep(
								eleOurRecommendationsProd.getText()
										+ " element is dispalyed in the Inavlid serach our recommendations list products",
								LogAs.PASSED, null);
					}
					driver.navigate().back();
					driver.navigate().back();
				} catch (Exception e) {
					throw e;
				}
			}
		} catch (RuntimeException e) {
			// TODO: handle exception
			Thread.sleep(5000);
			try {
				validateAutoSuggestions(getElePopularSearchesLst(), searchOption);
				BaseLib.scrollToElement(4, "UP", .90, .50, getEleSearchCategoriesLst().get(0));
				validateAutoSuggestions(getEleSearchCategoriesLst(), searchOption);
				Thread.sleep(5000);
				BaseLib.swipeBottomToTop(.90, .50);
				validateAutoSuggestions(getEleSearchBrandsLst(), searchOption);
				driver.navigate().back();
			} catch (RuntimeException e1) {
				String searchOpts[] = searchOption.split(" ");
				String serach = searchOpts[0];
				validateAutoSuggestions(getEleSearchCategoriesLst(), serach);
				Thread.sleep(5000);
				BaseLib.swipeBottomToTop(.90, .50);
				validateAutoSuggestions(getEleSearchBrandsLst(), serach);
				driver.navigate().back();
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}

		// TODO: handle exception
	}

	public void validateAutoSuggestions(List<WebElement> autoSearchTest, String serachOption) {
		for (WebElement elePopularSearchesProd : autoSearchTest) {
			Assert.assertTrue(elePopularSearchesProd.isDisplayed(),
					elePopularSearchesProd.getText() + " element is not dispalyed in the Autosuggetions text");
			NXGReports.addStep(elePopularSearchesProd.getText() + " element is dispalyed in the Autosuggetions text",
					LogAs.PASSED, null);
		}
		autoSearchTest.get(1).click();
		validateSearchProdycts(serachOption);
		driver.navigate().back();

	}

	public void validateSearchProdycts(String seacrhOption) {

		for (int i = 0; i < getEleSearchPLPprodNameTxt().size(); i++) {
			Assert.assertTrue(
					getEleSearchPLPprodNameTxt().get(i).getText().toLowerCase().contains(seacrhOption.toLowerCase()),
					seacrhOption + " element is not dispalyed in the search PLP Product name");
			NXGReports.addStep(
					getEleSearchPLPprodNameTxt().get(i).getText() + " element dispalyed in the search PLP Product name",
					LogAs.PASSED, null);
		}
	}

	/*Author: Prerana Bhatt
	 * description: this method perform Filter based on given argument 
	 * category and subcategory .
	 */

	public void toValidateFilterOptions(String category, String subCategory) throws InterruptedException {

		try {
			driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + category + "')]")).click();

			if (category.equals("Sort")) {
				Thread.sleep(4000);
				driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + subCategory
						+ "')]/../android.widget.RelativeLayout")).click();
			} else if (category.equals("Brand")) {
				getEleFilterSearchBtn().sendKeys(subCategory);
				for (int i = 0; i <= getEleFilterBrandLst().size() - 1; i++) {
					if (getEleFilterBrandLst().get(i).getText().equals(subCategory)) {
						getEleFilterBrandLst().get(i).click();
					}
				}
			} else {

				driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + subCategory
						+ "')]/../..//android.widget.ImageView")).click();
			}
		} catch (Exception e) {
			NXGReports.addStep("given brand is not available for the selected product ", LogAs.INFO,
					new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		// need to add Else-if for colors

	}
	/*
	 * description: this is to verify whether all webElement is displayed in
	 * PLP,Pdp and Filter Screen respectively. this method check contents of
	 * screen based on the argument passed.
	 */

	public void toVerifyPageContentsDisplay(String arg) {
		switch (arg) {
		case "Plp":
			NXGReports.addStep("PLP CONENT VERIFICATIONS", LogAs.INFO, null);
			BaseLib.elementStatus(getEleBackBtn(), "BackButton", "displayed");
			BaseLib.elementStatus(getElePlpCategoryName(), "CategoryName", "displayed");
			BaseLib.elementStatus(getEleNotificationIcon(), "NotificationIcon", "displayed");
			BaseLib.elementStatus(getEleCartIcon(), "CartIcon", "displayed");
			BaseLib.elementStatus(getElePlpProductFoundTxt(), "Product Found", "displayed");
			BaseLib.elementStatus(getElePlpSwitchtoListIcon(), "SwitchtoList", "displayed");
			BaseLib.elementStatus(getElePlpProductName(), "ProductName", "displayed");
			BaseLib.elementStatus(getElePlpOfferPrice(), "ActualPrice", "displayed");
			BaseLib.elementStatus(getElePlpViewSimilarIcon(), "ViewSimilarIcon", "displayed");
			BaseLib.elementStatus(getElePlpFilterIcon(), "FilterIcon", "displayed");
			BaseLib.elementStatus(getElePlpFavIcon(), "FavIcon", "displayed");
			break;

		case "Pdp":
			NXGReports.addStep("PDP CONENT VERIFICATIONS", LogAs.INFO, null);
			BaseLib.elementStatus(getEleBackBtn(), "BackButton", "displayed");
			BaseLib.elementStatus(getEleNotificationIcon(), "NotificationIcon", "displayed");
			BaseLib.elementStatus(getEleCartIcon(), "CartIcon", "displayed");
			BaseLib.elementStatus(getElePdpProductName(), "ProductName", "displayed");
			BaseLib.elementStatus(getElePdpOfferPrice(), "OfferedPrice", "displayed");
			BaseLib.elementStatus(getElePdpSizeGuideLnk(), "SizeGuideLink", "displayed");
			BaseLib.elementStatus(getElePdpSaveForLaterLnk(), "SaveForLaterLink", "displayed");
			//BaseLib.elementStatus(getElePdpShareLnk(), "ShareLink", "displayed");
			BaseLib.elementStatus(getElePdpAddToBagBtn(), "AddTOBagButton", "displayed");
			break;
		case "Filter":
			NXGReports.addStep("FILETR CONENT VERIFICATIONS", LogAs.INFO, null);
			BaseLib.elementStatus(getEleFilterCloseBtn(), " FilterCloseBtn", "displayed");
			BaseLib.elementStatus(getEleFilterProductFound(), "FilterProductFound ", "displayed");
			BaseLib.elementStatus(getEleFilterClearAll(), "FilterClearAll ", "displayed");
			BaseLib.elementStatus(getEleFilterSort(), "FilterSort ", "displayed");
			BaseLib.elementStatus(getEleFilterGender(), "FilterGender ", "displayed");
			BaseLib.elementStatus(getEleFilterProduct(), "FilterProduct ", "displayed");
			BaseLib.elementStatus(getEleFilterPrice(), "FilterPrice ", "displayed");
			BaseLib.elementStatus(getEleFilterSize(), "FilterSize ", "displayed");
			BaseLib.elementStatus(getEleFilterBrand(), "FilterBrand ", "displayed");
			BaseLib.elementStatus(getEleFilterColour(), "FilterColour ", "displayed");
			BaseLib.elementStatus(getEleFilterPopularity(), " FilterPopularity", "displayed");
			BaseLib.elementStatus(getEleFilterNewest(), " FilterNewest", "displayed");
			BaseLib.elementStatus(getEleFilterDiscount(), "FilterDiscount ", "displayed");
			BaseLib.elementStatus(getEleFilterPriceLowToHigh(), "FilterPriceLowToHigh ", "displayed");
			driver.findElement(By
					.xpath("//android.widget.TextView[contains(@text,'Popularity')]/../android.widget.RelativeLayout"))
					.isSelected();

			NXGReports.addStep("Popularity radio btn is selected", LogAs.PASSED, null);
			driver.findElement(By.xpath(
					"//android.widget.ImageView[contains(@resource-id,'com.abof.android:id/category_image')and  @index='0']"));

			NXGReports.addStep("arrow is at first filter", LogAs.PASSED, null);
			break;
		case "More":
			NXGReports.addStep("MORE CONENT VERIFICATIONS", LogAs.INFO, null);
			BaseLib.elementStatus(getEleMoreLikeItTxt(), "MoreLikeIt Text", "displayed");
			BaseLib.IsListDisplayed(getEleProductImageLst(), "Products Name in moreLikeIt Segment");
			BaseLib.IsListDisplayed(getEleProductNameLst(), "Products Name in moreLikeIt Segment");
			BaseLib.IsListDisplayed(getElePriceLst(), "Price list in moreLikeIt Segment");

			break;
		case "RecentlyViewed":
			NXGReports.addStep("RECENTLY VIEWED CONENT VERIFICATIONS", LogAs.INFO, null);
			BaseLib.elementStatus(getEleRecentlyViewedTxt(), "RecentlyViewed Text ", "displayed");
			BaseLib.IsListDisplayed(getEleProductImageLst(), "Products Name in RecentlyViewed Segment");
			BaseLib.IsListDisplayed(getEleProductNameLst(), "Products Name in RecentlyViewed Segment");
			BaseLib.IsListDisplayed(getElePriceLst(), "Price list in RecentlyViewed Segment");
			break;

		default:
			NXGReports.addStep("No such Screen or segment available in PLP and PDP page", LogAs.FAILED, null);
			break;
		}
	}

	/*
	 * Author: Prerana Bhatt
	 * description: this is to verify MoreLikeIT,RecentlyViewed carousal whether all 
	 * element is displayed or not. Selecting very first element in the list
	 */
	public void verifyBottomSegementCarousal(WebElement element) {

		BaseLib.scrollToElement(6, "UP", .80, .20, element);
		toVerifyPageContentsDisplay(element.getText());
		texta = element.getText();
		lst = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,'" + texta
				+ "')]/../android.widget.FrameLayout//android.widget.ImageView[contains(@resource-id,'com.abof.android:id/product_img_view')]"));
		lst.get(0).click();
		toVerifyPageContentsDisplay("Pdp");
	}

	/*
	 * Author: Prerana Bhatt description: this is to verify successful text
	 * message "added to bag"&"Product already in bag" displayed or not,upon
	 * click of add to bag btn
	 * 
	 */

	public void verifyViewBagStaus() {
		if (getElePdpViewBagStatusMsg().getText().equals("Product already in bag")) {

			if (Integer.parseInt(getEleBadgeCount().getText()) > 1) {
				NXGReports.addStep("Product already in bag", LogAs.PASSED, null);
			}

		} else {

			BaseLib.elementStatus(getElePdpViewBagStatusMsg(), getElePdpViewBagStatusMsg().getText(), "displayed");
			BaseLib.elementStatus(getElePdpViewBagLnk(), "ViewBagLink", "displayed");
		}
	}

	/*
	 * Description: this method is used to convert string value to int
	 * 
	 * @autor :Prerana
	 */

	public int convertPriceToIntValue(String price) {
		StringBuilder str = new StringBuilder();
		str.setLength(0);
		for (int j = 0; j <= price.length() - 1; j++) {
			if (Character.isDigit(price.charAt(j))) {
				str.append(price.charAt(j));
			}

		}
		int convertedPrice = Integer.parseInt(str.toString());
		return convertedPrice;

	}

	/*
	 * Description: this method is check listed product for different price
	 * filter 1) Price high-to Low 2) Price Low-High
	 * 
	 * @autor :Prerana
	 */
	public void checkPriceFilter(String priceFilterDescrip, int first, int second) {
		if (priceFilterDescrip.equals("Price-High to Low")) {
			if (first < second) {
				NXGReports.addStep("price displayed, not as per given high to low filter", LogAs.PASSED, null);
			} else {
				NXGReports.addStep("price displayed,as per given high to low filter ", LogAs.FAILED,new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			first = second;
		} else {

			if (first > second) {
				NXGReports.addStep("price displayed, not as per given high to low filter ", LogAs.PASSED, null);
			} else {
				NXGReports.addStep("price displayed,as per given high to low filter ", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			first = second;
		}
		
	}
	
}

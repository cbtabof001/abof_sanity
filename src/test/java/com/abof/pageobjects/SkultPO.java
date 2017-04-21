package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SkultPO {
	
	AndroidDriver driver;
	
	public SkultPO(AndroidDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="com.abof.android:id/video_layout")
	private WebElement eleSkultVideoLayout;
	public WebElement getEleSkultVideoLayout() {
		return eleSkultVideoLayout;
	}
	
	@FindBy(id="com.abof.android:id/look_details_no_of_items")
	private WebElement eleItemCountInLookDetail;

	public WebElement getEleItemCountInLookDetail() {
		return eleItemCountInLookDetail;
	}
	
	@FindBys({ @FindBy(id = "com.abof.android:id/lookdetail_product_img") })
	private List<WebElement> eleLookDetailProductImageLst;

	public List<WebElement> getEleLookDetailProductImageLst() {
		return eleLookDetailProductImageLst;
	}
	

	
	
	@FindBy(xpath = "//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement eleBackBtn;

	public WebElement getEleBackBtn() {
		return eleBackBtn;
	}
	@FindBy(id="com.abof.android:id/play")
	private WebElement eleSkultVideoPlayBtn;
	public WebElement getEleSkultVideoPlayBtn() {
		return eleSkultVideoPlayBtn;
	}
	@FindBy(xpath="//android.widget.Button[@text='View All Products']")
	private WebElement eleViewAllProductsBtn;
	public WebElement getEleViewAllProductsBtn() {
		return eleViewAllProductsBtn;
	}
	@FindBy(xpath="//android.widget.Button[@text='View All Looks']")
	private WebElement eleViewAllLooksBtn;
	public WebElement getEleViewAllLooksBtn() {
		return eleViewAllLooksBtn;
	}
	
	@FindBy(id="com.abof.android:id/closeView")
	private WebElement eleCloseView;
	public WebElement geteleCloseView() {
		return eleCloseView;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Skult Looks']")
	private WebElement eleSkultLooksTxt;
	public WebElement getEleSkultLooksTxt() {
		return eleSkultLooksTxt;
	}
	
	@FindBy(id="com.abof.android:id/trending_content_type")
	private WebElement eleSkultContentTxt;
	public WebElement getEleSkultContentTxt(){
		return eleSkultContentTxt;
	}
	
	@FindBy(id="com.abof.android:id/trending_content_type")
	private List<WebElement> eleSkultContentList;
	public List <WebElement> getEleSkultContentList(){
		return eleSkultContentList;
	}
	
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

	

	@FindBy(id = "com.abof.android:id/out_of_stock_txt")
	private WebElement eleOutofStockTxt;

	public WebElement getEleOutofStockTxt() {
		return eleOutofStockTxt;
	}
	
	
	public void navigateBackToFavPage(){
		try{
			getEleBackBtn().click();
			getEleBackBtn().click();
			getEleBackBtn().click();
			geteleCloseView().click();
			getEleBackBtn().click();
			
		}catch(Exception e){
			throw e;
		}
	}


}

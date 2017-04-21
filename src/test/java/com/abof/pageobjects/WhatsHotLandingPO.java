package com.abof.pageobjects;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class WhatsHotLandingPO {
	AndroidDriver driver;
	String selectsizeaction = "Y";
	String size = null;
	String[] sData=null;
	String[] ss = null;
	String sEleWhatsHot="WHAT'S HOT";

	public WhatsHotLandingPO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'WHAT')]")
	private WebElement eleWhatsHotModule;

	public WebElement getEleWhatsHotModule() {
		return eleWhatsHotModule;
	}
	
	@FindBy(xpath="//android.view.View[contains(@content-desc,'LIKES')]")
	 private WebElement eleLikesIcon;
	 public WebElement getEleLikesIcon() {
	  return eleLikesIcon;
	 }
	 
	 @FindBy(xpath="//android.view.View[contains(@content-desc,'LIKES')]")
	 private List<WebElement> eleLikes;
	 public List<WebElement> getEleLikes() {
	  return eleLikes;
	 }
	 
	 @FindBy(xpath="//android.view.View[contains(@content-desc,'SHARE')]")
	 private WebElement eleWhatHotShareIcon;
	 public WebElement getEleWhatHotShareIcon() {
	  return eleWhatHotShareIcon;
	 }
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Tweet')]")
	 private WebElement eleTweetIcon;
	 public WebElement getEleTweetIcon() {
	  return eleTweetIcon;
	 }
	 
	 
	 @FindBy(xpath="//android.view.View[contains(@text,'www.abof.com')]")
	 private WebElement eleWCMTxt;
	 public WebElement getEleWCMTxt() {
	  return eleWCMTxt;
	 }
	 
	 @FindBy(id="com.twitter.android:id/composer_post")
	 private WebElement eleTweetComposerPostBtn;
	 public WebElement getEleTweetComposerPostBtn() {
	  return eleTweetComposerPostBtn;
	 }
	 
	
	 
	 
	 @FindBy(xpath="//android.view.View[contains(@content-desc,'READ MORE...')]")
	 private WebElement eleReadMoreIcon;
	 public WebElement getEleReadMoreIcon() {
	  return eleReadMoreIcon;
	 }
	 
	 @FindBy(xpath="//android.view.View[contains(@content-desc,'SIMILAR LOOKS')]")
	 private WebElement eleSimilarLooksTxt;
	 public WebElement getEleSimilarLooksTxt() {
	  return eleSimilarLooksTxt;
	 }
	 
	 @FindBy(xpath="//android.view.View[contains(@content-desc,'READ LESS...')]")
	 private WebElement eleReadLessIcon;
	 public WebElement getEleReadLessIcon() {
	  return eleReadLessIcon;
	 }
	 
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'MEN')]")
	private WebElement eleMenModule;

	public WebElement getEleMenModule() {
		return eleMenModule;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'WOMEN')]")
	private WebElement elewomenModule;
	public WebElement getEleWomenModule() {
		return elewomenModule;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'SHOP BRANDS')]")
	private WebElement eleShopBrandsTxt;

	public WebElement getEleShopBrandsTxt() {
		return eleShopBrandsTxt;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.abof.android:id/land_category_txt')]") })
	private List<WebElement> eleSubCategoryLst;

	public List<WebElement> getEleSubCategoryLst() {
		return eleSubCategoryLst;
	}

	@FindBys({ @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.abof.android:id/text')]") })
	private List<WebElement> eleviewAllBrandLst;

	public List<WebElement> getEleviewAllBrandLst() {
		return eleviewAllBrandLst;
	}

	@FindBy(id = "com.abof.android:id/trending_brand_text")
	private WebElement eleViewAllBtn;

	public WebElement getEleViewAllBtn() {
		return eleViewAllBtn;
	}

	@FindBy(id = "com.abof.android:id/brand_search")
	private WebElement eleViewAllSearchTxtBx;

	public WebElement getEleViewAllSearchTxtBx() {
		return eleViewAllSearchTxtBx;
	}

	@FindBys({
			@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.abof.android:id/text')]") })
	private List<WebElement> eleShopBrandLst;

	public List<WebElement> getEleShopBrandLst() {
		return eleShopBrandLst;
	}
	
	@FindBys({ @FindBy(xpath = "//android.widget.GridView/android.widget.LinearLayout") })
	private List<WebElement> eleShopBrandGridViewImageLst;

	public List<WebElement> getEleShopBrandGridViewImageLst() {
		return eleShopBrandGridViewImageLst;
	}
	
	@FindBy(className="android.widget.TextView")
	private WebElement eleLookDetailsTxt;
	public WebElement getEleLookDetaolsTxt(){
		return eleLookDetailsTxt;
	}
	@FindBy(id="com.abof.android:id/look_name")
	private WebElement eleLookNameTxt;
	public WebElement getEleLookNameTxt(){
		return eleLookNameTxt;
	}
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='2']//android.widget.TextView")
	private List<WebElement> eleProductDetailsTxt;
	public List<WebElement> getEleproductDetailsTxt(){
		return eleProductDetailsTxt;
	}
	
	@FindBy(id="com.abof.android:id/look_detail_save_for_later_icon")
	private WebElement eleFavoriteIcon;
	public WebElement getEleFavoriteIcon(){
		return eleFavoriteIcon;
	}
	
	@FindBy(id="com.abof.android:id/look_detail_share")
	private WebElement eleShareIcon;
	public WebElement getEleShareIcon(){
		return eleShareIcon;
	}
	
	@FindBy(id="com.abof.android:id/look_detail_add_to_cart_stickybutton")
	private WebElement eleAddtoBagBtn;
	public WebElement getEleAddtoBagBtn(){
		return eleAddtoBagBtn;
	}
	
	@FindBy(id="com.abof.android:id/look_detail_checkbox")
	private List<WebElement> eleCheckBoxIcon;
	public List<WebElement> getEleCheckBoxIcon(){
		return eleCheckBoxIcon;
	}
	
	@FindBy(id="com.abof.android:id/look_detail_checkbox")
	private WebElement eleLookDetailsCheckBoxIcon;
	public WebElement getEleLookDetailsCheckBoxIcon(){
		return eleLookDetailsCheckBoxIcon;
	}
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='4']//android.widget.TextView")
	private List<WebElement> eleLookProductTxt;
	public List<WebElement> getEleLookProductTxt(){
		return eleLookProductTxt;
	}
	
	@FindBy(id="com.abof.android:id/zoomview")
	private WebElement eleZoomView;
	public WebElement getEleZoomView(){
		return eleZoomView;
	}
	@FindBy(id="com.abof.android:id/lookdetail_arrowview")
	private WebElement eleSizeArrowIcon;
	public WebElement getEleSizeArrowIcon(){
		return eleSizeArrowIcon;
	}
	@FindBy(xpath ="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement eleMenuBtn;

	public WebElement getEleMenuBtn() {
		return eleMenuBtn;
	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@index='1']//android.widget.TextView")
	private List<WebElement> eleFavouritesTxt;
	public List<WebElement> getEleFavouritesTxt(){
		return eleFavouritesTxt;
	}
	
	@FindBy(id="com.abof.android:id/pdp_infocare_text")
	private WebElement eleinfocaretxt;
	public WebElement getEleInfocareTxt(){
		return eleinfocaretxt;
		
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='1']//android.widget.RelativeLayout[@index='1']//android.widget.TextView[@index='0']")
	private WebElement eleLookDetailsPage;
	public WebElement getEleLookDetailsPage(){
		return eleLookDetailsPage;
	}
	
	@FindBy(id="com.abof.android:id/imgview")
	private WebElement eleLookDetailsImage;
	public WebElement getEleLookDetailsImage(){
		return eleLookDetailsImage;
	}
	
	@FindBy(id="com.abof.android:id/closeview")
	private WebElement eleCloseIcon;
	public WebElement getEleCloseIcon(){
		return eleCloseIcon;
	}
	@FindBy(id="com.abof.android:id/zoomview")
	private WebElement eleZoomViewIcon;
	public WebElement getEleZoomViewIcon(){
		return eleZoomViewIcon;
	}
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc,'SHOP THE STORY')]")
	private WebElement eleShopTheStoryBtn;

	public WebElement getEleShopTheStoryBtn() {
		return eleShopTheStoryBtn;
	}
	
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Women')]")
	private WebElement eleWomenProductTxt;
		public WebElement getEleWomenProductTxt(){
			return eleWomenProductTxt;
	}
		
	@FindBy(id="android:id/button2")
	private WebElement eleNoButton;
	public WebElement getEleNoButton(){
		return eleNoButton;
	}
	
	
	@FindBy(id="com.abof.android:id/banner_view")
	private WebElement eleBannerViewTab;
	public WebElement getEleBannerViewTab(){
		return eleBannerViewTab;
	}
	
	@FindBy(id="com.abof.android:id/lookdetail_product_name")
	private WebElement eleProductNameTxt;
	public WebElement getEleProductNameTxt()
	{
		return eleProductNameTxt;
	}
	
	
	@FindBy(id="com.abof.android:id/trending_story_page_title")
	private WebElement eleTrendingStoryTitle;
	public WebElement getEleTrendingStoryTitle(){
		return eleTrendingStoryTitle;
	}
	
	@FindBy(id="com.abof.android:id/closeView")
	private WebElement eleCloseViewIcon;
	public WebElement getEleCloseViewIcon(){
		return eleCloseViewIcon;
	}
	
	@FindBy(name="My favourites")
	private WebElement eleFavouritesIcon;
	public WebElement getEleFavouritesIcon(){
		return eleFavouritesIcon;
	}
	

	
	
	
	public void closeviewBtn() {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		try {
			getEleCloseViewIcon().click();
		} catch (Exception e) {
		}
	}
	
	
	public void getMenSubmenu(String catgeory,String subcatgeory) throws InterruptedException {	
		getEleMenModule().click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'" + catgeory + "')]//android.widget.FrameLayout[@index='0']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+subcatgeory+"')]")).click();
	}
	

	public void getwomenSubmenu(String catgeory,String subcatgeory) throws InterruptedException {	
		getEleWomenModule().click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'" + catgeory + "')]//android.widget.FrameLayout[@index='0']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+subcatgeory+"')]")).click();
	}
	
	public void selectSize( String[] size) throws InterruptedException {
	try{
		
			String size1 = size[0];
			String size2 = size[1];

			driver.findElement(By.xpath("//android.widget.GridView[@index='3']//android.widget.RelativeLayout//android.widget.TextView[contains(@text,'" + size1
					+ "') or contains(@text,'" + size2 + "')]")).click();
			
		
	}catch(Exception e){
		throw e;
	}
	}
	
	public void zoomimage(){
		try{
			 WebElement image=driver.findElement(By.id("com.abof.android:id/zoomview"));
			 for(int i=0;i<=6;i++){
				 
				driver.tap(1,image,2);
			 }
			 Thread.sleep(4000);
			 BaseLib.swipeRightToLeft(.80,.10);
			 for(int i=0;i<=6;i++){
				 
					driver.tap(1,image,2);
				 }
			 Thread.sleep(4000);
			 BaseLib.swipeRightToLeft(.80,.10);
			 for(int i=0;i<=6;i++){
				 
					driver.tap(1,image,2);
				 }
			 
			 
			 
			
		}catch(Exception e){
			
		}
	}
	
	public void handlecheckbox(){
		try{
		for(int i=0;i<=getEleCheckBoxIcon().size();i++){
			BaseLib.swipeBottomToTop(.90,.22);
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='"+i+"']//android.widget.RelativeLayout[@index='1']//android.widget.CheckBox")).click();
		}
		}catch(Exception e){
			
		}
	}
	
	public void handleLookDetailsPage() throws Exception{
		LoginPagePO loginpo=new LoginPagePO(driver);
		try{
		Thread.sleep(5000); 
		getEleWhatsHotModule().click();
		 for(int i=1;i<=2;i++){
			 int k=i--;
			 BaseLib.swipeBottomToTop(.90,.22);
		 WebElement ele=driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='"+k+"']"));
		 ele.click();
		 Thread.sleep(3000);
		 closeviewBtn();
		 Thread.sleep(3000);
		 loginpo.handleOkayBtn();
		 try{
		  if(getEleLookDetailsPage().getText().equals("Look Details")){
			Thread.sleep(4000);
			for(int j=0;j<=3;j++){
				Thread.sleep(4000);
			BaseLib.swipeRightToLeft(.80,.10);
			}
			for(int k1=0;k1<=3;k1++){
			Thread.sleep(4000);
			BaseLib.swipeRightToLeft(.10,.80);
			}
			getEleLookDetailsImage().click();
			Thread.sleep(3000);
			zoomimage();
			getEleCloseIcon().click();
			Thread.sleep(3000);
			BaseLib.elementStatus(getEleLookNameTxt(), "Product LookName text", "displayed");
			for (WebElement eleLookDetailsProductTxt: getEleproductDetailsTxt()) {

				Assert.assertTrue(eleLookDetailsProductTxt.isDisplayed(),
						eleLookDetailsProductTxt.getText() + " is dispalyed in the LooknName details page.");
				NXGReports.addStep(
						eleLookDetailsProductTxt.getText() + "is dispalyed in the in the LooknName details page.",
						LogAs.PASSED, null);
			}
			BaseLib.elementStatus(getEleFavoriteIcon(), "Look Details Favorite Icon", "displayed");
			BaseLib.elementStatus(getEleShareIcon(), "Look Details Share Icon", "displayed");
			BaseLib.elementStatus(getEleAddtoBagBtn(), "Add to bag button", "displayed");
			 handlecheckbox();
			 BaseLib.swipeBottomToTop(.22,.90);
			 Thread.sleep(3000);
			 getEleLookDetailsCheckBoxIcon().click();
			 getEleSizeArrowIcon().click();
			 sData = GenericLib.toReadExcelData("Login", "TC_PLPPDP_001");
			size = sData[2];
			ss = size.split(",");
			 Thread.sleep(4000);
			selectSize(ss);
			 getEleAddtoBagBtn().click();
			handleFavoriteOption();
			 Thread.sleep(4000);
			 driver.navigate().back();
			 BaseLib.swipeBottomToTop(.22,.90);
			 getEleMenuBtn().click();
			 getEleFavouritesIcon().click();
			 for (WebElement eleFavouritesTxt:getEleFavouritesTxt()) {

					Assert.assertTrue(eleFavouritesTxt.isDisplayed(),
							eleFavouritesTxt.getText() + " is dispalyed in the favourites page");
					NXGReports.addStep(
							eleFavouritesTxt.getText() + "is dispalyed in the favourites page",
							LogAs.PASSED, null);
				}
			 
			break;
			
		}
		else {
			Thread.sleep(3000);
			 BaseLib.swipeBottomToTop(.90,.22);
			 driver.navigate().back();
				Thread.sleep(3000);
				 BaseLib.swipeBottomToTop(.90,.22);
		}
		 }catch(RuntimeException e){
			 Thread.sleep(3000);
			 BaseLib.swipeBottomToTop(.90,.22);
			 driver.navigate().back();
				Thread.sleep(3000);
				 BaseLib.swipeBottomToTop(.90,.22);
			 
		 }
		 }
		}catch(Exception e){
			throw e;
		}
	}
	
	public void handlenoButton(){
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		try{
			getEleNoButton().click();
		}catch(Exception e){
			
		}
	}
	
	public void handleFavoriteOption() throws Exception{
		try{	
				getEleFavoriteIcon().click();
				Thread.sleep(4000);
				String text=BaseLib.verifyToastMessage(driver);
				if(text.contains("Cha-ching! Added to your")){
				Assert.assertTrue(text.contains("Cha-ching! Added to your"), "Added to your favourites toast message is not displayed");
				NXGReports.addStep("Added to your favourites toast message is successfully displayed", LogAs.PASSED, null);
				Assert.assertTrue(text.contains("favourites."), "Added to your favourites toast message is not displayed");
				NXGReports.addStep("Added to your favourites toast message is successfully displayed", LogAs.PASSED, null);
				Thread.sleep(4000);
				}
				else{
					Assert.assertTrue(text.contains("Item removed from favourites"), "Added to your favourites toast message is not displayed");
					NXGReports.addStep("Added to your favourites toast message is successfully displayed", LogAs.PASSED, null);
					getEleFavoriteIcon().click();
					Thread.sleep(3000);
					String secondtext=BaseLib.verifyToastMessage(driver);
					Assert.assertTrue(secondtext.contains("Cha-ching! Added to your"), "Added to your favourites toast message is not displayed");
					NXGReports.addStep("Added to your favourites toast message is successfully displayed", LogAs.PASSED, null);
					Assert.assertTrue(secondtext.contains("favourites."), "Added to your favourites toast message is not displayed");
					NXGReports.addStep("Added to your favourites toast message is successfully displayed", LogAs.PASSED, null);
				}
		}catch(Exception e){
			throw e;
			
		}
	}
	
	public void whatsHotLandingPage() throws Exception{
		LoginPagePO loginpo=new LoginPagePO(driver);
		try{
			Thread.sleep(2000); 
			 for(int i=1;i<=2;i++){
				 int k=i--;
				 BaseLib.swipeBottomToTop(.90,.22);
				 WebElement ele=driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='"+k+"']"));
				 ele.click();
				 Thread.sleep(2000);
				 closeviewBtn();
				 Thread.sleep(2000);
				 loginpo.handleOkayBtn();
				 try{ 
					 if(getEleTrendingStoryTitle().getText().equals("Back to what's hot")){
						  Thread.sleep(4000);
						  for(int j=0;j<=3;j++){
						  BaseLib.swipeBottomToTop(.90,.22);
						  }
						  BaseLib.elementStatus(getEleShopTheStoryBtn(), "The Shop The Story Button", "displayed");
						  getEleShopTheStoryBtn().click();
						  Thread.sleep(4000);
						  loginpo.handleOkayBtn();
						  driver.navigate().back();
						  driver.navigate().back();
						  Thread.sleep(4000);
						  BaseLib.swipeBottomToTop(.22,.90);
						  break;
					 }
					  else {
							Thread.sleep(3000);
							 BaseLib.swipeBottomToTop(.90,.22);
							 driver.navigate().back();
							 handlenoButton();
							Thread.sleep(3000);
							BaseLib.swipeBottomToTop(.90,.22);
						}
			 }catch(RuntimeException e){
				 Thread.sleep(3000);
				 BaseLib.swipeBottomToTop(.90,.22);
				 driver.navigate().back();
				 handlenoButton();
				Thread.sleep(3000);
				BaseLib.swipeBottomToTop(.90,.22);
				 
			 }
			 }
		}catch(Exception e){
			throw e;
		}
	}
	
	public void whatsHotlookDetailsPage() throws Exception{
			LoginPagePO loginpo=new LoginPagePO(driver);
			try{
			Thread.sleep(5000); 
			getEleWhatsHotModule().click();
			 for(int i=1;i<=2;i++){
				 int k=i--;
				 BaseLib.swipeBottomToTop(.90,.22);
			 WebElement ele=driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='"+k+"']"));
			 ele.click();
			 Thread.sleep(3000);
			 closeviewBtn();
			 Thread.sleep(3000);
			 loginpo.handleOkayBtn();
			 try{
			  if(getEleLookDetailsPage().getText().equals("Look Details")){
				  
				  Thread.sleep(4000);
				  BaseLib.elementStatus(getEleLookDetailsPage(), "The Card to Commerce Cards Module", "displayed");
				  BaseLib.swipeBottomToTop(.90,.22);
					Assert.assertTrue(getEleProductNameTxt().isDisplayed(),
							getEleProductNameTxt().getText() + " is dispalyed in the favourites page");
					NXGReports.addStep(
							getEleProductNameTxt().getText() + "is dispalyed in the favourites page",
							LogAs.PASSED, null);
					BaseLib.elementStatus(getEleFavoriteIcon(), "Look Details Favorite Icon", "displayed");
					BaseLib.elementStatus(getEleShareIcon(), "Look Details Share Icon", "displayed");
					BaseLib.elementStatus(getEleAddtoBagBtn(), "Add to bag button", "displayed");
				  break;
			  }
			  else {
					Thread.sleep(3000);
					 BaseLib.swipeBottomToTop(.90,.22);
					 driver.navigate().back();
					 handlenoButton();
					Thread.sleep(3000);
					BaseLib.swipeBottomToTop(.90,.22);
				}
	 }catch(RuntimeException e){
		 Thread.sleep(3000);
		 BaseLib.swipeBottomToTop(.90,.22);
		 driver.navigate().back();
		 handlenoButton();
		Thread.sleep(3000);
		BaseLib.swipeBottomToTop(.90,.22);
		 
	 }
	 }
			
		}catch(Exception e){
			throw e;
		}
	}
	
	
	

	

}

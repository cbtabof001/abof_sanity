/***********************************************************************
* @author 			:		Srinivas Hippargi 
* @description		: 		Page objects and re-usbale methods for Hamburger Menu and Login screen
* @module			:		Hamburger Menu,Login
* @reusable methods : 		
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
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.android.AndroidDriver;

public class HomePagePO {
	AndroidDriver driver;
	String[] sData=null;
	
	public HomePagePO(AndroidDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	 private WebElement eleHamburgerMenuIcon;
	 public WebElement getEleHamburgerMenuIcon() {
	  return eleHamburgerMenuIcon;
	 }
	 
	 
	 @FindBy(id="com.abof.android:id/search_icon")
	 private WebElement eleSearchIcon;
	 public WebElement getEleSearchIcon(){
		 return eleSearchIcon;
	 }
	 
	 @FindBy(xpath="//android.widget.ListView[@index='5']//android.widget.LinearLayout//android.widget.TextView")
	private List<WebElement> eleBrandList;
	 public List<WebElement> getEleBrandList(){
		 return eleBrandList;
	 }
	 
	 @FindBy(id="com.abof.android:id/brand_search")
	 private WebElement eleBrandSearch;
	 public WebElement getEleBrandSearch(){
		 return eleBrandSearch;
	 }
	 
	 @FindBy(xpath="//android.widget.RelativeLayout[@index='0']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']")
	 private WebElement eleSaleList;
	 public WebElement getEleSaleList(){
		 return eleSaleList;
	 }
	 
	@FindBy(id="com.abof.android:id/actionbarTitle")
    private WebElement eleHomeAbofLnk;
	public WebElement getEleHomeAboLnk() {
		return eleHomeAbofLnk;
	} 
	@FindBy(id="com.abof.android:id/search_icn")
	private WebElement eleHomeSearchIcon;
	public WebElement getEleHomeSearchIcon() {
		return eleHomeSearchIcon;
	} 
	@FindBy(id="com.abof.android:id/fav_icn")
	private WebElement eleHomeNotificationIcon;
	public WebElement getEleHomeNotificationIcon() {
		return eleHomeNotificationIcon;
	} 
    @FindBy(id="com.abof.android:id/cart_icn")
	private WebElement eleHomeCartIcon;
	public WebElement getEleHomeCartIcon() {
		return eleHomeCartIcon;
	} 
	@FindBy(xpath="//android.widget.TextView[@text='MEN']")
	private WebElement eleHomeMenLnk;
	public WebElement getEleHomeMenLnk() {
		return eleHomeMenLnk;
	} 
	@FindBy(xpath="//android.widget.TextView[@text='view all']")
	private WebElement eleviewAllBtn;
	public WebElement getEleviewAllBtn() {
		return eleviewAllBtn;
	} 
	
	@FindBy(xpath="//android.widget.TextView[@text='WOMEN']")
	private WebElement homeWomenLnk;
	public WebElement getHomeWomenLnk() {
		return homeWomenLnk;
	} 
	@FindBy(xpath="//text()='WHAT'S HOT'")
	private WebElement eleWhatsHotLnk;
	public WebElement getwhatsHotLnk() {
		return eleWhatsHotLnk;
	} 
	@FindBy(id="com.abof.android:id/search_edittext")
	private WebElement eleSearchEdtBx;
	public WebElement getEleSearchEdtBx() {
		return eleSearchEdtBx;
	} 
	@FindBy(xpath="//text()='That's a buzzkill! No matches 'savvy''")
	private WebElement eleNoMatchTxt;
	public WebElement getNoMatchTxt() {
		return eleNoMatchTxt;
	} 
	@FindBy(xpath="//android.widget.TextView[contains(@text,'My Favourites')]")
	private WebElement eleSearchPageMyFavLnk;
	public WebElement getEleSearchPageMyFavLnk() {
		return eleSearchPageMyFavLnk;
	} 
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Our Recommendations')]")
	private WebElement eleSearchPageRecommendationLnk;
	public WebElement getEleSearchPageRecommendationLnk() {
		return eleSearchPageRecommendationLnk;
	}
	@FindBys({@FindBy(id="com.abof.android:id/prduct_name")})
	private List<WebElement> eleSearchPageFavLst;
	public List<WebElement> getEleSearchPageFavLst()
	{
		return eleSearchPageFavLst;
	}
	@FindBys({@FindBy(className="android.widget.LinearLayout")})
	private List<WebElement> eleSearchPageRecomendlst;
	public List<WebElement> getEleSearchPageRecomendLst()
	{
		return eleSearchPageRecomendlst;
	}
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']//android.widget.RelativeLayout[@index='0']//android.widget.TextView")
	private List<WebElement> elecategoryIcon;
	public List<WebElement> getEleCategoryIcon(){
		return elecategoryIcon;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@index,'1')]//android.widget.FrameLayout[@index='0']")
	private WebElement eleNewInCategoryIcon;
	public WebElement getEleNewInCategoryIcon(){
		return eleNewInCategoryIcon;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@index,'0')]//android.widget.FrameLayout[@index='0']")
	private WebElement eleClothingCategoryIcon;
	public WebElement getEleClothingCategoryIcon(){
		return eleClothingCategoryIcon;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@index,'2')]//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']")
	private WebElement eleTrendCategoryIcon;
	public WebElement getEleTrendCategoryIcon(){
		return eleTrendCategoryIcon;
	}
	
	
	@FindBy(id="com.abof.android:id/title")
	private WebElement eleProductText;
	public WebElement getEleProductText(){
		return eleProductText;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@index,'2')]//android.widget.FrameLayout[@index='0']")
	private WebElement eleClothingModule;
	public WebElement getEleClothingModule(){
		return eleClothingModule;
	}
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='8']")
	private WebElement eleClothingSweatersSweatshirtsTxt;
	public WebElement getEleClothingSweatersSweatshirtsTxt(){
		return eleClothingSweatersSweatshirtsTxt;
	}
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='9']")
	private WebElement eleClothingViewAllTxt;
	public WebElement getEleClothingViewAllTxt(){
		return eleClothingViewAllTxt;
	}
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='10']")
	private WebElement eleMenClothingViewAllTxt;
	public WebElement getEleMenClothingViewAllTxt(){
		return eleMenClothingViewAllTxt;
	}
	
	//after performing invalid search My fav item is displayed or not 
	public void favItemListIsPresent()
	{
		 if(getEleSearchPageFavLst().isEmpty())
	     {
	    	 NXGReports.addStep(" In search Page,All product in My Favorites are not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	     }
	     else
	     {
	    	 NXGReports.addStep(" In search Page,All product in My Favorites are displayed", LogAs.PASSED, null);
	    	 
	     }
		
	}
	
	//after performing invalid search Recommendation item is displayed or not 
	public void recomendationListIsPresent()
	{
		if(getEleSearchPageRecomendLst().isEmpty())
	     {
	    	 NXGReports.addStep("Recommendation list is not displayed", LogAs.FAILED,new CaptureScreen(ScreenshotOf.BROWSER_PAGE) );
	     }
	     else
	     {
	    	 NXGReports.addStep("Recommendation list is displayed", LogAs.PASSED,null);
	     }
	}
	public void searchOption(String searchItem) throws Exception{
		
		try{
			Thread.sleep(4000);
			getEleHomeSearchIcon().click();
			getEleSearchEdtBx().sendKeys(searchItem);
			Thread.sleep(5000);
			BaseLib.tapOnElement(.98, .99);
		}catch(Exception e){
			throw e;
		}
	}
	
	
	
	
	public void slectMenProduct(){
		try{
			getEleClothingModule().click();
			
		}catch(Exception e){
			
		}
	}
	public void womencategoryTab() throws Exception{
		LoginPagePO loginPo = new LoginPagePO(driver);
		try{
				for(int i=1;i<=2;i++){
					
					driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'" + i+ "')]//android.widget.FrameLayout[@index='0']")).click();
					Thread.sleep(2000);
			
					for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

						Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
								eleSubCategoryTxt.getText() + " is dispalyed in the women sub category page.");
						NXGReports.addStep(
								eleSubCategoryTxt.getText() + "is dispalyed in the in the women sub category page.",
								LogAs.PASSED, null);
					}
					BaseLib.swipeBottomToTop(.90, .22);
				}
				for(int i=1;i<=2;i++){
					driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'" + i+ "')]//android.widget.FrameLayout[@index='0']")).click();
					Thread.sleep(4000);
					for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

						Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
								eleSubCategoryTxt.getText() + " is dispalyed in the women sub category page.");
						NXGReports.addStep(
								eleSubCategoryTxt.getText() + "is dispalyed in the in the women sub category page.",
								LogAs.PASSED, null);
					}
					BaseLib.swipeBottomToTop(.90, .22);
					
				}
				
				getEleClothingModule().click();
				Thread.sleep(4000);
				for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

					Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
							eleSubCategoryTxt.getText() + " is dispalyed in the women sub category page.");
					NXGReports.addStep(
							eleSubCategoryTxt.getText() + "is dispalyed in the in the women sub category page.",
							LogAs.PASSED, null);
				}
				BaseLib.swipeBottomToTop(.90, .22);
				getEleClothingModule().click();
					Thread.sleep(4000);
					for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

						Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
								eleSubCategoryTxt.getText() + " is dispalyed in the women sub category page.");
						NXGReports.addStep(
								eleSubCategoryTxt.getText() + "is dispalyed in the in the women sub category page.",
								LogAs.PASSED, null);
					}
					BaseLib.swipeBottomToTop(.90, .22);
					
		}catch(Exception e){
			throw e;
		}
	}
	
	public void womensubcategory() throws Exception{
		LoginPagePO loginPo = new LoginPagePO(driver);
		try{
			getEleNewInCategoryIcon().click();
			for(int i=0;i<=4;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				
			}
			BaseLib.swipeBottomToTop(.90, .22);
			try{
			getEleClothingModule().click();
			for(int i=0;i<=9;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women  PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				
			}
			}catch(RuntimeException e){
				BaseLib.swipeBottomToTop(.90, .22);
				getEleClothingSweatersSweatshirtsTxt().click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women  PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				getEleClothingViewAllTxt().click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women  PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
			}
			getEleNewInCategoryIcon().click();
			for(int i=0;i<=3;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women  PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women  PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
			}
			BaseLib.swipeBottomToTop(.90, .22);
			getEleClothingModule().click();
			for(int i=0;i<=4;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				
			}
			BaseLib.swipeBottomToTop(.90, .22);
			getEleClothingModule().click();
			for(int i=0;i<=2;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women  PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				
			}
			BaseLib.swipeBottomToTop(.90, .22);
			getEleClothingModule().click();
			for(int i=0;i<=6;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginPo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Women PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Women PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
				
			}
			
		}catch(Exception e){
			throw e;
		}
	}
	
	public void mensubcategory() throws Exception{
		LoginPagePO loginpo=new LoginPagePO(driver);
		try{
			getEleNewInCategoryIcon().click();
			for(int i=0;i<=3;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginpo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Men PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Men PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
			}
			 BaseLib.swipeBottomToTop(.90,.22);
			 try{
				 getEleClothingCategoryIcon().click();
				 for(int i=0;i<=10;i++){
				driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
				Thread.sleep(4000);
				loginpo.handleOkayBtn();
				Assert.assertTrue(getEleProductText().isDisplayed(),
						getEleProductText().getText() + " is dispalyed in the Men PlP Page");
				NXGReports.addStep(
						getEleProductText().getText() + "is dispalyed in the Men PlP Page",
						LogAs.PASSED, null);
				Thread.sleep(4000);
				driver.navigate().back();
			}
			 }catch(Exception e){
				 BaseLib.swipeBottomToTop(.90,.22);
				 getEleClothingSweatersSweatshirtsTxt().click();
				 Thread.sleep(4000);
				 loginpo.handleOkayBtn();
					Assert.assertTrue(getEleProductText().isDisplayed(),
							getEleProductText().getText() + " is dispalyed in the Men PlP Page");
					NXGReports.addStep(
							getEleProductText().getText() + "is dispalyed in the Men  PlP Page",
							LogAs.PASSED, null);
					Thread.sleep(4000);
					driver.navigate().back();
					getEleClothingViewAllTxt().click();
					Thread.sleep(4000);
					loginpo.handleOkayBtn();
					Assert.assertTrue(getEleProductText().isDisplayed(),
							getEleProductText().getText() + " is dispalyed in the Men PlP Page");
					NXGReports.addStep(
							getEleProductText().getText() + "is dispalyed in the Men  PlP Page",
							LogAs.PASSED, null);
					Thread.sleep(4000);
					driver.navigate().back();
			 }
				getEleMenClothingViewAllTxt().click();
					 Thread.sleep(4000);
					 loginpo.handleOkayBtn();
						Assert.assertTrue(getEleProductText().isDisplayed(),
								getEleProductText().getText() + " is dispalyed in the Men PlP Page");
						NXGReports.addStep(
								getEleProductText().getText() + "is dispalyed in the Men  PlP Page",
								LogAs.PASSED, null);
						Thread.sleep(4000);
						driver.navigate().back();
						getEleTrendCategoryIcon().click();
				 for(int i=0;i<=2;i++){
						driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
						Thread.sleep(2000);
						loginpo.handleOkayBtn();
						Assert.assertTrue(getEleProductText().isDisplayed(),
								getEleProductText().getText() + " is dispalyed in the Men PlP Page");
						NXGReports.addStep(
								getEleProductText().getText() + "is dispalyed in the Men PlP Page",
								LogAs.PASSED, null);
						Thread.sleep(2000);
						driver.navigate().back();
					}
				 getEleTrendCategoryIcon().click();
				 for(int i=0;i<=6;i++){
						driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']//android.widget.LinearLayout[@index='"+i+"']")).click();
						Thread.sleep(2000);
						loginpo.handleOkayBtn();
						Assert.assertTrue(getEleProductText().isDisplayed(),
								getEleProductText().getText() + " is dispalyed in the Men PlP Page");
						NXGReports.addStep(
								getEleProductText().getText() + "is dispalyed in the Men PlP Page",
								LogAs.PASSED, null);
						Thread.sleep(4000);
						driver.navigate().back();
					}
		}catch(Exception e){
			throw e;
		}
		
	}
	
	public void mencategoryTab() throws Exception{
		LoginPagePO loginpo=new LoginPagePO(driver);
		try{
				getEleNewInCategoryIcon().click();
				for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

					Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
							eleSubCategoryTxt.getText() + " is dispalyed in the men sub category page.");
					NXGReports.addStep(
							eleSubCategoryTxt.getText() + "is dispalyed in the in the men sub category page.",
							LogAs.PASSED, null);
				}
				BaseLib.swipeBottomToTop(.90, .22);
				getEleClothingCategoryIcon().click();
				for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

					Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
							eleSubCategoryTxt.getText() + " is dispalyed in the men sub category page.");
					NXGReports.addStep(
							eleSubCategoryTxt.getText() + "is dispalyed in the in the men sub category page.",
							LogAs.PASSED, null);
				}
				BaseLib.swipeBottomToTop(.90, .22);
				getEleTrendCategoryIcon().click();
				for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

					Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
							eleSubCategoryTxt.getText() + " is dispalyed in the men sub category page.");
					NXGReports.addStep(
							eleSubCategoryTxt.getText() + "is dispalyed in the in the men sub category page.",
							LogAs.PASSED, null);
				}
				getEleTrendCategoryIcon().click();
				for (WebElement eleSubCategoryTxt: getEleCategoryIcon()) {

					Assert.assertTrue(eleSubCategoryTxt.isDisplayed(),
							eleSubCategoryTxt.getText() + " is dispalye"
									+ "d in the men sub category page.");
					NXGReports.addStep(
							eleSubCategoryTxt.getText() + "is dispalyed in the in the men sub category page.",
							LogAs.PASSED, null);
				}
				
				
		}catch(Exception e){
			throw e;
		}
	}
	
}

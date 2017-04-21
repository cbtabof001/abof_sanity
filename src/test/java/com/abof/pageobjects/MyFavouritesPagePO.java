package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyFavouritesPagePO {
	AndroidDriver driver;

	public MyFavouritesPagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.abof.android:id/title")
	private WebElement eleFavouritesTitleTxt;

	public WebElement getEleFavouritesTitleTxt() {
		return eleFavouritesTitleTxt;
	}

	@FindBy(xpath = "//	android.widget.TextView[contains(@text,'Favourites')]")
	private WebElement eleFavouritesTxt;

	public WebElement getEleFavouritesTxt() {
		return eleFavouritesTxt;
	}

	@FindBy(id = "com.abof.android:id/ABOF_logout_btn")
	private WebElement eleLogoutBtn;

	public WebElement getEleLogoutBtn() {
		return eleLogoutBtn;
	}

	@FindBy(id = "com.abof.android:id/btnFavShare")
	private WebElement eleFavouriteShareBtn;

	public WebElement getEleFavouriteShareBtn() {
		return eleFavouriteShareBtn;
	}

	@FindBy(id = "com.abof.android:id/btnFavRemove")
	private WebElement eleFavouriteRemoveBtn;

	public WebElement getEleFavouriteRemoveBtn() {
		return eleFavouriteRemoveBtn;
	}
	

	@FindBy(id = "com.abof.android:id/btnFavRemove")
	private List<WebElement> eleFavouriteRemoveButton;

	public List<WebElement> getEleFavouriteRemoveButton() {
		return eleFavouriteRemoveButton;
	}

	@FindBy(id = "com.abof.android:id/btnAddToBag")
	private WebElement eleMoveToCartBtn;

	public WebElement getEleMoveToCartBtn() {
		return eleMoveToCartBtn;
	}
	
	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	 private WebElement eleHamburgerMenuIcon;
	 public WebElement getEleHamburgerMenuIcon() {
	  return eleHamburgerMenuIcon;
	 }

	@FindBy(id = "com.abof.android:id/btnDone")
	private WebElement eleDoneBtn;

	public WebElement getEleDoneBtn() {
		return eleDoneBtn;
	}
	
	@FindBy(id="com.abof.android:id/fav_text")
	private WebElement eleFavTxt;
	public WebElement getEleFavTxt(){
		return eleFavTxt;
	}
	@FindBy(xpath = "//android.view.View/android.widget.ImageButton")
	private WebElement eleFavBackBtn;

	public WebElement getEleFavBackBtn() {
		return eleFavBackBtn;
	}
	
	public void handleFavourite(){
		try{
			Thread.sleep(4000);
			getEleHamburgerMenuIcon().click();
			getEleFavTxt().click();
			int count =getEleFavouriteRemoveButton().size();
			for(int i=0;i<=count;i++){
				getEleFavouriteRemoveBtn().click();
			}
		}catch(Exception e){
			
		}
	}

}

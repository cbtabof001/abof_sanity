package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.abof.library.BaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;

public class MyOrdersPagePO {
	AndroidDriver driver;
	public MyOrdersPagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'My Orders')]")
	private WebElement eleMyOrdersTxt;

	public WebElement getEleMyOrdersTxt() {
		return eleMyOrdersTxt;
	}
	@FindBy(id = "com.abof.android:id/order_view_more")
	private WebElement eleViewMoreIcon;

	public WebElement getEleViewMoreIcon() {
		return eleViewMoreIcon;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'View Details')]")
	private WebElement eleViewDetailsOpt;

	public WebElement getEleViewDetailsOpt() {
		return eleViewDetailsOpt;
	}
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Can')]")
	private WebElement eleCancelOpt;

	public WebElement getEleCancelOpt() {
		return eleCancelOpt;
	}
	@FindBy(id = "com.abof.android:id/order_id_count")
	private WebElement eleOrderIdCountsTxt;

	public WebElement getEleOrderIdCountsTxt() {
		return eleOrderIdCountsTxt;
	}
	@FindBy(id = "com.abof.android:id/order_placed_date")
	private WebElement eleOrderPlacedDateTxt;

	public WebElement getEleOrderPlacedDateTxt() {
		return eleOrderPlacedDateTxt;
	}
	@FindBy(id = "com.abof.android:id/order_delivery_status")
	private WebElement eleOrderDeliveryStatusTxt;

	public WebElement getEleOrderDeliveryStatusTxt() {
		return eleOrderDeliveryStatusTxt;
	}
	@FindBy(id = "com.abof.android:id/order_track_shipment")
	private WebElement eleTrackShipmentBtn;

	public WebElement getEleTrackShipmentBtn() {
		return eleTrackShipmentBtn;
	}
	
	
	@FindBy(id = "com.abof.android:id/order_cancel_txt")
	private WebElement eleAlertCancelLnk;

	public WebElement getEleAlertCancelLnk() {
		return eleAlertCancelLnk;
	}
	
	
	@FindBy(id = "com.abof.android:id/cancel_items_count_txt")
	private WebElement eleCancelledItemCountTxt;

	public WebElement getEleCancelledItemCountTxt() {
		return eleCancelledItemCountTxt;
	}

	@FindBy(id = "com.abof.android:id/cancel_cancel_close_btn")
	private WebElement eleCancelCloseBtn;

	public WebElement getCancelCloseBtn() {
		return eleCancelCloseBtn;
	}

	@FindBy(id = "com.abof.android:id/select_reason_text_view")
	private WebElement eleSelectReasonTxt;

	public WebElement getSelectReasonTxt() {
		return eleSelectReasonTxt;
	}
	

	@FindBy(xpath="//android.widget.Button[contains(@text,'Done')]")
	private WebElement eleDoneBtn;

	public WebElement getEleDoneBtn() {
		return eleDoneBtn;
	}


	@FindBy(id = "com.abof.android:id/shipment_text")
	private WebElement eleAlertCancellationCount;

	public WebElement getEleAlertCancellationCount() {
		return eleAlertCancellationCount;
	}
	
	
	@FindBy(id = "com.abof.android:id/item_cancelled")
	private WebElement eleAlertItemSelectedTxt;

	public WebElement getEleAlertItemSelectedTxt() {
		return eleAlertItemSelectedTxt;
	}
	
	
	@FindBy(id = "com.abof.android:id/cancel_proceed_bt")
	private WebElement eleProceedForCancellationBtn;

	public WebElement getEleProceedForCancellationBtn() {
		return eleProceedForCancellationBtn;
	}
	
	
	@FindBy(id = "com.abof.android:id/cancel_confirm_text")
	private WebElement eleConfirmCancellationTxt;

	public WebElement getEleConfirmCancellationTxt() {
		return eleConfirmCancellationTxt;
	}
	
	@FindBy(id = "com.abof.android:id/confirm_cancel_bt")
	private WebElement eleConfirmCancellationBtn;

	public WebElement getEleConfirmCancellationBtn() {
		return eleConfirmCancellationBtn;
	}
	

	@FindBy(xpath="//android.widget.TextView[contains(@text,'item(s) cancelled successfully')]")
	private WebElement eleCancellationSuccesfulMsg;

	public WebElement getEleCancellationSuccesfulMsg() {
		return eleCancellationSuccesfulMsg;
	}
	
	
	@FindBy(id="com.abof.android:id/continue_shop_bt")
	private WebElement eleContinueshoppingBtn;

	public WebElement getEleContinueShoppingBtn() {
		return eleContinueshoppingBtn;
	}
	
	
	

	@FindBys({ @FindBy(id = "com.abof.android:id/order_id_count") })
	private List<WebElement> eleOrderNoLst;

	public List<WebElement> getEleOrderNoLst() {
		return eleOrderNoLst;
	}
	
	
	public void OrderCancellation() throws InterruptedException
	{
        
		try{
			BaseLib.elementStatus(getEleMyOrdersTxt(),"My Order Text","displayed");
			for(int i=0;i<=getEleOrderNoLst().size();i++)
			{
				if(getEleOrderNoLst().get(i).getText().contains("SI1035003"))
				{
					System.out.println(" got it");
                  driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'SI1035003')]/../../android.widget.ImageView"))
							.click();
					getEleCancelOpt().click();
					Thread.sleep(8000);
					getEleAlertCancelLnk().click();
					Thread.sleep(8000);
			driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Not Interested Any More')]/..//android.widget.RadioButton"))
							.click();
					getEleDoneBtn().click();
					BaseLib.elementStatus(getEleAlertCancellationCount(),"Alert Cancellation Count Txt","displayed");
					BaseLib.elementStatus(getEleAlertItemSelectedTxt() ,"Alert Item Selected Txt","displayed");
					getEleProceedForCancellationBtn().click();	
					BaseLib.elementStatus(getEleConfirmCancellationTxt() ,"Confirm CancellationTxt","displayed");	
					BaseLib.elementStatus(getEleConfirmCancellationBtn(),"Confirm CancellationBtn","displayed");
					getEleConfirmCancellationBtn().click();
					BaseLib.elementStatus(getEleCancellationSuccesfulMsg(),"Cancellation SuccesfulMsg","displayed");
					BaseLib.elementStatus(getEleContinueShoppingBtn(),"Continue shoppingBtn","displayed");
					getEleContinueShoppingBtn().click();
					 
					     break;
				}
				else
				{
				}
			}
			
		}
		catch(Exception e)
		{
			
		}
		
		
		
	}	

		
		

	
	public void OrderConfirmation(String OrderNo) throws InterruptedException
	{
				
		for(int i=0;i<=getEleOrderNoLst().size()-1;i++)
		{
			
			if (getEleOrderNoLst().get(i).getText().contains(OrderNo)) {
			
				System.out.println(getEleOrderNoLst().get(i).getText());
				String status = driver
						.findElement(By.xpath("//android.widget.TextView[contains(@text,'SI1035003')]/../../../../../android.widget.LinearLayout/android.widget.TextView[2]")).getText();

			
				if (status.equals("ORDER PLACED")) {
					NXGReports.addStep("Confirm : OrderIS Placed properly with ORderNo " + OrderNo, LogAs.PASSED, null);
					break;
				}
			}
			
			
		}
	}
	
	
	
	
	
	
}

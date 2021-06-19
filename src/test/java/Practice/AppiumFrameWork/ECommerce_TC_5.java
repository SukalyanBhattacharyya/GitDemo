package Practice.AppiumFrameWork;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import pageObjects.CheckOutPage;
import pageObjects.FormPage;
import pageObjects.ProductsPage;

public class ECommerce_TC_5 extends base1 {

	// TODO Auto-generated method stub

	@Test
	public void totalvalidation() throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");

		//service=startServer();
		// Get started with the App

		FormPage FP = new FormPage(driver);
		FP.nameField.sendKeys("Hello");
		FP.getNameField().sendKeys("Hello");
		driver.hideKeyboard();

		FP.femaleOption.click();
		FP.dropDown.click();
		
		Utilities U = new Utilities(driver);
		U.scrollToText("Algeria");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))");
		//FP.countrySelection.click();
		
		FP.letShopButton.click();

		ProductsPage PP = new ProductsPage(driver);

		PP.addToCart.get(0).click();
		PP.addToCart.get(0).click();
		PP.cartButton.click();

		Thread.sleep(3000);

		CheckOutPage CP = new CheckOutPage(driver);

		int size = CP.productPriceList.size();
		double sum = 0;
		for (int i = 0; i < size; i++) {
			String amount = CP.productPriceList.get(i).getText();
			double Amount = getAmount(amount);
			sum = sum + Amount;
		}

		String TotalAmount = CP.totalAmount.getText();
		TotalAmount = TotalAmount.substring(1);
		double totalValue = getAmount(TotalAmount);
		System.out.println("Total Purchase Amount : " + totalValue);

		Assert.assertEquals(sum, totalValue);
		
		//service.stop();

	}

	public static double getAmount(String value) {
		value = value.substring(1);
		double amount = Double.parseDouble(value);
		return amount;
	}
	
	

	/*
	 * //driver.findElementById("com.androidsample.generalstore:id/nameField").
	 * sendKeys("hello");
	 * 
	 * //driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").
	 * click(); //driver.findElementById("android:id/text1").click();
	 * 
	 * //driver.findElementByXPath("//android.widget.TextView[@text='Albania']").
	 * click();
	 * //driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").
	 * click();
	 * 
	 * //After clicking the first add to cart, the text will change to added to
	 * cart. So the index will start again from 0.
	 * //driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
	 * //driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
	 * 
	 * //driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart")
	 * .click();
	 * 
	 * 
	 * //int size =
	 * driver.findElementsById("com.androidsample.generalstore:id/productPrice").
	 * size();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * String price1 =
	 * driver.findElementsById("com.androidsample.generalstore:id/productPrice").get
	 * (0).getText(); String price2 =
	 * driver.findElementsById("com.androidsample.generalstore:id/productPrice").get
	 * (1).getText();
	 * 
	 * double amount1 = getAmount(price1); double amount2 = getAmount(price2);
	 * 
	 * double total = amount1 + amount2;
	 * System.out.println("Sum of products : "+total);
	 * 
	 */

}

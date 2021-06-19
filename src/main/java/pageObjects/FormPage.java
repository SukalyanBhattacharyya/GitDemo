package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {

	
public FormPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
public WebElement nameField;

@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
public WebElement femaleOption;

@AndroidFindBy(id="android:id/text1")
public WebElement dropDown;

/*
 * @AndroidFindBy(uiAutomator =
 * "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))")
 * public WebElement scrolling;
 */

@AndroidFindBy(xpath="//android.widget.TextView[@text='Albania']")
public WebElement countrySelection;

@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
public WebElement letShopButton;


public WebElement getNameField() {
	System.out.println("Getting the name field.");
	return nameField;
}





}

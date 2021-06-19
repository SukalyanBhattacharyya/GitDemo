package Practice.AppiumFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Utilities {

	AndroidDriver driver;
	
public Utilities(AndroidDriver<AndroidElement> driver) {
		
		this.driver = driver;
	}

	
	public void scrollToText(String text) {
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))");
		driver.findElementByXPath("//android.widget.TextView[@text='"+text+"']").click();;
		
				
	}
	
	
	
}

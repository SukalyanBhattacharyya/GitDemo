package Practice.AppiumFrameWork;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;

public class ApiDemo extends base1{

	
		// TODO Auto-generated method stub
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
		public void apiDemo(String input) throws IOException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemoApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
		Preferences p = new Preferences(driver);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		h.Preferences.click();
		
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='3. Preference dependencies']").click();
		
		p.dependencies.click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys(input);
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
		
	}

}

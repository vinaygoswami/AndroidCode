import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;


public class Androidautomation {
	    AndroidDriver driver;
	    
		@Test(priority=1)
		public void testwatsup() throws MalformedURLException {
			
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("deviceName","Vinay");
        capability.setCapability("platformName","Android");
        capability.setCapability("platformVersion","7.0");
		
        File file=new File("C:\\Users\\Nilesh Thummar\\workspace\\Androidautomation\\App\\Callyzer.apk");
        capability.setCapability("app",file.getAbsolutePath());
        
        driver = new AndroidDriver( new URL("http://192.168.1.17:4723/wd/hub"), capability );
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);    
        
      	}
		
		@Test(priority=2)
		public void tcase() throws InterruptedException{
			
			
		Thread.sleep(5000);
		
		/*allowAppPermission();
		
		Thread.sleep(5000);
		allowAppPermission();
		
		Thread.sleep(5000);
		allowAppPermission();
		
		Thread.sleep(5000);
		allowAppPermission();
		//driver.findElementById("permission_allow_button").click();
		*/
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		
		
		}
		
		
		public void allowAppPermission(){
			 while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

			 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
			 }


		
			
			
			
		}
		
		
}

package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetUp_IE_Chrome_PanthomJS_IOS_Android {

	public static void main(String[] args) {

		/*
		DesiredCapabilities cap = DesiredCapabilities.chrome();    //internetExplorer();  //chrome();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		//------------------------------------Internet Explorer Driver-------------------------------------
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		
		
		//------------------------------------Chrome Driver-------------------------------------
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://dshsapoly3dtpf1/EmployeeDirectory");
		System.out.println("Browser open successfully");
		
		
		//------------------------------------PanthomJS-------------------------------------
		 
		
		
		
		
		
		
		
		
		
		//------------------------------------iOS---Android----------------------------------
		
		
		SelendroidCapabilities capa= new SelendroidCapabilites(“io.selendroid.testapp:0.9.0”);
		WebDriver driver = new SelendroidDriver(capa); 
		driver.manage.timeout().implecitlywait(20, TimeUnit.SECONDS);  
		driver.findElement(By.id(“my_text_field”)).sendkeys(“Hello Selendroid!!”);
		driver.findElement(By.id(“visibleButtonTest”)).Click();  
		
		
		//--------------------------------------Selendroid-OSX-------------------------------------
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("devices","selendroid")'
		cap.setCability("app","/Users/way2automation/Documents/android.sdk/adt-bundle-mac-x86");
		cap.setCapability("app-package","io.selendroid.testapp")
		cap.setCapability("app-activity","HomeScreenActivity")
		driver = new SwipeableWebDriver(new URL("http://127.0.01:4723/wd/hub").capabilities);
		
		Public class SwipeableWebDriver extends RemoteWebDriver implements HosTouchScreen{
		private RemoteTouchScreen touch;
		
		public SwipeableWebDriver(URL remoteAddress, Capabilities desiredCapabilities){
		super(remoteAddress, desiredCapabilities);
		touch = new RemoteTouchScreen(getExecuteMethod());
		}
		
		public TouchScreen getTouch(){
		return touch;
		}}
		
		
		
		//---------------------------------------------iPhone  simulator--------------------------
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("device","iPhone Simulator");
		cap.setCability("app","/Users/way2automation/Documents/android.sdk/adt-bundle-mac-x86");
		driver = new SwipeableWebDriver(new URL("http://127.0.01:4723/wd/hub").capabilities);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}

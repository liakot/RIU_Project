package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_Verify_Assertion {

	public static void main(String[] args) {
	
	
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://Google.com");
		System.out.println("Browser open successfully");
		
		//----How to get typed text from a textbox -----------Using ---Assert--------------Validating--------
		
		WebElement EnterYourText = driver.findElement(By.xpath("//*[@id='Email']"));	
		EnterYourText.sendKeys("2automationRemoteSchool@gmail");
		System.out.println(EnterYourText.getSize().getWidth());
		System.out.println(EnterYourText.getSize().getHeight());
		String getText = EnterYourText.getAttribute("value");
			if(EnterYourText !=null){
				Assert.assertTrue(true);
				System.out.println("Element is present"+"      " + getText);					
		}else{
			System.out.println("Element absent");			
		}
			
//------------------------------------------------------------------			
			
			
			String pageTitle = driver.getTitle(); 
			System.out.println(pageTitle);
			
			
			if(pageTitle.contains("Gogle"))
			{System.out.println("Virification is complete");}
			else{{System.out.println("Virification is not complete");}
			}
			
//---------------------OR-------------------------------
 			
 
		try{
	    String page1Title = driver.getTitle();    
	    System.out.println(page1Title +"         "+ "Varification Beganing");    
	    Assert.assertEquals("Google.com", page1Title);    
	    
			}catch (Throwable t){
				System.out.println("Error Printed");
				//Error.addError(t);
			}
			System.out.println( "Varification Ending");
			
				
//---------------------------------------------or-------------------------------------------------------------			
			
			WebElement EnterYourEmail = driver.findElement(By.xpath("//*[@id='Email']"));
			System.out.println(EnterYourEmail);
			
			//if(EnterYourEmail.equals(null)) or
				if (EnterYourEmail==null)
			{
				System.out.println("Element Not Found");
			}else{
				EnterYourEmail.sendKeys("mshahnewaz@gmail.com");}
			System.out.println("Typing Succesfull");
			
//----------------------------------------------or----------------------------------			
			try{
			WebElement Enter1YourEmail = driver.findElement(By.xpath("//*[@id='Emal']"));  //Wrong xpath , without Email er i
			System.out.println(Enter1YourEmail);
			
			//if(EnterYourEmail.equals(null)) or
				if (Enter1YourEmail==null)
			{
				System.out.println("Element Not Found");
			}else{
				Enter1YourEmail.sendKeys("mshahnewaz@gmail.com");}
			System.out.println("Typing Succesfull");
			
			}catch(Throwable t){
				System.out.println("Error Occoured");
				//Error.addError(t);			
			}
			
			System.out.println("Pass by test steps");
			
			
//---------------------------------------------------or----------------------------			
			
			WebElement text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/div/div/p[2]"));
			String Text = text.getText();
			System.out.println(Text);
			Assert.assertEquals("One Google Account for everything Google", Text);
			System.out.println("Varification Successfull");
			
			
			
			//-----------------------------or------------------------------------
			
			driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("mshahnewaz1@gmail.com");
			
			boolean ElementPresent = driver.findElement(By.xpath("//*[@id='next']")).isDisplayed();
			boolean Element1Present = driver.findElement(By.xpath("//*[@id='next']")).isEnabled();
			
			if (ElementPresent==true && Element1Present==true)
			{driver.findElement(By.xpath("//*[@id='next']")).click();
				}else{
					System.out.println("Element is not Displayed or Enable");
				
			}
//--------or--------------AssertNotNull--------UserName Present and printing-			
			
			WebElement Enter2YourEmail = driver.findElement(By.id("Email"));
			Enter2YourEmail.sendKeys("mshahnewaz@gmail.com");
			String Verify = Enter2YourEmail.getAttribute("id");
			Assert.assertNotNull(Verify);
			System.out.println("Verification Complete");
			
			
//-------------------or-------------validation --Username----element--is present-----			
			
			WebElement Enter3YourEmail = driver.findElement(By.xpath("//*[@id='Email']"));
			if((Enter3YourEmail)!= null){
			//if(driver.findElement(By.xpath("//*[@id='Email']"))!= null){
				System.out.println("Element is Present");
				}else{
				System.out.println("Element is Absent");
				}
//-------------------or--------To check text present-----on the webpage-------				
		
		WebElement Enter4YourEmail = driver.findElement(By.xpath("//*[@id='Email']"));
			if(Enter4YourEmail.isDisplayed()){
				System.out.println("Element is Visible");
				}else{
				System.out.println("Element is InVisible");
				}
		
//---------or--------To check text present-----on the webpage------------------
 
		if(driver.getPageSource().contains("continue")){
				System.out.println("Text is present");
				}else{
				System.out.println("Text is absent");
				}

			   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try{
		       FileUtils.copyFile(scrFile, new File("C:\\screenshot\\ScrenPrint.png"));
			   }catch (IOException e){
				   e.printStackTrace();				   			   
			   }
			
			   System.out.println("ScreenShot is Successfull");
			   
			   
		
	//-----------------------------------Step2: Verify the Last Name------------------------------	
		
		//Step2: Verify the Last Name
		if(driver.getPageSource().contains("Zaman")){
			System.out.println("Search Employee name is present");
			}else{
			System.out.println("Text is absent");
			}
		
//-------------------//Step4: Verify the Back to List Link on the page------------------------------		
		
		//Step4: Verify the Back to List Link on the page
		if(driver.getPageSource().contains("Back to List")){
			Assert.assertTrue(true);
			System.out.println("Back to List Link Verify Successfull");
			}else{
			System.out.println("Text Element is absent");
			}
		
//-------------------//Step4: Verify the Back to List Link on the page------------------------------		
		
		//Step: Verify
		WebElement Number = driver.findElement(By.xpath("html/body/div[2]/div[2]/dl/dd[5]"));
		String VerifyPhone = Number.getText();
		Assert.assertEquals("(360) 486-2308", VerifyPhone);
		

	}

}

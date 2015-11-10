package BasicSelenium;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.testng.Assert;


	public class JUnit_Assertion {
		
		@Rule
		public ErrorCollector ec = new ErrorCollector();

		@Test
		public void testTitle(){
			
			String actual_title = "Google.com"; // Extract Selenium script 
			String expected_title = "Google Inc"; // Compare this title from the Excel sheet
		
			System.out.println("Start comparising");
			try{
			Assert.assertEquals(actual_title, expected_title);
			}catch(Throwable t){
				
				System.out.println("Error Captured");
				ec.addError(t);
			}
			System.out.println("Comparison done");
		}
			
			/*
			if(actual_title == expected_title){
				System.out.println("Test Case Pass");
			}else{
				
				System.out.println("Test Case Fail");
			}
			*/

	}



package testNGBasics;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "test-data")
	   public static Object[][] dataProvFunc(){
	         return new Object[][]{
	               {"Lambda Test"},{"Automation"}
	         };
	   }

}

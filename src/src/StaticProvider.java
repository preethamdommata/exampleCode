package src;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name="Inputvalues")
	public static Object[][] createData(){ 
		return new Object[][]{new Object[]{"10"}};
		}
	}
	
package src;

//import java.util.Vector;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	private int m_numberOfTimes;  

	  public NewTest(int numberOfTimes) {  
	    m_numberOfTimes = numberOfTimes;  
	  }  


	
	@BeforeSuite
	public void beforeSuite(){
			System.out.println("Set up related to Suite before anything else");    
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Close all the appliations after all the testing");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("After Method");
	}
	@BeforeGroups
	public void beforeGroups(){
		System.out.println("Before Groups");
	}
	@AfterGroups
	public void afterGroups(){
		System.out.println("After Groups");
	}
	@Test(groups={"funtest"})
	public void method1() {
		System.out.println("this is method one ");
	}
	
	@DataProvider(name="dataprovider")	
	public Object[][] createData(){
		return new Object[][]{
				{"preetham", new Integer(123)},
				{"pramati", new Integer(546)},
				{"kanabay", new Integer(98)}
		};
	}
	
	@Test(dataProvider="dataprovider", groups={"funtest"})
	public void method3(String name, Integer number) {
		System.out.println("this is method three");
		System.out.println("String is: "+name+" "+"and Number is: "+number);
	}

	@Test(groups={"funtest", "checkintest"})
	public void method2() {
		for (int i = 0; i < m_numberOfTimes; i++) {  
			System.out.println("this is method two");  
		   } 
	}
}



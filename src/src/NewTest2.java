package src;

import org.testng.annotations.Test;

public class NewTest2 {
	private int m_numberoftimes;
	public NewTest2(int numberOfTimes) {  
	    m_numberoftimes = numberOfTimes;  
	  }  

	
  @Test(groups = {"funtest1","checkintest"})
  public void method1() {
System.out.println("this is method6");
  }
  @Test(groups = {"funtest1"})
  public void method2() {
System.out.println("this is method7");
  }
  @Test
  public void method8() {
System.out.println("this is method8");
  }
  @Test
  public void method9() {
System.out.println("this is method9");
  }
  @Test
  public void method10() {
System.out.println("this is method10");
  }
}

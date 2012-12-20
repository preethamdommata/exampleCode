package src;

import org.testng.annotations.Test;

public class NewTest {

	@Test(groups = { "funtest" })
	public void method1() {
		System.out.println("this is method one ");
	}

	@Test(groups = { "funtest" })
	public void method3() {
		System.out.println("this is method three");
	}

	@Test(groups = { "funtest","checkintest" })
	public void method2() {
		System.out.println("this is method two");

	}
	@Test
	public void methodtesting(){
		System.out.println("preetham reddy");
	}
	@Test
	public void testing7(){
	System.out.println("testing7");
}

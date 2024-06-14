package testNgExample;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;

//@Listeners( ITestListenerClass.class)
public class ITestClass1 {
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		AssertJUnit.assertTrue(false);
	}
	
	
	@Test(timeOut = 1000)
	public void testMethod3() throws Exception {
		Thread.sleep(2000);
		System.out.println("testMethod3");
		
	}
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
		
	}
	
	@Test(dependsOnMethods = "testMethod4")
	public void testMethod5() {
		System.out.println("testMethod5");
	}
}

package springmvc;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import springmvc.model.MyServices;

public class calTest {
	MyServices myServices=new MyServices();
	
	@Test
	public void calAddTest() {
		assertEquals(5, myServices.add(2, 3));
		assertEquals(203, myServices.add(100, 103));

	}
	
	public void calTestPass() {
		assertEquals(5, myServices.add(2, 3));
		
		/*
		 * assertEquals("error in div()",2, myServices.sub(6, 3));
		 * assertEquals("error in mul()",14, myServices.mul(2, 7));
		 * assertEquals("error in sub()",4, myServices.sub(2, 6));
		 */
	
	}
	

}

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
	@Test
	public void calSubTest() {
		assertEquals(5, myServices.sub(8, 3));
		assertEquals(200, myServices.sub(303, 103));

	}
	
	@Test
	public void calDivTest() {

	
		assertEquals(5, (int) myServices.div(15, 3));
		assertEquals(10, (int) myServices.div(10000, 1000));

	}
	
	@Test
	public void calMulTest() {
		assertEquals(6,(int) myServices.mul(2, 3));
		assertEquals(400,(int) myServices.mul(200, 2));

	}
	
		
		
	
	
	

}

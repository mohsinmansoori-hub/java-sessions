package testngSessions;

import org.testng.annotations.Test;

//if priority is not given test will run in alphabetical form
//and all the test cases are given priority =1 ,then also they will run in alphabetical foem
//we can give priority 1,2,3 and even negitive priority but we must avid it.


//D Test
//E Test
//A test
//C test
//b test

public class PriorityInTestNG {
	@Test(priority=1)
	public void ATest() {
		System.out.println("A test");
	}
	@Test(priority=3)
	public void Btest() {
		System.out.println("b test");
		
	}
	@Test(priority=2)
	public void Ctest() {
		System.out.println("C test");
	}
	@Test
	public void DTest() {
		System.out.println("D Test");
	}
	@Test
	public void ETest() {
		System.out.println("E Test");
	}

}

package testngSessions;

import org.testng.annotations.Test;

public class ExceptedExceptionconcept {
	
	

	
		@Test(expectedExceptions= ArithmeticException.class)
		public void ATest() {
			System.out.println("A test");
			int i=9/0;
			System.out.println("bye");
		}
		//exception is a super class of all exception.
		
		//@Test(expectedExceptions= Exception.class)
		//public void searchhomepage() {
			//System.out.println("A test");
			//int i=9/0;
		//}
		
		//throwable class is a super class of exception class.
		@Test(expectedExceptions= Throwable.class)
				public void searchhomepage() {
					System.out.println("A test");
					int i=9/0;
				}
}
		//as expected exception is of array type we can multiple exception,but exception should be there in testcases,
		//if it will be not there then exception will come}.if we are passing a exception ,then exception should be there.

		
		//we will not be using this bcz we are automating to solve these exception ,not to bypass these exception.
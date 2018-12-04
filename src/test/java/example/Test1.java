package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test()
	public void methodTest1() {
		System.out.println("methodTest1");
	}
	
	@Test()
	public void method2Test1() {
		System.out.println("method2Test1");
	}
	
	@Test()
	public void method3Test1() {
		System.out.println("method3Test1");
	}
	
	@Test()
	public void method4Test1() {
		String Name ="jeetendra";
		Assert.assertEquals("jeetendra", Name);
//		System.out.println("method3Test1");
	}
}

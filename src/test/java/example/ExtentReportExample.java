package example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class ExtentReportExample {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public void startTest() {
		report = new ExtentReports();
		test = report.createTest("Demo Test case ");
	}

	@Test()
	public void testcase() {
		
		test.log(Status.PASS, "Inside sample test case");
		System.out.println(test.pass("testcase"));
//		rep.onTestStarted(null);
	}
}

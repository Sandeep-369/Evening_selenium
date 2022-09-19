package Extent;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class E1 {
        @Test
        public void test1()
        {
        	
			ExtentReports report=new ExtentReports("./Extent_report/exte.html",false);
			ExtentTest test = report.startTest("tc1");
			test.log(LogStatus.PASS, "test case passed");
			test.log(LogStatus.FAIL, "test case Fail");
			test.log(LogStatus.SKIP, "test case Skip");
			report.endTest(test);
        	report.flush();
        }
}

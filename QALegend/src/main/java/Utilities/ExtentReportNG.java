
package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
static ExtentReports extent;
public static ExtentReports getReportObject() {
String path=System.getProperty("user.dir")+"\\test-output\\report.html";
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setReportName("web automation report");
reporter.config().setDocumentTitle("Test Results");
extent=new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("tester", "Farzina farzi");
return extent;

}

}

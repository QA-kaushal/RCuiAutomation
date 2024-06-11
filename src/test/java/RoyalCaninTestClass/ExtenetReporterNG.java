package RoyalCaninTestClass;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ExtenetReporterNG  {
	
	public static ExtentReports extent;	
	
	public static ExtentReports getreporterObject() {
		String path =	System.getProperty("user.dir")+"\\reports\\index.htm";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("RC result");
		reporter.config().setDocumentTitle("Test Result");
		reporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company Name", "Channelplay Limited");
		extent.setSystemInfo("QA Engineer", "Kaushal V. Golangade");
		extent.setSystemInfo("Project Name", "Royal Canin");
		extent.setSystemInfo("Automated App", "RC Start Application");
		
		return extent;
	}

}

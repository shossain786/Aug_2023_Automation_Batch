package org.itest.reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.itest.libs.PropertiesManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportNG {
    static ExtentReports extent;

    public static ExtentReports setupExtentReport() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);

        String reportPath = System.getProperty("user.dir")+
                "/target/Reports/ExecutionReport_"+actualDate+".html";

        ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(sparkReport);

        sparkReport.config().setDocumentTitle("AutomationReport");
        sparkReport.config().setTheme(Theme.STANDARD);
        sparkReport.config().setReportName("MAGNETO");

        extent.setSystemInfo("Executed on Environment: ", PropertiesManager.getPropertyValueByKey("url"));
        extent.setSystemInfo("Executed on Browser: ", PropertiesManager.getPropertyValueByKey("browser"));
        extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
        extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));

        return extent;
    }
}

package Annotations;

import Base_utilities.Base_class;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestFial extends Base_class  implements ITestListener {


    public TestFial() throws IOException {
        super();
        Base_class.init();
    }

    public void onTestFailure(ITestResult result) {
        String methodName=result.getName().toString().trim();
        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver)context.getAttribute("driver");
        Base_class.takeScreenShot(methodName, driver);
    }
}

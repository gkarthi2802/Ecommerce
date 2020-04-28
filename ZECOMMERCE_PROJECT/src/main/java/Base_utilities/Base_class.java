package Base_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Constants.Constants;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Base_class implements ITestNGListener {

public static WebDriver	driver;
public static Properties prop;

public Base_class() throws IOException {

 prop = new Properties();
 FileInputStream fis = new FileInputStream("C:\\Users\\Karthik\\IdeaProjects\\Ecommerce\\ZECOMMERCE_PROJECT\\Resources\\config.properties");
 prop.load(fis);
	
	
}

public static void init() {
System.setProperty(prop.getProperty("webdriver_chrome"),Constants.webdriver_url);
driver = new ChromeDriver();	
driver.get(prop.getProperty("url"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Constants.implicit_time, TimeUnit.MILLISECONDS);
	
}

    public static void takeScreenShot(String methodName, WebDriver driver) {
        String filePath = "./screenshots/";
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

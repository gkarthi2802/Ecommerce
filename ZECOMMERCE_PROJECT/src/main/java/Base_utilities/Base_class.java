package Base_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {

public static WebDriver	driver;
public static Properties prop;

public Base_class() throws IOException {

 prop = new Properties();
 FileInputStream fis = new FileInputStream("C:\\Users\\Karthik\\eclipse-workspace\\ZECOMMERCE_PROJECT\\Resources\\config.properties");
 prop.load(fis);
	
	
}

public static void init() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\Desktop\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();	
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
}

}

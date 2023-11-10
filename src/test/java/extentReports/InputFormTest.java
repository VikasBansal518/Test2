package extentReports;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class InputFormTest extends BaseTest {
    public String username = "YOUR_USERNAME";
    public String accesskey = "YOUR_ACCESSKEY";
  //  public static WebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub";

    @BeforeTest
    public void startReport(){
        initializeReport();
    }

    @BeforeMethod
    public void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "96.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "ExtentReportGeneration");
        capabilities.setCapability("name", "ExtentReportGenerationTest");
        try {
           // driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        	WebDriverManager.chromedriver().setup();
    		driver= new ChromeDriver(); 
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println(e.getMessage());

    }
    }

    @Test
    public void verifyTitle(){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName,"verify_Page_Title");
        test.log(Status.INFO,"starting");
        test.assignCategory("P0");

        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        String title ="Selenium Grid Online | Run Selenium Test On Cloud";
        System.out.println(title.length());
        System.out.println(driver.getTitle().trim().length());
        
        Assert.assertEquals(title,driver.getTitle().trim());
    }

    @Test
    public void SingleInputTest() {
        try {
            String nameofCurrMethod = new Throwable()
                    .getStackTrace()[0]
                    .getMethodName();

            test = extent.createTest(nameofCurrMethod, "TestCase_singleInputTest");
            test.log(Status.INFO,"Starting the tests : "+test.getStatus());
            test.assignCategory("P1");

            driver.get("https://www.lambdatest.com/selenium-playground/");

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            //Clicks on the simple form demo option in the selenium playground
            WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
            simpleFormDemo.click();

            //Enters the message in the enter message input box
            WebElement messageInputBox = driver.findElement(By.xpath("//input[@id='user-message']"));
            messageInputBox.sendKeys("Hello World");

            //Clicks on Show Message button
            WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Get Checked Value']"));
            showMessageButton.click();

            //Retrieves the entered user message
            WebElement userMessage = driver.findElement(By.xpath("//label[text()='Your Message: ']//..//p"));
            String actualUserText = userMessage.getText();

            Assert.assertEquals(actualUserText,"Hello World", "Expected and actual texts do match.");

        } catch (Exception e) {

        }

    }

    @Test
    public void MultipleInputTest() {
        try {
            String methodName = new Exception().getStackTrace()[0].getMethodName();
            test = extent.createTest(methodName, "TestCase_MultipleInputTest");
            test.log(Status.INFO,"Starting the tests :");
            test.assignCategory("P0");

            driver.get("https://www.lambdatest.com/selenium-playground/");
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
            simpleFormDemo.click();

            WebElement firstInputBox = driver.findElement(By.xpath("//input[@id='sum1']"));
            firstInputBox.sendKeys("5");

            WebElement secondInputBox = driver.findElement(By.xpath("//input[@id='sum2']"));
            secondInputBox.sendKeys("10");

            WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Sum']"));
            getTotalButton.click();

            WebElement userMessage = driver.findElement(By.xpath("//p[@id='addmessage']"));
            String actualUserText = userMessage.getText();

            Assert.assertEquals(actualUserText,"15", "Expected and actual values do match.");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @AfterMethod
    public void end(){
        driver.quit();

    }
    @AfterTest
    public void endReport(){
        extent.flush();

    }

}

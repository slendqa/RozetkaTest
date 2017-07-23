package RozTest.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class ChromeSettings {

    protected WebDriver driver;
    protected String email = "roztest@mailinator.com";
    protected String password = "Password1";

    @BeforeClass
    public void setUp(){
        String property = System.getProperty( "user.dir" ) + "/driver/chromedriver.exe";
        System.setProperty( "webdriver.chrome.driver", property );
        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}

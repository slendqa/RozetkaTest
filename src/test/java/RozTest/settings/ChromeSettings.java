package RozTest.settings;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.mustache.StringChunk;

import java.util.concurrent.TimeUnit;


public class ChromeSettings {

    protected WebDriver driver;
    protected java.lang.String userEmail = "roztest@mailinator.com";
    protected java.lang.String userPassword = "Password1";

    @BeforeClass
    public void setUp(){
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

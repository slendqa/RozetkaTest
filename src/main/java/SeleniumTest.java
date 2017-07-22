import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SlendQA on 13.07.2017.
 */
public class SeleniumTest {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new FirefoxDriver();
        WebDriver.Options options = driver.manage();
        options.window().maximize();

        driver.get("http://google.com");

        WebElement searchField = driver.findElement(By.className("gsfi"));
//        WebElement searchButton = driver.findElement(By.className("b_searchboxSubmit"));

        searchField.sendKeys("automation");
//        searchButton.click();

//        WebElement wikiLink = driver.findElement(By.linkText("Test - Wikipedia"));
//        wikiLink.click();
//
//        WebElement wikiSearch = driver.findElement(By.name("search"));
//        wikiSearch.sendKeys("Testosteron");
//
//        WebElement wikiSearchButton = driver.findElement(By.name("go"));
//        wikiSearchButton.click();
//
//        WebElement title = driver.findElement(By.id("firstHeading"));
//          String title = driver.findElement()
//        title.getText();

//        System.out.println(title);

        driver.quit();
    }
}

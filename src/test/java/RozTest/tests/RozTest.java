package RozTest.tests;

import RozTest.pages.MainPage;
import RozTest.settings.ChromeSettings;
import org.apache.xpath.operations.String;
import org.testng.annotations.Test;

public class RozTest extends ChromeSettings {

    @Test
    public void searchMacbook() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSignInButton();
        mainPage.login(userEmail, userPassword);
    }
}

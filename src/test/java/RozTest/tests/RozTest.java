package RozTest.tests;

import RozTest.pages.MainPage;
import RozTest.settings.ChromeSettings;
import org.testng.annotations.Test;

public class RozTest extends ChromeSettings {

    @Test
    public void searchMacbook() throws InterruptedException{
        MainPage mainpage = new MainPage(driver);
        mainpage.clickSignInButton();
        mainpage.login( email, password);
    }
}

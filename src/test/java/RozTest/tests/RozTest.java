package RozTest.tests;

import RozTest.pages.MainPage;
import RozTest.pages.ResultPage;
import RozTest.settings.ChromeSettings;
import org.testng.annotations.Test;

public class RozTest extends ChromeSettings {

    @Test
    public void searchMacbook() throws InterruptedException{
        MainPage mainpage = new MainPage(driver);
        mainpage.clickSignInButton();
        mainpage.login(email, password);
        mainpage.clickSocialPopUp();
        mainpage.assertUserName();
        mainpage.searchMacbook();
        ResultPage resultPage = mainpage.clickSearchButton();
        resultPage.clickBuyProductButton();
//        resultPage.assertItemName();
        resultPage.deleteItemFromCart();
        resultPage.assertEmptyCart();
    }
}

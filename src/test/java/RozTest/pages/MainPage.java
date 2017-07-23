package RozTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.xml.transform.Result;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) { this.driver = driver; }

    By signInButton = By.cssSelector("[name='signin']");
    By emailTxt = By.cssSelector("[name='login']");
    By passTxt = By.xpath("//div[contains(text(), 'Пароль')]//following-sibling::input");
    By submitButton = By.cssSelector("[name='auth_submit']");
    By closeSocialPopUp = By.xpath("//*[@id='social_popup']/div/div/a");
    By userNameLocator = By.id("header_user_menu_parent");
    By searchTxt = By.cssSelector("[name='text']");
    By searchButton = By.className("btn-link-i");


    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void typeEmail(String email){
        WebElement login = driver.findElement(emailTxt);
        login.click();
        login.clear();
        login.sendKeys(email);
    }

    public void typePassword(String password){
        WebElement login = driver.findElement(passTxt);
        login.click();
        login.clear();
        login.sendKeys( (CharSequence) password );
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void login (String email, String password){
        typeEmail(email);
        typePassword(password);
        clickSubmitButton();
        System.out.println("Login OK");
    }

    public void clickSocialPopUp(){
        driver.findElement(closeSocialPopUp).click();
        System.out.println("Close Social Pop-up OK");
    }

    public void assertUserName(){
        Assert.assertEquals("Arnold", driver.findElement(userNameLocator).getText(), "Arnold");
        System.out.println("User name is Ok");
    }

    public void searchMacbook(){
        WebElement input = driver.findElement(searchTxt);
        input.click();
        input.clear();
        input.sendKeys("Macbook");
    }

    public ResultPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new ResultPage(driver);
    }
}

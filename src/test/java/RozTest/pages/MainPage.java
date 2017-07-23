package RozTest.pages;

import RozTest.settings.ChromeSettings;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends ChromeSettings {
    private WebDriver driver;

    public MainPage(WebDriver driver) { this.driver = driver; }

    By signInButton = By.cssSelector("[name='signin']");
    By emailTxt = By.cssSelector("[name='login']");
    By passTxt = By.xpath("//div[contains(text(), 'Пароль')]//following-sibling::input");
    By submitButton = By.cssSelector("[name='auth_submit']");

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void typeEmail(String email){
        WebElement login = driver.findElement(emailTxt);
        login.click();
        login.clear();
        login.sendKeys( (CharSequence) email );
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
    }
}

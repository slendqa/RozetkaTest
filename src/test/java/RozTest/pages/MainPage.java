package RozTest.pages;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) { this.driver = driver; }

    By signInButton = By.cssSelector("[name='signin']");
    By emailTxt = By.cssSelector("[name='login']");
    By passTxt = By.xpath("//div[contains(text(), 'Пароль')]//following-sibling::input");
    By submitButton = By.cssSelector("[name='auth_submit']");

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void typeEmail( String userEmail){
        WebElement login = driver.findElement(emailTxt);
        login.click();
        login.clear();
        login.sendKeys((CharSequence) userEmail);
    }

    public void typePassword( String userPassword){
        WebElement login = driver.findElement(passTxt);
        login.click();
        login.clear();
        login.sendKeys((CharSequence) userPassword);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void login ( String userEmail, String userPassword){
        typeEmail(userEmail);
        typePassword(userPassword);
        clickSubmitButton();
    }
}

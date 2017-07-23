package RozTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResultPage {
    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    By buyProductButton = By.xpath(".//*[@id='block_with_search']/div/div[2]//div[@class='toOrder']");
    By itemNameLocator = By.xpath(".//*[@id='cart-popup']//div[@class='cart-i-title']");
    By delItemFromCart = By.className("cart-check");
    By confirmDelItemFromCart = By.className("cart-i-delete");
    By emptyCart = By.className("empty-cart-title");

    public void clickBuyProductButton(){
        driver.findElement(buyProductButton).click();
        System.out.println("Click Buy button");
    }

//    public void assertItemName(){
////        System.out.println(driver.findElement(itemNameLocator).getText());
//        Assert.assertEquals("Apple MacBook Pro Retina 15\" (MJLQ2UA/A)", driver.findElement(itemNameLocator).getText());
//        System.out.println("Assertion Ok");
//    }

    public void deleteItemFromCart(){
        driver.findElement(delItemFromCart).click();
        driver.findElement(confirmDelItemFromCart).click();
        System.out.println("Delete item Ok");
    }

    public void assertEmptyCart(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCart));
        Assert.assertEquals("Корзина пуста", driver.findElement(emptyCart).getText());
        System.out.println("Empty cart Ok");
    }
}

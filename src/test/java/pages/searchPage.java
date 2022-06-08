package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPage {
    By filter = By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(12) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(4) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    By second = By.cssSelector("a[aria-label='2 sayfasına git']");
    By name = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span");
    By sepet = By.cssSelector("#add-to-cart-button");

    WebDriver driver;
    WebDriverWait wait;
    public searchPage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 10);

    }
    public void filterProduct() {
        driver.findElement(filter).click();
    }
    public void secondPage() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 2000);");
        driver.findElement(second).click();
    }
    public void selectName() {
        driver.findElement(name).click();
    }
    public void addCard() {
        driver.findElement(sepet).click();
    }
}

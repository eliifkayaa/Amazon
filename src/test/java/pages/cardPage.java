package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cardPage {

    By card = By.cssSelector("#sw-gtc > span > a");
    By delete = By.cssSelector("input[value='Sil']");
    By control = By.cssSelector("div[class='a-row'] h1");
    By control_2 = By.cssSelector(".a-spacing-mini.a-spacing-top-base");
    WebDriver driver;
    WebDriverWait wait;

    public cardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    public void goCard() {
        driver.findElement(card).click();
    }
    public void controlProduct() {
        driver.findElement(control);
    }
    public void deleteCard() {
        driver.findElement(delete).click();
    }
    public void controlCard() {
        driver.findElement(control_2);
    }
}


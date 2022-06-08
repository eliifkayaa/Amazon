package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class homePage {
    By logo = By.id("nav-logo-sprites");
    By searchBox = By.cssSelector("#twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By cookie = By.cssSelector("#sp-cc-accept");
    WebDriver driver;
    WebDriverWait wait;
    public homePage(WebDriver driver) {
        this.driver =driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    public void setDefaultSettings(int time) {
        driver.get("https://www.amazon.com.tr");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void checkLogo() {
        driver.findElement(logo);
        driver.findElement(cookie).click();
    }
    public void setSearchBox(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

}



package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import util.driverFactory;

public class homePageSteps {
    WebDriver driver = new driverFactory().getDriver();
    homePage homePage = new homePage(driver);

        @Given("Uygulama acilir")
        public void uygulama_acilir() {
            homePage.setDefaultSettings(10);
            homePage.checkLogo();

        }
        @When("Arama cubuguna {string} yazilir")
        public void arama_cubuguna_yazilir(String product) {
            homePage.setSearchBox(product);
        }
        @When("Ara butonuna tiklanir")
        public void ara_butonuna_tiklanir() {
            homePage.clickSearchButton();
    }

}

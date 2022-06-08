package stepDefinition;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.searchPage;
import util.driverFactory;

public class searchPageSteps {

    WebDriver driver = new driverFactory().getDriver();
    searchPage searchPage = new searchPage(driver);

    @When("Urun filtrelenir")
    public void urun_filtrelenir() {
        searchPage.filterProduct();
    }

    @When("Ikıncı sayfaya gecis")
    public void ıkıncı_sayfaya_gecis() {
        searchPage.secondPage();
    }

    @When("Isme gore urun secme")
    public void ısme_gore_urun_secme() {
        searchPage.selectName();
    }

    @When("Sepete ekleye tiklanir")
    public void sepete_ekleye_tiklanir() {
        searchPage.addCard();
    }
}

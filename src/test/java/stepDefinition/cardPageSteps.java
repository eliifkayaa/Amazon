package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.cardPage;
import pages.searchPage;
import util.driverFactory;

public class cardPageSteps {
    WebDriver driver = new driverFactory().getDriver();
    cardPage cardPage = new cardPage(driver);

    @When("Sepete gidilir")
    public void sepete_gidilir() {
        cardPage.goCard();

    }
    @When("Urunun sepette oldugunu kontrol edilir")
    public void urununSepetteOldugunuKontrolEdilir() {
        cardPage.controlProduct();
    }

    @Then("Urun sepetten cikarilir")
    public void urun_sepetten_cikarilir() {
        cardPage.deleteCard();
    }



    @When("Urunun sepetten cikarildigi kontrol edilir")
    public void urununSepettenCikarildigiKontrolEdilir() {
        cardPage.controlCard();
    }

}

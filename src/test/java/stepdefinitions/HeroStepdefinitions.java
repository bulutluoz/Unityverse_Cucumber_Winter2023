package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HeroPage;

public class HeroStepdefinitions {

    HeroPage heroPage = new HeroPage();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        heroPage.addElementButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(heroPage.deleteButonu.isDisplayed());
    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        heroPage.deleteButonu.click();
    }

    @And("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void addRemoveElementsYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(heroPage.addRemoveYaziElementi.isDisplayed());
    }
}

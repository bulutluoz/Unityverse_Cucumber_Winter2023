package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepdefinitions {

    EditorPage editorPage = new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }
    @Then("{string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void bilgilerini_girer(String isim, String soyisim, String position, String office, String extension, String startDate, String salary) {
    //    And "<isim>" "<soyisim>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer

        Actions actions = new Actions(Driver.getDriver());
        actions.click(editorPage.kayitGirisIsimKutusu)
                .sendKeys(isim)
                .sendKeys(Keys.TAB)
                .sendKeys(soyisim)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extension)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary)
                .perform();
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();
    }

    @When("kullanici {string} ve {string} ile arama yapar")
    public void kullaniciVeIleAramaYapar(String isim, String soyisim) {

        editorPage.aramaKutusu.sendKeys(isim + " " + soyisim);

    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String isim) {

        String actualIsim = editorPage.aramaSonucuIsimKutusu.getText();

        Assert.assertTrue(actualIsim.contains(isim));
    }
}

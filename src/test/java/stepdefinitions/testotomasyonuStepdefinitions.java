package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class testotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        ReusableMethods.bekle(5);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        int sonucSayisi = testOtomasyonuPage.bulunanUrunlerListesi.size();
        Assert.assertTrue(sonucSayisi>0);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }

    @When("arama kutusuna shoes yazip aratir")
    public void aramaKutusunaShoesYazipAratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("shoes" + Keys.ENTER);
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @Then("ilk urune click yapar")
    public void ilk_urune_click_yapar() {
        testOtomasyonuPage.bulunanUrunlerListesi.get(0).click();
    }
    @Then("urun isminin shoes icerdigini test eder")
    public void urun_isminin_shoes_icerdigini_test_eder() {

        String expectedUrunIsimIcerigi = "shoes";
        String actualUrunIsmi = testOtomasyonuPage.seciliUrunIsimElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIsimIcerigi));
    }
}

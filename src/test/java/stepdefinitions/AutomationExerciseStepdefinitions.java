package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ExercisePage;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    ExercisePage exercisePage = new ExercisePage();

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        exercisePage.signUpLinki.click();
    }
    @Given("user Create an account bölümüne email adresi girer")
    public void user_create_an_account_bölümüne_email_adresi_girer() {
        Faker faker = new Faker();
        exercisePage.signUpIsimKutusu.sendKeys(faker.name().fullName());
        exercisePage.signUpEmailKutusu.sendKeys(faker.internet().emailAddress());
    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        exercisePage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(exercisePage.titleRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("23")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("75001")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        exercisePage.createAccountButonu.click();
    }
    @Then("hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        Assert.assertTrue(exercisePage.kayitOlusturulduYazisi.isDisplayed());
    }
}

package com.cermati.webtesting.step_definitions;

import com.cermati.webtesting.pages.DaftarAkun;
import com.cermati.webtesting.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.cermati.webtesting.step_definitions.Hooks.delay;

public class TestDaftarAkun {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private DaftarAkun daftarAkun = new DaftarAkun();

    public TestDaftarAkun() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.002 Input registration data Email, NoHandphone, Password,ConfirmPassword, inputFirstName, inputLastName")
    public void input_registration_data() {
        delay(2);
        this.daftarAkun.inputData("23fortest@gmail.com", "085256233390","$Test123",
                "$Test123","widiya","fitri");
        extentTest.log(LogStatus.PASS, "TCC.002 Input registration data Email, NoHandphone, Password,ConfirmPassword, inputFirstName, inputLastName");
    }

    @And("TCC.002 Search regency or city")
    public void serch_regency_city() {
        this.daftarAkun.searchInput("Kota batam");
        this.daftarAkun.enter();
        delay(2);
        extentTest.log(LogStatus.PASS, "TCC.002 Search regency/city");
    }

    @And("TCC.002 Click on terms and conditions")
    public void click_on_terms_and_conditions() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        this.daftarAkun.clickKebijakanPrivasi();
        extentTest.log(LogStatus.PASS, "TCC.002 Click on terms and conditions");
    }

    @And("TCC.002 Click register button")
    public void click_register_button() {
        delay(1);
        this.daftarAkun.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "TCC.002 Click register button");
    }

    @And("TCC.002 Select verification methode OTP code")
    public void go_to_select_verification_method_page() {
        extentTest.log(LogStatus.PASS, "TCC.002 Select verification methode OTP code");
    }

    @Then("TCC.002 account is successfully created go to home page")
    public void account_created_successfully() {
        driver.get(Constants.HOMEPAGE);
        Assert.assertEquals(daftarAkun.getTxtHomePage(), "Beranda");
        extentTest.log(LogStatus.PASS, "TCC.002 account is successfully created go to home page");
    }

}

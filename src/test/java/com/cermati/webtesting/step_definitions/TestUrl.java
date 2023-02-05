package com.cermati.webtesting.step_definitions;

import com.cermati.webtesting.pages.Url;
import com.cermati.webtesting.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUrl {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Url url = new Url();

    public TestUrl() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case Access URL
    @When("TCC.001 User open cermati URL")
    public void user_open_url() {
        driver.get(Constants.VALID_URL);
        extentTest.log(LogStatus.PASS, "TCC.001 User open cermati URL");
    }

    @Then("TCC.001 Showing register page")
    public void showing_register_page() {
        Assert.assertEquals(url.getTxtDaftarAkun(), "Daftar Akun");
        extentTest.log(LogStatus.PASS, "TCC.001 Showing register page");
    }


}

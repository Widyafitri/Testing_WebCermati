package com.cermati.webtesting.pages;

import com.cermati.webtesting.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DaftarAkun {
    private WebDriver driver;

    public DaftarAkun() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "mobilePhone")
    WebElement inputNoHP;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"safe-area\"]/div[2]/div[2]/div/div[2]/div/button")
    WebElement hiddenPassword;

    @FindBy(id = "confirmPassword")
    WebElement inputConfirmPassword;

    @FindBy(id = "firstName")
    WebElement inputFirstName;

    @FindBy(id = "lastName")
    WebElement inputLastName;

    @FindBy(id = "cityAndProvince")
    WebElement searchCityProvince;

    @FindBy(id = "cityAndProvince")
    WebElement enterCityProvince;

    @FindBy(xpath = "//*[@id=\"terms-and-condition\"]")
    WebElement cklistKebijakanPrivasi;

    @FindBy(xpath = "//*[@id=\"safe-area\"]/div[2]/div[2]/div/button")
    WebElement btnDaftar;

    @FindBy(xpath = "//*[@id=\"safe-area\"]/header/div/div[2]/div[2]/div/div[1]/div/div[2]")
    WebElement txtHomePage;

    @FindBy(xpath = "//*[@id=\"safe-area\"]/div[2]/div[2]/div/div[2]/div/button[2]")
    WebElement btnInputOtpviaSms;



    public void inputData(String inputEmail, String inputNoHP, String inputPassword, String inputConfirmPassword, String inputFirstName, String inputLastName){
        this.inputEmail.sendKeys(inputEmail);
        this.inputNoHP.sendKeys(inputNoHP);
        this.inputPassword.sendKeys(inputPassword);
        this.inputConfirmPassword.sendKeys(inputConfirmPassword);
        this.inputFirstName.sendKeys(inputFirstName);
        this.inputLastName.sendKeys(inputLastName);

    }

    public void searchInput(String searchInput) {this.searchCityProvince.sendKeys(searchInput);}

    public void clickBtnDaftar() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnDaftar);
    }

    public void enter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", enterCityProvince);
    }

    public void clickKebijakanPrivasi() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", cklistKebijakanPrivasi);
    }

    public String getTxtHomePage() {return txtHomePage.getText();}


    public void clickkonfrViaSms() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnInputOtpviaSms);
    }
}

package com.cermati.webtesting.pages;

import com.cermati.webtesting.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url {
    private WebDriver driver;

    public Url() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id=\"safe-area\"]/div[2]/div[1]/div[1]/h1")
    WebElement txtDaftarAkun;

    public String getTxtDaftarAkun() {return txtDaftarAkun.getText();}
}

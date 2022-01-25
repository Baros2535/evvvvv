package com.evComply.Pages;

import com.evComply.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link nav-link-signin'])[1]")
    public WebElement login;

    @FindBy(xpath = "(//a[.='Register interest'])[1]")
    public WebElement register;

    @FindBy(xpath = "//ul[@class='nav ml-lg-auto justify-content-center']//a")
    public List<WebElement> footers;

    @FindBy(xpath = "//a[.='Privacy Policy']")
    public WebElement privacy;

    @FindBy(xpath = "//a[.='Terms & Conditions']")
    public WebElement terms;

}

package com.evComply.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[.='ACCEPT']")
    public WebElement accept;

    @FindBy(xpath = "//h1")
    public WebElement h1;

    @FindBy(xpath = "(//div[@class='col-lg-5 col-md-4 d-block'])[1]")
    public WebElement apple;

    @FindBy(xpath = "(//div[@class='col-lg-5 col-md-4 d-block'])[2]")
    public WebElement google;

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

    @FindBy(css =    ".homepage-pitch>img")
    public WebElement video;







}

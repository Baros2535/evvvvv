package com.evComply.StepDef;

import com.evComply.Pages.BasePage;
import com.evComply.Pages.HomePage;
import com.evComply.Utils.BrowserUtils;
import com.evComply.Utils.ConfigurationReader;
import com.evComply.Utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePageStepDefs {

    @Given("User is on the given URL")
    public void user_is_on_the_given_url() {
        Driver.getDriver().get(ConfigurationReader.get("URL"));
    }

    @Then("Verify that user at the URL successfully")
    public void verify_that_user_at_the_url_successfully() {
        new HomePage().accept.click();
        String expectedUrl = "https://www.ev-comply.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Verifying Url :",expectedUrl,actualUrl);

    }

    @Then("Verify that user sees {string} at the page")
    public void verify_that_user_sees_at_the_page(String expectedTitle) {
        WebElement element = null;
        if(expectedTitle.equals("Simplifying your EV Charger installations")) {
            element = new HomePage().h1;
            BrowserUtils.waitForVisibility(element, 10);
            BrowserUtils.verifyElementDisplayed(element);

        }else if( expectedTitle.equals("Register interest" )) {
                element = new HomePage().register;
                BrowserUtils.waitForVisibility(element,10);
                BrowserUtils.verifyElementDisplayed(element);

        }else if( expectedTitle.equals("Watch Our Intro" )) {
            element = new HomePage().video;
            BrowserUtils.waitForVisibility(element, 10);
            BrowserUtils.verifyElementDisplayed(element);
        }else{
                System.out.println("Invalid Title");
        }


    }

    @Then("Verify that user sees the mobile app store links on the page")
    public void verify_that_user_sees_the_mobile_app_store_links_on_the_page() {


    }
    @Then("Verify that user sees following links on the the footer")
    public void verify_that_user_sees_following_links_on_the_the_footer(List<String> expectedFooterLabels) {
        List<String> actualFooterLabels = BrowserUtils.getElementsText(new HomePage().footers);
        Assert.assertEquals(expectedFooterLabels,actualFooterLabels);


    }
    @Then("Verify that user sees following options end of the page")
    public void verify_that_user_sees_following_options_end_of_the_page(List<String> expectedTitles) {


    }

}

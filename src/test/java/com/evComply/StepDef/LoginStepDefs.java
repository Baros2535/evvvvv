package com.evComply.StepDef;

import com.evComply.Pages.HomePage;
import com.evComply.Utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    @When("user click Login")
    public void user_click_login() {
       new HomePage().login.click();
    }
    @Then("Verify URL {string}")
    public void verify_url(String expectedURL) {
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());
    }


}

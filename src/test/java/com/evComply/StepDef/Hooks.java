package com.evComply.StepDef;



import com.evComply.Utils.Driver;


import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;


public class Hooks {
        @Before
        public void setUp(){

            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


        @After
        public void tearDown(Scenario scenario){
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            }
            Driver.closeDriver();

        }
}

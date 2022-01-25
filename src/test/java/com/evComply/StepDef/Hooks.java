package com.evComply.StepDef;



import com.evComply.Utils.Driver;


import com.evComply.Utils.ScreenRecordUtils;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks {

ScreenRecordUtils screenRecordUtils=new ScreenRecordUtils();


        @Before
        public void setUp() throws IOException, AWTException {
          screenRecordUtils.startRecording();
            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }


        @After
        public void tearDown(Scenario scenario) throws Exception {
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            }
            Driver.closeDriver();
       screenRecordUtils.stopRecording();
        }


}

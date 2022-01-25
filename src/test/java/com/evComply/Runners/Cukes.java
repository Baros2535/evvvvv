package com.evComply.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "me.jvt.cucumber.report.PrettyReports:target"
                ,"pretty"
        },
        features = "src/test/resources/Features",
        glue = "com/evComply/StepDef",
        dryRun = false,
        tags = "@wip"
)
public class Cukes {
}

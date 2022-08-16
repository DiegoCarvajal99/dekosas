package com.dekosas.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.dekosas.www.feature/busquedaExcel.feature",
        glue = "com.dekosas.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BusquedaExcelRunner {
}

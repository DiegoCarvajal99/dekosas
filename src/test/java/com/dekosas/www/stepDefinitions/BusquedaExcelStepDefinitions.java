package com.dekosas.www.stepDefinitions;

import com.dekosas.www.tasks.BusquedaExcel;
import com.dekosas.www.userInterface.OutlineProductosUI;
import com.dekosas.www.utils.Models;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BusquedaExcelStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero encontrar un producto desde excel$")
    public void quieroEncontrarUnProductoDesdeExcel() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaExcel.enDekosas());
    }


    @Then("^Seleccionar producto$")
    public void seleccionarProducto() {

    }
}

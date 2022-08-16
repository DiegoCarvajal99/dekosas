package com.dekosas.www.stepDefinitions;

import com.dekosas.www.tasks.BusquedaExcel;
import com.dekosas.www.tasks.ProductoAleatorioDekosas;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class ClickRandomStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero encontrar un producto$")
    public void quieroEncontrarUnProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoAleatorioDekosas.enDekosas());
    }


    @Then("^Slecciono una categoria para escoger uno aleatoriamente$")
    public void sleccionoUnaCategoriaParaEscogerUnoAleatoriamente() {

    }
}

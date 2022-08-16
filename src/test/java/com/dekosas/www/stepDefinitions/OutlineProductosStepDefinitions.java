package com.dekosas.www.stepDefinitions;

import com.dekosas.www.driver.DriverScreenplay;
import com.dekosas.www.tasks.OutlineBuscarProductos;
import com.dekosas.www.userInterface.OutlineProductosUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class OutlineProductosStepDefinitions {

    OutlineProductosUI outlineProductosUI = new OutlineProductosUI();
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^que me encuentre en la pagina dekosas (.*)$")
    public void queMeEncuentreEnLaPaginaDekosasHttpsDekosasComCo(String url) {
        OnStage.theActorCalled("")
                .can(BrowseTheWeb.with(DriverScreenplay.chromeDrive(url)));

    }


    @When("^quiero conocer informacion del producto (.*)$")
    public void quieroConocerInformacionDelProductoPapelDeColgadura(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(OutlineBuscarProductos.enDekosas(producto));
    }

    @Then("^valido el nombre del producto (.*)$")
    public void validoElNombreDelProductoPapelDeColgaduraDecoStyleGrisKonker(String validar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(outlineProductosUI.LBL_NOMBRE_PRODUCTO.of()), WebElementStateMatchers
                .containsText(validar)));
    }
}

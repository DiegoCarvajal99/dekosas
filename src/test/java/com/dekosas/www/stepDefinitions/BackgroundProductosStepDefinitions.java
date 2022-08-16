package com.dekosas.www.stepDefinitions;

import com.dekosas.www.tasks.OutlineBuscarProductos;
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

public class BackgroundProductosStepDefinitions {

    OutlineProductosUI outlineProductosUI = new OutlineProductosUI();
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero conocer el precio del producto$")
    public void quieroConocerElPrecioDelProducto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(OutlineBuscarProductos.enDekosas(arg1.get(0).getProducto()));
    }


    @Then("^valido si el precio se adapta a mi presupuesto$")
    public void validoSiElPrecioSeAdaptaAMiPresupuesto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(outlineProductosUI.LBL_NOMBRE_PRODUCTO.of()), WebElementStateMatchers
                .containsText(arg1.get(0).getValidacion())));
    }
}

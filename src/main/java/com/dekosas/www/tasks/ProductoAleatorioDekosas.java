package com.dekosas.www.tasks;

import com.dekosas.www.interactions.ClickRandom;
import com.dekosas.www.userInterface.CatergoriaUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoAleatorioDekosas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CatergoriaUI.BTN_MENU, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CatergoriaUI.BTN_MENU),
                WaitUntil.the(CatergoriaUI.BTN_CATEGORIA_MUEBLES, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CatergoriaUI.BTN_CATEGORIA_MUEBLES),
                ClickRandom.enCatergoriasMuebles()

        );


    }
    public static Performable enDekosas(){
        return Instrumented.instanceOf(ProductoAleatorioDekosas.class).withProperties();
    }


}
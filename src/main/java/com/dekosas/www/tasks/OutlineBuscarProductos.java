package com.dekosas.www.tasks;

import com.dekosas.www.userInterface.OutlineProductosUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class OutlineBuscarProductos implements Task {


    private String producto;

    public OutlineBuscarProductos(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(producto).into(OutlineProductosUI.TXT_BARRA_DEKOSAS),
                Enter.keyValues(Keys.ENTER).into(OutlineProductosUI.TXT_BARRA_DEKOSAS),
                Click.on(OutlineProductosUI.BTN_PRODUCTO)
        );

    }
    public static Performable enDekosas(String producto){
        return Instrumented.instanceOf(OutlineBuscarProductos.class).withProperties(producto);
    }
}

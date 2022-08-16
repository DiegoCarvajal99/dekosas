package com.dekosas.www.interactions;

import com.dekosas.www.userInterface.CatergoriaUI;
import com.dekosas.www.utils.VariableGlobal;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

public class ClickRandom implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {
        try {Thread.sleep(5000);}catch (InterruptedException e){e.printStackTrace();}
        Random random = new Random();
        List<WebElementFacade> listaBtnProductos = CatergoriaUI.BTN_PRODUCTO_ALEATORIO.resolveAllFor(actor);
        List<WebElementFacade> listaLblProductos =  CatergoriaUI.LBL_PRODUCTO_ALEATORIO.resolveAllFor(actor);
        int numRandom = random.nextInt(listaBtnProductos.size());
        VariableGlobal.productoAleatorio = listaLblProductos.get(numRandom).getText();
        listaBtnProductos.get(numRandom).click();
        try {Thread.sleep(5000);}catch (InterruptedException e){e.printStackTrace();}

    }
    public static Performable enCatergoriasMuebles(){
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}

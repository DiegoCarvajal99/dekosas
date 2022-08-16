package com.dekosas.www.tasks;

import com.dekosas.www.userInterface.OutlineProductosUI;
import com.dekosas.www.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaExcel implements Task {

    OutlineProductosUI outlineProductosUI = new OutlineProductosUI();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.readExcel("busquedas.xlsx", "Buscar");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i<leerExcel.size(); i++) {
            actor.attemptsTo(

                    Enter.keyValues(leerExcel.get(i).get("Terminos")).into(OutlineProductosUI.TXT_BARRA_DEKOSAS),
                    Enter.keyValues(Keys.ENTER).into(outlineProductosUI.TXT_BARRA_DEKOSAS),
                    Click.on(OutlineProductosUI.BTN_PRODUCTO),
                    //Enter.theValue( "").into(outlineProductosUI.TXT_BARRA_DEKOSAS).thenHit(Keys.CLEAR),
                     //Enter.keyValues(Keys.CONTROL + "a" + Keys.CLEAR).into(outlineProductosUI.TXT_BARRA_DEKOSAS)
                    Clear.field(outlineProductosUI.TXT_BARRA_DEKOSAS)

                    );
           }

    }
    public static Performable enDekosas(){
        return Instrumented.instanceOf(BusquedaExcel.class).withProperties();
    }
}

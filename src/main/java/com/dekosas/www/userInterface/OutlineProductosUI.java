package com.dekosas.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class OutlineProductosUI {
    public  static final Target TXT_BARRA_DEKOSAS = Target
            .the("Barra de busqueda de dekosas")
            .locatedBy("//input[@id='search']");
    public static final Target BTN_PRODUCTO = Target
            .the("Productos selecionado")
            .locatedBy("(//a[@class='product-item-link'])[1]");
    public static final Target LBL_NOMBRE_PRODUCTO = Target
            .the("Nombre del producto")
            .locatedBy("//span[@class='base']");
}

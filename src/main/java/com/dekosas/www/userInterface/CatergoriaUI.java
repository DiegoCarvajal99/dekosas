package com.dekosas.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CatergoriaUI {
    public static final Target BTN_MENU = Target
            .the("boton Menu despegable en dekosas")
            .locatedBy("//div[@class='menu-title closed']");

    public static final Target BTN_CATEGORIA_MUEBLES = Target
            .the("boton Categoria Muebles")
            .locatedBy("//a[@href='https://dekosas.com/co/muebles-accesorios']");

    public static final Target BTN_PRODUCTO_ALEATORIO = Target
            .the("boton para seleccionar uno de los productos")
            .locatedBy("//div[@class='product photo product-item-photo']");

    public static final Target LBL_PRODUCTO_ALEATORIO = Target
            .the("titulos de los productos")
            .locatedBy("//a[@class='product-item-link']");
}

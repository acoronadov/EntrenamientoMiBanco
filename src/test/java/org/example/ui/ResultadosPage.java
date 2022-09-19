package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosPage

{

    public static Target LBLResultado = Target.the("Validacion").locatedBy("//span[@class='layout_hola']");

    public static Target txtMsgError = Target.the("mensaje de error").locatedBy("//span[@class='error']");
}

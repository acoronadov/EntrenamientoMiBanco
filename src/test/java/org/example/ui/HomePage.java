package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target txtUsername = Target.the("Usuario para ingresar").locatedBy("//input[@id='username']");

    public static Target btnConfirm = Target.the("Confirm").locatedBy("//tbody/tr[2]/td[1]/input[1]");

    public static Target txtPss = Target.the("Pss ingreso").locatedBy("//input[@id='answer']");

    public static Target bntLogin = Target.the("login").locatedBy("//input[@value='Enviar']");





}

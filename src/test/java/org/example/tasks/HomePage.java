package org.example.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HomePage implements Task {

    private String user;
    private String pss;
    private Integer case1;

    public HomePage(String user, String pss, Integer case1){
        this.user = user;
        this.pss = pss;
        this.case1 = case1;
    }

    //Paso 1 - La tarea a la que pasamos los parametros
    public static Performable login(String user, String pss, Integer case1){
        return Instrumented.instanceOf(HomePage.class).withProperties(user, pss, case1);
    }


        @Override
    public <T extends Actor> void performAs(T actor) {
            if(case1 == 1) {
                actor.attemptsTo(
                        Enter.theValue(user).into(org.example.ui.HomePage.txtUsername),
                        Click.on(org.example.ui.HomePage.btnConfirm),
                        Enter.theValue(pss).into(org.example.ui.HomePage.txtPss),
                        Click.on(org.example.ui.HomePage.bntLogin)
                );
            }
            else {
                actor.attemptsTo(
                        Enter.theValue(user).into(org.example.ui.HomePage.txtUsername),
                        Click.on(org.example.ui.HomePage.btnConfirm)
                );
            }
    }



}

package org.example.steps;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class transferStep {


    public static Actor Alex = Actor.named("Fer");

    @Managed
    public static WebDriver suNavegador;

    @Before
    public void setUpForTest(){
        suNavegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Alex.can(BrowseTheWeb.with(suNavegador));

    }


}

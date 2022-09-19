package org.example.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.Question.homeDataLambda;
import org.example.tasks.HomePage;
import org.example.Question.homeData;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class MiPrimerFeature {

    public static Actor Alex = Actor.named("Alex");

    @Managed
    public static WebDriver suNavegador;

    @Before
    public void setUpForTest(){
        suNavegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Alex.can(BrowseTheWeb.with(suNavegador));

    }
    @Given("un usuario se registra en el sitio")
    public void un_usuario_se_registra_en_el_sitio() {
        Alex.attemptsTo(Open.url("https://mbdva.bppr.com/cibp-web/actions/login?lang=es"));
    }

    @When("^el usuario ([^\"]*) se logea con credenciales ([^\"]*) validas")
    public void el_usuario_se_logea_con_credenciales_validas(String user, String pss) {
        Integer case1 = 1;
        Alex.attemptsTo(HomePage.login(user,pss, case1));
    }

    @Then("el sitio debe mostrar el home con el nombre de usuario correcto ([^\"]*)$")
    public void el_sitio_debe_mostrar_el_home_con_el_nombre_de_usuario_correcto( String name) {
      //  WaitUntil.the(ResultadosPage.LBLResultado,isVisible()).forNoMoreThan(10).seconds();
        //Fer.should(seeThat(the(ResultadosPage.LBLResultado), isVisible()));
        Alex.should(seeThat("Nombre de quien se logea", homeData.Name(), containsString(name)));
    }



    @When("el perfil se logea con credenciales invalidas")
    public void elPerfilSeLogeaConCredencialesInvalidas() {
        Integer case1 = 2;
        Alex.attemptsTo(HomePage.login("autoquinito","Test1234", case1));
    }

    @Then("la web debe mostrar el mensaje usuario invalido")
    public void lawebdebemostrarelmensajeusuarioinvalido() {
        Alex.should(seeThat("El mensaje de error es:", homeDataLambda.msgErrorValue(), equalTo("Usuario inválido")));


    }

}

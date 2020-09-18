package co.com.bancolombia.prueba.stepdefinitions;

import co.com.bancolombia.prueba.tasks.Create;
import co.com.bancolombia.prueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class UtestStepDefinitions {

    @Before
    public void beforeStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^(.*) ingresa a la pagina web de Utest$")
    public void ingresaAUtest(String actor){
        OnStage.theActorCalled(actor).wasAbleTo(
                OpenUp.thePage()
        );
    }

    @When("^cuando intenta registrarse con los siguientes datos$")
    public void seRegistra(Map<String, String> valores) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Create.anAccount(valores)
        );

    }

}

package co.com.bancolombia.prueba.tasks;

import co.com.bancolombia.prueba.userinterface.UTestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenUp implements Task {

    public static Performable thePage() {
        return instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new UTestHomePage()));
    }
}

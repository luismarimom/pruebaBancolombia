package co.com.bancolombia.prueba.tasks;

import co.com.bancolombia.prueba.userinterface.UTestHomePage;
import co.com.bancolombia.prueba.userinterface.UtestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Create implements Task {

    private Map<String, String> valores;

    public Create(Map<String, String> valores) {
        this.valores = valores;
    }

    public static Performable anAccount(Map<String, String> valores) {
        return instrumented(Create.class, valores);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestHomePage.BUTTON_JOIN));

        actor.attemptsTo(
                Enter.keyValues(valores.get("firstName")).into(UtestRegistroPage.INPUT_FIRST_NAME),
                Enter.keyValues(valores.get("lastName")).into(UtestRegistroPage.INPUT_LAST_NAME),
                Enter.keyValues(valores.get("email")).into(UtestRegistroPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(valores.get("birthMonth")).from(UtestRegistroPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(valores.get("birthDay")).from(UtestRegistroPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(valores.get("birthYear")).from(UtestRegistroPage.SELECT_BIRTH_YEAR),
                Click.on(UtestRegistroPage.BUTTON_NEXT)
        );

        actor.attemptsTo(
                Click.on(UtestRegistroPage.BUTTON_NEXT)
        );

        actor.attemptsTo(
                Click.on(UtestRegistroPage.BUTTON_NEXT)
        );

        actor.attemptsTo(
                Enter.keyValues(valores.get("password")).into(UtestRegistroPage.INPUT_PASSWORD),
                Enter.keyValues(valores.get("password")).into(UtestRegistroPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegistroPage.CHECK_TERM_USE),
                Click.on(UtestRegistroPage.CHECK_PRIVACY),
                Click.on(UtestRegistroPage.BUTTON_COMPLETE)
        );

    }
}

package co.com.bancolombia.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UTestHomePage extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("boton ir a la vista de registro")
            .locatedBy("//ul[@class='nav navbar-nav']//a[contains(text(), 'Join Today')]");

}

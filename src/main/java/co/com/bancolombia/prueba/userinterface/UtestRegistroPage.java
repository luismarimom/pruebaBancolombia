package co.com.bancolombia.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistroPage {

    private UtestRegistroPage(){}

    public static final Target INPUT_FIRST_NAME = Target.the("campo para escribir el nombre")
            .locatedBy("#firstName");
    public static final Target INPUT_LAST_NAME = Target.the("campo para escribir el apellido")
            .locatedBy("#lastName");
    public static final Target INPUT_EMAIL = Target.the("campo para escribir el email")
            .locatedBy("#email");
    public static final Target SELECT_BIRTH_MONTH = Target.the("campo para escribir el mes de nacimiento")
            .locatedBy("#birthMonth");
    public static final Target SELECT_BIRTH_DAY = Target.the("campo para escribir el dia de nacimiento")
            .locatedBy("#birthDay");
    public static final Target SELECT_BIRTH_YEAR = Target.the("campo para escribir el anho de nacimiento")
            .locatedBy("#birthYear");
    public static final Target INPUT_PASSWORD = Target.the("campo para escribir la contrasena")
            .locatedBy("#password");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("campo para confirmar la contrasena")
            .locatedBy("#confirmPassword");
    public static final Target CHECK_TERM_USE = Target.the("checkbox para aceptar los terminos de uso")
            .locatedBy("#termOfUse");
    public static final Target CHECK_PRIVACY = Target.the("checkbox para aceptar las politicas de privacidad")
            .locatedBy("#privacySetting");
    public static final Target BUTTON_COMPLETE = Target.the("boton para finalizar el registro")
            .locatedBy("//span[contains(text(), 'Complete Setup')]");
    public static final Target BUTTON_NEXT = Target.the("boton para continuar el registro")
            .locatedBy("//span[contains(text(), 'Next:')]");


}

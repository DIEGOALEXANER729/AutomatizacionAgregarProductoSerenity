package is.demo.serenity.interactions;


import is.demo.serenity.userinterfaces.PaginaProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicAgregarProducto implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaProductosUI.BTN_NUEVO_PRODUCTO));
    }

    public static Performable ClicAgregarProducto() {
        return instrumented(ClicAgregarProducto.class);
    }

}

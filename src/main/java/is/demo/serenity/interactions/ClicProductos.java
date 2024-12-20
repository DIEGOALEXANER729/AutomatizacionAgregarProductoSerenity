package is.demo.serenity.interactions;

import is.demo.serenity.userinterfaces.PaginaPanelUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicProductos implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaPanelUI.BTN_PRODUCTOS));
    }

    public static Performable ClicProductos() {
        return instrumented(ClicProductos.class);
    }

}

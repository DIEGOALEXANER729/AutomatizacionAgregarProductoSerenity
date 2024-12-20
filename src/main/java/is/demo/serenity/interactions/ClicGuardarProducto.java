package is.demo.serenity.interactions;


import is.demo.serenity.userinterfaces.PaginaNuevoProductoUI;
import is.demo.serenity.userinterfaces.PaginaProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicGuardarProducto implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaNuevoProductoUI.BTN_GUARDAR));    }

    public static Performable ClicGuardarProducto(){
        return  instrumented(ClicGuardarProducto.class);}

}

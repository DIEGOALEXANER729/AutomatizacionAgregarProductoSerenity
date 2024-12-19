package is.demo.serenity.interactions;

import is.demo.serenity.userinterfaces.PaginaPanelUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicNorthwind   implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaPanelUI.BTN_NORTHWIND));
    }

    public static Performable ClicNorthwind(){
        return  instrumented(ClicNorthwind.class);}

}

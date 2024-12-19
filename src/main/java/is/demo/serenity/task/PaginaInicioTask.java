package is.demo.serenity.task;

import is.demo.serenity.utils.EsperaImplicita;
import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static is.demo.serenity.userinterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicioTask implements Task {

    private static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "DatosIngreso");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(Keys.BACK_SPACE).into(TXT_USUARIO));
        actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("UsuarioInicio")).into(TXT_USUARIO));
        actor.attemptsTo(Enter.theValue(Keys.BACK_SPACE).into(TXT_CLAVE));
        actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("Clave")).into(TXT_CLAVE));
        actor.attemptsTo(Click.on(BTN_INGRESAR));

    }

    public static Performable PaginaInicioTask(){
        return instrumented(PaginaInicioTask.class);
    }
}

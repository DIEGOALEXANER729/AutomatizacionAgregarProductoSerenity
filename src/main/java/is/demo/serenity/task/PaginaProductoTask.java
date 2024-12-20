package is.demo.serenity.task;


import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static is.demo.serenity.userinterfaces.PaginaProductosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PaginaProductoTask implements Task {

    private static ArrayList<Map<String, String>> datosExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Producto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("NombreProducto")).into(TXT_BUSCAR_PRODUCTO),
                Hit.the(Keys.ENTER).into(TXT_BUSCAR_PRODUCTO));

    }

    public static Performable PaginaProductoTask() {
        return instrumented(PaginaProductoTask.class);
    }
}

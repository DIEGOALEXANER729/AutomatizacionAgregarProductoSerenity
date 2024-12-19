package is.demo.serenity.task;

import is.demo.serenity.utils.EsperaImplicita;
import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static is.demo.serenity.userinterfaces.PaginaNuevoProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PaginaNuevoProductoTask implements Task {


    private static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Producto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("NombreProducto")).into(TXT_NOMBRE_PRODUCTO));
            actor.attemptsTo(
                Click.on(LST_PROVEEDOR), // Hacer clic para abrir el dropdown
                WaitUntil.the(TXT_PROVEEDOR, isVisible()).forNoMoreThan(10).seconds(), // Espera explícita para que LST_PROVEEDOR sea visible
                SendKeys.of("Bigfoot Breweries").into(TXT_PROVEEDOR), // Simular la escritura de "Bigfoot Breweries" en el campo del dropdown
                Hit.the(Keys.ENTER).into(TXT_PROVEEDOR) // Presionar ENTER para seleccionar el valor
                           );
            actor.attemptsTo(
                Click.on(LST_CATEGORIA), // Hacer clic para abrir el dropdown
                WaitUntil.the(TXT_CATEGORIA, isVisible()).forNoMoreThan(10).seconds(),
                SendKeys.of("Condimen").into(TXT_CATEGORIA),
                    SendKeys.of(Keys.ARROW_DOWN).into(TXT_CATEGORIA),
                Hit.the(Keys.ENTER).into(TXT_CATEGORIA)
                          );
            EsperaImplicita.esperaImplicita(3);
            actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("UnidadStock")).into(TXT_UNIDADES_STOCK));
            actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("UnidadPedido")).into(TXT_UNIDADES_BAJO_PEDIDO));
            actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("NivelReorden")).into(TXT_NIVEL_REORDENAMIENTO));
            actor.attemptsTo(Click.on(BTN_GUARDAR));

    }



    public static Performable PaginaNuevoProductoTask(){
        return instrumented(PaginaNuevoProductoTask.class);
    }
}

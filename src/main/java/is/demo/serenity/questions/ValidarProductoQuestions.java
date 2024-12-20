package is.demo.serenity.questions;

import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static is.demo.serenity.userinterfaces.PaginaProductosUI.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidarProductoQuestions implements Question<Boolean> {


    String nomberProducto="";

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            ArrayList<Map<String, String>> datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Producto");
            nomberProducto = datosExcel.get(0).get("NombreProducto");


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        String productoValidar = LBL_VALIDAR_PRODUCTO.resolveFor(actor).getText();

        if( nomberProducto.equals(productoValidar)){
            return true;
        }


        return false;
    }

    public static Question ValidarProductoQuestions(){
        return new ValidarProductoQuestions();
    }
}

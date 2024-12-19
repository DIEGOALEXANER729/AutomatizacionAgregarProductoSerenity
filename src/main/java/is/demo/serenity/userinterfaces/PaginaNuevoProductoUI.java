package is.demo.serenity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaNuevoProductoUI extends PageObject {

    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Texto nombre producto nuevo").located(By.id("ProductDialog48_ProductName"));
    public static final Target TXT_UNIDADES_STOCK = Target.the("Texto uninades  disponibles").located(By.id("ProductDialog48_UnitsInStock"));
    public static final Target TXT_UNIDADES_BAJO_PEDIDO = Target.the("Texto unidades bajo pedido").located(By.id("ProductDialog48_UnitsOnOrder"));
    public static final Target TXT_NIVEL_REORDENAMIENTO = Target.the("Texto de nivel de reordenamiento").located(By.id("ProductDialog48_ReorderLevel"));
    public static final Target BTN_GUARDAR = Target.the("boton guardar").located(By.xpath("//span[@class='button-inner' and text()='Save']"));



}

package is.demo.serenity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaNuevoProductoUI extends PageObject {

    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Texto nombre producto nuevo").located(By.xpath("//input[@class='editor s-Serenity-StringEditor s-StringEditor required']"));
    public static final Target TXT_UNIDADES_STOCK = Target.the("Texto uninades  disponibles").located(By.xpath("//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required' and @name='UnitsInStock']"));
    public static final Target TXT_UNIDADES_BAJO_PEDIDO = Target.the("Texto unidades bajo pedido").located(By.xpath("//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required' and @name='UnitsOnOrder']"));
    public static final Target TXT_NIVEL_REORDENAMIENTO = Target.the("Texto de nivel de reordenamiento").located(By.xpath("//input[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required' and @name='ReorderLevel']"));
    public static final Target LST_PROVEEDOR = Target.the("Lista de proveedores").located(By.xpath("//div[@id='s2id_ProductDialog9_SupplierID']"));
    public static final Target TXT_PROVEEDOR = Target.the("Lista de proveedores").located(By.xpath("//input[@id='s2id_autogen4_search']"));
    public static final Target LST_CATEGORIA = Target.the("Click Lista categoria").located(By.xpath("//div[@id='s2id_ProductDialog9_CategoryID']"));
    public static final Target TXT_CATEGORIA = Target.the("Texto decategoria").located(By.xpath("//input[@id='s2id_autogen5_search']"));
    public static final Target BTN_GUARDAR = Target.the("boton guardar").located(By.xpath("//i[@class='fa fa-check-circle text-purple']"));


}

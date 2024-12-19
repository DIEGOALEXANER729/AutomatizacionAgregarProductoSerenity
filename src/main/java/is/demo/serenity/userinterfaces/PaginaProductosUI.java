package is.demo.serenity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductosUI extends PageObject {

    public static final Target BTN_NUEVO_PRODUCTO = Target.the("Boton Nuevo Producto").located(By.xpath("//div[@class='tool-button add-button icon-tool-button']//i[@class='fa fa-plus-circle text-green']"));
    public static final Target TXT_BUSCAR_PRODUCTO = Target.the("Texto de buscar producto").located(By.id("ProductGrid0_QuickSearchInput"));

}

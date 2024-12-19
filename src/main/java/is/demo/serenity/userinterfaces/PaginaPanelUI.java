package is.demo.serenity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPanelUI extends PageObject {

    public static final Target BTN_NORTHWIND = Target.the("Boton NorthWind").located(By.xpath("//span[@class='s-sidebar-link-text' and text()='Northwind']"));
    public static final Target BTN_PRODUCTOS = Target.the("Boton Products").located(By.xpath("//span[@class='s-sidebar-link-text' and text()='Products']"));

}

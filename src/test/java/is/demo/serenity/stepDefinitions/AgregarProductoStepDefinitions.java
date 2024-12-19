package is.demo.serenity.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import is.demo.serenity.interactions.ClicNorthwind;
import is.demo.serenity.interactions.ClicProductos;
import is.demo.serenity.task.PaginaInicioTask;
import is.demo.serenity.utils.EsperaImplicita;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class AgregarProductoStepDefinitions {

    @Before
    public void setUser(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abra el navegador en la url")
    public void queElUsuarioAbraElNavegadorEnLaUrlEInicieSesionExitosamente() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/")

        );

    }
    @Dado("inicie sesion exitosamente")
    public void inicieSesionExitosamente() {
       theActorCalled("usuario").attemptsTo(PaginaInicioTask.PaginaInicioTask());
    }

    @Cuando("el usuario accede al módulo Northwind")
    public void elUsuarioAccedeAlMódulo() {
        theActorCalled("usuario").attemptsTo(ClicNorthwind.ClicNorthwind());

    }
    @Cuando("selecciona Productos")
    public void seleccionaProductos() {
        theActorCalled("usuario").attemptsTo(ClicProductos.ClicProductos());
    }
    @Cuando("hace clic en Nuevo Producto")
    public void haceClicEnNuevoProducto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("ingresa la informacion del producto")
    public void ingresaLaInformacionDelProducto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("hace clic en Guardar")
    public void haceClicEnGuardar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("ingresa producto en el campo de búsqueda")
    public void ingresaProductoEnElCampoDeBúsqueda() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debera visualizar el producto creado en la lista")
    public void deberaVisualizarElProductoCreadoEnLaLista() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

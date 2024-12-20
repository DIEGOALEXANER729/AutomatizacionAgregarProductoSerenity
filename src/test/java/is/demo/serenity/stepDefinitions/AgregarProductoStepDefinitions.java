package is.demo.serenity.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import is.demo.serenity.interactions.ClicAgregarProducto;
import is.demo.serenity.interactions.ClicGuardarProducto;
import is.demo.serenity.interactions.ClicNorthwind;
import is.demo.serenity.interactions.ClicProductos;
import is.demo.serenity.questions.ValidarProductoQuestions;
import is.demo.serenity.task.PaginaInicioTask;
import is.demo.serenity.task.PaginaNuevoProductoTask;
import is.demo.serenity.task.PaginaProductoTask;
import is.demo.serenity.utils.EsperaImplicita;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
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
        theActorCalled("usuario").attemptsTo(ClicAgregarProducto.ClicAgregarProducto());
    }
    @Cuando("ingresa la informacion del producto")
    public void ingresaLaInformacionDelProducto() {
        theActorCalled("usuario").attemptsTo(PaginaNuevoProductoTask.PaginaNuevoProductoTask());
    }
    @Cuando("hace clic en Guardar")
    public void haceClicEnGuardar() {
        theActorCalled("usuario").attemptsTo(ClicGuardarProducto.ClicGuardarProducto());
    }
    @Cuando("ingresa producto en el campo de búsqueda")
    public void ingresaProductoEnElCampoDeBúsqueda() {
        theActorCalled("usuario").attemptsTo(PaginaProductoTask.PaginaProductoTask());
        EsperaImplicita.esperaImplicita(5);
    }
    @Entonces("debera visualizar el producto creado en la lista")
    public void deberaVisualizarElProductoCreadoEnLaLista() {
        theActorCalled("usuario").should(
                seeThat(
                        "Se visualiza producto",
                        ValidarProductoQuestions.ValidarProductoQuestions(),
                        Matchers.equalTo(true)
                )

        );
        EsperaImplicita.esperaImplicita(5);
    }



}

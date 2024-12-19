package is.demo.serenity.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class AgregarProductoStepDefinitions {

    @Before
    public void setUser(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abra el navegador en la url e inicie sesion exitosamente")
    public void queElUsuarioAbraElNavegadorEnLaUrlEInicieSesionExitosamente() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is")
        );
    }
    @Cuando("el usuario accede al módulo {string}")
    public void elUsuarioAccedeAlMódulo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("selecciona {string}")
    public void selecciona(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("hace clic en {string}")
    public void haceClicEn(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("ingresa la informacion del producto")
    public void ingresaLaInformacionDelProducto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("ingresa {string} en el campo de búsqueda")
    public void ingresaEnElCampoDeBúsqueda(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debera visualizar el producto creado en la lista")
    public void deberaVisualizarElProductoCreadoEnLaLista() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

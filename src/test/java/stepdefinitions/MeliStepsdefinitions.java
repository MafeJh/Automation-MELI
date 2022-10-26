package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.meli.questions.ValidarPrecioAirpods;
import org.meli.tasks.BuscarItem;
import org.meli.tasks.SeleccionarAirpods;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.meli.utils.Constantes.PRECIO;
import static org.meli.utils.Constantes.URL;

public class MeliStepsdefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());}
    @Given("^Abro la pagina$")
    public void abroLaPagina() {
        theActorCalled("Mafe").wasAbleTo(Open.url(URL));
    }
    @When("^Ingreso el nombre de los audifonos (.*)$")
    public void ingresoElNombreDeLosAudifonos(String airpods) {
        theActorInTheSpotlight().attemptsTo(BuscarItem.page(airpods));
    }

    @And("^Doy click para visualizar el producto(.*)$")
    public void doyClickParaVisualizarElProductoAppleAirPodsProBlanco(String airPods) {
        theActorInTheSpotlight().attemptsTo(SeleccionarAirpods.select());
    }

    @Then("^Visualizo el precio del producto$")
    public void VisualizoElPrecioDelProducto(){
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarPrecioAirpods.validarPrecio(), Matchers.is(PRECIO)));
    }
}

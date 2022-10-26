package org.meli.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static org.meli.userinterfaces.ResultadoProductos.AIRPODS;


public class SeleccionarAirpods implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AIRPODS));
    }

    public static SeleccionarAirpods select(){
        return Tasks.instrumented(SeleccionarAirpods.class);
    }
}

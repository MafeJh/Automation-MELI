package org.meli.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.meli.userinterfaces.DetalleAirpods.TXT_PRECIO;

public class ValidarPrecioAirpods implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return TXT_PRECIO.resolveFor(actor).getText();
    }

    public static ValidarPrecioAirpods validarPrecio(){
        return new ValidarPrecioAirpods();
    }
}

package org.meli.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target SEARCH_INPUT = Target.the("Input de la búsqueda").located(By.id("cb1-edit"));

}

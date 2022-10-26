package org.meli.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleAirpods {
    public static final Target TXT_PRECIO = Target.the("Precio del producto").located(By.xpath("//*[@class='ui-pdp-price mt-16 ui-pdp-price--size-large']/div/span/span[3]"));

}

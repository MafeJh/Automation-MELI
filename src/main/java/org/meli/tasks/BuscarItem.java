package org.meli.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.openqa.selenium.Keys;

import static org.meli.userinterfaces.Home.SEARCH_INPUT;

public class BuscarItem implements Task {
    private String item1;
    public BuscarItem(String item) {
        this.item1=item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(item1).into(SEARCH_INPUT).thenHit(Keys.ENTER));
    }
    public static BuscarItem page(String item){
        return Tasks.instrumented(BuscarItem.class, item);
    }
}

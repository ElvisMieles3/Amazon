package com.amazon.certification.tasks;

import com.amazon.certification.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    String product;

    public Search(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product).into(Home.SEARCH_BAR),
                Click.on(Home.SUBMIT)
        );
    }

    public static Search product(String product){
        return Tasks.instrumented(Search.class, product);
    }
}

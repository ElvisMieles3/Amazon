package com.amazon.certification.tasks;

import com.amazon.certification.userinterfaces.ResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ChangeResult implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ResultsPage.PAGE),
                Click.on(ResultsPage.PRODUCT)
        );
    }

    public static ChangeResult page(){
        return Tasks.instrumented(ChangeResult.class);
    }
}

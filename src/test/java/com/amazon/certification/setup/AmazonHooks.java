package com.amazon.certification.setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AmazonHooks {

    @Managed
    private static WebDriver hisBrowser;

    @Before
    public void setUpOneStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Elvis");
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }
}



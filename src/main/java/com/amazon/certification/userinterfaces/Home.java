package com.amazon.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    private Home() {
    }

    public static final Target SEARCH_BAR = Target.the("Search bar")
            .located(By.id("twotabsearchtextbox"));

    public static final Target SUBMIT = Target.the("Submit button")
            .located(By.id("nav-search-submit-button"));

}

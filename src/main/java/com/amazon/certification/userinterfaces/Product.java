package com.amazon.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Product {

    private Product() {
    }

    public static final Target BUY_BUTTON = Target.the("Search bar")
            .located(By.cssSelector("a.a-button-text.a-text-left"));
}

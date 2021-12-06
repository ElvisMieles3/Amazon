package com.amazon.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {

    private ResultsPage() {
    }

    public static final Target PRODUCT = Target.the("Search bar")
            .located(By.xpath("(//*[@class='s-image'])[3]"));

    public static final Target PAGE = Target.the("Search bar")
            .located(By.xpath("(//*[@class='a-normal'])[1]"));
}

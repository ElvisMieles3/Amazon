package com.amazon.certification.questions;

import com.amazon.certification.userinterfaces.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeeThe implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return !Product.BUY_BUTTON.resolveFor(actor).isDisabled();
    }

    public static SeeThe buyButton(){
        return new SeeThe();
    }
}

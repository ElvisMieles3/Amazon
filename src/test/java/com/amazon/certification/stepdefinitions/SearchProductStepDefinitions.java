package com.amazon.certification.stepdefinitions;

import com.amazon.certification.exceptions.NoStock;
import com.amazon.certification.questions.SeeThe;
import com.amazon.certification.tasks.ChangeResult;
import com.amazon.certification.tasks.Search;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class SearchProductStepDefinitions {

    @Given("^The user navigates in Amazon$")
    public void theUserNavigatesInAmazon() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com/"));
    }

    @When("^Searches for \"([^\"]*)\"$")
    public void searchesFor(String product) {
        theActorInTheSpotlight().attemptsTo(Search.product(product));
    }

    @And("^selects the third item from the second page$")
    public void selectsTheThirdItemFromTheSecondPage() {
        theActorInTheSpotlight().attemptsTo(ChangeResult.page());

    }

    @Then("^the buy button is enable$")
    public void theBuyButtonIsEnable() {
        theActorInTheSpotlight().should(seeThat(SeeThe.buyButton(), equalTo(true))
                .orComplainWith(NoStock.class, "The buy button is not available"));
    }
}

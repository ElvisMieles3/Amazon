package com.amazon.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/search_product.feature",
        glue = {"com.amazon.certification.stepdefinitions", "com.amazon.certification.setup"},
        snippets = SnippetType.CAMELCASE, tags = {"@BuyProduct"}
)
public class SearchProduct {
}

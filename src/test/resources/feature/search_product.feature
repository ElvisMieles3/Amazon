Feature: As a customer I want to buy an specific product

  @BuyProduct
  Scenario: buy a product
    Given The user navigates in Amazon
    When Searches for "Alexa"
    And selects the third item from the second page
    Then the buy button is enable

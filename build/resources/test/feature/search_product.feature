Feature: Find product
  As User of the web
  I WANT to check that the search for a product
  TO make shopping

  @BuyProduct
  Scenario: Select a specific product
    Given The user navigates in Amazon
    When Searches for "Alexa"
    And selects the third item from the second page
    Then the buy button is enable

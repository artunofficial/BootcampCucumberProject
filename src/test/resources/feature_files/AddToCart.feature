@TutorialsNinjaAddToCart
Feature: Add to Cart Functionality of TutorialsNinja

  @AddValidProduct
  Scenario: Add a valid product to cart
    Given User opens the browser
    When User enters a valid product "HP"
    And User clicks on the search button
    And User clicks add to cart button on product page
    And User clicks add to cart button again
    Then User gets added product alert display in product page
Feature: Add product to cart and checkout on Sauce Demo
  As a shopper
  I want to log in, add a product to the cart, and complete checkout
  So that I can finish a purchase successfully

  Scenario: Successful checkout of the first inventory product
    Given I open the Sauce Demo site
    And I log in with valid credentials
    When I add the first product to the cart
    And I proceed to checkout with my details

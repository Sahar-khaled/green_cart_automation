@smoke
Feature: F01_Payment-process |


  Scenario: user buy from the green cart
    Given user link to the url
    When user click on add to cart button
    And click on bag image
    And Click on proceed to checkout and navigate to green cart
    And click on place order button and navigate to choose country page
    And click on select button
    And agree to the terms and conditions
    And click on proceed button
    Then Validate that the user bought successfully.


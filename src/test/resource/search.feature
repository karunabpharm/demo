Feature: search an item
  Scenario: select an item added to basket
    When i enter the product as "nike"
    And I select "Sporting Goods" from all categories
    And I select min as 20 max as 25
    And I select any product
    Then I should see selected product

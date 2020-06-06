Feature: search feature automation scenarios

  Background: application should be installed and open
    Given I should set the test environment

  @searchTest
  Scenario: search feature should be working properly
    Given should be on page: "start page"
    When click to button: "searchTextBoxElement"
    Then popular topics should be listed
    When I close the keyboard
    Then List should be includes 10 element
    When click to 1 (st) element in the list
    Then it should be "shown" in "searchTextBoxElement"


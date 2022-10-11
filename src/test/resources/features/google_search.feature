Feature: Test google search functionality

  @TestGoogleSearch @SmokeTest
  Scenario: As a user, I want to search for a term on google
    Given I am on the google homepage
    When I enter a search criteria
    And click the search button
    Then I should see the results of the search
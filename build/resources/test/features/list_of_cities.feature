vb'c{ñf8imo9,yFeature: I can find a city inside a state.

  @TestListOfCities @SmokeTest
  Scenario Outline: As a Test Engineer, I want to validate that a text is present inside a list.
    Given I navigate to the list page
    When I search '<state>' in the list
    Then I can validate that '<city>' is present inside the list
    Examples:
      | state        | city                       |
      | New York     | Utica, New York            |
      | Texas        | Dallas, Texas              |
      | Pennsylvania | Philadelphia, Pennsylvania |
      | Bogota D.C.  | Bogota D.C.                |
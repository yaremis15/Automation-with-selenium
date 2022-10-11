Feature: Test different actions of switch to iFrames

  Background: Open the url of the website
    Given I navigate to the iframe page

  @TestFrameByName
  Scenario: As a Test Engineer, I want to test switch to iFrame by Name criteria
    And I switch to iFrame by Name criteria
    Then I can enter information in the iframe

  @TestFrameByIndex
  Scenario: As a Test Engineer, I want to test switch to iFrame by Index criteria
    And I switch to iFrame by Index criteria
    Then I can enter information in the iframe

  @TestFrameByWebElement
  Scenario: As a Test Engineer, I want to test switch to iFrame by WebElement criteria
    And I switch to iFrame by WebElement criteria
    Then I can enter information in the iframe
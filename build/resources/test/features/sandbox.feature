Feature: Test different actions on a sandBox page.

  @TestSandbox
  Scenario: As a Test Engineer, I want to test different actions on a sandBox page.
    Given I navigate to the sandBox page
    And select a value from the dropdown

  @TestUploadFile
  Scenario: As a Test Engineer, I want to upload a file.
    Given I navigate to the upload file page
    And I upload a file


Feature: Validate document upload mode selection

  Scenario: Verify document upload mode options
    Given I am on the document upload page
    When I select the 'upload documents' option
    Then I should see the options for single file upload and multiple file upload

  Scenario: Verify single file upload selection
    Given I have selected the 'upload documents' option
    When I choose the 'single file upload'
    Then a single box should be enabled for file upload

  Scenario: Verify multiple file upload selection
    Given I have selected the 'upload documents' option
    When I choose the 'upload documents separately'
    Then multiple boxes should be displayed for each required document
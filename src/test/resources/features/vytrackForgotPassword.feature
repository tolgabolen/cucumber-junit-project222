Feature: Forgot Password Verification
@vytrack
  Scenario: Forgot password title verification
    Given user is on the vytrack login page
    And user clicks to forgot your password button
    Then user should see title as Forgot Password
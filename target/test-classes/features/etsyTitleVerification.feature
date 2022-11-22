
Feature: Etsy Title Verification
  User Story:
  As a user, when I am on the etsy page I should be able to see the relevant information in the title

  Background: For the scenarios in the feature file, user is expected to be on etsy page
    Given User is on etsy page

  @smoke
  Scenario: Etsy home title verification

    Then User sees title as Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Etsy Search Functionality Title Verification (without parameterization)

    When User types Wooden Spoon in the search box
    Then User sees Wooden Spoon in the etsy title
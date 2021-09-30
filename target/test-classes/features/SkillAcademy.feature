@SkillAcademy
Feature: Skill academy feature

  @Positive
  Scenario: search skill and get the correct result
    Given the user is on the skill academy home page
    When user search "valid" on search field
    When user click search button
    Then user can see the result related "valid"

  @Positive
  Scenario: search speaker name and get the correct result
    Given the user is on the skill academy home page
    When user search "speaker" on search field
    When user click search button
    Then user can see the result related "speaker"

  @Positive
  Scenario: search skill and get the correct result with press enter button
    Given the user is on the skill academy home page
    When user search "valid" on search field
    When user click enter on search field
    Then user can see the result related "valid"

  @Positive
  Scenario: check result for invalid input
    Given the user is on the skill academy home page
    When user search "invalid" on search field
    When user click search button
    Then user can see the alert about invalid result


  @Negative
  Scenario: search with html tag
    Given the user is on the skill academy home page
    When user search "html" on search field
    When user click search button
    Then user can see the alert about invalid result



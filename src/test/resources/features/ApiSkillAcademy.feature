@SkillAcademyAPI
Feature: Skill academy API

  @Positive
  Scenario: Hit discovery search
    Given prepare data for get search result
    When send request for get discovery search
    Then response get member detail status message is "success"



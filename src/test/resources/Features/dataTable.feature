@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    And dataTable Example
    | testuser_1 | Test@135 |
    | testuser_2 | Test@246 |
    | testuser_3 | Test@357 |

  Scenario: Parameterizatin without table or scenario Outline
    And username is "testingUser" and password is "testerPassword"

Scenario Outline: Successful Login with Valid Credentials
	And User enters "<username>" and "<password>"
Examples:
    | username   | password |
    | testuser_1 | 153 |
    | testuser_2 | 269 |
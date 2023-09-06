Feature: Login to PCFC


    Scenario Outline: Login PCFC
      Given I am on PCFC login page
      When I enter "<username>" and "<password>"
      Then I click sigin button
      Then i Logout from PCFC
      Examples:
      |username | password|
      |galaxy55 |Login345 |

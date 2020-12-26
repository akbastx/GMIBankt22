@US_24 @SmokeTest1
Feature: US_24 System should allow to create new states using api endpoint

  Scenario Outline: System allow the user to create a state using valid endpoint
    Given user get data with valid token and "endpoint"
    When user verify status code 200 and content type JSon
    When user create a new "<state>" one by one if it is not created already
    Then validate "<state>" is created
    Examples: data
      | state |
      | worldFL1   |
      | worldFL2   |
      | worldFL3   |
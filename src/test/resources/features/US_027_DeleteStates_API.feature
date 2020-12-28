@US027api
Feature: System should allow to delete states by one by one
  endpoint : https://www.gmibank.com/api/tp-states/1803

Scenario: User can retrieve states
  Given user can retrieve all states with GET "< https://www.gmibank.com/api/tp-states/"
  Then validate status code is 200
  Then validate state of "<state>" that exists in response

  Scenario Outline:
    Given user can delete states by one by one using <id>
    Then verify delete with status code 204
    Examples:
      | id |
      | 21572 |
      | 59131 |
      | 21574 |


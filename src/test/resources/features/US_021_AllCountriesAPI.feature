@US021
Feature: US21 Countries
  Background: Read all countries' information using the api endpoint

  Background:
    Given read all countries info using api end point "https://www.gmibank.com/api/tp-countries"

  Scenario: read all countries
    Then get all countries

  Scenario: read all countries data
    Then assert all countries



  Scenario: read countries id is
    Then assert countries one by one:
      |22312|
      |22314|
      |22315|
      |22316|
      |22317|


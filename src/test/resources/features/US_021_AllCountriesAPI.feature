@US021
Feature: US21 Countries
  Background: Read all countries' information using the api endpoint

  Background:
    Given read all countries info using api end point "https://www.gmibank.com/api/tp-countries"

    Scenario: read all countries
      Then get all countries




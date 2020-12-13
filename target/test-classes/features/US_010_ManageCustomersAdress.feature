@US_010_ManageCustomer
Feature: Manage customers address

  Background: login
    Given click user icon
    And click Sign in
    And user employee login
    And click on My Operations
    And click on Manage Customers
    And click on Create a new Customer

  Scenario: All fields together with valid credentials (HappyPath)
#    Given All other fields should be typed successfully
    And click on Address field and type the address
    And click on City field and type the city
    And click on Country field and Select Country from dropdown list
    And click on state field and type the state
    And click on Save

  Scenario: address fields cannot be blanc
    And click on Save
    And verify address field's empty message

  Scenario: city fields cannot be blanc
    And click on Save
    And verify city field's empty message


  Scenario: state fields cannot be blanc
    And click on Save
    And verify state field's empty message
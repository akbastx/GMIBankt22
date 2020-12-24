@US23_ReadAllApplicants
Feature: System should allow to read all Applicants information

  Background:
    Given use the api endpoint https:"https://www.gmibank.com/api/tp-account-registrations"
    Then  Get all data deserialized into Java

  @TC_001_AllApplicant'sData
  Scenario: Verify to be able read all Applicant's data
    And write all Applicant's information into a file
    Then read all applicants in Application
    Then validate all Aplicant's numbers

  @TC_002_AllApplicant's_1by1
  Scenario: TC_002 verify Single Applicant's data
    And  verify first Applicant's id <1251>
    And verify second Applicant's ssn "124-45-3422"
    And verify third Applicant's firstName "customer"
    And verify fourth Applicant's lastName "techproed"
    And verify fifth Applicant's address "Gallows road 8765"
    And verify sixth Applicant's mobilePhoneNumber "111-222-3333"
    And verify seventh Applicant's userId  <1555>
    And verify eighth Applicant's userName "ali"
    And verify nineth Applicant'semail  "peter@john.com"
    Then verify tenth Applicant's createDate "2020-11-01T07:28:16.796Z"

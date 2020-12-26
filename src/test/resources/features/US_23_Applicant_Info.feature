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
    And  verify first Applicant's id <1252>
    And verify second Applicant's ssn "765-56-4544"
    And verify third Applicant's firstName "settar"
    And verify fourth Applicant's lastName "batch2"
    And verify fifth Applicant's address "Street 1234"
    And verify sixth Applicant's mobilePhoneNumber "222-333-4444"
    And verify seventh Applicant's userId  <2151>
    And verify eighth Applicant's userName "peterpan"
    And verify nineth Applicant'semail  "kalin54ibrahim@gmail.com"
    Then verify tenth Applicant's createDate "2020-11-02T06:48:40.193Z"

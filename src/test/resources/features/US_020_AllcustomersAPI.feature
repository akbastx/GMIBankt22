@US_O20_CustomersDataApi
Feature: System should allow to read all customers' information using the api endpoint

  Background:
    Given use the api endpoint "https://www.gmibank.com/api/tp-customers"
    Then get all customers' information as de-serialization

    @TC_001_AllCustomersData
    Scenario: Verify to read all customers' data set

      Then verify the number 20 that is equals to the customers'number created from user
      Then write to all customers' "ssn","firstName" and  "lastName" in a .txt file
      Then get all the information of the "5th customer"
      Then verify that 5th customer's first name "Ally" and ssn "33880"

   @TC_002_OneByOneCustomerData
      Scenario: Verify the customer's data one by one

     Then verify that first customer's email "as@sdf.com" and mobilePhoneNumber "123-322-1234"
     Then verify that second customer's city "fairfax" and zipCode "20123"
     Then verify that third customer's firstName "Frederick" and lastName "Williamson"
     Then verify that last customer's firstName "deniz" and lastName "mavi"




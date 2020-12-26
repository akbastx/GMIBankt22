@US_030_PDFFile

Feature: Print all customers info

  Background: create a connection with database
    Given user makes a connection with database using "jdbc:postgresql://157.230.48.97:5432/gmibank_db","techprodb_user" and "Techpro_@126"

  Scenario Outline: : Print Information of users
    Given user gets all customer info using "<query>" and "<columnName>" and "<fileType>"
    Then user validates customer info

    Examples:
    |query|columnName|fileType|
    |Select * from tp_customer|ssn|CustomerSSn.txt|
    |Select * from tp_customer|first_name|firstName.txt|
    |Select * from tp_customer|zip_code|zipCode.txt|
    |Select * from tp_country|name|countryName.txt|
    |Select * from tp_state|name|stateName.txt|

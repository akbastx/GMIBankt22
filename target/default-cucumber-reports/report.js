$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_020_AllcustomersAPI.feature");
formatter.feature({
  "name": "System should allow to read all customers\u0027 information using the api endpoint",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US_O20_CustomersDataApi"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "use the api endpoint \"https://www.gmibank.com/api/tp-customers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.use_the_api_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get all customers\u0027 information as de-serialization",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.get_all_customers_information_as_de_serialization()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify to read all customers\u0027 data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_O20_CustomersDataApi"
    },
    {
      "name": "@TC_001_AllCustomersData"
    }
  ]
});
formatter.step({
  "name": "verify the number 20 that is equals to the customers\u0027number created from user",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.verifyTheNumberThatIsEqualsToTheCustomersNumberCreatedFromUser(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write to all customers\u0027 \"ssn\",\"firstName\" and  \"lastName\" in a .txt file",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.write_to_all_customers_and_in_a_txt_file(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get all the information of the \"5th customer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.get_all_the_information_of_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that 5th customer\u0027s first name \"Ally\" and ssn \"33880\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.verify_that_5th_customer_s_first_name_and_ssn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
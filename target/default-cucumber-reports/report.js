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
  "name": "write the all customer\u0027s \"firstName\" and  \"lastName\" in a  file",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.writeTheAllCustomerSAndInAFile(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write the all customer\u0027s \"ssn\" in a file and validate all the \"ssn\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.writeTheAllCustomerSInAFileAndValidateAllThe(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: not verify expected:\u003c[458-62-6584, 612-15-5726, 450-56-4994, 186-48-4946, 439-12-4312, 234-55-8998, 511-18-8543, 333-34-2395, 473-22-1798, 123-12-1234, 244-56-7748, 355-88-2318, 821-84-3971, 108-53-6655, 224-71-4004, 194-21-8830, 498-53-5576, 234-22-8998, 234-11-8998, 777-23-7777]\u003e but was:\u003c[458-62-6584, 612-15-5726, 450-56-4994, 186-48-4946, 439-12-4312, 234-55-8998, 511-18-8543, 333-34-2395, 473-22-1798, 123-12-1234, 244-56-7748, 355-88-2318, 821-84-3971, 108-53-6655, 224-71-4004, 194-21-8830, 498-53-5576, 234-22-8998, 234-11-8998, 777-23-7777, 458-62-6584, 612-15-5726, 450-56-4994, 186-48-4946, 439-12-4312, 234-55-8998, 511-18-8543, 333-34-2395, 473-22-1798, 123-12-1234, 244-56-7748, 355-88-2318, 821-84-3971, 108-53-6655, 224-71-4004, 194-21-8830, 498-53-5576, 234-22-8998, 234-11-8998, 777-23-7777, 458-62-6584, 612-15-5726, 450-56-4994, 186-48-4946, 439-12-4312, 234-55-8998, 511-18-8543, 333-34-2395, 473-22-1798, 123-12-1234, 244-56-7748, 355-88-2318, 821-84-3971, 108-53-6655, 224-71-4004, 194-21-8830, 498-53-5576, 234-22-8998, 234-11-8998, 777-23-7777]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat gmiBank_team22.step_Definitions.US_020_AllCustomersAPI_StepDefinitions.writeTheAllCustomerSInAFileAndValidateAllThe(US_020_AllCustomersAPI_StepDefinitions.java:92)\r\n\tat ✽.write the all customer\u0027s \"ssn\" in a file and validate all the \"ssn\"(file:///C:/Users/felat/IdeaProjects/GMIBankt22/src/test/resources/features/US_020_AllcustomersAPI.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
});
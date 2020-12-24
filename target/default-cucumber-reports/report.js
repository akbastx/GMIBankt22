$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_23_Applicant_Info.feature");
formatter.feature({
  "name": "System should allow to read all Applicants information",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US23_ReadAllApplicants"
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
  "name": "use the api endpoint https:\"https://www.gmibank.com/api/tp-account-registrations\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.useTheApiEndpointHttps(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all data deserialized into Java",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.getAllDataDeserializedIntoJava()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify to be able read all Applicant\u0027s data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US23_ReadAllApplicants"
    },
    {
      "name": "@TC_001_AllApplicant\u0027sData"
    }
  ]
});
formatter.step({
  "name": "write all Applicant\u0027s information into a file",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.writeAllApplicantSInformationIntoAFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "read all applicants in Application",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.readAllApplicantsInApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate all Aplicant\u0027s numbers",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.validateAllAplicantSNumbers()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "use the api endpoint https:\"https://www.gmibank.com/api/tp-account-registrations\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.useTheApiEndpointHttps(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all data deserialized into Java",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.getAllDataDeserializedIntoJava()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_002 verify Single Applicant\u0027s data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US23_ReadAllApplicants"
    },
    {
      "name": "@TC_002_AllApplicant\u0027s_1by1"
    }
  ]
});
formatter.step({
  "name": "verify first Applicant\u0027s id \u003c1251\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyFirstApplicantSId(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify second Applicant\u0027s ssn \"124-45-3422\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifySecondApplicantSSsn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify third Applicant\u0027s firstName \"customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyThirdApplicantSFirstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify fourth Applicant\u0027s lastName \"techproed\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyFourthApplicantSLastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify fifth Applicant\u0027s address \"Gallows road 8765\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyFifthApplicantSAddress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify sixth Applicant\u0027s mobilePhoneNumber \"111-222-3333\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifySixthApplicantSMobilePhoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify seventh Applicant\u0027s userId  \u003c1555\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifySeventhApplicantSUserId(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify eighth Applicant\u0027s userName \"ali\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyEighthApplicantSUserName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify nineth Applicant\u0027semail  \"peter@john.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyNinethApplicantSemail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify tenth Applicant\u0027s createDate \"2020-11-01T07:28:16.796Z\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_23_Applicants_info_StepDef.verifyTenthApplicantSCreateDate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_005_InvalidCredentials.feature");
formatter.feature({
  "name": "Invalid Credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Invalid"
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
  "name": "User goes to Url",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.userGoesToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks menuIcon",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.user_clicks_menuIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks signInButton",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.user_clicks_signInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks signIn Option",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.userClicksSignInOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees Failed Message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.userSeesFailedMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Invalid UserName",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "User enters Invalid Username",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.userEntersInvalidUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_005InvalidCredentialsStep.userEntersValidPassword()"
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

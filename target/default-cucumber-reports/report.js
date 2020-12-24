$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_26_updateDifferent.feature");
formatter.feature({
  "name": "update of countries",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CountryDiffer"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user sets all data using \"https://www.gmibank.com/api/tp-countries\" using \"\u003cid\u003e\" and \"\u003cname\u003e\" and \"\u003cstate\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "name",
        "state"
      ]
    },
    {
      "cells": [
        "18949",
        "Switzerland",
        "null"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CountryDiffer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sets all data using \"https://www.gmibank.com/api/tp-countries\" using \"18949\" and \"Switzerland\" and \"null\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_26_Country_Update.user_sets_all_data_using_using_and_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user read all countries data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CountryDiffer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sets the countries to response using \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_26_Country_Update.user_sets_the_countries_to_response_using(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates updated country",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_26_Country_Update.user_validates_updated_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user saves the countries to correspondent files",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_26_Country_Update.user_saves_the_countries_to_correspondent_files()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the countries",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US_26_Country_Update.user_validates_the_countries()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/maddy/eclipse-workspace/CucumberConcepts/src/main/java/com/features/contact.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Create Contact Feature",
  "description": "",
  "id": "freecrm-create-contact-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Create Contact Test",
  "description": "",
  "id": "freecrm-create-contact-feature;create-contact-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of Login Page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Uname \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters Pass \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify User is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User goes to Create Contact Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "freecrm-create-contact-feature;create-contact-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 17,
      "id": "freecrm-create-contact-feature;create-contact-test;;1"
    },
    {
      "cells": [
        "maddymb",
        "madhur123",
        "Madhur",
        "Bharadwaj",
        "Ceo"
      ],
      "line": 18,
      "id": "freecrm-create-contact-feature;create-contact-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Create Contact Test",
  "description": "",
  "id": "freecrm-create-contact-feature;create-contact-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of Login Page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Uname \"maddymb\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters Pass \"madhur123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify User is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User goes to Create Contact Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"Madhur\" and \"Bharadwaj\" and \"Ceo\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 5624386709,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_Login_Page_is_FreeCRM()"
});
formatter.result({
  "duration": 13719470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maddymb",
      "offset": 19
    }
  ],
  "location": "LoginStepDefinition.user_enters_User_Name(String)"
});
formatter.result({
  "duration": 177312584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhur123",
      "offset": 18
    }
  ],
  "location": "LoginStepDefinition.user_enters_Password(String)"
});
formatter.result({
  "duration": 116554753,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 1857595208,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_User_is_on_Home_Page()"
});
formatter.result({
  "duration": 3016465695,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_goes_to_Create_Contact_Page()"
});
formatter.result({
  "duration": 1011124721,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madhur",
      "offset": 29
    },
    {
      "val": "Bharadwaj",
      "offset": 42
    },
    {
      "val": "Ceo",
      "offset": 58
    }
  ],
  "location": "LoginStepDefinition.user_enters_contact_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 427014429,
  "status": "passed"
});
});
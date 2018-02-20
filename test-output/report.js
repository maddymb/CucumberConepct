$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/maddy/eclipse-workspace/CucumberConcepts/src/main/java/com/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Login Feature",
  "description": "",
  "id": "freecrm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Test",
  "description": "",
  "id": "freecrm-login-feature;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of Login Page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters User Name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify User is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 5419332871,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_Login_Page_is_FreeCRM()"
});
formatter.result({
  "duration": 11974044,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_User_Name()"
});
formatter.result({
  "duration": 146548474,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_Password()"
});
formatter.result({
  "duration": 123302088,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 2138264221,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_User_is_on_Home_Page()"
});
formatter.result({
  "duration": 153690001,
  "status": "passed"
});
});
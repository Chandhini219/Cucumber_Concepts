$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/LoginPage.feature");
formatter.feature({
  "name": "open the orangeHrm.com",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@runnable"
    }
  ]
});
formatter.step({
  "name": "the user is entering into the portal",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginPage1.the_user_is_entering_into_the_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is typing in the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginPage1.user_is_typing_in_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is click on the submit button.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginPage1.the_user_is_click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
});
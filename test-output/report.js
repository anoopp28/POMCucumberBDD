$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/52001551/eclipse-workspace/POMCucumberBDD/src/main/java/com/qa/feature/FreeCrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home page",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens browser page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser_page()"
});
formatter.result({
  "duration": 11776307400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 254066200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 652850500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 9345200,
  "status": "passed"
});
});
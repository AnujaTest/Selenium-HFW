$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "To test the CRM application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the login functionality of CRM application.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the CRM application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_launch_the_CRM_application()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.BaseClass.Library.browserSetUp(Library.java:48)\r\n\tat com.StepsDefinition.LoginStepDefinition.to_launch_the_CRM_application(LoginStepDefinition.java:18)\r\n\tat ✽.To launch the CRM application(file:///C:/Users/Anuja%20Ramajayan/eclipse-workspace/HybridFramework/src/test/resources/features/login.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_enter_the_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "take a screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.take_a_screenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "cucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Signup Function",
  "description": "",
  "id": "cucumberjava;signup-function",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I should be at signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide valid infomations",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the signup button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be able to login into profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.signupPage()"
});
formatter.result({
  "duration": 20881822796,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.validInfo()"
});
formatter.result({
  "duration": 937869143,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.signupClick()"
});
formatter.result({
  "duration": 6474183056,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.profilePage()"
});
formatter.result({
  "duration": 1573371477,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("API.feature");
formatter.feature({
  "line": 1,
  "name": "API Test",
  "description": "Write description",
  "id": "api-test",
  "keyword": "Business Need"
});
formatter.scenario({
  "line": 4,
  "name": "To verify user should be able to get authenticate with valid credential",
  "description": "",
  "id": "api-test;to-verify-user-should-be-able-to-get-authenticate-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I set Post login api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set the request header",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I set the request body",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Sends post HTTP request",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I received valid HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "testSteps.setPostEndpoint()"
});
formatter.result({
  "duration": 68573417,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.setHeaders()"
});
formatter.result({
  "duration": 29459,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.setRequestBody()"
});
formatter.result({
  "duration": 1262750,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.setLoginAPI()"
});
formatter.result({
  "duration": 2560262083,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.verifyStatusCode()"
});
formatter.result({
  "duration": 433447541,
  "status": "passed"
});
formatter.after({
  "duration": 2438166,
  "status": "passed"
});
});
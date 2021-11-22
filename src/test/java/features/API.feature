Business Need: API Test
  Write description

  Scenario: To verify user should be able to get authenticate with valid credential
    Given I set Post login api endpoint
    When  I set the request header
    And   I set the request body
    And   Sends post HTTP request
    Then  I received valid HTTP response code 200


Feature: Login to web demo
  	To test the login page

  Scenario: Login with valid userid and password
    Given I should be at the login page
    And I provide valid userid and password
    When I click on login button
    Then I should be able to login inside the web demo
    And The title of web page should be Main page of this web
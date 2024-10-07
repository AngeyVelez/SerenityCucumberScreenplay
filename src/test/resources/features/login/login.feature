Feature: Login into the application

  @green
  Scenario: Successful login
    Given Sergey is on the login page
    When he enters his username "admin" and password "serenity"
    Then he should be redirected to the home page

  @red
  Scenario: Unsuccessful login
    Given Sergey is on the login page
    When he enters his username "admin" and incorrect password "admin"
    Then he should see an error message

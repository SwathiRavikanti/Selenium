Feature: Login

  @login
  Scenario: Valid Login

     Given I am on Home page
     When I enter username "swathiravikanthi@gmail.com" and password "123@"
     And I click signIn button
     Then I should be log in successfully with title as "test"

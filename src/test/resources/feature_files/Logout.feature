@TutorialsNinjaLogout

  Feature: Checkout Functionality of TutorialsNinja


    Scenario Outline: Logout From My Account
      Given User navigating to login page
      When user enters valid email address <email>
      And User enters a valid password <password>
      And User clicks on the login button
      And User directed to the Account Page
      And User clicks on Logout linktext
      Then User gets logout alert
      Examples:
        | email                   | password     |
        | seleniumpanda@gmail.com | Selenium@123 |


    Scenario Outline: Logout From My Account Dropdown Option
      Given User navigating to login page
      When user enters valid email address <email>
      And User enters a valid password <password>
      And User clicks on the login button
      And User directed to the Account Page
      And User clicks on My Account dropdown
      And User clicks on Logout dropdown
      Then User gets logout alert
      Examples:
        | email                   | password     |
        | seleniumpanda@gmail.com | Selenium@123 |

@new
Feature: Register Function

  Background:
    Given The user open the Url
    When The user click Register button
    Then The user verifies that Register message

  Scenario Outline: The user can create an account by filling in the required fields.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the registered Message
    Examples:
      | Gender | First Name | Last Name | Email                  | Password | Confirm Password |
      | Male   | Amasya     | Suluova   | ensonmail.05@gmail.com | merkez   | merkez           |

  Scenario Outline: The user can register on the site without selecting "Gender"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the registered Message
    Examples:
      | First Name | Last Name | Email                    | Password | Confirm Password |
      | Amasya     | Suluova   | ensonmailim.05@gmail.com | merkez   | merkez           |


  Scenario Outline:The user cannot create an account without adding the invalid info.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email                  | Password | Confirm Password |
      | Male   |            | Suluova   | ensonmail.05@gmail.com | merkez   | merkez           |
      | Male   | Amasya     |           | ensonmail.05@gmail.com | merkez   | merkez           |
      | Male   | Amasya     | Suluova   |                        | merkez   | merkez           |
      | Male   | Amasya     | Suluova   | ensonmail.05@gmail.com |          |                  |
      | Male   | Amasya     | Suluova   | ensonmail.05@gmailcom  | mer      | mer              |
      | Male   | Amasya     | Suluova   | ensonmail.05gmail.com  | merkez   | merkez           |
      | Male   | Amasya     | Suluova   | ensonmail.05@gmailcom  | merkez   | merkez           |

  Scenario Outline:The user can not create an account again with an existing email address.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Existing Email Error Message
    Examples:
      | Gender | First Name | Last Name | Email                  | Password | Confirm Password |
      | Male   | Amasya     | Suluova   | ensonmail.05@gmail.com | merkez   | merkez           |




@wip
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
      | Gender | First Name | Last Name | Email              | Password | Confirm Password |
      | Male   | Amasya     | Suluova   | enson.05@gmail.com | merkez   | merkez           |

  Scenario Outline: The user can register on the site without selecting "Gender".
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the registered Message
    Examples:
      | First Name | Last Name | Email               | Password | Confirm Password |
      | Amasya     | Suluova   | enson1.05@gmail.com | merkez   | merkez           |

  Scenario Outline:The user cannot create an account without adding the "FirstName" in the FirstName field.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email              | Password | Confirm Password |
      | Male   |            | Suluova   | 01234.05@gmail.com | merkez   | merkez           |

  Scenario Outline:The user cannot create an account without adding the "LastName" in the LastName field.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email              | Password | Confirm Password |
      | Male   | Amasya     |           | 01234.05@gmail.com | merkez   | merkez           |

  Scenario Outline:The user cannot create an account without adding the "Email" in the Email field.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email | Password | Confirm Password |
      | Male   | Amasya     | Suluova   |       | merkez   | merkez           |

  Scenario Outline:The user cannot create an account without adding the "Password" and "ConfirmPassword "in the fields.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email              | Password | Confirm Password |
      | Male   | Amasya     | Suluova   | 01234.05@gmail.com |          |                  |


  Scenario Outline:The user cannot create an account if they enter a password of less than "6 characters".
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email             | Password | Confirm Password |
      | Male   | Ali        | O         | 01234.05@gmailcom | mer      | mer              |

  Scenario Outline:The user can not create an account without adding the "@" sign to the email address.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email             | Password | Confirm Password |
      | Male   | Ali        | O         | 01234.05gmail.com | merkez   | merkez           |

  Scenario Outline:The user can not create an account without adding the "." sign to the email address.
    When The user selects the Gender "<Gender>"
    And The user enters "FirstName" "<First Name>"
    And The user enters "LastName" "<Last Name>"
    And The user enters "Email" "<Email>"
    And The user enters "Password" "<Password>"
    And The user enters "ConfirmPassword" "<Confirm Password>"
    And The user clicks to Register button
    Then The user verifies the Error Message
    Examples:
      | Gender | First Name | Last Name | Email             | Password | Confirm Password |
      | Male   | Ali        | O         | 01234.05@gmailcom | merkez   | merkez           |


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
      | Gender | First Name | Last Name | Email               | Password | Confirm Password |
      | Male   | Ali        | O         | enson1.05@gmail.com | merkez   | merkez           |




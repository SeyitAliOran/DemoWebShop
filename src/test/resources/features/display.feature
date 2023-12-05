Feature: As a user, I should be able to view products in the category
  in groups of 4, 8 and 12 on the Demo WebShop website

  Background:
    Given The user navigates to website


  Scenario Outline: The user can display products
    When The user clicks "<category>" category
    Examples:
      | category          |
      | books             |
      | computers         |
      | electronics       |
      | apparel-shoes     |
      | digital-downloads |
      | jewelry           |
      | gift-cards        |


  Scenario Outline: The user can verifies headers
    When The user clicks "<category>" category
    Then The user should be able to see "<headerMessage>"
    Examples:
      | category          | headerMessage     |
      | books             | Books             |
      | computers         | Computers         |
      | electronics       | Electronics       |
      | apparel-shoes     | Apparel & Shoes   |
      | digital-downloads | Digital downloads |
      | jewelry           | Jewelry           |
      | gift-cards        | Gift Cards        |

  @wip
  Scenario Outline: The user can view 4,8 ve 12 products on the page
    When The user clicks "<category>" category
    And The user clicks on the display menu and select the "4" or "8" or "12"

    Examples:
      | category          |
      | books             |
      | apparel-shoes     |
      | digital-downloads |
      | jewelry           |
      | gift-cards        |












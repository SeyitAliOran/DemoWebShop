Feature: As a user, I should be able to view products in the category
         in groups of 4, 8 and 12 on the Demo WebShop website

  Background:
    Given The user navigates to website


  Scenario: The user can display drop-down menu
    When The user cliks on the books category
    Then The user verifies display menu

  @wip
  Scenario: The user can display products 4 per page
    When The user cliks on the computers category
    And The user cliks on the desktops category
    And The user click on the display menu and select the number
    Then The user verifies that products are displayed on the page




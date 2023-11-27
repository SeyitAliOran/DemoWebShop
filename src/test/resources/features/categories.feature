Feature: The user should be able to easily sort the products on the shopping site.

  Background:
    Given The user is on the home page.

  @wip
  Scenario Outline: 'Sort by' function test
    When The user navigate to a "<category>" category
    And The user verifies that there is a sort by function in the Category.
    Then The user clicks on the sort by menu and verifies that the "<option>" option is visible in the menu.
    Examples:
      | category          | option             |
      | Apparel & Shoes   | Name: A to Z       |
      | Digital downloads | Price: Low to High |
      | Apparel & Shoes   | Price: High to Low |
      | Digital downloads | Name: Z to A       |
      | Apparel & Shoes   | Price: Low to High |
      | Digital downloads | Created on         |


  Scenario Outline: 'Sort by' default option test in the Computers categories.
    When The user navigate to a Computers category
    And The user clicks "<subMenu>"
    Then The user clicks on the sort by menu and verifies that the default Position option is visible in the menu.
    Examples:
      | subMenu     |
      | Desktops    |
      | Notebooks   |
      | Accessories |






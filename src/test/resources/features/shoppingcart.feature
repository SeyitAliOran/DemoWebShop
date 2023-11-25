Feature: The user should be able to place order from website

  Background:
    Given The user navigates to homepage

  @wip
  Scenario:The user should be able to add and remove products from the cart
    When The user clicks on login button and enters "batch11test@gmail.com" and "Test12345!" credentials
    And The user adds Computing and Internet product from Books category
    And The user adds "4 " piece "Blue and green Sneaker" from the "Apparel & Shoes" category
    And The user removes "Computing and Internet" chosen product from Cart Page
    And The user clicks on the continue shopping button
    And The user adds "Music 2" product from "Digital downloads" category
    Then The user verifies purchase amount

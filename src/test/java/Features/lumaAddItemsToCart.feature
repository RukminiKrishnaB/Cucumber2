Feature: Add items to cart in Luma App

  @lumaTest
  Scenario Outline: Add Men's Tops & Jackets to cart
    Given I login to Luma app with valid login details "<emailId>" and "<password>"
    And I navigate to jackshirt page
    When I select a jacket of "<size>" "<color>"
    And click on add to cart button
    Then cart should be updated

    Examples: 
      | emailId                | password    | size | color |
      | rukmini18.in@gmail.com | Rukmini1234 | M    | Blue  |
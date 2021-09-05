Feature: Category Tests

  Background: Search pre-condition

    Given I am on Home page "http://www.next.co.uk"

  @Category
  Scenario Outline: Category Shop Button Verification
    Given I am on Home page "http://www.next.co.uk"
    When I click on category "<menu>"
    When I click on subMenu "<subMenu>"
    Then I should be re-directed to a page with relevant results "<PageVerificationElem>"

    Examples:
      | menu          | PageVerificationElem | subMenu      |
      | WOMEN         | Womens Clothing      | All clothing |
      | MEN           | THE MENS SHOP        | All clothing |
      | HOME          | New In Homeware      | All clothing |
      | SCHOOL        | All Schoolwear       | All clothing |
      | BOYS          | THE BOYS SHOP        | All clothing |
      | GIRLS         | THE GIRLS SHOP       | All clothing |
      | BABY          | THE BABY SHOP        | All clothing |
      | BEAUTY        | THE BEAUTY SHOP      | All clothing |
      | BRANDS        | THE BRANDS SHOP      | All clothing |
      | SPORTS        | THE SPORTS SHOP      | All clothing |
      | GIFTS&FLOWERS | GIFT IDEAS           | All clothing |



Feature:Search Feature Test
  As a user
  I should search and retrieve the relevant products

  Background: Search pre-condition

    Given I am on Home page "http://www.next.co.uk"

  @search @reg
Scenario:Verify product search with product name
   When I enter search Term "Jeans"
   And I click search Icon
   Then I should get re-directed to the results page with headings "Jeans"

  @search @reg
 Scenario: Verify product search with special Characters
   When I enter search Term "%"
   And I click search Icon
   Then I should get a message for no results found "We found no results that closely match your search for "%""

  @search
 Scenario: Verify for a search term you are getting top results without clicking search icon
   When I enter search Term "Jumper"
   Then I should be provided with Top results message "Top results for 'Jumper'"

  @search
  Scenario: Verify See all results button will re-direct to a page of products with search term
    When I enter search Term "Wine"
    And I should be provided with Top results message "Top results for 'Wine'"
    And I click on "See All Results"
    Then I should be re-directed to a page with products related to search term "Wine"

  @search
  Scenario:
     Verify search using invalid search term
    When I enter search Term "yogurt"
    And I click search Icon
    And I should get a message for no results found "No results found for yogurt"
    Then I should be suggested with nearest search results "Showing results for yours"

  @search
  Scenario: Verify if empty search bar gives warning message
    Given I am on empty search bar
    And I click search Icon
    Then I should be given warning message "Please fill out this field."








package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchSteps extends CommonFunctions {

    @Given("I am on Home page {string}")
    public void i_am_on_home_page(String url) {
        driver.get(url);
    }
    @When("I enter search Term {string}")
    public void i_enter_search_term(String searchTerm) {
        driver.findElement(By.id("sli_search_1")).sendKeys(searchTerm);

    }
    @When("I click search Icon")
    public void i_click_search_icon() {
        driver.findElement(By.xpath("//input[@class='SearchButton']")).click();

    }
    @Then("I should get re-directed to the results page with headings {string}")
    public void i_should_get_re_directed_to_the_results_page_with_headings(String expectedResultHeading) {
        String actualResultHeading = driver.findElement(By.xpath("//div[@class='spell-correct']")).getText();
        Assert.assertEquals(actualResultHeading,expectedResultHeading);
    }
    @Then("I should get a message for no results found {string}%{string}")
    public void i_should_get_a_message_for_no_results_found(String message, String expectedNoResultsFound) {
        driver.findElement(By.xpath("//div[@class='no-results']")).getText();
    }
    @Then("I should be provided with Top results message {string}")
    public void i_should_be_provided_with_top_results_message(String expectedTopResultsMessage) {
       driver.findElement(By.xpath("//div[@class='search-dropdown-products']")).getText();
    }
    @When("I click on {string}")
    public void i_click_on(String seeAllResults) {
      driver.findElement(By.xpath("//*[@id=\"newsearch\"]/div[2]/div[1]/div/div[2]/a[9]/text()")).click();

    }
    @Then("I should be re-directed to a page with products related to search term {string}")
    public void i_should_be_re_directed_to_a_page_with_products_related_to_search_term(String expectedSearchTermHeading) {
       driver.findElement(By.xpath("//div[@class='spell-correct']")).getText();


    }
    @When("I should get a message for no results found {string}")
    public void i_should_get_a_message_for_no_results_found(String expectedNoResultsMessage) {
        String actualNoResultMessage = driver.findElement(By.xpath("//div[@class='resultMessage']")).getText();
        Assert.assertEquals(actualNoResultMessage,expectedNoResultsMessage);

    }
    @Then("I should be suggested with nearest search results {string}")
    public void i_should_be_suggested_with_nearest_search_results(String expectedNearestSearchResults) {
        String actualNearestSearchResults=driver.findElement(By.xpath("//div[@class='spell-error']")).getText();
        Assert.assertEquals(actualNearestSearchResults,expectedNearestSearchResults);
    }

    @Given("I am on empty search bar")
    public void i_am_on_empty_search_bar() {
        driver.findElement(By.id("sli_search_1")).click();
    }
    @Then("I should be given warning message {string}")
    public void i_should_be_given_warning_message(String expectedWarningMessage) {
      driver.findElement(By.xpath("//input[@value='score']")).getText();

    }

}

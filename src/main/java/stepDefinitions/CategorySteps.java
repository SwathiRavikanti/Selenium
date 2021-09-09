package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.sql.Driver;

public class CategorySteps extends CommonFunctions {

    @When("I click on category {string}")
    public void i_click_on_category(String button) {

        driver.findElement(By.xpath("//span[text()='"+button+"']")).click();
    }

    @When("I click on subMenu {string}")
    public void i_click_on_sub_menu(String subMenuOption) {
        driver.findElement(By.xpath("")).click();
    }

    @Then("I should be re-directed to a page with relevant results {string}")
    public void i_should_be_re_directed_to_a_page_with_relevant_results(String PageVerificationElem) {
       String actualPageVerificationElem = driver.getTitle();
        Assert.assertTrue(actualPageVerificationElem.contains(PageVerificationElem));

    }

}

package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on Home page")
    public void i_am_on_home_page() {

    }
    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {

        loginPage.enterUserName(username);
        loginPage.enterPassword(password);

    }
    @When("I click signIn button")
    public void i_click_sign_in_button() {

        loginPage.clickSignInButton();

    }
    @Then("I should be log in successfully with title as {string}")
    public void i_should_be_log_in_successfully(String expectedPageTitle) {

        loginPage.assertLoginSuccessful(expectedPageTitle);

    }

}

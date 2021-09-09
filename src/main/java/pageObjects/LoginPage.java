package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "")
    public WebElement usernameTxtField;

    @FindBy(xpath = "")
    public WebElement passwordTxtField;

    @FindBy(xpath = "")
    public WebElement signInButton;

    @FindBy(xpath = "")
    public WebElement forgotPasswordLink;

    public void enterUserName(String username)
    {
        usernameTxtField.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        passwordTxtField.sendKeys(password);
    }

    public void clickSignInButton()
    {
        signInButton.click();
    }

    public void assertLoginSuccessful(String expectedTitle)
    {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }


}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public Header(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "sli_search_1")
    public WebElement searchTxtFld;

    @FindBy(xpath = "//input[@class='SearchButton']")
    public WebElement searchIcon;

    public void enterSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchTxtFld.click();
    }

}

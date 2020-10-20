package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {

    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//div[@class='dt-buttons']//span")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstnameBox;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastnameBox;
    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;
    @FindBy(id = "DTE_Field_office")
    public WebElement officeBox;
    @FindBy(id = "DTE_Field_extn")
    public WebElement  extensionBox;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement startdateBox;
    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryBox;
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;
    @FindBy(xpath = "//input[@type='search']")
    public  WebElement searchButton;
    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement nameField;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GlobalTrader {

    public  GlobalTrader(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='icon_widh'])[1]")
    public WebElement menClothingMenu;

    @FindBy(linkText = "T-Shirts")
    public WebElement tshirtsButton;

    @FindBy(xpath = "//input[@value='L']")
    public WebElement lButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-warning btn-block'])[3]")
    public WebElement filterButton;

}

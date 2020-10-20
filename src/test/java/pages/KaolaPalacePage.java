package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

public class KaolaPalacePage {

    public KaolaPalacePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginClick;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoom;

    @FindBy(id = "IDHotel")
    public  WebElement idHotel;

    @FindBy(id = "Code")
    public WebElement codeBox;

    @FindBy(id = "Name")
    public WebElement nameBox;

    @FindBy(id = "Location")
    public WebElement locationBox;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public  WebElement descriptionBox;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeSelect;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCount;

    @FindBy(id = "IsAvailable")
    public WebElement approvedBox;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement message;

    @FindBy (xpath = "(//button)[8]")
    public WebElement okButton;


    public void idHotelSelect(){
        KaolaPalacePage obj= new KaolaPalacePage();
        Select options= new Select(obj.idHotel);
        options.selectByIndex(3);

    }

    public void roomType(){
        KaolaPalacePage obj= new KaolaPalacePage();
        Select options= new Select(obj.roomTypeSelect);
        options.selectByIndex(5);


    }


}





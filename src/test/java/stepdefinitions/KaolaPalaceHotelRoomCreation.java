package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.GooglePage;
import pages.KaolaPalacePage;
import utilities.ConfigReader;
import utilities.Driver;

public class KaolaPalaceHotelRoomCreation {
    KaolaPalacePage kaolaPalacePage =new KaolaPalacePage();

    @Given("user is on the main main page")
    public void user_is_on_the_main_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @Given("user clicks login button")
    public void user_clicks_login_button() {
        kaolaPalacePage.loginButton.click();
    }

    @When("user enters the username")
    public void user_enters_the_username() {
       kaolaPalacePage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("user enters the password")
    public void user_enters_the_password() {
       kaolaPalacePage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("user clicks login")
    public void user_clicks_login() {
        kaolaPalacePage.loginClick.click();
    }

    @When("user clicks hotel management")
    public void user_clicks_hotel_management() {
        kaolaPalacePage.hotelManagement.click();
    }

    @When("user clicks hotel rooms")
    public void user_clicks_hotel_rooms() {
        kaolaPalacePage.hotelRooms.click();
    }

    @When("user clicks add hotelroom button")
    public void user_clicks_add_hotelroom_button() {
        kaolaPalacePage.addHotelRoom.click();
    }

    @When("user selects idhotel")
    public void user_selects_idhotel() {
    kaolaPalacePage.idHotelSelect();


    }

    @When("user enters the code")
    public void user_enters_the_code() {
        kaolaPalacePage.codeBox.sendKeys("5555");
    }
    @When("user enters the name")
    public void user_enters_the_name() {
        kaolaPalacePage.nameBox.sendKeys("Smith");
    }

    @When("user enters the location")
    public void user_enters_the_location() {
        kaolaPalacePage.locationBox.sendKeys("Cologne");
    }

    @When("user enters description")
    public void user_enters_description() {
        kaolaPalacePage.descriptionBox.sendKeys("King Palace");
    }

    @When("user enter the price")
    public void user_enter_the_price() {
        kaolaPalacePage.priceBox.sendKeys("700");
    }

    @When("user selects the room type")
    public void user_selects_the_room_type() {
        kaolaPalacePage.roomType();
    }

    @When("user enters the max adult count")
    public void user_enters_the_max_adult_count() {
        kaolaPalacePage.maxAdultCount.sendKeys("2");
    }

    @When("user enters the max children count")
    public void user_enters_the_max_children_count() {
        kaolaPalacePage.maxChildCount.sendKeys("2");
    }

    @When("user clicks approved button")
    public void user_clicks_approved_button() throws InterruptedException {
        kaolaPalacePage.approvedBox.click();
        Thread.sleep(3000);
    }

    @When("user clicks save button")
    public void user_clicks_save_button() throws InterruptedException {
        kaolaPalacePage.saveButton.click();
        Thread.sleep(3000);
    }

    @When("user verifys the alert has successfully")
    public void user_verifys_the_alert_has_successfully() throws InterruptedException {
       String message=  kaolaPalacePage.message.getText();
        Assert.assertTrue(message.contains("successfully"));
        Thread.sleep(3000);
    }

    @When("user clicks ok button")
    public void user_clicks_ok_button() {
        kaolaPalacePage.okButton.click();

    }
}

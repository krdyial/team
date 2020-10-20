package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GlobalTrader;
import utilities.ConfigReader;
import utilities.Driver;

public class GlobalTraderStepDefinitions {
    GlobalTrader globalTrader = new GlobalTrader();

    @Given(": User goes to the main page")
    public void user_goes_to_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("global_url"));
    }

    @Given("user clicks Men Clothing&Accessories button")
    public void user_clicks_Men_Clothing_Accessories_button() {
        globalTrader.menClothingMenu.click();
    }

    @Given("under the Tops& Tees menu selects TShirts button")
    public void under_the_Tops_Tees_menu_selects_TShirts_button() {
        globalTrader.tshirtsButton.click();
    }

    @Given("under size menu selects L size")
    public void under_size_menu_selects_L_size() {
         globalTrader.lButton.click();
    }
    @Then("Clicks Filter Size Button")
    public void clicks_Filter_Size_Button() {
         globalTrader.filterButton.click();
    }




}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinition {
    DataTablePage dataTablePage = new DataTablePage();

    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
       Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));
    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();
    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dataTablePage.firstnameBox.sendKeys("Alex");
    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastnameBox.sendKeys("Souza");
    }

    @When("user enters the position")
    public void user_enters_the_position() {
       dataTablePage.positionBox.sendKeys("AttackingMidFielder");
    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.officeBox.sendKeys("Brazil");
    }

    @When("user enters the extension")
    public void user_enters_the_extension() {
        dataTablePage.extensionBox.sendKeys("10");
    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dataTablePage.startdateBox.sendKeys("2020-10-03");
    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
     dataTablePage.salaryBox.sendKeys("13000000");
    }

    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createButton.click();
    }

    @When("search for the firstname")
    public void search_for_the_firstname() {
        dataTablePage.searchButton.sendKeys("Alex");
    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Alex"));
    }

    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dataTablePage.firstnameBox.sendKeys(string);
    }

    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dataTablePage.lastnameBox.sendKeys(string);
    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablePage.positionBox.sendKeys(string);
    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
       dataTablePage.officeBox.sendKeys(string);
    }
    @When("user enters the extension {string}")
    public void user_enters_the_extension(String string) {
        dataTablePage.extensionBox.sendKeys(string);
    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dataTablePage.startdateBox.sendKeys(string);
    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablePage.salaryBox.sendKeys(string);
    }
    @When("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        dataTablePage.searchButton.sendKeys(string);
    }
    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String string) throws InterruptedException {
       Thread.sleep(3000);
       Assert.assertTrue(dataTablePage.nameField.getText().contains(string));
    }
}

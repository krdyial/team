
Feature: US1002_user_should_add_data_scenario_outline
  @regression
  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the datatables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And search for the first name "<firstname>"
    Then verify the name fields contains first name "<firstname>"

    Examples: test data for the data table test
      | firstname | lastname | position | office | extension | startdate | salary |
      |Jerry      | Rodman    |center    |bulls   |chicago    |2020-09-10 |780000  |
      |Ihsan      | Kim       |forward   |nets    |la         |2020-09-10 |780000  |
      |Fatih      | Cam       |defence   |lakers  |london     |2020-09-11 |790000  |
      |Jumper     | York      |midfielder|mavs    |dortmund   |2020-09-12 |810000  |
      |Volkan     | Willis    |keeper    |heat    |bochum     |2020-09-13 |870000  |
      |Ali        | Jordan    |subst     |clippers|munich     |2020-09-15 |980000  |
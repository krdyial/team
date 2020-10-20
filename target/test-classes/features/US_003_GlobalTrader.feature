
  Feature: Global Trader Select and Filter Product
    @wip11
    Scenario: Select and filter large size tshirts for men
      Given : User goes to the main page
      And user clicks Men Clothing&Accessories button
      And under the Tops& Tees menu selects TShirts button
      And under size menu selects L size
      Then Clicks Filter Size Button

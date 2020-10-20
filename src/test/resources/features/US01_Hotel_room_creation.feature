Feature: US01_Hotel_room_creation
  Scenario: TC01_Verify_the_created_hotel_room
    Given user is on the main main page
    And user clicks login button
    When user enters the username
    When user enters the password
    When user clicks login
    When user clicks hotel management
    When user clicks hotel rooms
    When user clicks add hotelroom button
    When user selects idhotel
    When user enters the code
    When user enters the name
    When user enters the location
    When user enters description
    When user enter the price
    When user selects the room type
    When user enters the max adult count
    When user enters the max children count
    When user clicks approved button
    And user clicks save button
    And user verifys the alert has successfully
    And user clicks ok button







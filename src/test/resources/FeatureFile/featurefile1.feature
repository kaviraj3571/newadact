Feature: Adactin Hotel Normal Booking

  Scenario Outline: Normal booking
    Given User on the adactin page "https://adactinhotelapp.com"
    When User login with valid credentials "Suganesh","Sugan@123"
    Then User should verify page navigate to "Search Hotel "
    And User fill the field on searchotel page "<location>","<hotels>","<roomtype>","<numofrooms>","<checkindate>","<checkoutdate>","<adultscnt>","<childrecount>",and click searchbutton
    Then Validate page navigate to "Select Hotel "
    When User should conform and continue
    Then user conform page navigate to "Book A Hotel "
    When user enter book noe page field "<firstname>","<lastname>","<address>","<ccnum>","<cctype>","<expmonth>","<expyear>","<ccvnum>"
    And User get the order id

    Examples: 
      | location | hotels | roomtype | numofrooms | checkindate | checkoutdate | adultscnt | childrecount | firstname | lastname | address | ccnum             | cctype | expmonth | expyear | ccvnum |
      |        2 |      3 |        3 |          2 | 12/08/2021  | 13/08/2021   |         2 |            1 | kavi      | raj      | chennai | 1234567890123456  |      2 |       10 |      11 |   1234 |

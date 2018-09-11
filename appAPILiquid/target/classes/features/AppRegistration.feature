Feature: A customer wants to redeem a coupon from its APP but is not registered
  @ToTest
  Scenario: An unregistered customer open the APP to register itself
    Given an unregistered customer that start the APP
    And customer
    When customer introduce the "Name", "Msn", "Address", "Post Code", "City", "Email"
    Then customer is registered correctly

  Scenario: A regist
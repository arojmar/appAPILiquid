@ToTest
Feature: A user get an overview of all coupons has assigned

  Scenario: A new user enters in the APP and check the coupons
    Given a new user with a "deviceID" and identify with "saltUser" opens the APPs
    When the user call the service to check the coupons
    Then service returns the list of coupons available in this moment

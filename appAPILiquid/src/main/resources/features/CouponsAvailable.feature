@ToTest
Feature: A user get an overview of all coupons has assigned

  Scenario: A new user enters in the APP and check the coupons
    Given a new user with a "deviceID" and identify with "saltUser" opens the APPs
    When the user call the service to obtain the coupons
    Then service returns the list of coupons available in this moment

  Scenario: A new user enters in the APP and check the coupons
    Given a existing user logged out with a "deviceID" and identify with "saltUser" opens the APPs
    When the user call the service to obtain the coupons
    Then service returns the list of coupons available in this moment

  Scenario: An existing user enters in the APP and check the coupons
    Given an existing user with a "UserID" and identify with "saltUser" opens the APPs
    When the user call the service to obtain the coupons
    Then service returns the list of coupons available in this moment
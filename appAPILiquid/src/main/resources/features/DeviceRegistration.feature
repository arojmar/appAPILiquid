assertNewDeviceIsRegistered

@ToTest
Feature: An existing user wants to register a new device

  Scenario: An existing user register device with Liquid Barcodes
    Given an existing user with a "UserID" and "saltUser" open the APP
    When the user register a new device with folowing parameter "DeviceId", "DeviceToken", "MSN", "Language", "DeviceType", "AppVersion" and "Notes"
    Then service confirms that the registration was successful
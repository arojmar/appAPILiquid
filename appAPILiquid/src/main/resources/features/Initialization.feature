@ToTest
Feature: API initialize the communication and generate the UserId

  Scenario: A new user initialize the APP for the first time and establish communication with the service
    Given a new user with a "iPhone" device open the APP
    When the APP send the petition for starting the communication
    Then signature is calculated
    And the API returns an UserId

  Scenario: A registered user initialize the APP after signing off and establish communication with the service
    Given a registered user with a "iPhone" device open the APP
    And the user needs to sign up
    When the APP send the petition for starting the communication
    Then signature is calculated
    And the API returns an UserId

  Scenario: A registered user initialize the APP after reinstalling the APP and establish communication with the service
    Given a registered user with a "iPhone" device open the APP
    And the APP is initialize for the first time
    And the user needs to sign up
    When the APP send the petition for starting the communication
    Then signature is calculated
    And the API returns an UserId

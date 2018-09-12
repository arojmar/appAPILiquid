package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import serenitySteps.RegisterSteps;
import serenitySteps.UserSteps;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class CouponsDefinition {

    InitializeSteps initializeSteps;
    UserSteps userSteps;
    RegisterSteps registerSteps;


    @Given("^a new user with a \"([^\"]*)\" and identify with \"([^\"]*)\" opens the APPs$")
    public void aUserWithADeviceIDAndUserSaltOpensTheAPP(String deviceID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userSteps.checkIfIsAExistingUser(deviceID, saltUser);
        initializeSteps.newInstanceWhenOpensApp(deviceID, saltUser);
    }

    @When("^the user call the service to check the coupons$")
    public void theUserCallTheServiceToCheckTheCoupons() {

    }

    @Then("^service returns the list of coupons available in this moment$")
    public void serviceReturnsTheListOfCouponsAvailableInThisMoment() {

    }
}

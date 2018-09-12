package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.core.Serenity;
import serenitySteps.CouponStep;
import serenitySteps.InitializeSteps;
import serenitySteps.UserSteps;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class CouponsDefinition {

    InitializeSteps initializeSteps;
    UserSteps userSteps;
    CouponStep couponStep;

    @Given("^(a new user|a existing user logged out) with a \"([^\"]*)\" and identify with \"([^\"]*)\" opens the APPs$")
    public void aUserWithADeviceIDAndUserSaltOpensTheAPP(String deviceID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userSteps.checkIfIsAExistingUser(deviceID, saltUser);
        initializeSteps.newInstanceWhenOpensApp(deviceID, saltUser);
    }

    @Given("^an existing user with a \"([^\"]*)\" and identify with \"([^\"]*)\" opens the APPs$")
    public void anExistingUserWithAAndIdentifyWithOpensTheAPPs(String userID, String saltUser) {
        userSteps.checkIfIsAExistingUser(userID, saltUser);
        final Serenity.SessionVariableSetter USER_ID = Serenity.setSessionVariable(userID);
        final Serenity.SessionVariableSetter SALT_USER = Serenity.setSessionVariable(saltUser);
    }

    @When("^the user call the service to obtain the coupons$")
    public void theUserCallTheServiceToCheckTheCoupons() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        couponStep.getAllCouponsAvailableForCustomer(Serenity.sessionVariableCalled("USER_ID"),Serenity.sessionVariableCalled("SALT_USER"));
    }

    @Then("^service returns the list of coupons available in this moment$")
    public void serviceReturnsTheListOfCouponsAvailableInThisMoment() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        couponStep.assertAllCouponsAreAsExpected(Serenity.sessionVariableCalled("USER_ID"),Serenity.sessionVariableCalled("SALT_USER"));
    }
}

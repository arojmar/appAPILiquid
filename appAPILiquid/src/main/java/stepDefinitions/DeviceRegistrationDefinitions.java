package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import serenitySteps.RegisterSteps;
import serenitySteps.UserSteps;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class DeviceRegistrationDefinitions {
    @Steps
    UserSteps userSteps;

    @Steps
    RegisterSteps registerSteps;

    @Given("^an existing user with a \"([^\"]*)\" and \"([^\"]*)\" open the APP$")
    public void anExistingUserWithAAndOpenTheAPP(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userSteps.confirmIsARegisteredCustomer(userID, saltUser);
        final Serenity.SessionVariableSetter USER_ID = Serenity.setSessionVariable(userID);
        final Serenity.SessionVariableSetter SALT_USER = Serenity.setSessionVariable(saltUser);

    }

    @When("^the user register a new device with folowing parameter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void introduceAndParameters(String deviceID, String deviceToken, String MSN, String language, String deviceType, String appVersion, String notes) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        HashMap<String, String> deviceParameters = new HashMap<>();
        deviceParameters.put("DeviceID", deviceID);
        deviceParameters.put("UserID", Serenity.sessionVariableCalled("USER_ID"));
        deviceParameters.put("deviceToken", deviceToken);
        deviceParameters.put("MSN", MSN);
        deviceParameters.put("Language", language);
        deviceParameters.put("DeviceType", deviceType);
        deviceParameters.put("appVersion", appVersion);
        deviceParameters.put("Notes", notes);

        registerSteps.registerNewDevice(deviceParameters, Serenity.sessionVariableCalled("SALT_USER"));
    }

    @Then("^service confirms that the registration was successful$")
    public void serviceConfirmsThatTheRegistrationWasSuccessful() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        registerSteps.assertNewDeviceIsRegistered(Serenity.sessionVariableCalled("USER_ID"), Serenity.sessionVariableCalled("SALT_USER"));
    }
}

package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitySteps.InitializeSteps;
import serenitySteps.RegisterSteps;
import serenitySteps.UserSteps;

public class InitializeDef {

    @Steps
    InitializeSteps initializeSteps;

    @Steps
    UserSteps userSteps;

    @Steps
    RegisterSteps registerSteps;



    @Given("^a new user with a \"([^\"]*)\" device open the APP$")
    public void aNewUserWithADeviceOpenTheAPP(String deviceName) {
        userSteps.checkIfIsAExistingUser();
        registerSteps.registerNewDevice(deviceName);
    }

    @When("^the APP send the petition for starting the communication$")
    public void theAPPSendThePetitionForStartingTheCommunication() {

    }

    @Then("^signature is calculated$")
    public void signatureIsCalculated() {

    }

    @And("^the API returns an UserId$")
    public void theAPIReturnsAnUserId() {

    }

    @Given("^a registered user with a \"([^\"]*)\" device open the APP$")
    public void aRegisteredUserWithADeviceOpenTheAPP(String arg0) {

    }

    @And("^the user needs to sign up$")
    public void theUserNeedsToSignUp() {
;
    }

    @And("^the APP is initialize for the first time$")
    public void theAPPIsInitializeForTheFirstTime() {

    }
}

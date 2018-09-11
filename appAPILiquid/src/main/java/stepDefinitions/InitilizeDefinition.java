package stepDefinitions;


import net.thucydides.core.annotations.Steps;
import serenitySteps.InitializeSteps;
import serenitySteps.RegisterSteps;
import serenitySteps.UserSteps;

public class InitilizeDefinition {

    public InitilizeDefinition() {

        @Steps
        InitializeSteps initializeSteps;

        @Steps
        UserSteps userSteps;

        @Steps
        RegisterSteps registerSteps;

        @Given("^a new user with a \"([^\"]*)\" device open the APP$")
        public void a_new_user_with_a_device_open_the_APP(String deviceName) {
            userSteps.isANewUser();
            registerSteps.registerNewDevice(deviceName);

        }


        @When("^the APP send the petition for starting the communication$")
        public void the_APP_send_the_petition_for_starting_the_communication() {

        }

        @Then("^signature is calculated$")
        public void signature_is_calculated() {

        }

        @Then("^the API returns an UserId$")
        public void the_API_returns_an_UserId() {

        }

        @Given("^a registered user with a \"([^\"]*)\" device open the APP$")
        public void a_registered_user_with_a_device_open_the_APP(String deviceName)  {

        }

        @Given("^the user needs to sign up$")
        public void the_user_needs_to_sign_up() {

        }

        @Given("^the APP is initialize for the first time$")
        public void the_APP_is_initialize_for_the_first_time() {

        }
    }
}

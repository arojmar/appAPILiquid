package serenitySteps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.DevicePageObject;
import pages.UserPageObject;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


public class UserSteps extends ScenarioSteps {

    private UserPageObject getUserPageObject(){return getPages().get(UserPageObject.class);}
    private DevicePageObject getDevicePageObject(){return getPages().get(DevicePageObject.class);}


    public void checkIfIsAExistingUser(String deviceID, String saltUser)  {
        assertNotEqual(deviceID, getDevicePageObject().getDeviceID(saltUser));
    }

    public void confirmIsARegisteredCustomer(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        assertTrue(getUserPageObject().checkUserID(userID, saltUser));
    }
}

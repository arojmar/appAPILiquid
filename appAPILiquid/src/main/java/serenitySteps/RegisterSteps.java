package serenitySteps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.DevicePageObject;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterSteps extends ScenarioSteps {

    public RegisterSteps(List<String> resultLines) {
        super((Pages) resultLines);
    }

    private DevicePageObject getDevicePageObject() { return getPages().get(DevicePageObject.class);}

    public void registerNewDevice(Map<String, String> deviceInfo, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        getDevicePageObject().registerNewDevice((HashMap<String, String>) deviceInfo, saltUser);
    }

    public void assertNewDeviceIsRegistered(String deviceID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        assertTrue(getDevicePageObject().assertNewDeviceIsRegistered(deviceID, saltUser));
    }
    public void registerNewCustomer(){
        //TODO to add a method that calls the userPageObject and ask for a registration of new customer

    }

}



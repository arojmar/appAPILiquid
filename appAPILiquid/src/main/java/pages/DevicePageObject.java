package pages;

import com.google.gson.Gson;
import net.serenitybdd.core.pages.PageObject;
import utils.SignatureUtility;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import static net.serenitybdd.rest.SerenityRest.given;

public class DevicePageObject extends PageObject {

    public void registerNewDevice (HashMap<String, String> deviceInfo, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Gson deviceInfoInHashMap = new Gson();
        String contentBodyNewDevice = deviceInfoInHashMap.toJson(deviceInfo);

        String identifier="";
        for(HashMap.Entry parameterDevice : deviceInfo.entrySet()){
            if(parameterDevice.getKey() != "Notes"){identifier = deviceInfo.get(parameterDevice);}
        }

        given()
                .header("signature", SignatureUtility.generateSignature(identifier,saltUser),saltUser)
                .contentType("application/json")
                .body(contentBodyNewDevice)
        .when()
                .post()
        .then()
                .statusCode(200);
    }

    public void assertNewDeviceIsRegistered (String deviceID, String saltUser){
        //TODO rest call to assert that the device was stored properly
    }

    public void getDeviceID (String saltUser){
        //TODO rest call for this "DeviceID"
    }
}

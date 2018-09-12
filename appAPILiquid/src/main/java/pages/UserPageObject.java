package pages;

import net.serenitybdd.core.pages.PageObject;
import utils.SignatureUtility;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static net.serenitybdd.rest.SerenityRest.given;

public class UserPageObject extends PageObject {

     public String getUserId (String deviceID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {


        String bodyContent = deviceID;

        return given()
                .header("signature", SignatureUtility.generateSignature(deviceID, saltUser))
                .contentType("application/json")
                .body(bodyContent).baseUri("https://")
        .when()
                .post()
        .then()
                .statusCode(200)
        .extract()
                .response()
                .asString();
    }

    public void checkUserID(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {

         given()
                .header("signature", SignatureUtility.generateSignature(userID, saltUser))
                .contentType("application/json")
                .body(userID).baseUri("https://")
        .when()
                .get()
        .then()
                .statusCode(200);
    }
}

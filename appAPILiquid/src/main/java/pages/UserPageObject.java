package pages;

import net.serenitybdd.core.pages.PageObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class UserPageObject extends PageObject {

    public void getUserId (String UserID){

        given()
                .header()
                .header()
                .header()
                .header()
                .header()
                .contentType()
                .body()
                .baseURI()
        .when()
                .get()
                .asString();


    }


    private String generateSignature(String UserId, String Salt) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String dateTime ="0";

        String composeStringToSHA256 = dateTime+UserId+Salt;

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] digest = md.digest(composeStringToSHA256.getBytes("UTF-8"));
// https://fluidattacks.com/web/es/defends/java/generar-sha2/
    }

}

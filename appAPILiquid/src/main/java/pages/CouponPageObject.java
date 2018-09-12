package pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.pages.PageObject;
import utils.SignatureUtility;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class CouponPageObject extends PageObject {



    public Response getAllCoupons(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Response allCoupons = SerenityRest.given()
                .header("signature", SignatureUtility.generateSignature(userID, saltUser))
                .contentType("application/json")
                .body(userID)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().response();

        return allCoupons;
    }
}

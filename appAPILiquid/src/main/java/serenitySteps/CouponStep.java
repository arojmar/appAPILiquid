package serenitySteps;

import io.restassured.response.Response;
import pages.CouponPageObject;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class CouponStep {

    private CouponPageObject getCouponPageObject(){return getPages().get(CouponPageObject.class);}

    public void assertAllCouponsAreAsExpected(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Object couponsAvailable = null; //TODO Add a Json of couponsAvailables for this customer
        assertTrue(getAllCouponsAvailableForCustomer(userID,saltUser), couponsAvailable);
    }

    public Response getAllCouponsAvailableForCustomer(String userID, String saltUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return getCouponPageObject().getAllCoupons(userID,saltUser);
    }
}

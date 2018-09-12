package serenitySteps;

import net.serenitybdd.core.Serenity;
import pages.UserPageObject;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class InitializeSteps {

    private UserPageObject getUserPageObject(){return getPages().get(UserPageObject.class);}

    public void newInstanceWhenOpensApp(String deviceID, String salt) throws UnsupportedEncodingException, NoSuchAlgorithmException {
            Serenity.setSessionVariable("USER_ID").to(getUserPageObject().getUserId(deviceID, salt));
    }
}

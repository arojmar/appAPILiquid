package serenitySteps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import pages.AppPageObject;
import pages.UserPageObject;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class InitializeSteps extends ScenarioStep {


    InitializeSteps(Pages Pages) {super(pages);}

    private UserPageObject getUserPageObject() { return getPages().get(UserPageObject.class); }

    private AppPageObject getAppPageObject() {return getPages().get(AppPageObject.class); }

    public void userOpensApp(){
        getAppPageObject().openApp();
    }
}

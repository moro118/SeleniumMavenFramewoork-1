package test.java;

import main.java.pageEvents.CreateAccountPageEvents;
import main.java.pageEvents.HomePageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    HomePageEvents homePageEvents = new HomePageEvents();
    CreateAccountPageEvents createAccountPageEvents = new CreateAccountPageEvents();

    @Test
    public void sampleMethodForUsernameEntering() {
        homePageEvents.clickOnSignInButton();
        homePageEvents.clickOnNewAccount();
        //createAccountPageEvents.enterUserName();
    }
}


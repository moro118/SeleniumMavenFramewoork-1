package main.java.pageEvents;

import main.java.pageObjects.CreateAccountPageElements;
import main.java.utils.ElementFetch;

public class CreateAccountPageEvents {
    ElementFetch elementFetch = new ElementFetch();

    public void enterUserName(){
    elementFetch.getWebElement("XPATH", CreateAccountPageElements.userName).sendKeys("AndreaDiaz");
    }

}

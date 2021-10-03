package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static test.java.BaseTest.driver;

public class HomePageEvents {


    public void clickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageElements.signInButton)));
        //elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }

    public void clickOnNewAccount() {
        ElementFetch elementFetch = new ElementFetch();
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageElements.newAccountButton)));
        elementFetch.getWebElement("XPATH", HomePageElements.speakersCategory).click();
    }

    //public void speakersCategory() {
    //  ElementFetch elementFetch = new ElementFetch();
    //WebDriverWait wait = new WebDriverWait(driver, 20);
    //elementFetch.getWebElement("XPATH", HomePageElements.speakersCategory).click();
    // }

}

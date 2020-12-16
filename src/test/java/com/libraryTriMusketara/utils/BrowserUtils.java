package com.libraryTriMusketara.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    // try catch block for Thread.sleep
    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // wait method for Element to be clickable
    public static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    // wait method for Element to be clickable using JavaScript
    public static void clickWithJS(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) (Driver.getDriver())).executeScript("arguments[0].click()", element);
    }

    // wait method for Element to be visible --> TO BE CHECKED!!!
    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering text: " + text);
    }
    // wait method for Element to be visible
    public static void visibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * For instance, selenium webdriver is trying to enter the text:
     * Expected text input  actual text input
     *
     * [java is great] --> [java is g]
     *
     * for some reason, selenium jumps to the next step without finishing text input here
     *
     * to prevent this issue, we need to make it wait until text is completely entered.
     *
     * How to do that?
     *
     * As we know, text is stored in the value attribute. So we need to wait until value attribute
     * of the element will obtain expected text.
     */

}

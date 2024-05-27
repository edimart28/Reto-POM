package com.haceb.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class clickJS {

    public static void clickJScheckBox(WebDriver driver, WebElementFacade elemento) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
        elemento);

    }

}

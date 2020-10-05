package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.cucumber.driver.DriverManager.getWebDriver;

public abstract class BasePage {

    protected WebElement waitForElement(By elementBy) {
        WebDriverWait waitForOne = new WebDriverWait(getWebDriver(), 15);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(elementBy));
        return getWebDriver().findElement(elementBy);
    }

    protected void navigateAndClick(By element1By, By element2By) {
        Actions builder = new Actions(getWebDriver());
        builder.moveToElement(getWebDriver().findElement(element1By)).click(getWebDriver().findElement(element2By));
        builder.build().perform();
    }

}

package com.cucumber.pages;

import org.openqa.selenium.By;

import static com.cucumber.driver.DriverManager.getWebDriver;
import static java.lang.String.format;

public class OtusContactsPage extends BasePage {

    private String contactLinkXpath = "//div[@class ='contacts']//a/span[text()='%s']/..";
    private String contactTextXpath = "//div[@class ='contacts']//a[@itemprop='%s']";

    public String getContactLink(String name) {
        return getWebDriver().findElement(By.xpath(format(contactLinkXpath, name))).getAttribute("href");
    }

    public String getContactText(String name) {
        return getWebDriver().findElement(By.xpath(format(contactTextXpath, name))).getText();
    }
}

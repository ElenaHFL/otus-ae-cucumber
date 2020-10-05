package com.cucumber.pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class OtusMainPage extends BasePage {

    private String streamNameXpath = "//div[@id='categories_id']//a[@title='%s']";
    private String subHeaderNameXpath = "//header//a[@title='%s']";
    private String tabNameXpath = "//header//p[text()='%s']";

    public void selectStream(String streamName) {
        waitForElement(By.xpath(format(streamNameXpath, streamName))).click();
    }

    public void selectSubHeader(String subHeader) {
        waitForElement(By.xpath(format(subHeaderNameXpath, subHeader))).click();
    }

    public void selectTab(String tabName, String subTabName) {
        navigateAndClick(By.xpath(format(tabNameXpath, tabName)),By.xpath(format(subHeaderNameXpath, subTabName)));
    }
}

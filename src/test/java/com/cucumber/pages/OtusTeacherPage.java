package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.cucumber.driver.DriverManager.getWebDriver;
import static java.lang.String.format;

public class OtusTeacherPage extends BasePage {

    private String teacherListXpath = "//div[@class ='teachers']//a[@class ='teacher']";
    private String teacherListByCourseXpath = teacherListXpath + "/div[text()='%s']";
    private String teacherWorkplaceInfoByNameXpath = teacherListXpath + "/div[text()[contains(.,'%s')]]/../div[@class ='teacher__workplace']";

    public List<WebElement> getTeacherList() {
        return getWebDriver().findElements(By.xpath(teacherListXpath));
    }

    public List<WebElement> getTeacherListByCourse(String courseName) {
        return getWebDriver().findElements(By.xpath(format(teacherListByCourseXpath, courseName)));
    }

    public String getTeacherWorkplaceInfoByName(String name) {
        return getWebDriver().findElement(By.xpath(format(teacherWorkplaceInfoByNameXpath, name))).getText();
    }

}

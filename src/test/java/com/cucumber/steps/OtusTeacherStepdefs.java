package com.cucumber.steps;

import com.cucumber.pages.OtusMainPage;
import com.cucumber.pages.OtusTeacherPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OtusTeacherStepdefs {

    @When("I go to teacher page")
    public void openTeacherPage() {
        OtusMainPage otusMainPage = new OtusMainPage();
        otusMainPage.selectTab("Преподавателям", "Наши преподаватели");
    }

    @Then("I should find that the {string} is taught by {int} people")
    public void verifyCount(String courseName, Integer count) {
        OtusTeacherPage otusTeacherPage = new OtusTeacherPage();
        List<WebElement> list = otusTeacherPage.getTeacherListByCourse(courseName);
        Assertions.assertThat(list.size()).isEqualTo(count);
    }

    @Then("I should find info about {string} for {string}")
    public void verifyWorkplace(String workplace, String teacher) {
        OtusTeacherPage otusTeacherPage = new OtusTeacherPage();
        assertThat(otusTeacherPage.getTeacherWorkplaceInfoByName(teacher)).isEqualToIgnoringCase(workplace);
    }
}

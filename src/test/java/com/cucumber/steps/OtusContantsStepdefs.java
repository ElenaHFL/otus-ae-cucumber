package com.cucumber.steps;

import com.cucumber.pages.OtusContactsPage;
import com.cucumber.pages.OtusMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cucumber.driver.DriverManager.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class OtusContantsStepdefs {

    @Given("I navigate to Otus contacts page by {string}")
    public void navigateToContactsPage(String url) {
        getWebDriver().navigate().to(url);
        OtusMainPage otusMainPage =  new OtusMainPage();
        otusMainPage.selectSubHeader("Контакты");
    }

    @When("I select social network {string}")
    public String getSocialNetwork(String name) {
        OtusContactsPage otusContactsPage = new OtusContactsPage();
        return otusContactsPage.getContactLink(name);
    }

    @Then("I should get link {string} by {string}")
    public void verifyLink(String link, String name) {
        assertThat(getSocialNetwork(name)).isEqualToIgnoringCase(link);
    }

    @When("I select contact {string}")
    public String getContactInfo(String name) {
        OtusContactsPage otusContactsPage = new OtusContactsPage();
        return otusContactsPage.getContactText(name);
    }

    @Then("I should get info {string} for {string}")
    public void verifyInfo(String link, String name) {
        assertThat(getContactInfo(name)).isEqualToIgnoringCase(link);
    }
}

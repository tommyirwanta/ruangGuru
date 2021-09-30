package com.gdn.qa.module.ui.test.steps;

import com.gdn.qa.automation.core.properties.WebProperties;
import com.gdn.qa.automation.core.CucumberStepsDefinition;
import com.gdn.qa.module.ui.test.pages.SkillAcademyPage;
import com.gdn.qa.module.ui.test.properties.SkillAcademyProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import net.thucydides.core.steps.ScenarioSteps;


@CucumberStepsDefinition
public class SkillAcademySteps extends ScenarioSteps {

    @Autowired
    WebProperties webProperties;

    @Autowired
    SkillAcademyPage skillAcademyPage;

    @Autowired
    SkillAcademyProperties skillAcademyProperties;


    @Given("^the user is on the skill academy home page$")
    public void theUserIsOnTheSkillAcademyHomePage() {
        skillAcademyPage.openAt(webProperties.endpoint("skillAcademy"));
    }

    @When("^user search \"([^\"]*)\" on search field$")
    public void userSearchOnSearchField(String keyword) {
        skillAcademyPage.typeKeyword(skillAcademyProperties.get(keyword));
    }

    @When("^user click search button$")
    public void userClickSearchButton() {
        skillAcademyPage.clickBtnSearch();
    }

    @Then("^user can see the result related \"([^\"]*)\"$")
    public void userCanSeeTheResultRelated(String keyword) {
        assertThat("Something wrong when search the keyword",
                skillAcademyPage.checkSearchResult(),
                Matchers.containsString(skillAcademyProperties.get(keyword)));
    }

    @When("^user click enter on search field$")
    public void userClickEnterOnSearchField() {
        skillAcademyPage.clickEnter();
    }

    @Then("^user can see the alert about invalid result$")
    public void userCanSeeTheAlertAboutInvalidResult() {
        assertThat("Something wrong when search the keyword",
                skillAcademyPage.checkSearchResult(),
                Matchers.containsString("Maaf, kami tidak menemukan hasil untuk"));
    }
}

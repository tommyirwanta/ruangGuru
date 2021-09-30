package com.gdn.qa.module.ui.test.steps;

import com.gdn.qa.automation.core.CucumberStepsDefinition;
import com.gdn.qa.module.ui.test.api.services.SkillAcademyController;
import com.gdn.qa.module.ui.test.data.SkillAcademyData;
import com.gdn.qa.module.ui.test.properties.SkillAcademyProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;

@CucumberStepsDefinition
public class ApiSkillAcademy extends ScenarioSteps {

    @Autowired
    SkillAcademyProperties skillAcademyProperties;

    @Autowired
    SkillAcademyData skillAcademyData;

    @Autowired
    SkillAcademyController skillAcademyController;


    @Given("^prepare data for get search result$")
    public void prepareDataForGetSearchResult() {
        skillAcademyData.setPage(skillAcademyProperties.get("page"));
        skillAcademyData.setPageSize(skillAcademyProperties.get("pageSize"));
        skillAcademyData.setSearchQuery(skillAcademyProperties.get("searchQuery"));
        skillAcademyData.setMinPrice(skillAcademyProperties.get("minPrice"));
        skillAcademyData.setMaxPrice(skillAcademyProperties.get("maxPrice"));
        skillAcademyData.setSortBy(skillAcademyProperties.get("sortBy"));
        skillAcademyData.setOrderBy(skillAcademyProperties.get("orderBy"));
    }

    @When("^send request for get discovery search$")
    public void sendRequestForGetDiscoverySearch() {
        skillAcademyData.setGetDiscoverySearchResponseResponseApi(skillAcademyController.getDiscoverySearchResponseResponseApi());
    }

    @Then("^response get member detail status message is \"([^\"]*)\"$")
    public void responseGetMemberDetailStatusMessageIs(String value ) {
        assertThat("Something Wring",
                skillAcademyData.getGetDiscoverySearchResponseResponseApi().getResponseBody().getStatus(),
                Matchers.equalTo(value));
    }
}

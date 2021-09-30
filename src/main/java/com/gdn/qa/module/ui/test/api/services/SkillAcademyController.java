package com.gdn.qa.module.ui.test.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gdn.qa.automation.core.json.JsonApi;
import com.gdn.qa.automation.core.restassured.ResponseApi;
import com.gdn.qa.automation.core.restassured.ServiceApi;
import com.gdn.qa.module.ui.test.data.SkillAcademyData;
import com.gdn.qa.module.ui.test.models.response.DiscoverySearchResponse;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com.gdn.qa.module.ui.test.api.services.skillAcademyController")
public class SkillAcademyController extends ServiceApi {

    @Autowired
    JsonApi jsonApi;

    @Autowired
    SkillAcademyData skillAcademyData;

    public ResponseApi<DiscoverySearchResponse> getDiscoverySearchResponseResponseApi() {
        Response response = service("saApi")

                .queryParam("page",skillAcademyData.getPage())
                .queryParam("pageSize",skillAcademyData.getPageSize())
                .queryParam("searchQuery",skillAcademyData.getSearchQuery())
                .queryParam("minPrice",skillAcademyData.getMinPrice())
                .queryParam("maxPrice",skillAcademyData.getMaxPrice())
                .queryParam("sortBy",skillAcademyData.getSortBy())
                .queryParam("orderBy",skillAcademyData.getOrderBy())
                .get("/search");
        response.getBody().prettyPrint();

        return jsonApi.fromJson(response, new TypeReference<DiscoverySearchResponse>() {
        });
    }
}

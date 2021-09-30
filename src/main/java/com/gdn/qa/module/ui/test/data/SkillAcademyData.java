package com.gdn.qa.module.ui.test.data;

import com.gdn.qa.automation.core.restassured.ResponseApi;
import com.gdn.qa.module.ui.test.models.response.DiscoverySearchResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("com.gdn.qa.module.ui.test.data.SkillAcademyData")
public class SkillAcademyData {
    private String page;
    private String pageSize;
    private String searchQuery;
    private String minPrice;
    private String maxPrice;
    private String sortBy;
    private String orderBy;

    private String minDuration;
    private String maxDuration;

    private ResponseApi<DiscoverySearchResponse> getDiscoverySearchResponseResponseApi;

}

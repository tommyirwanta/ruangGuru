package com.gdn.qa.module.ui.test.api.interceptors;

import com.gdn.qa.automation.core.restassured.ServiceInterceptor;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

@Component("com.gdn.qa.module.ui.test.api.interceptor.skillAcademyInterceptor")
public class skillAcademyInterceptor implements ServiceInterceptor {
    @Override
    public void prepare(RequestSpecification requestSpecification) {
        requestSpecification.header("content-type", "application/json")
                .log().all();
    }

    @Override
    public boolean isSupport(String serviceName) {
        if (serviceName.equalsIgnoreCase("saApi")) {
            return true;
        }return false;
    }
}

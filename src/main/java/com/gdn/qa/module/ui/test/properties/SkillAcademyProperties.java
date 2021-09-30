package com.gdn.qa.module.ui.test.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@ConfigurationProperties(prefix = "sa")
@Component("com.gdn.qa.module.ui.test.properties.SkillAcademyProperties")
public class SkillAcademyProperties {

    private HashMap<String, String> data;
    public String get(String name){
        return data.get(name);
    }
}

package com.gdn.qa.module.ui.test.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.stereotype.Component;


@Component("com.gdn.qa.module.ui.test.pages.SkillAcademyPage")
public class SkillAcademyPage extends PageObject {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    private WebElementFacade inputField;

    @FindBy(xpath = "//div[3]/div[1]/div[2]/img[1]")
    private WebElementFacade btnSearch;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")
    private WebElementFacade txtSearchResult;

    private String inputForEnter = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]";


    public void typeKeyword(String keyword) {
        inputField.type(keyword);
    }

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public String checkSearchResult() {
        return txtSearchResult.getText();
    }

    public void clickEnter() {
        find(By.xpath(inputForEnter)).sendKeys(Keys.ENTER);
    }

}

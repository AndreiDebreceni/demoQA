package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CheckBoxPage extends PageObject {
    @FindBy(css = "#tree-node > ol > li > span > button > svg")
    private WebElementFacade toggleListButton;
    @FindBy (css = "li:nth-child(2) > span > button > svg")
    private WebElementFacade toggleDocumentsButton;
    @FindBy (css = "ol  ol  ol > li:nth-of-type(1) > .rct-text > button[title='Toggle'] > .rct-icon.rct-icon-expand-close")
    private WebElementFacade toggleWorkSpaceButton;
    @FindBy(css = "ol  ol  ol  ol > li:nth-of-type(1) > .rct-text > label > .rct-checkbox")
    private WebElementFacade checkBoxReact;
    @FindBy(css = "#result > span.text-success")
    private WebElementFacade resultSelectedItem;
    @FindBy(css = "ol  ol  ol  ol > li:nth-of-type(1) > .rct-text > label > .rct-checkbox")
    private WebElementFacade chBoxCheck;



    public void clickToggleList(){
        clickOn(toggleListButton);
    }
    public void clickToggleDocuments(){
        clickOn(toggleDocumentsButton);
    }
    public void clickToggleWorkSpace(){
        clickOn(toggleWorkSpaceButton);
    }
    public void setCheckBoxReact(){
        clickOn(checkBoxReact);
    }
    public void checkResultSelectedItem(){
        System.out.println("expected item selected: react ");
        System.out.println("actual item selected : " + resultSelectedItem.getText());
       Assert.assertTrue("react" , true);
       resultSelectedItem.shouldContainOnlyText("react");

    }

    public boolean chCheckBox(){
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(By.cssSelector("ol  ol  ol  ol > li:nth-of-type(1) > .rct-text > label > .rct-checkbox"));
        return chBoxCheck.isEnabled();

    }
}

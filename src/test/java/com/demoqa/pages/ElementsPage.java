package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsPage extends PageObject {
    @FindBy(css = "#item-0 > span")
    private WebElementFacade textBoxLink;
    @FindBy(css = "#item-1 > span")
    private WebElementFacade checkBoxLink;


    public void clickOnTextBoxLink(){
        clickOn(textBoxLink);
    }
    public void clickOnCheckBoxLing(){
        clickOn(checkBoxLink);
    }
}

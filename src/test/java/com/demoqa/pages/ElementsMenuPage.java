package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsMenuPage extends PageObject {

    @FindBy(css = "#item-0 > span")
    private WebElementFacade textBoxLink;
    @FindBy(css = "#item-1 > span")
    private WebElementFacade checkBoxLink;
    @FindBy(css = "#item-2 > span")
    private WebElementFacade radioButtonLink;
    @FindBy(css = "#item-3 > span")
    private WebElementFacade webTablesLink;

    public void clickOnTextBoxLink(){
        clickOn(textBoxLink);
    }
    public void clickOnCheckBoxLink(){
        clickOn(checkBoxLink);
    }
    public void clickOnRadioLink(){
        clickOn(radioButtonLink);

    }
    public void clickOnWebTablesLink(){
        clickOn(webTablesLink);
    }
}

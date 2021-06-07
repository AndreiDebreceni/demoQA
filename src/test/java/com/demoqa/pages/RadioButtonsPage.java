package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RadioButtonsPage extends PageObject {

    @FindBy(css = "div:nth-child(1) > div:nth-child(2) > label")
    private WebElementFacade yesRadioButton;


    public void setYesRadioButton(){
        clickOn(yesRadioButton);
    }
    public boolean checkRadioButton(){
        return yesRadioButton.isEnabled();
    }


}

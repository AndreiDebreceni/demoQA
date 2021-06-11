package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ButtonsPage extends PageObject {
    @FindBy(css = "#rightClickBtn")
    private WebElementFacade rightClickButton;
    @FindBy(css = "#rightClickMessage")
    private WebElementFacade rightClickMessage;

    public void setRightClickButton() {
        withAction().contextClick(rightClickButton).perform();
    }
    public String checkRightClick(){
        return rightClickMessage.getText();
    }
}

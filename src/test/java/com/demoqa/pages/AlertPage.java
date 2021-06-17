package com.demoqa.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AlertPage extends PageObject {
    @FindBy (css = "#confirmButton")
    private WebElementFacade confirmButton;
    @FindBy(css = "#confirmResult")
    private WebElementFacade confirmResult;

    public void setConfirmButton(){
        clickOn(confirmButton);
        getAlert().accept();

    }
    public String setConfirmResult(){
        System.out.println("Confirm text : " + confirmResult.getText());
        return confirmResult.getText();
    }
}

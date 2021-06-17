package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ModalDialogPage extends PageObject {
    @FindBy(css = "#showSmallModal")
    private WebElementFacade generateSmallModal;
    @FindBy(css = "body > div.fade.modal.show > div > div > div.modal-body")
    private WebElementFacade textFromModal;

    public void setGenerateSmallModal(){
        clickOn(generateSmallModal);
    }
    public String getTextFromModal(){
        System.out.println("modal text: " + textFromModal.getText());
        return textFromModal.getText();

    }

}

package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TextBoxPage extends PageObject {
    @FindBy(css = "input#userName")
    private WebElementFacade insertUserName;
    @FindBy(css = "input#userEmail")
    private WebElementFacade insertEmail;
    @FindBy(css = "textarea#currentAddress")
    private WebElementFacade insertAddress;
    @FindBy (css = "textarea#permanentAddress")
    private WebElementFacade insertPermanentAddress;
    @FindBy (css = "button#submit")
    private WebElementFacade submitButton;
    @FindBy (css = "#name")
    private WebElementFacade verifySubmit;



    public void setInsertUserName(String text){
        typeInto(insertUserName, text);
    }

    public void setInsertEmail(String email) {
        typeInto(insertEmail, email);
    }

    public void setInsertAddress(String address) {
        typeInto(insertAddress, address);
    }

    public void setInsertPermanentAddress(String permAddress) {
        typeInto(insertPermanentAddress , permAddress);
    }
    public void submitButton(){
        clickOn(submitButton);
    }
    public String verifySubmit(String text){
        System.out.println("Text expected : Name:UncleBoB ");
        System.out.println("Actual text: " + verifySubmit.getText());
       return verifySubmit.getText();


    }
    public boolean isWelcomeTextDisplayed(String text) {
        return verifySubmit.containsOnlyText(text);
    }

    public String getcreatedText() {
       return verifySubmit.getText();
    }
}

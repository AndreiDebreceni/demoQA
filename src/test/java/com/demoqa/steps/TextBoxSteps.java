package com.demoqa.steps;

import net.thucydides.core.annotations.Step;
import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.TextBoxPage;
import org.junit.Assert;

public class TextBoxSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private TextBoxPage textBoxPage;
    @Step
    public void navigateToTextBox(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsMenuPage.clickOnTextBoxLink();
    }
    @Step
    public void submitTextBox(String UserName,String Email, String Address, String PermAddress ){
        textBoxPage.setInsertUserName(UserName);
        textBoxPage.setInsertEmail(Email);
        textBoxPage.setInsertAddress(Address);
        textBoxPage.setInsertPermanentAddress(PermAddress);
        textBoxPage.submitButton();
    }
    @Step
    public void checkSubmitResult(String message) {
        textBoxPage.verifySubmit(message);
        Assert.assertTrue(textBoxPage.isWelcomeTextDisplayed(message));
        Assert.assertEquals(message.toLowerCase(), textBoxPage.getcreatedText().toLowerCase());
    }
}

package com.demoqa.steps;

import net.thucydides.core.annotations.Step;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.TextBoxPage;
import org.junit.Assert;

import java.util.Locale;

public class TextBoxSteps {
    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    @Step
    public void navigateToTextBox(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsPage.clickOnTextBoxLink();
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

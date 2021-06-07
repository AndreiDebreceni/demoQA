package com.demoqa.steps;

import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.RadioButtonsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class SelectRadioButtonSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private RadioButtonsPage radioButtonsPage;

    @Step
    public void navigateToRadioBpage(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsMenuPage.clickOnRadioLink();

    }
    @Step
    public void selectRadioButton(){
        radioButtonsPage.setYesRadioButton();
    }
    @Step
    public void checkRadioButtonIsChecked(){
        Assert.assertTrue(radioButtonsPage.checkRadioButton());
    }


}

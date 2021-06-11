package com.demoqa.steps;

import com.demoqa.pages.ButtonsPage;
import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RightClickOnButtonSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private ButtonsPage buttonsPage;

    @Step
    public void goToButtonsPage() {
        homePage.open();
        homePage.clickOnElementsButton();
        elementsMenuPage.clickOnButtonsPage();
    }
    @Step
    public void rightClickOnButton(){
        buttonsPage.setRightClickButton();
    }
    @Step
    public void checkIfButtonIsRClick(String text){
        Assert.assertTrue(buttonsPage.checkRightClick().equals(text));

    }
}
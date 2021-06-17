package com.demoqa.steps;

import com.demoqa.pages.AlertsFrameMenuPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.ModalDialogPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GenerateModalSteps {
    private HomePage homePage;
    private AlertsFrameMenuPage alertsFrameMenuPage;
    private ModalDialogPage modalDialogPage;

    @Step
    public void navigateToModalPage(){
        homePage.open();
        homePage.clickOnAlertsFrameButton();
        alertsFrameMenuPage.clickModalButton();
    }
    @Step
    public void generateModal(){
        modalDialogPage.setGenerateSmallModal();
    }
    @Step
    public void confirmModalText(String text){
        Assert.assertTrue(modalDialogPage.getTextFromModal().equals(text));
    }
}

package com.demoqa.steps;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.AlertsFrameMenuPage;
import com.demoqa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ConfirmAlertMsgSteps {
    private HomePage homePage;
    private AlertsFrameMenuPage alertsFrameMenuPage;
    private AlertPage alertPage;

    @Step
    public void navigateToAlertPage(){
        homePage.open();
        homePage.clickOnAlertsFrameButton();
        alertsFrameMenuPage.clickOnAlertsButton();
    }
    @Step
    public void clickAndConfirmAlertMsg(){
        alertPage.setConfirmButton();
    }
    @Step
    public void checkIfAlertIsConfirmed(String text){
        Assert.assertTrue(alertPage.setConfirmResult().equalsIgnoreCase(text));
    }











}

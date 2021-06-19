package com.demoqa.steps;

import com.demoqa.pages.DatePickerPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.WidgetsMenuPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SetTimeAndDateSteps {
    private HomePage homePage;
    private WidgetsMenuPage widgetsMenuPage;
    private DatePickerPage datePickerPage;
    @Step
    public void navigateToDatePickerPage(){
        homePage.open();
        homePage.clicOnWidgetsButton();
        widgetsMenuPage.datePickerLink();
    }
    @Step
    public void setTimeAndDate(){
        datePickerPage.selectMonth();
        datePickerPage.selectYear();
        datePickerPage.setSetHour();
    }
    @Step
    public void validDayTime(String value){
        Assert.assertTrue(datePickerPage.validateDateAndHour().equals(value));
    }
}

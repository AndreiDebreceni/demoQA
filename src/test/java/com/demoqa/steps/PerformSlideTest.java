package com.demoqa.steps;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SliderPage;
import com.demoqa.pages.WidgetsMenuPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class PerformSlideTest {
    private HomePage homePage;
    private WidgetsMenuPage widgetsMenuPage;
    private SliderPage sliderPage;
    @Step
    public void navigateToSliderPage(){
        homePage.open();
        homePage.clicOnWidgetsButton();
        widgetsMenuPage.clickOnSliderLink();
    }
    @Step
    public void moveSlideBar(){
        sliderPage.controlSlider();
    }
    @Step
    public void getSlideValue(String value){
        Assert.assertTrue(sliderPage.getSliderValue().equals(value));
    }
}

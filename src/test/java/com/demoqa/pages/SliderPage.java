package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SliderPage extends PageObject {
    Actions action = new Actions(getDriver());
    @FindBy(css = ".range-slider.range-slider--primary")
    private WebElementFacade sliderBar;
    @FindBy(css = "#sliderValue")
    private WebElementFacade slideValue;

    public void controlSlider(){
//        waitABit(2000);
        action.clickAndHold(sliderBar).dragAndDropBy(sliderBar,80,0).release().perform();

    }
//    public String hoverOverSlide(){
//        WebElement element = (WebElement) getDriver();
//        action.moveToElement(sliderBar).perform();
//        waitFor(slideValue);
//        System.out.println("slide value: " + slideValue.getValue());
//        return  slideValue.getText();
    public String getSliderValue(){
        System.out.println("Slider value: " + slideValue.getValue());
         return slideValue.getValue();
    }
}

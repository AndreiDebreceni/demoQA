package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class WidgetsMenuPage extends PageObject {
    @FindBy(css = ".collapse.element-list.show > .menu-list > li:nth-of-type(3) > .text")
    private WebElementFacade datePickerButton;
    @FindBy(css = ".collapse.element-list.show > .menu-list > li:nth-of-type(4) > .text")
    private WebElementFacade sliderLink;
    Actions action = new Actions(getDriver());


    public void datePickerLink(){
        action.sendKeys(Keys.PAGE_DOWN).perform();
        waitABit(2000);
        clickOn(datePickerButton);
    }
    public void clickOnSliderLink(){
        action.sendKeys(Keys.PAGE_DOWN).perform();
        waitABit(2000);
        clickOn(sliderLink);
    }

}

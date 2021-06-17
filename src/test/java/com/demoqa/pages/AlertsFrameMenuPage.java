package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AlertsFrameMenuPage extends PageObject {

    @FindBy(css = ".collapse.element-list.show > .menu-list > li:nth-of-type(2)")
    private WebElementFacade alertsButton;
    @FindBy(css = ".collapse.element-list.show > .menu-list > li:nth-of-type(5) > .text")
    private WebElementFacade modalDialogButton;

    public void clickOnAlertsButton(){
        clickOn(alertsButton);
    }
    public void clickModalButton(){
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        waitFor(modalDialogButton);
        clickOn(modalDialogButton);
    }



}

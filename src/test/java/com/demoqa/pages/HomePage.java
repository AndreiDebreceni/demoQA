package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com")
public class HomePage extends PageObject {



    @FindBy(css = "div.avatar.mx-auto.white")
    private WebElementFacade elementsButton;




    public void clickOnElementsButton() {
        clickOn(elementsButton);
    }

}

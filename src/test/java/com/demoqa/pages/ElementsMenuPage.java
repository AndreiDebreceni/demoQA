package com.demoqa.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;



public class ElementsMenuPage extends PageObject {
    private WebDriver driver;
    @FindBy(css = "#item-0 > span")
    private WebElementFacade textBoxLink;
    @FindBy(css = "#item-1 > span")
    private WebElementFacade checkBoxLink;
    @FindBy(css = "#item-2 > span")
    private WebElementFacade radioButtonLink;
    @FindBy(css = "#item-3 > span")
    private WebElementFacade webTablesLink;
    @FindBy(css = "#item-4 > span")
    private WebElementFacade buttonsLink;
    @FindBy(css = "#item-7 > span")
    private WebElementFacade downloadUploadLink;


    public void clickOnTextBoxLink(){
        clickOn(textBoxLink);
    }
    public void clickOnCheckBoxLink(){
        clickOn(checkBoxLink);
    }
    public void clickOnRadioLink(){
        clickOn(radioButtonLink);

    }
    public void clickOnWebTablesLink(){
        clickOn(webTablesLink);
    }
    public void clickOnButtonsPage(){
        clickOn(buttonsLink);
    }
    public void clickOnDownloadUploadLink(){

        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).perform();
        waitABit(3000);
        clickOn(downloadUploadLink);
    }
}

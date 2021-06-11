package com.demoqa.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.steps.ScreenplayInspector;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]")
    private WebElementFacade downloadUploadLink;

//just for test
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
        clickOn(downloadUploadLink);
    }
}
